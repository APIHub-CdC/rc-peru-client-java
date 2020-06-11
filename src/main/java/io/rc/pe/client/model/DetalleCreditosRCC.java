package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import io.rc.pe.client.model.Entidades;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class DetalleCreditosRCC {
  @SerializedName("claveMes")
  private String claveMes = null;
  @SerializedName("numeroEntidades")
  private BigDecimal numeroEntidades = null;
  @SerializedName("idPeorCalificacion")
  private String idPeorCalificacion = null;
  @SerializedName("porcentajeCalificacion")
  private Float porcentajeCalificacion = null;
  @SerializedName("deudaVigente")
  private Float deudaVigente = null;
  @SerializedName("deudaVencida")
  private Float deudaVencida = null;
  @SerializedName("deudaJudicial")
  private Float deudaJudicial = null;
  @SerializedName("deudaRR")
  private Float deudaRR = null;
  @SerializedName("deudaIndirecta")
  private Float deudaIndirecta = null;
  @SerializedName("castigos")
  private Float castigos = null;
  @SerializedName("provisiones")
  private Float provisiones = null;
  @SerializedName("entidades")
  private List<Entidades> entidades = null;
  public DetalleCreditosRCC claveMes(String claveMes) {
    this.claveMes = claveMes;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el periodo al que corresponde la información. Formato yyyymm")
  public String getClaveMes() {
    return claveMes;
  }
  public void setClaveMes(String claveMes) {
    this.claveMes = claveMes;
  }
  public DetalleCreditosRCC numeroEntidades(BigDecimal numeroEntidades) {
    this.numeroEntidades = numeroEntidades;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el número de entidades que reportaron a la SBS.")
  public BigDecimal getNumeroEntidades() {
    return numeroEntidades;
  }
  public void setNumeroEntidades(BigDecimal numeroEntidades) {
    this.numeroEntidades = numeroEntidades;
  }
  public DetalleCreditosRCC idPeorCalificacion(String idPeorCalificacion) {
    this.idPeorCalificacion = idPeorCalificacion;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el identificador con la peor calificación del mes. <table><thead><tr><th>Id Calificación</th><th>Calificación</th></tr></thead><tbody><tr><td>0</td><td>Normal</td></tr><tr><td>1</td><td>Problemas Potenciales</td></tr><tr><td>2</td><td>Deficiente</td></tr><tr><td>3</td><td>Dudoso</td></tr><tr><td>4</td><td>Pérdida</td></tr><tr><td>5</td><td>Cerrada</td></tr><tr><td>6</td><td>Abierto</td></tr><tr><td>7</td><td>Sin Calificación</td></tr><tr><td>9</td><td>Histórico</td></tr></tbody></table>")
  public String getIdPeorCalificacion() {
    return idPeorCalificacion;
  }
  public void setIdPeorCalificacion(String idPeorCalificacion) {
    this.idPeorCalificacion = idPeorCalificacion;
  }
  public DetalleCreditosRCC porcentajeCalificacion(Float porcentajeCalificacion) {
    this.porcentajeCalificacion = porcentajeCalificacion;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el porcentaje asociado con la peor calificación del mes multiplicado por 100.")
  public Float getPorcentajeCalificacion() {
    return porcentajeCalificacion;
  }
  public void setPorcentajeCalificacion(Float porcentajeCalificacion) {
    this.porcentajeCalificacion = porcentajeCalificacion;
  }
  public DetalleCreditosRCC deudaVigente(Float deudaVigente) {
    this.deudaVigente = deudaVigente;
    return this;
  }
   
  @ApiModelProperty(value = "Suma de monto de Deuda directa y con situación vigente.")
  public Float getDeudaVigente() {
    return deudaVigente;
  }
  public void setDeudaVigente(Float deudaVigente) {
    this.deudaVigente = deudaVigente;
  }
  public DetalleCreditosRCC deudaVencida(Float deudaVencida) {
    this.deudaVencida = deudaVencida;
    return this;
  }
   
  @ApiModelProperty(value = "Deuda directa y con situación vencida.")
  public Float getDeudaVencida() {
    return deudaVencida;
  }
  public void setDeudaVencida(Float deudaVencida) {
    this.deudaVencida = deudaVencida;
  }
  public DetalleCreditosRCC deudaJudicial(Float deudaJudicial) {
    this.deudaJudicial = deudaJudicial;
    return this;
  }
   
  @ApiModelProperty(value = "Suma de monto de Deuda directa y con situación judicial.")
  public Float getDeudaJudicial() {
    return deudaJudicial;
  }
  public void setDeudaJudicial(Float deudaJudicial) {
    this.deudaJudicial = deudaJudicial;
  }
  public DetalleCreditosRCC deudaRR(Float deudaRR) {
    this.deudaRR = deudaRR;
    return this;
  }
   
  @ApiModelProperty(value = "Suma de monto de Deuda directa y con situación refinanciada o reestructurada.")
  public Float getDeudaRR() {
    return deudaRR;
  }
  public void setDeudaRR(Float deudaRR) {
    this.deudaRR = deudaRR;
  }
  public DetalleCreditosRCC deudaIndirecta(Float deudaIndirecta) {
    this.deudaIndirecta = deudaIndirecta;
    return this;
  }
   
  @ApiModelProperty(value = "Suma de monto de deuda indirecta.")
  public Float getDeudaIndirecta() {
    return deudaIndirecta;
  }
  public void setDeudaIndirecta(Float deudaIndirecta) {
    this.deudaIndirecta = deudaIndirecta;
  }
  public DetalleCreditosRCC castigos(Float castigos) {
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
  public DetalleCreditosRCC provisiones(Float provisiones) {
    this.provisiones = provisiones;
    return this;
  }
   
  @ApiModelProperty(value = "Suma de monto de provisiones.")
  public Float getProvisiones() {
    return provisiones;
  }
  public void setProvisiones(Float provisiones) {
    this.provisiones = provisiones;
  }
  public DetalleCreditosRCC entidades(List<Entidades> entidades) {
    this.entidades = entidades;
    return this;
  }
  public DetalleCreditosRCC addEntidadesItem(Entidades entidadesItem) {
    if (this.entidades == null) {
      this.entidades = new ArrayList<Entidades>();
    }
    this.entidades.add(entidadesItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<Entidades> getEntidades() {
    return entidades;
  }
  public void setEntidades(List<Entidades> entidades) {
    this.entidades = entidades;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetalleCreditosRCC detalleCreditosRCC = (DetalleCreditosRCC) o;
    return Objects.equals(this.claveMes, detalleCreditosRCC.claveMes) &&
        Objects.equals(this.numeroEntidades, detalleCreditosRCC.numeroEntidades) &&
        Objects.equals(this.idPeorCalificacion, detalleCreditosRCC.idPeorCalificacion) &&
        Objects.equals(this.porcentajeCalificacion, detalleCreditosRCC.porcentajeCalificacion) &&
        Objects.equals(this.deudaVigente, detalleCreditosRCC.deudaVigente) &&
        Objects.equals(this.deudaVencida, detalleCreditosRCC.deudaVencida) &&
        Objects.equals(this.deudaJudicial, detalleCreditosRCC.deudaJudicial) &&
        Objects.equals(this.deudaRR, detalleCreditosRCC.deudaRR) &&
        Objects.equals(this.deudaIndirecta, detalleCreditosRCC.deudaIndirecta) &&
        Objects.equals(this.castigos, detalleCreditosRCC.castigos) &&
        Objects.equals(this.provisiones, detalleCreditosRCC.provisiones) &&
        Objects.equals(this.entidades, detalleCreditosRCC.entidades);
  }
  @Override
  public int hashCode() {
    return Objects.hash(claveMes, numeroEntidades, idPeorCalificacion, porcentajeCalificacion, deudaVigente, deudaVencida, deudaJudicial, deudaRR, deudaIndirecta, castigos, provisiones, entidades);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalleCreditosRCC {\n");
    
    sb.append("    claveMes: ").append(toIndentedString(claveMes)).append("\n");
    sb.append("    numeroEntidades: ").append(toIndentedString(numeroEntidades)).append("\n");
    sb.append("    idPeorCalificacion: ").append(toIndentedString(idPeorCalificacion)).append("\n");
    sb.append("    porcentajeCalificacion: ").append(toIndentedString(porcentajeCalificacion)).append("\n");
    sb.append("    deudaVigente: ").append(toIndentedString(deudaVigente)).append("\n");
    sb.append("    deudaVencida: ").append(toIndentedString(deudaVencida)).append("\n");
    sb.append("    deudaJudicial: ").append(toIndentedString(deudaJudicial)).append("\n");
    sb.append("    deudaRR: ").append(toIndentedString(deudaRR)).append("\n");
    sb.append("    deudaIndirecta: ").append(toIndentedString(deudaIndirecta)).append("\n");
    sb.append("    castigos: ").append(toIndentedString(castigos)).append("\n");
    sb.append("    provisiones: ").append(toIndentedString(provisiones)).append("\n");
    sb.append("    entidades: ").append(toIndentedString(entidades)).append("\n");
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
