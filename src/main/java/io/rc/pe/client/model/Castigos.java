package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

public class Castigos {
  @SerializedName("descripcionEntidad")
  private String descripcionEntidad = null;
  @SerializedName("claveEstatusPago")
  private String claveEstatusPago = null;
  @SerializedName("fechaPrimerCastigo")
  private String fechaPrimerCastigo = null;
  @SerializedName("fechaUltimoCastigo")
  private String fechaUltimoCastigo = null;
  @SerializedName("montoUltimoCastigo")
  private Float montoUltimoCastigo = null;
  public Castigos descripcionEntidad(String descripcionEntidad) {
    this.descripcionEntidad = descripcionEntidad;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el nombre de la entidad con la que se tiene el castigo.")
  public String getDescripcionEntidad() {
    return descripcionEntidad;
  }
  public void setDescripcionEntidad(String descripcionEntidad) {
    this.descripcionEntidad = descripcionEntidad;
  }
  public Castigos claveEstatusPago(String claveEstatusPago) {
    this.claveEstatusPago = claveEstatusPago;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la situación en la que se encuentra el castigo: <li> ACT: Es cuando la persona o empresa fue reportada por alguna entidad de la SBS en la última carga de RCC o en la última carga de algún aportante de Deuda Micro. <li> HIS: Es cuando no fue reportada por alguna entidad en la última carga, pero sí en alguna de los últimos 60 meses (siempre y cuando sea visible).<table><thead><tr><th>Clave</th><th>Situación</th></tr></thead><tbody><tr><td>ACT</td><td>Actual</td></tr><tr><td>HIS</td><td>Histórico</td></tr></tbody></table>")
  public String getClaveEstatusPago() {
    return claveEstatusPago;
  }
  public void setClaveEstatusPago(String claveEstatusPago) {
    this.claveEstatusPago = claveEstatusPago;
  }
  public Castigos fechaPrimerCastigo(String fechaPrimerCastigo) {
    this.fechaPrimerCastigo = fechaPrimerCastigo;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el periodo en el que fue reportado con castigo en la entidad por primera vez dentro de los últimos 60 meses. Formato yyyymm")
  public String getFechaPrimerCastigo() {
    return fechaPrimerCastigo;
  }
  public void setFechaPrimerCastigo(String fechaPrimerCastigo) {
    this.fechaPrimerCastigo = fechaPrimerCastigo;
  }
  public Castigos fechaUltimoCastigo(String fechaUltimoCastigo) {
    this.fechaUltimoCastigo = fechaUltimoCastigo;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el último periodo en el que fue reportado con castigo en la entidad dentro de los últimos 60 meses. Formato yyyymm")
  public String getFechaUltimoCastigo() {
    return fechaUltimoCastigo;
  }
  public void setFechaUltimoCastigo(String fechaUltimoCastigo) {
    this.fechaUltimoCastigo = fechaUltimoCastigo;
  }
  public Castigos montoUltimoCastigo(Float montoUltimoCastigo) {
    this.montoUltimoCastigo = montoUltimoCastigo;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el monto de la deuda castigada ya sea de la RCC o Microfinanzas no supervisadas.")
  public Float getMontoUltimoCastigo() {
    return montoUltimoCastigo;
  }
  public void setMontoUltimoCastigo(Float montoUltimoCastigo) {
    this.montoUltimoCastigo = montoUltimoCastigo;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Castigos castigos = (Castigos) o;
    return Objects.equals(this.descripcionEntidad, castigos.descripcionEntidad) &&
        Objects.equals(this.claveEstatusPago, castigos.claveEstatusPago) &&
        Objects.equals(this.fechaPrimerCastigo, castigos.fechaPrimerCastigo) &&
        Objects.equals(this.fechaUltimoCastigo, castigos.fechaUltimoCastigo) &&
        Objects.equals(this.montoUltimoCastigo, castigos.montoUltimoCastigo);
  }
  @Override
  public int hashCode() {
    return Objects.hash(descripcionEntidad, claveEstatusPago, fechaPrimerCastigo, fechaUltimoCastigo, montoUltimoCastigo);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Castigos {\n");
    
    sb.append("    descripcionEntidad: ").append(toIndentedString(descripcionEntidad)).append("\n");
    sb.append("    claveEstatusPago: ").append(toIndentedString(claveEstatusPago)).append("\n");
    sb.append("    fechaPrimerCastigo: ").append(toIndentedString(fechaPrimerCastigo)).append("\n");
    sb.append("    fechaUltimoCastigo: ").append(toIndentedString(fechaUltimoCastigo)).append("\n");
    sb.append("    montoUltimoCastigo: ").append(toIndentedString(montoUltimoCastigo)).append("\n");
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
