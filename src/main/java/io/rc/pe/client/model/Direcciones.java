package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

public class Direcciones {
  @SerializedName("fuente")
  private String fuente = null;
  @SerializedName("ubigeo")
  private String ubigeo = null;
  @SerializedName("departamento")
  private String departamento = null;
  @SerializedName("provincia")
  private String provincia = null;
  @SerializedName("distrito")
  private String distrito = null;
  @SerializedName("nombreVia")
  private String nombreVia = null;
  @SerializedName("numeroExterior")
  private String numeroExterior = null;
  @SerializedName("numeroInterior")
  private String numeroInterior = null;
  @SerializedName("nombreZona")
  private String nombreZona = null;
  @SerializedName("referencia")
  private String referencia = null;
  @SerializedName("fecha")
  private String fecha = null;
  @SerializedName("fechaActualizaciontSunat")
  private String fechaActualizaciontSunat = null;
  public Direcciones fuente(String fuente) {
    this.fuente = fuente;
    return this;
  }
   
  @ApiModelProperty(value = "Entidad que reporta la información.")
  public String getFuente() {
    return fuente;
  }
  public void setFuente(String fuente) {
    this.fuente = fuente;
  }
  public Direcciones ubigeo(String ubigeo) {
    this.ubigeo = ubigeo;
    return this;
  }
   
  @ApiModelProperty(value = "Número de la clave ubigeo al que pertenece la dirección.")
  public String getUbigeo() {
    return ubigeo;
  }
  public void setUbigeo(String ubigeo) {
    this.ubigeo = ubigeo;
  }
  public Direcciones departamento(String departamento) {
    this.departamento = departamento;
    return this;
  }
   
  @ApiModelProperty(value = "Departamento al que pertenece.")
  public String getDepartamento() {
    return departamento;
  }
  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }
  public Direcciones provincia(String provincia) {
    this.provincia = provincia;
    return this;
  }
   
  @ApiModelProperty(value = "Provincia a la que pertenece.")
  public String getProvincia() {
    return provincia;
  }
  public void setProvincia(String provincia) {
    this.provincia = provincia;
  }
  public Direcciones distrito(String distrito) {
    this.distrito = distrito;
    return this;
  }
   
  @ApiModelProperty(value = "Distrito al que pertenece.")
  public String getDistrito() {
    return distrito;
  }
  public void setDistrito(String distrito) {
    this.distrito = distrito;
  }
  public Direcciones nombreVia(String nombreVia) {
    this.nombreVia = nombreVia;
    return this;
  }
   
  @ApiModelProperty(value = "Calle o via de la dirección de la persona.")
  public String getNombreVia() {
    return nombreVia;
  }
  public void setNombreVia(String nombreVia) {
    this.nombreVia = nombreVia;
  }
  public Direcciones numeroExterior(String numeroExterior) {
    this.numeroExterior = numeroExterior;
    return this;
  }
   
  @ApiModelProperty(value = "Número exterior correspondiente a la dirección de la persona.")
  public String getNumeroExterior() {
    return numeroExterior;
  }
  public void setNumeroExterior(String numeroExterior) {
    this.numeroExterior = numeroExterior;
  }
  public Direcciones numeroInterior(String numeroInterior) {
    this.numeroInterior = numeroInterior;
    return this;
  }
   
  @ApiModelProperty(value = "Número interior correspondiente a la dirección de la persona.")
  public String getNumeroInterior() {
    return numeroInterior;
  }
  public void setNumeroInterior(String numeroInterior) {
    this.numeroInterior = numeroInterior;
  }
  public Direcciones nombreZona(String nombreZona) {
    this.nombreZona = nombreZona;
    return this;
  }
   
  @ApiModelProperty(value = "Colonia o zona correspondiente a la dirección de la persona.")
  public String getNombreZona() {
    return nombreZona;
  }
  public void setNombreZona(String nombreZona) {
    this.nombreZona = nombreZona;
  }
  public Direcciones referencia(String referencia) {
    this.referencia = referencia;
    return this;
  }
   
  @ApiModelProperty(value = "Datos de referencia para ubicar el domicilio.")
  public String getReferencia() {
    return referencia;
  }
  public void setReferencia(String referencia) {
    this.referencia = referencia;
  }
  public Direcciones fecha(String fecha) {
    this.fecha = fecha;
    return this;
  }
   
  @ApiModelProperty(value = "Fecha de la última actualización. Formato: yyyymm")
  public String getFecha() {
    return fecha;
  }
  public void setFecha(String fecha) {
    this.fecha = fecha;
  }
  public Direcciones fechaActualizaciontSunat(String fechaActualizaciontSunat) {
    this.fechaActualizaciontSunat = fechaActualizaciontSunat;
    return this;
  }
   
  @ApiModelProperty(value = "Fecha de actualización de SUNAT. Formato: yyyymm")
  public String getFechaActualizaciontSunat() {
    return fechaActualizaciontSunat;
  }
  public void setFechaActualizaciontSunat(String fechaActualizaciontSunat) {
    this.fechaActualizaciontSunat = fechaActualizaciontSunat;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Direcciones direcciones = (Direcciones) o;
    return Objects.equals(this.fuente, direcciones.fuente) &&
        Objects.equals(this.ubigeo, direcciones.ubigeo) &&
        Objects.equals(this.departamento, direcciones.departamento) &&
        Objects.equals(this.provincia, direcciones.provincia) &&
        Objects.equals(this.distrito, direcciones.distrito) &&
        Objects.equals(this.nombreVia, direcciones.nombreVia) &&
        Objects.equals(this.numeroExterior, direcciones.numeroExterior) &&
        Objects.equals(this.numeroInterior, direcciones.numeroInterior) &&
        Objects.equals(this.nombreZona, direcciones.nombreZona) &&
        Objects.equals(this.referencia, direcciones.referencia) &&
        Objects.equals(this.fecha, direcciones.fecha) &&
        Objects.equals(this.fechaActualizaciontSunat, direcciones.fechaActualizaciontSunat);
  }
  @Override
  public int hashCode() {
    return Objects.hash(fuente, ubigeo, departamento, provincia, distrito, nombreVia, numeroExterior, numeroInterior, nombreZona, referencia, fecha, fechaActualizaciontSunat);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Direcciones {\n");
    
    sb.append("    fuente: ").append(toIndentedString(fuente)).append("\n");
    sb.append("    ubigeo: ").append(toIndentedString(ubigeo)).append("\n");
    sb.append("    departamento: ").append(toIndentedString(departamento)).append("\n");
    sb.append("    provincia: ").append(toIndentedString(provincia)).append("\n");
    sb.append("    distrito: ").append(toIndentedString(distrito)).append("\n");
    sb.append("    nombreVia: ").append(toIndentedString(nombreVia)).append("\n");
    sb.append("    numeroExterior: ").append(toIndentedString(numeroExterior)).append("\n");
    sb.append("    numeroInterior: ").append(toIndentedString(numeroInterior)).append("\n");
    sb.append("    nombreZona: ").append(toIndentedString(nombreZona)).append("\n");
    sb.append("    referencia: ").append(toIndentedString(referencia)).append("\n");
    sb.append("    fecha: ").append(toIndentedString(fecha)).append("\n");
    sb.append("    fechaActualizaciontSunat: ").append(toIndentedString(fechaActualizaciontSunat)).append("\n");
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
