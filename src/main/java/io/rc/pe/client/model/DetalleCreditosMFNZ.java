package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import io.rc.pe.client.model.DetalleEntidades;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class DetalleCreditosMFNZ {
  @SerializedName("periodo")
  private String periodo = null;
  @SerializedName("entidades")
  private BigDecimal entidades = null;
  @SerializedName("idPeorCalificacion")
  private String idPeorCalificacion = null;
  @SerializedName("porcentaje")
  private Float porcentaje = null;
  @SerializedName("vigente")
  private Float vigente = null;
  @SerializedName("vencidaMenor30")
  private Float vencidaMenor30 = null;
  @SerializedName("vencidaMayor30")
  private Float vencidaMayor30 = null;
  @SerializedName("judicial")
  private Float judicial = null;
  @SerializedName("refinanciada")
  private Float refinanciada = null;
  @SerializedName("indirecta")
  private Float indirecta = null;
  @SerializedName("castigos")
  private Float castigos = null;
  @SerializedName("detalleEntidades")
  private List<DetalleEntidades> detalleEntidades = null;
  public DetalleCreditosMFNZ periodo(String periodo) {
    this.periodo = periodo;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el periodo al que corresponde la información. Formato yyyymm")
  public String getPeriodo() {
    return periodo;
  }
  public void setPeriodo(String periodo) {
    this.periodo = periodo;
  }
  public DetalleCreditosMFNZ entidades(BigDecimal entidades) {
    this.entidades = entidades;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el número de identidades que reportaron.")
  public BigDecimal getEntidades() {
    return entidades;
  }
  public void setEntidades(BigDecimal entidades) {
    this.entidades = entidades;
  }
  public DetalleCreditosMFNZ idPeorCalificacion(String idPeorCalificacion) {
    this.idPeorCalificacion = idPeorCalificacion;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la peor calificación de las entidades reportadas en el último periodo reportado por la SBS. Si la fecha de reporte SBS no corresponde a al último periodo reportado por la SBS, la peor calificación indicará 9 (Histórico). <table><thead><tr><th>Id Calificación</th><th>Calificación</th></tr></thead><tbody><tr><td>0</td><td>Normal</td></tr><tr><td>1</td><td>Problemas Potenciales</td></tr><tr><td>2</td><td>Deficiente</td></tr><tr><td>3</td><td>Dudoso</td></tr><tr><td>4</td><td>Pérdida</td></tr><tr><td>5</td><td>Cerrada</td></tr><tr><td>6</td><td>Abierto</td></tr><tr><td>7</td><td>Sin Calificación</td></tr><tr><td>9</td><td>Histórico</td></tr></tbody></table>")
  public String getIdPeorCalificacion() {
    return idPeorCalificacion;
  }
  public void setIdPeorCalificacion(String idPeorCalificacion) {
    this.idPeorCalificacion = idPeorCalificacion;
  }
  public DetalleCreditosMFNZ porcentaje(Float porcentaje) {
    this.porcentaje = porcentaje;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el porcentaje asociado con la peor calificación del mes multiplicado por 100.")
  public Float getPorcentaje() {
    return porcentaje;
  }
  public void setPorcentaje(Float porcentaje) {
    this.porcentaje = porcentaje;
  }
  public DetalleCreditosMFNZ vigente(Float vigente) {
    this.vigente = vigente;
    return this;
  }
   
  @ApiModelProperty(value = "Suma de monto de deuda directa y con situación vigente.")
  public Float getVigente() {
    return vigente;
  }
  public void setVigente(Float vigente) {
    this.vigente = vigente;
  }
  public DetalleCreditosMFNZ vencidaMenor30(Float vencidaMenor30) {
    this.vencidaMenor30 = vencidaMenor30;
    return this;
  }
   
  @ApiModelProperty(value = "Suma de monto de deuda directa y con situación vencida menor a 30 días.")
  public Float getVencidaMenor30() {
    return vencidaMenor30;
  }
  public void setVencidaMenor30(Float vencidaMenor30) {
    this.vencidaMenor30 = vencidaMenor30;
  }
  public DetalleCreditosMFNZ vencidaMayor30(Float vencidaMayor30) {
    this.vencidaMayor30 = vencidaMayor30;
    return this;
  }
   
  @ApiModelProperty(value = "Suma de monto de deuda directa y con situación vencida mayor a 30 días.")
  public Float getVencidaMayor30() {
    return vencidaMayor30;
  }
  public void setVencidaMayor30(Float vencidaMayor30) {
    this.vencidaMayor30 = vencidaMayor30;
  }
  public DetalleCreditosMFNZ judicial(Float judicial) {
    this.judicial = judicial;
    return this;
  }
   
  @ApiModelProperty(value = "Suma de monto de deuda directa y con situación judicial.")
  public Float getJudicial() {
    return judicial;
  }
  public void setJudicial(Float judicial) {
    this.judicial = judicial;
  }
  public DetalleCreditosMFNZ refinanciada(Float refinanciada) {
    this.refinanciada = refinanciada;
    return this;
  }
   
  @ApiModelProperty(value = "Suma de monto de deuda directa y con situación refinanciada o reestructurada.")
  public Float getRefinanciada() {
    return refinanciada;
  }
  public void setRefinanciada(Float refinanciada) {
    this.refinanciada = refinanciada;
  }
  public DetalleCreditosMFNZ indirecta(Float indirecta) {
    this.indirecta = indirecta;
    return this;
  }
   
  @ApiModelProperty(value = "Suma de monto de deuda de la deuda indirecta.")
  public Float getIndirecta() {
    return indirecta;
  }
  public void setIndirecta(Float indirecta) {
    this.indirecta = indirecta;
  }
  public DetalleCreditosMFNZ castigos(Float castigos) {
    this.castigos = castigos;
    return this;
  }
   
  @ApiModelProperty(value = "Suma de monto de castigos.")
  public Float getCastigos() {
    return castigos;
  }
  public void setCastigos(Float castigos) {
    this.castigos = castigos;
  }
  public DetalleCreditosMFNZ detalleEntidades(List<DetalleEntidades> detalleEntidades) {
    this.detalleEntidades = detalleEntidades;
    return this;
  }
  public DetalleCreditosMFNZ addDetalleEntidadesItem(DetalleEntidades detalleEntidadesItem) {
    if (this.detalleEntidades == null) {
      this.detalleEntidades = new ArrayList<DetalleEntidades>();
    }
    this.detalleEntidades.add(detalleEntidadesItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<DetalleEntidades> getDetalleEntidades() {
    return detalleEntidades;
  }
  public void setDetalleEntidades(List<DetalleEntidades> detalleEntidades) {
    this.detalleEntidades = detalleEntidades;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetalleCreditosMFNZ detalleCreditosMFNZ = (DetalleCreditosMFNZ) o;
    return Objects.equals(this.periodo, detalleCreditosMFNZ.periodo) &&
        Objects.equals(this.entidades, detalleCreditosMFNZ.entidades) &&
        Objects.equals(this.idPeorCalificacion, detalleCreditosMFNZ.idPeorCalificacion) &&
        Objects.equals(this.porcentaje, detalleCreditosMFNZ.porcentaje) &&
        Objects.equals(this.vigente, detalleCreditosMFNZ.vigente) &&
        Objects.equals(this.vencidaMenor30, detalleCreditosMFNZ.vencidaMenor30) &&
        Objects.equals(this.vencidaMayor30, detalleCreditosMFNZ.vencidaMayor30) &&
        Objects.equals(this.judicial, detalleCreditosMFNZ.judicial) &&
        Objects.equals(this.refinanciada, detalleCreditosMFNZ.refinanciada) &&
        Objects.equals(this.indirecta, detalleCreditosMFNZ.indirecta) &&
        Objects.equals(this.castigos, detalleCreditosMFNZ.castigos) &&
        Objects.equals(this.detalleEntidades, detalleCreditosMFNZ.detalleEntidades);
  }
  @Override
  public int hashCode() {
    return Objects.hash(periodo, entidades, idPeorCalificacion, porcentaje, vigente, vencidaMenor30, vencidaMayor30, judicial, refinanciada, indirecta, castigos, detalleEntidades);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalleCreditosMFNZ {\n");
    
    sb.append("    periodo: ").append(toIndentedString(periodo)).append("\n");
    sb.append("    entidades: ").append(toIndentedString(entidades)).append("\n");
    sb.append("    idPeorCalificacion: ").append(toIndentedString(idPeorCalificacion)).append("\n");
    sb.append("    porcentaje: ").append(toIndentedString(porcentaje)).append("\n");
    sb.append("    vigente: ").append(toIndentedString(vigente)).append("\n");
    sb.append("    vencidaMenor30: ").append(toIndentedString(vencidaMenor30)).append("\n");
    sb.append("    vencidaMayor30: ").append(toIndentedString(vencidaMayor30)).append("\n");
    sb.append("    judicial: ").append(toIndentedString(judicial)).append("\n");
    sb.append("    refinanciada: ").append(toIndentedString(refinanciada)).append("\n");
    sb.append("    indirecta: ").append(toIndentedString(indirecta)).append("\n");
    sb.append("    castigos: ").append(toIndentedString(castigos)).append("\n");
    sb.append("    detalleEntidades: ").append(toIndentedString(detalleEntidades)).append("\n");
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
