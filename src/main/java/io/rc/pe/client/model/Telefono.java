package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

public class Telefono {
  @SerializedName("fuente")
  private String fuente = null;
  @SerializedName("telefono")
  private String telefono = null;
  @SerializedName("codigo")
  private String codigo = null;
  @SerializedName("fechaActualizacion")
  private String fechaActualizacion = null;
  public Telefono fuente(String fuente) {
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
  public Telefono telefono(String telefono) {
    this.telefono = telefono;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la Información detallada de los teléfonos registrados.")
  public String getTelefono() {
    return telefono;
  }
  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }
  public Telefono codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el codigo de la ciudad que corresponde el teléfono.")
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }
  public Telefono fechaActualizacion(String fechaActualizacion) {
    this.fechaActualizacion = fechaActualizacion;
    return this;
  }
   
  @ApiModelProperty(value = "Fecha de la última actualización. Formato: yyyymm")
  public String getFechaActualizacion() {
    return fechaActualizacion;
  }
  public void setFechaActualizacion(String fechaActualizacion) {
    this.fechaActualizacion = fechaActualizacion;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Telefono telefono = (Telefono) o;
    return Objects.equals(this.fuente, telefono.fuente) &&
        Objects.equals(this.telefono, telefono.telefono) &&
        Objects.equals(this.codigo, telefono.codigo) &&
        Objects.equals(this.fechaActualizacion, telefono.fechaActualizacion);
  }
  @Override
  public int hashCode() {
    return Objects.hash(fuente, telefono, codigo, fechaActualizacion);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Telefono {\n");
    
    sb.append("    fuente: ").append(toIndentedString(fuente)).append("\n");
    sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    fechaActualizacion: ").append(toIndentedString(fechaActualizacion)).append("\n");
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
