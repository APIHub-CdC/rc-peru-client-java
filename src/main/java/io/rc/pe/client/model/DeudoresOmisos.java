package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;


public class DeudoresOmisos {
  @SerializedName("tipo")
  private String tipo = null;
  @SerializedName("periodo")
  private String periodo = null;
  @SerializedName("claveSituacion")
  private String claveSituacion = null;
  @SerializedName("acreedorConcepto")
  private String acreedorConcepto = null;
  @SerializedName("fechaReporte")
  private String fechaReporte = null;
  @SerializedName("montoDeuda")
  private Float montoDeuda = null;
  public DeudoresOmisos tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra dos tipos de estatus: •Deudor u •Omiso.")
  public String getTipo() {
    return tipo;
  }
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }
  public DeudoresOmisos periodo(String periodo) {
    this.periodo = periodo;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el Periodo tributario o periodo omiso. Formato: yyyymm")
  public String getPeriodo() {
    return periodo;
  }
  public void setPeriodo(String periodo) {
    this.periodo = periodo;
  }
  public DeudoresOmisos claveSituacion(String claveSituacion) {
    this.claveSituacion = claveSituacion;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la situación actual de la deuda. <li> Actual - Cuando la persona fue reportada por algún aportante de una fuente en su última carga. <li> Histórico - es cuando no fue reportada en la última carga de un aportante, pero sí en alguna carga de los últimos 60 meses (siempre y cuando sea visible el registro). <table><thead><tr><th>CLAVE</th><th>SITUACIÓN</th></tr></thead><tbody><tr><td>ACT</td><td>Actual</td></tr><tr><td>HIS</td><td>Histórico</td></tr></tbody></table>")
  public String getClaveSituacion() {
    return claveSituacion;
  }
  public void setClaveSituacion(String claveSituacion) {
    this.claveSituacion = claveSituacion;
  }
  public DeudoresOmisos acreedorConcepto(String acreedorConcepto) {
    this.acreedorConcepto = acreedorConcepto;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el tipo de acreedor cuando el tipo es deudor y la de concepto cuando la deuda es de tipo omiso.")
  public String getAcreedorConcepto() {
    return acreedorConcepto;
  }
  public void setAcreedorConcepto(String acreedorConcepto) {
    this.acreedorConcepto = acreedorConcepto;
  }
  public DeudoresOmisos fechaReporte(String fechaReporte) {
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
  public DeudoresOmisos montoDeuda(Float montoDeuda) {
    this.montoDeuda = montoDeuda;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el monto adeudado.")
  public Float getMontoDeuda() {
    return montoDeuda;
  }
  public void setMontoDeuda(Float montoDeuda) {
    this.montoDeuda = montoDeuda;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeudoresOmisos deudoresOmisos = (DeudoresOmisos) o;
    return Objects.equals(this.tipo, deudoresOmisos.tipo) &&
        Objects.equals(this.periodo, deudoresOmisos.periodo) &&
        Objects.equals(this.claveSituacion, deudoresOmisos.claveSituacion) &&
        Objects.equals(this.acreedorConcepto, deudoresOmisos.acreedorConcepto) &&
        Objects.equals(this.fechaReporte, deudoresOmisos.fechaReporte) &&
        Objects.equals(this.montoDeuda, deudoresOmisos.montoDeuda);
  }
  @Override
  public int hashCode() {
    return Objects.hash(tipo, periodo, claveSituacion, acreedorConcepto, fechaReporte, montoDeuda);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeudoresOmisos {\n");
    
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    periodo: ").append(toIndentedString(periodo)).append("\n");
    sb.append("    claveSituacion: ").append(toIndentedString(claveSituacion)).append("\n");
    sb.append("    acreedorConcepto: ").append(toIndentedString(acreedorConcepto)).append("\n");
    sb.append("    fechaReporte: ").append(toIndentedString(fechaReporte)).append("\n");
    sb.append("    montoDeuda: ").append(toIndentedString(montoDeuda)).append("\n");
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
