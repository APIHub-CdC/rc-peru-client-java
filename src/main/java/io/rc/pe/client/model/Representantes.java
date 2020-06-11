package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

public class Representantes {
  @SerializedName("claveRespuesta")
  private String claveRespuesta = null;
  @SerializedName("fechaReporte")
  private String fechaReporte = null;
  @SerializedName("documentoIdentidad")
  private String documentoIdentidad = null;
  @SerializedName("nombre")
  private String nombre = null;
  @SerializedName("cargo")
  private String cargo = null;
  @SerializedName("fechaInicioCargo")
  private String fechaInicioCargo = null;
  @SerializedName("fechaActaRepresentante")
  private String fechaActaRepresentante = null;
  public Representantes claveRespuesta(String claveRespuesta) {
    this.claveRespuesta = claveRespuesta;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la clave para identificar que se mostrará en la sección:<table><thead><th>Clave</th><th>Descripción</th></thead><tbody><tr><td>RL</td><td>Representantes Legales</td></tr><tr><td>ER</td><td>Empresas Representadas</td></tr></tr></tbody></table>")
  public String getClaveRespuesta() {
    return claveRespuesta;
  }
  public void setClaveRespuesta(String claveRespuesta) {
    this.claveRespuesta = claveRespuesta;
  }
  public Representantes fechaReporte(String fechaReporte) {
    this.fechaReporte = fechaReporte;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la última fecha de reporte. Formato: yyyymm")
  public String getFechaReporte() {
    return fechaReporte;
  }
  public void setFechaReporte(String fechaReporte) {
    this.fechaReporte = fechaReporte;
  }
  public Representantes documentoIdentidad(String documentoIdentidad) {
    this.documentoIdentidad = documentoIdentidad;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el número de documento que identificación del representante legal/ Empresa representada.")
  public String getDocumentoIdentidad() {
    return documentoIdentidad;
  }
  public void setDocumentoIdentidad(String documentoIdentidad) {
    this.documentoIdentidad = documentoIdentidad;
  }
  public Representantes nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }
   
  @ApiModelProperty(value = "Nombre de la persona o empresa.")
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public Representantes cargo(String cargo) {
    this.cargo = cargo;
    return this;
  }
   
  @ApiModelProperty(value = "Nombre del cargo que tiene como representante legal en la empresa.")
  public String getCargo() {
    return cargo;
  }
  public void setCargo(String cargo) {
    this.cargo = cargo;
  }
  public Representantes fechaInicioCargo(String fechaInicioCargo) {
    this.fechaInicioCargo = fechaInicioCargo;
    return this;
  }
   
  @ApiModelProperty(value = "Fecha inicio de vigencia. Formato: yyyymm")
  public String getFechaInicioCargo() {
    return fechaInicioCargo;
  }
  public void setFechaInicioCargo(String fechaInicioCargo) {
    this.fechaInicioCargo = fechaInicioCargo;
  }
  public Representantes fechaActaRepresentante(String fechaActaRepresentante) {
    this.fechaActaRepresentante = fechaActaRepresentante;
    return this;
  }
   
  @ApiModelProperty(value = "Fecha firma de acta. Formato: yyyymm")
  public String getFechaActaRepresentante() {
    return fechaActaRepresentante;
  }
  public void setFechaActaRepresentante(String fechaActaRepresentante) {
    this.fechaActaRepresentante = fechaActaRepresentante;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Representantes representantes = (Representantes) o;
    return Objects.equals(this.claveRespuesta, representantes.claveRespuesta) &&
        Objects.equals(this.fechaReporte, representantes.fechaReporte) &&
        Objects.equals(this.documentoIdentidad, representantes.documentoIdentidad) &&
        Objects.equals(this.nombre, representantes.nombre) &&
        Objects.equals(this.cargo, representantes.cargo) &&
        Objects.equals(this.fechaInicioCargo, representantes.fechaInicioCargo) &&
        Objects.equals(this.fechaActaRepresentante, representantes.fechaActaRepresentante);
  }
  @Override
  public int hashCode() {
    return Objects.hash(claveRespuesta, fechaReporte, documentoIdentidad, nombre, cargo, fechaInicioCargo, fechaActaRepresentante);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Representantes {\n");
    
    sb.append("    claveRespuesta: ").append(toIndentedString(claveRespuesta)).append("\n");
    sb.append("    fechaReporte: ").append(toIndentedString(fechaReporte)).append("\n");
    sb.append("    documentoIdentidad: ").append(toIndentedString(documentoIdentidad)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    cargo: ").append(toIndentedString(cargo)).append("\n");
    sb.append("    fechaInicioCargo: ").append(toIndentedString(fechaInicioCargo)).append("\n");
    sb.append("    fechaActaRepresentante: ").append(toIndentedString(fechaActaRepresentante)).append("\n");
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
