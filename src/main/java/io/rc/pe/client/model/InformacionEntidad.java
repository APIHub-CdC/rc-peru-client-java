package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

public class InformacionEntidad {
  @SerializedName("descripcionEntidad")
  private String descripcionEntidad = null;
  @SerializedName("claveSituacion")
  private String claveSituacion = null;
  @SerializedName("antiguedad")
  private BigDecimal antiguedad = null;
  @SerializedName("fechaUltimoReporte")
  private String fechaUltimoReporte = null;
  @SerializedName("vigente")
  private Float vigente = null;
  @SerializedName("refinanciada")
  private Float refinanciada = null;
  @SerializedName("vencida")
  private Float vencida = null;
  @SerializedName("judicial")
  private Float judicial = null;
  @SerializedName("deudaTotal")
  private Float deudaTotal = null;
  public InformacionEntidad descripcionEntidad(String descripcionEntidad) {
    this.descripcionEntidad = descripcionEntidad;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el nombre de la entidad acreedora en el caso de RCC y el nombre del aportante en el caso de Deuda Microfinanzas no supervisadas.")
  public String getDescripcionEntidad() {
    return descripcionEntidad;
  }
  public void setDescripcionEntidad(String descripcionEntidad) {
    this.descripcionEntidad = descripcionEntidad;
  }
  public InformacionEntidad claveSituacion(String claveSituacion) {
    this.claveSituacion = claveSituacion;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la situación en la que se encuentra: <li> ACT: Es cuando la persona o empresa fue reportada por alguna entidad de la SBS en la última carga de RCC o en la última carga de algún aportante de Deuda Microfinanzas no supervisadas. <li> HIS: Es cuando no fue reportada por alguna entidad en la última carga, pero sí en alguna de los últimos 60 meses (siempre y cuando sea visible).<table><thead><tr><th>Clave</th><th>Situación</th></tr></thead><tbody><tr><td>ACT</td><td>Actual</td></tr><tr><td>HIS</td><td>Histórico</td></tr></tbody></table>")
  public String getClaveSituacion() {
    return claveSituacion;
  }
  public void setClaveSituacion(String claveSituacion) {
    this.claveSituacion = claveSituacion;
  }
  public InformacionEntidad antiguedad(BigDecimal antiguedad) {
    this.antiguedad = antiguedad;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la cantidad de meses desde el primer periodo reportado con cuentas de deuda directa en el producto y entidad.")
  public BigDecimal getAntiguedad() {
    return antiguedad;
  }
  public void setAntiguedad(BigDecimal antiguedad) {
    this.antiguedad = antiguedad;
  }
  public InformacionEntidad fechaUltimoReporte(String fechaUltimoReporte) {
    this.fechaUltimoReporte = fechaUltimoReporte;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el último periodo en el que fue reportado con el producto por la entidad. Formato yyyymm")
  public String getFechaUltimoReporte() {
    return fechaUltimoReporte;
  }
  public void setFechaUltimoReporte(String fechaUltimoReporte) {
    this.fechaUltimoReporte = fechaUltimoReporte;
  }
  public InformacionEntidad vigente(Float vigente) {
    this.vigente = vigente;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el monto de la deuda vigente.")
  public Float getVigente() {
    return vigente;
  }
  public void setVigente(Float vigente) {
    this.vigente = vigente;
  }
  public InformacionEntidad refinanciada(Float refinanciada) {
    this.refinanciada = refinanciada;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el monto de la deuda vigente refinanciada/reestructurada.")
  public Float getRefinanciada() {
    return refinanciada;
  }
  public void setRefinanciada(Float refinanciada) {
    this.refinanciada = refinanciada;
  }
  public InformacionEntidad vencida(Float vencida) {
    this.vencida = vencida;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el monto de la deuda vencida.")
  public Float getVencida() {
    return vencida;
  }
  public void setVencida(Float vencida) {
    this.vencida = vencida;
  }
  public InformacionEntidad judicial(Float judicial) {
    this.judicial = judicial;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el monto de la deuda judicial.")
  public Float getJudicial() {
    return judicial;
  }
  public void setJudicial(Float judicial) {
    this.judicial = judicial;
  }
  public InformacionEntidad deudaTotal(Float deudaTotal) {
    this.deudaTotal = deudaTotal;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la sumatoria de los saldos de la deuda vigente, refinanciada/restructurada, vencida y judicial.")
  public Float getDeudaTotal() {
    return deudaTotal;
  }
  public void setDeudaTotal(Float deudaTotal) {
    this.deudaTotal = deudaTotal;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InformacionEntidad informacionEntidad = (InformacionEntidad) o;
    return Objects.equals(this.descripcionEntidad, informacionEntidad.descripcionEntidad) &&
        Objects.equals(this.claveSituacion, informacionEntidad.claveSituacion) &&
        Objects.equals(this.antiguedad, informacionEntidad.antiguedad) &&
        Objects.equals(this.fechaUltimoReporte, informacionEntidad.fechaUltimoReporte) &&
        Objects.equals(this.vigente, informacionEntidad.vigente) &&
        Objects.equals(this.refinanciada, informacionEntidad.refinanciada) &&
        Objects.equals(this.vencida, informacionEntidad.vencida) &&
        Objects.equals(this.judicial, informacionEntidad.judicial) &&
        Objects.equals(this.deudaTotal, informacionEntidad.deudaTotal);
  }
  @Override
  public int hashCode() {
    return Objects.hash(descripcionEntidad, claveSituacion, antiguedad, fechaUltimoReporte, vigente, refinanciada, vencida, judicial, deudaTotal);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InformacionEntidad {\n");
    
    sb.append("    descripcionEntidad: ").append(toIndentedString(descripcionEntidad)).append("\n");
    sb.append("    claveSituacion: ").append(toIndentedString(claveSituacion)).append("\n");
    sb.append("    antiguedad: ").append(toIndentedString(antiguedad)).append("\n");
    sb.append("    fechaUltimoReporte: ").append(toIndentedString(fechaUltimoReporte)).append("\n");
    sb.append("    vigente: ").append(toIndentedString(vigente)).append("\n");
    sb.append("    refinanciada: ").append(toIndentedString(refinanciada)).append("\n");
    sb.append("    vencida: ").append(toIndentedString(vencida)).append("\n");
    sb.append("    judicial: ").append(toIndentedString(judicial)).append("\n");
    sb.append("    deudaTotal: ").append(toIndentedString(deudaTotal)).append("\n");
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
