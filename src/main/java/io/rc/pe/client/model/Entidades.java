package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Muestra el detalle por entidad que reporta a la RCC del mes correspondiente.")
public class Entidades {
  @SerializedName("nombreEntidad")
  private String nombreEntidad = null;
  @SerializedName("idCalificacion")
  private String idCalificacion = null;
  @SerializedName("porcentajeCalificacion")
  private Float porcentajeCalificacion = null;
  @SerializedName("detalleVigente")
  private Float detalleVigente = null;
  @SerializedName("detalleVencida")
  private Float detalleVencida = null;
  @SerializedName("detalleJudicial")
  private Float detalleJudicial = null;
  @SerializedName("detalleRR")
  private Float detalleRR = null;
  @SerializedName("detalleIndirecta")
  private Float detalleIndirecta = null;
  @SerializedName("detalleCastigos")
  private Float detalleCastigos = null;
  @SerializedName("detalleProvisiones")
  private Float detalleProvisiones = null;
  public Entidades nombreEntidad(String nombreEntidad) {
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
  public Entidades idCalificacion(String idCalificacion) {
    this.idCalificacion = idCalificacion;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el identificador con la calificación de la entidad del mes correspondiente. <table><thead><tr><th>Id Calificación</th><th>Calificación</th></tr></thead><tbody><tr><td>0</td><td>Normal</td></tr><tr><td>1</td><td>Problemas Potenciales</td></tr><tr><td>2</td><td>Deficiente</td></tr><tr><td>3</td><td>Dudoso</td></tr><tr><td>4</td><td>Pérdida</td></tr><tr><td>5</td><td>Cerrada</td></tr><tr><td>6</td><td>Abierto</td></tr><tr><td>7</td><td>Sin Calificación</td></tr><tr><td>9</td><td>Histórico</td></tr></tbody></table>")
  public String getIdCalificacion() {
    return idCalificacion;
  }
  public void setIdCalificacion(String idCalificacion) {
    this.idCalificacion = idCalificacion;
  }
  public Entidades porcentajeCalificacion(Float porcentajeCalificacion) {
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
  public Entidades detalleVigente(Float detalleVigente) {
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
  public Entidades detalleVencida(Float detalleVencida) {
    this.detalleVencida = detalleVencida;
    return this;
  }
   
  @ApiModelProperty(value = "Suma de monto de deuda directa y con situación vencida reportada por la entidad.")
  public Float getDetalleVencida() {
    return detalleVencida;
  }
  public void setDetalleVencida(Float detalleVencida) {
    this.detalleVencida = detalleVencida;
  }
  public Entidades detalleJudicial(Float detalleJudicial) {
    this.detalleJudicial = detalleJudicial;
    return this;
  }
   
  @ApiModelProperty(value = "Suma de monto de deuda directa y con situación judicial reportada por la entidad.")
  public Float getDetalleJudicial() {
    return detalleJudicial;
  }
  public void setDetalleJudicial(Float detalleJudicial) {
    this.detalleJudicial = detalleJudicial;
  }
  public Entidades detalleRR(Float detalleRR) {
    this.detalleRR = detalleRR;
    return this;
  }
   
  @ApiModelProperty(value = "Suma de monto de deuda directa y con situación refinanciada o reestructurada reportada por la entidad.")
  public Float getDetalleRR() {
    return detalleRR;
  }
  public void setDetalleRR(Float detalleRR) {
    this.detalleRR = detalleRR;
  }
  public Entidades detalleIndirecta(Float detalleIndirecta) {
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
  public Entidades detalleCastigos(Float detalleCastigos) {
    this.detalleCastigos = detalleCastigos;
    return this;
  }
   
  @ApiModelProperty(value = "Suma de monto de castigos reportados por la entidad.")
  public Float getDetalleCastigos() {
    return detalleCastigos;
  }
  public void setDetalleCastigos(Float detalleCastigos) {
    this.detalleCastigos = detalleCastigos;
  }
  public Entidades detalleProvisiones(Float detalleProvisiones) {
    this.detalleProvisiones = detalleProvisiones;
    return this;
  }
   
  @ApiModelProperty(value = "Suma de monto de provisiones reportados por la entidad.")
  public Float getDetalleProvisiones() {
    return detalleProvisiones;
  }
  public void setDetalleProvisiones(Float detalleProvisiones) {
    this.detalleProvisiones = detalleProvisiones;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Entidades entidades = (Entidades) o;
    return Objects.equals(this.nombreEntidad, entidades.nombreEntidad) &&
        Objects.equals(this.idCalificacion, entidades.idCalificacion) &&
        Objects.equals(this.porcentajeCalificacion, entidades.porcentajeCalificacion) &&
        Objects.equals(this.detalleVigente, entidades.detalleVigente) &&
        Objects.equals(this.detalleVencida, entidades.detalleVencida) &&
        Objects.equals(this.detalleJudicial, entidades.detalleJudicial) &&
        Objects.equals(this.detalleRR, entidades.detalleRR) &&
        Objects.equals(this.detalleIndirecta, entidades.detalleIndirecta) &&
        Objects.equals(this.detalleCastigos, entidades.detalleCastigos) &&
        Objects.equals(this.detalleProvisiones, entidades.detalleProvisiones);
  }
  @Override
  public int hashCode() {
    return Objects.hash(nombreEntidad, idCalificacion, porcentajeCalificacion, detalleVigente, detalleVencida, detalleJudicial, detalleRR, detalleIndirecta, detalleCastigos, detalleProvisiones);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Entidades {\n");
    
    sb.append("    nombreEntidad: ").append(toIndentedString(nombreEntidad)).append("\n");
    sb.append("    idCalificacion: ").append(toIndentedString(idCalificacion)).append("\n");
    sb.append("    porcentajeCalificacion: ").append(toIndentedString(porcentajeCalificacion)).append("\n");
    sb.append("    detalleVigente: ").append(toIndentedString(detalleVigente)).append("\n");
    sb.append("    detalleVencida: ").append(toIndentedString(detalleVencida)).append("\n");
    sb.append("    detalleJudicial: ").append(toIndentedString(detalleJudicial)).append("\n");
    sb.append("    detalleRR: ").append(toIndentedString(detalleRR)).append("\n");
    sb.append("    detalleIndirecta: ").append(toIndentedString(detalleIndirecta)).append("\n");
    sb.append("    detalleCastigos: ").append(toIndentedString(detalleCastigos)).append("\n");
    sb.append("    detalleProvisiones: ").append(toIndentedString(detalleProvisiones)).append("\n");
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
