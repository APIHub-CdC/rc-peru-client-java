package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import io.rc.pe.client.model.DetalleEntidad;
import java.util.ArrayList;
import java.util.List;


public class Entidad {
  @SerializedName("descripcionEntidad")
  private String descripcionEntidad = null;
  @SerializedName("detalleEntidad")
  private List<DetalleEntidad> detalleEntidad = null;
  public Entidad descripcionEntidad(String descripcionEntidad) {
    this.descripcionEntidad = descripcionEntidad;
    return this;
  }
   
  @ApiModelProperty(value = "Nombre comercial de la empresa.")
  public String getDescripcionEntidad() {
    return descripcionEntidad;
  }
  public void setDescripcionEntidad(String descripcionEntidad) {
    this.descripcionEntidad = descripcionEntidad;
  }
  public Entidad detalleEntidad(List<DetalleEntidad> detalleEntidad) {
    this.detalleEntidad = detalleEntidad;
    return this;
  }
  public Entidad addDetalleEntidadItem(DetalleEntidad detalleEntidadItem) {
    if (this.detalleEntidad == null) {
      this.detalleEntidad = new ArrayList<DetalleEntidad>();
    }
    this.detalleEntidad.add(detalleEntidadItem);
    return this;
  }
   
  @ApiModelProperty(value = "Muestra los detalles de cada entidad.")
  public List<DetalleEntidad> getDetalleEntidad() {
    return detalleEntidad;
  }
  public void setDetalleEntidad(List<DetalleEntidad> detalleEntidad) {
    this.detalleEntidad = detalleEntidad;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Entidad entidad = (Entidad) o;
    return Objects.equals(this.descripcionEntidad, entidad.descripcionEntidad) &&
        Objects.equals(this.detalleEntidad, entidad.detalleEntidad);
  }
  @Override
  public int hashCode() {
    return Objects.hash(descripcionEntidad, detalleEntidad);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entidad {\n");
    
    sb.append("    descripcionEntidad: ").append(toIndentedString(descripcionEntidad)).append("\n");
    sb.append("    detalleEntidad: ").append(toIndentedString(detalleEntidad)).append("\n");
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
