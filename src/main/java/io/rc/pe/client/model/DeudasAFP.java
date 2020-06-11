package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

public class DeudasAFP {
  @SerializedName("descripcionEntidad")
  private String descripcionEntidad = null;
  @SerializedName("fechaReporte")
  private String fechaReporte = null;
  @SerializedName("claveTipoDeuda")
  private String claveTipoDeuda = null;
  @SerializedName("periodoDevengue")
  private String periodoDevengue = null;
  @SerializedName("importeDeudaFondo")
  private Float importeDeudaFondo = null;
  @SerializedName("importeDeudaAFP")
  private Float importeDeudaAFP = null;
  @SerializedName("claveCondicionDeuda")
  private String claveCondicionDeuda = null;
  @SerializedName("claveSituacion")
  private String claveSituacion = null;
  public DeudasAFP descripcionEntidad(String descripcionEntidad) {
    this.descripcionEntidad = descripcionEntidad;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el nombre de la entidad que reporta la deuda.")
  public String getDescripcionEntidad() {
    return descripcionEntidad;
  }
  public void setDescripcionEntidad(String descripcionEntidad) {
    this.descripcionEntidad = descripcionEntidad;
  }
  public DeudasAFP fechaReporte(String fechaReporte) {
    this.fechaReporte = fechaReporte;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la fecha en que fue reportada la deuda o en su defecto la fecha de proceso. Formato: yyyymmdd")
  public String getFechaReporte() {
    return fechaReporte;
  }
  public void setFechaReporte(String fechaReporte) {
    this.fechaReporte = fechaReporte;
  }
  public DeudasAFP claveTipoDeuda(String claveTipoDeuda) {
    this.claveTipoDeuda = claveTipoDeuda;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el tipo de deuda: <table><thead><tr><th>Clave Tipo Deuda</th><th>Tipo Deuda</th></tr></thead><tbody><tr><td>1</td><td>Cierta - Declaracion Sin Pago</td></tr><tr><td>2</td><td>Cierta - Fraccionamiento</td></tr><tr><td>3</td><td>Cierta - No Declarada</td></tr><tr><td>4</td><td>Presunta</td></tr></tbody></table>")
  public String getClaveTipoDeuda() {
    return claveTipoDeuda;
  }
  public void setClaveTipoDeuda(String claveTipoDeuda) {
    this.claveTipoDeuda = claveTipoDeuda;
  }
  public DeudasAFP periodoDevengue(String periodoDevengue) {
    this.periodoDevengue = periodoDevengue;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el periodo reportado por la fuente. Formato: yyyymm")
  public String getPeriodoDevengue() {
    return periodoDevengue;
  }
  public void setPeriodoDevengue(String periodoDevengue) {
    this.periodoDevengue = periodoDevengue;
  }
  public DeudasAFP importeDeudaFondo(Float importeDeudaFondo) {
    this.importeDeudaFondo = importeDeudaFondo;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la suma del monto deuda fondo.")
  public Float getImporteDeudaFondo() {
    return importeDeudaFondo;
  }
  public void setImporteDeudaFondo(Float importeDeudaFondo) {
    this.importeDeudaFondo = importeDeudaFondo;
  }
  public DeudasAFP importeDeudaAFP(Float importeDeudaAFP) {
    this.importeDeudaAFP = importeDeudaAFP;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la suma del monto deuda AFP.")
  public Float getImporteDeudaAFP() {
    return importeDeudaAFP;
  }
  public void setImporteDeudaAFP(Float importeDeudaAFP) {
    this.importeDeudaAFP = importeDeudaAFP;
  }
  public DeudasAFP claveCondicionDeuda(String claveCondicionDeuda) {
    this.claveCondicionDeuda = claveCondicionDeuda;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la condición de la deuda. <table><thead><tr><th>Clave</th><th>Descripción</th></tr></thead><tbody><tr><td>M</td><td>Morosa</td></tr><tr><td>P</td><td>Protestada</td></tr><tr><td>J</td><td>Cobranza Judicial</td></tr><tr><td>C</td><td>Cartera Castigada</td></tr><tr><td>A</td><td>Cobranza Administrativa</td></tr><tr><td>F</td><td>Cobranza Fraccionada</td></tr><tr><td>R</td><td>Procesos Penales</td></tr></tbody></table>")
  public String getClaveCondicionDeuda() {
    return claveCondicionDeuda;
  }
  public void setClaveCondicionDeuda(String claveCondicionDeuda) {
    this.claveCondicionDeuda = claveCondicionDeuda;
  }
  public DeudasAFP claveSituacion(String claveSituacion) {
    this.claveSituacion = claveSituacion;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la situación actual de la deuda. <li> Actual - Cuando la persona fue reportada por algún aportante de una fuente en su última carga. <li> Histórico - es cuando no fue reportada en la última carga de un aportante, pero sí en alguna carga de los últimos 60 meses (siempre y cuando sea visible el registro).<table><thead><tr><th>CLAVE</th><th>SITUACIÓN</th></tr></thead><tbody><tr><td>ACT</td><td>Actual</td></tr><tr><td>HIS</td><td>Histórico</td></tr></tbody></table>")
  public String getClaveSituacion() {
    return claveSituacion;
  }
  public void setClaveSituacion(String claveSituacion) {
    this.claveSituacion = claveSituacion;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeudasAFP deudasAFP = (DeudasAFP) o;
    return Objects.equals(this.descripcionEntidad, deudasAFP.descripcionEntidad) &&
        Objects.equals(this.fechaReporte, deudasAFP.fechaReporte) &&
        Objects.equals(this.claveTipoDeuda, deudasAFP.claveTipoDeuda) &&
        Objects.equals(this.periodoDevengue, deudasAFP.periodoDevengue) &&
        Objects.equals(this.importeDeudaFondo, deudasAFP.importeDeudaFondo) &&
        Objects.equals(this.importeDeudaAFP, deudasAFP.importeDeudaAFP) &&
        Objects.equals(this.claveCondicionDeuda, deudasAFP.claveCondicionDeuda) &&
        Objects.equals(this.claveSituacion, deudasAFP.claveSituacion);
  }
  @Override
  public int hashCode() {
    return Objects.hash(descripcionEntidad, fechaReporte, claveTipoDeuda, periodoDevengue, importeDeudaFondo, importeDeudaAFP, claveCondicionDeuda, claveSituacion);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeudasAFP {\n");
    
    sb.append("    descripcionEntidad: ").append(toIndentedString(descripcionEntidad)).append("\n");
    sb.append("    fechaReporte: ").append(toIndentedString(fechaReporte)).append("\n");
    sb.append("    claveTipoDeuda: ").append(toIndentedString(claveTipoDeuda)).append("\n");
    sb.append("    periodoDevengue: ").append(toIndentedString(periodoDevengue)).append("\n");
    sb.append("    importeDeudaFondo: ").append(toIndentedString(importeDeudaFondo)).append("\n");
    sb.append("    importeDeudaAFP: ").append(toIndentedString(importeDeudaAFP)).append("\n");
    sb.append("    claveCondicionDeuda: ").append(toIndentedString(claveCondicionDeuda)).append("\n");
    sb.append("    claveSituacion: ").append(toIndentedString(claveSituacion)).append("\n");
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
