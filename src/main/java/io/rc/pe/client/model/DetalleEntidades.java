package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Muestra el detalle por entidad que reporta a la RCC del mes correspondiente.")


public class DetalleEntidades {
  @SerializedName("nombreEntidad")
  private String nombreEntidad = null;
  @SerializedName("idCalificacionEntidad")
  private String idCalificacionEntidad = null;
  @SerializedName("porcentajeCalificacion")
  private Float porcentajeCalificacion = null;
  @SerializedName("detalleVigente")
  private Float detalleVigente = null;
  @SerializedName("detalleVencidaMenor30")
  private Float detalleVencidaMenor30 = null;
  @SerializedName("detalleVencidaMayor30")
  private Float detalleVencidaMayor30 = null;
  @SerializedName("detalleJudicial")
  private Float detalleJudicial = null;
  @SerializedName("detalleRefinanciada")
  private Float detalleRefinanciada = null;
  @SerializedName("detalleIndirecta")
  private Float detalleIndirecta = null;
  @SerializedName("detalleCastigo")
  private Float detalleCastigo = null;
  public DetalleEntidades nombreEntidad(String nombreEntidad) {
    this.nombreEntidad = nombreEntidad;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el nombre de la entidad.")
  public String getNombreEntidad() {
    return nombreEntidad;
  }
  public void setNombreEntidad(String nombreEntidad) {
    this.nombreEntidad = nombreEntidad;
  }
  public DetalleEntidades idCalificacionEntidad(String idCalificacionEntidad) {
    this.idCalificacionEntidad = idCalificacionEntidad;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la peor calificación de la entidad reportadas en el último periodo reportado por la SBS. Si la fecha de reporte SBS no corresponde a al último periodo reportado por la SBS, la peor calificación indicará 9 (Histórico). <table><thead><tr><th>Id Calificación</th><th>Calificación</th></tr></thead><tbody><tr><td>0</td><td>Normal</td></tr><tr><td>1</td><td>Problemas Potenciales</td></tr><tr><td>2</td><td>Deficiente</td></tr><tr><td>3</td><td>Dudoso</td></tr><tr><td>4</td><td>Pérdida</td></tr><tr><td>5</td><td>Cerrada</td></tr><tr><td>6</td><td>Abierto</td></tr><tr><td>7</td><td>Sin Calificación</td></tr><tr><td>9</td><td>Histórico</td></tr></tbody></table>")
  public String getIdCalificacionEntidad() {
    return idCalificacionEntidad;
  }
  public void setIdCalificacionEntidad(String idCalificacionEntidad) {
    this.idCalificacionEntidad = idCalificacionEntidad;
  }
  public DetalleEntidades porcentajeCalificacion(Float porcentajeCalificacion) {
    this.porcentajeCalificacion = porcentajeCalificacion;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el porcentaje asociado con la calificación del mes reportada por la entidad multiplicado por 100.")
  public Float getPorcentajeCalificacion() {
    return porcentajeCalificacion;
  }
  public void setPorcentajeCalificacion(Float porcentajeCalificacion) {
    this.porcentajeCalificacion = porcentajeCalificacion;
  }
  public DetalleEntidades detalleVigente(Float detalleVigente) {
    this.detalleVigente = detalleVigente;
    return this;
  }
   
  @ApiModelProperty(value = "Suma de monto de deuda directa y con situación vigente reportada por la entidad.")
  public Float getDetalleVigente() {
    return detalleVigente;
  }
  public void setDetalleVigente(Float detalleVigente) {
    this.detalleVigente = detalleVigente;
  }
  public DetalleEntidades detalleVencidaMenor30(Float detalleVencidaMenor30) {
    this.detalleVencidaMenor30 = detalleVencidaMenor30;
    return this;
  }
   
  @ApiModelProperty(value = "Suma de monto de deuda directa y con situación vencida menor a 30 días reportada por la entidad.")
  public Float getDetalleVencidaMenor30() {
    return detalleVencidaMenor30;
  }
  public void setDetalleVencidaMenor30(Float detalleVencidaMenor30) {
    this.detalleVencidaMenor30 = detalleVencidaMenor30;
  }
  public DetalleEntidades detalleVencidaMayor30(Float detalleVencidaMayor30) {
    this.detalleVencidaMayor30 = detalleVencidaMayor30;
    return this;
  }
   
  @ApiModelProperty(value = "Suma de monto de deuda directa y con situación vencida mayor a 30 días reportadas por la entidad.")
  public Float getDetalleVencidaMayor30() {
    return detalleVencidaMayor30;
  }
  public void setDetalleVencidaMayor30(Float detalleVencidaMayor30) {
    this.detalleVencidaMayor30 = detalleVencidaMayor30;
  }
  public DetalleEntidades detalleJudicial(Float detalleJudicial) {
    this.detalleJudicial = detalleJudicial;
    return this;
  }
   
  @ApiModelProperty(value = "Suma de monto de deuda directa y con situación judicial reportadas por la entidad.")
  public Float getDetalleJudicial() {
    return detalleJudicial;
  }
  public void setDetalleJudicial(Float detalleJudicial) {
    this.detalleJudicial = detalleJudicial;
  }
  public DetalleEntidades detalleRefinanciada(Float detalleRefinanciada) {
    this.detalleRefinanciada = detalleRefinanciada;
    return this;
  }
   
  @ApiModelProperty(value = "Suma de monto de deuda directa y con situación refinanciada o reestructurada reportadas por la entidad.")
  public Float getDetalleRefinanciada() {
    return detalleRefinanciada;
  }
  public void setDetalleRefinanciada(Float detalleRefinanciada) {
    this.detalleRefinanciada = detalleRefinanciada;
  }
  public DetalleEntidades detalleIndirecta(Float detalleIndirecta) {
    this.detalleIndirecta = detalleIndirecta;
    return this;
  }
   
  @ApiModelProperty(value = "Suma de monto de deuda indirecta reportada por la entidad.")
  public Float getDetalleIndirecta() {
    return detalleIndirecta;
  }
  public void setDetalleIndirecta(Float detalleIndirecta) {
    this.detalleIndirecta = detalleIndirecta;
  }
  public DetalleEntidades detalleCastigo(Float detalleCastigo) {
    this.detalleCastigo = detalleCastigo;
    return this;
  }
   
  @ApiModelProperty(value = "Suma de monto de castigos reportados por la entidad.")
  public Float getDetalleCastigo() {
    return detalleCastigo;
  }
  public void setDetalleCastigo(Float detalleCastigo) {
    this.detalleCastigo = detalleCastigo;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetalleEntidades detalleEntidades = (DetalleEntidades) o;
    return Objects.equals(this.nombreEntidad, detalleEntidades.nombreEntidad) &&
        Objects.equals(this.idCalificacionEntidad, detalleEntidades.idCalificacionEntidad) &&
        Objects.equals(this.porcentajeCalificacion, detalleEntidades.porcentajeCalificacion) &&
        Objects.equals(this.detalleVigente, detalleEntidades.detalleVigente) &&
        Objects.equals(this.detalleVencidaMenor30, detalleEntidades.detalleVencidaMenor30) &&
        Objects.equals(this.detalleVencidaMayor30, detalleEntidades.detalleVencidaMayor30) &&
        Objects.equals(this.detalleJudicial, detalleEntidades.detalleJudicial) &&
        Objects.equals(this.detalleRefinanciada, detalleEntidades.detalleRefinanciada) &&
        Objects.equals(this.detalleIndirecta, detalleEntidades.detalleIndirecta) &&
        Objects.equals(this.detalleCastigo, detalleEntidades.detalleCastigo);
  }
  @Override
  public int hashCode() {
    return Objects.hash(nombreEntidad, idCalificacionEntidad, porcentajeCalificacion, detalleVigente, detalleVencidaMenor30, detalleVencidaMayor30, detalleJudicial, detalleRefinanciada, detalleIndirecta, detalleCastigo);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalleEntidades {\n");
    
    sb.append("    nombreEntidad: ").append(toIndentedString(nombreEntidad)).append("\n");
    sb.append("    idCalificacionEntidad: ").append(toIndentedString(idCalificacionEntidad)).append("\n");
    sb.append("    porcentajeCalificacion: ").append(toIndentedString(porcentajeCalificacion)).append("\n");
    sb.append("    detalleVigente: ").append(toIndentedString(detalleVigente)).append("\n");
    sb.append("    detalleVencidaMenor30: ").append(toIndentedString(detalleVencidaMenor30)).append("\n");
    sb.append("    detalleVencidaMayor30: ").append(toIndentedString(detalleVencidaMayor30)).append("\n");
    sb.append("    detalleJudicial: ").append(toIndentedString(detalleJudicial)).append("\n");
    sb.append("    detalleRefinanciada: ").append(toIndentedString(detalleRefinanciada)).append("\n");
    sb.append("    detalleIndirecta: ").append(toIndentedString(detalleIndirecta)).append("\n");
    sb.append("    detalleCastigo: ").append(toIndentedString(detalleCastigo)).append("\n");
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
