package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

@ApiModel(description = "Esta sección muestra información general de la consulta realizada.")
public class DatosConsulta {
  @SerializedName("fechaConsulta")
  private String fechaConsulta = null;
  @SerializedName("numeroConsulta")
  private BigDecimal numeroConsulta = null;
  @SerializedName("otorgante")
  private String otorgante = null;
  @SerializedName("usuario")
  private String usuario = null;
  @SerializedName("tipoCambio")
  private Float tipoCambio = null;
  public DatosConsulta fechaConsulta(String fechaConsulta) {
    this.fechaConsulta = fechaConsulta;
    return this;
  }
   
  @ApiModelProperty(value = "Fecha en la que se realiza la consulta. Formato: yyyymmdd")
  public String getFechaConsulta() {
    return fechaConsulta;
  }
  public void setFechaConsulta(String fechaConsulta) {
    this.fechaConsulta = fechaConsulta;
  }
  public DatosConsulta numeroConsulta(BigDecimal numeroConsulta) {
    this.numeroConsulta = numeroConsulta;
    return this;
  }
   
  @ApiModelProperty(value = "Número de consulta de Círculo de Crédito.")
  public BigDecimal getNumeroConsulta() {
    return numeroConsulta;
  }
  public void setNumeroConsulta(BigDecimal numeroConsulta) {
    this.numeroConsulta = numeroConsulta;
  }
  public DatosConsulta otorgante(String otorgante) {
    this.otorgante = otorgante;
    return this;
  }
   
  @ApiModelProperty(value = "Entidad que realiza la consulta.")
  public String getOtorgante() {
    return otorgante;
  }
  public void setOtorgante(String otorgante) {
    this.otorgante = otorgante;
  }
  public DatosConsulta usuario(String usuario) {
    this.usuario = usuario;
    return this;
  }
   
  @ApiModelProperty(value = "Nombre de la persona que realiza la consulta.")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }
  public DatosConsulta tipoCambio(Float tipoCambio) {
    this.tipoCambio = tipoCambio;
    return this;
  }
   
  @ApiModelProperty(value = "Tipo de cambio a la fecha de la consulta de soles a dólares.")
  public Float getTipoCambio() {
    return tipoCambio;
  }
  public void setTipoCambio(Float tipoCambio) {
    this.tipoCambio = tipoCambio;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatosConsulta datosConsuta = (DatosConsulta) o;
    return Objects.equals(this.fechaConsulta, datosConsuta.fechaConsulta) &&
        Objects.equals(this.numeroConsulta, datosConsuta.numeroConsulta) &&
        Objects.equals(this.otorgante, datosConsuta.otorgante) &&
        Objects.equals(this.usuario, datosConsuta.usuario) &&
        Objects.equals(this.tipoCambio, datosConsuta.tipoCambio);
  }
  @Override
  public int hashCode() {
    return Objects.hash(fechaConsulta, numeroConsulta, otorgante, usuario, tipoCambio);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatosConsulta {\n");
    
    sb.append("    fechaConsulta: ").append(toIndentedString(fechaConsulta)).append("\n");
    sb.append("    numeroConsulta: ").append(toIndentedString(numeroConsulta)).append("\n");
    sb.append("    otorgante: ").append(toIndentedString(otorgante)).append("\n");
    sb.append("    usuario: ").append(toIndentedString(usuario)).append("\n");
    sb.append("    tipoCambio: ").append(toIndentedString(tipoCambio)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
