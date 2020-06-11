package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.rc.pe.client.model.Exportaciones;
import io.rc.pe.client.model.Importaciones;
import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "Muestra el detalle de las exportaciones e importaciones.")
public class ComercioExterior {
  @SerializedName("exportaciones")
  private List<Exportaciones> exportaciones = null;
  @SerializedName("importaciones")
  private List<Importaciones> importaciones = null;
  public ComercioExterior exportaciones(List<Exportaciones> exportaciones) {
    this.exportaciones = exportaciones;
    return this;
  }
  public ComercioExterior addExportacionesItem(Exportaciones exportacionesItem) {
    if (this.exportaciones == null) {
      this.exportaciones = new ArrayList<Exportaciones>();
    }
    this.exportaciones.add(exportacionesItem);
    return this;
  }
   
  @ApiModelProperty(example = "[{\"periodo\":\"201912\",\"monto\":0},{\"periodo\":\"201911\",\"monto\":1878267.29}]", value = "Muestra el detalle de las exportaciones.")
  public List<Exportaciones> getExportaciones() {
    return exportaciones;
  }
  public void setExportaciones(List<Exportaciones> exportaciones) {
    this.exportaciones = exportaciones;
  }
  public ComercioExterior importaciones(List<Importaciones> importaciones) {
    this.importaciones = importaciones;
    return this;
  }
  public ComercioExterior addImportacionesItem(Importaciones importacionesItem) {
    if (this.importaciones == null) {
      this.importaciones = new ArrayList<Importaciones>();
    }
    this.importaciones.add(importacionesItem);
    return this;
  }
   
  @ApiModelProperty(example = "[{\"periodo\":\"201912\",\"monto\":0},{\"periodo\":\"201911\",\"monto\":1037333.08}]", value = "Muestra el detalle de las importaciones.")
  public List<Importaciones> getImportaciones() {
    return importaciones;
  }
  public void setImportaciones(List<Importaciones> importaciones) {
    this.importaciones = importaciones;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComercioExterior comercioExterior = (ComercioExterior) o;
    return Objects.equals(this.exportaciones, comercioExterior.exportaciones) &&
        Objects.equals(this.importaciones, comercioExterior.importaciones);
  }
  @Override
  public int hashCode() {
    return Objects.hash(exportaciones, importaciones);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComercioExterior {\n");
    
    sb.append("    exportaciones: ").append(toIndentedString(exportaciones)).append("\n");
    sb.append("    importaciones: ").append(toIndentedString(importaciones)).append("\n");
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
