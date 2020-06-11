package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;


public class Situacion24Meses {
  @SerializedName("fechaPeriodo")
  private String fechaPeriodo = null;
  @SerializedName("deudaVencida")
  private Float deudaVencida = null;
  @SerializedName("deudaVigente")
  private Float deudaVigente = null;
  @SerializedName("deudaRR")
  private Float deudaRR = null;
  @SerializedName("deudaJudicial")
  private Float deudaJudicial = null;
  @SerializedName("deudaCastigo")
  private Float deudaCastigo = null;
  public Situacion24Meses fechaPeriodo(String fechaPeriodo) {
    this.fechaPeriodo = fechaPeriodo;
    return this;
  }
   
  @ApiModelProperty(value = "Fecha periodo de reporte de la SBS. Formato yyyymm")
  public String getFechaPeriodo() {
    return fechaPeriodo;
  }
  public void setFechaPeriodo(String fechaPeriodo) {
    this.fechaPeriodo = fechaPeriodo;
  }
  public Situacion24Meses deudaVencida(Float deudaVencida) {
    this.deudaVencida = deudaVencida;
    return this;
  }
   
  @ApiModelProperty(value = "Monto de la deuda vencida.")
  public Float getDeudaVencida() {
    return deudaVencida;
  }
  public void setDeudaVencida(Float deudaVencida) {
    this.deudaVencida = deudaVencida;
  }
  public Situacion24Meses deudaVigente(Float deudaVigente) {
    this.deudaVigente = deudaVigente;
    return this;
  }
   
  @ApiModelProperty(value = "Monto de la deuda vigente.")
  public Float getDeudaVigente() {
    return deudaVigente;
  }
  public void setDeudaVigente(Float deudaVigente) {
    this.deudaVigente = deudaVigente;
  }
  public Situacion24Meses deudaRR(Float deudaRR) {
    this.deudaRR = deudaRR;
    return this;
  }
   
  @ApiModelProperty(value = "Monto de la deuda refinanciada y reestructurada.")
  public Float getDeudaRR() {
    return deudaRR;
  }
  public void setDeudaRR(Float deudaRR) {
    this.deudaRR = deudaRR;
  }
  public Situacion24Meses deudaJudicial(Float deudaJudicial) {
    this.deudaJudicial = deudaJudicial;
    return this;
  }
   
  @ApiModelProperty(value = "Monto de la deuda en cobranza judicial.")
  public Float getDeudaJudicial() {
    return deudaJudicial;
  }
  public void setDeudaJudicial(Float deudaJudicial) {
    this.deudaJudicial = deudaJudicial;
  }
  public Situacion24Meses deudaCastigo(Float deudaCastigo) {
    this.deudaCastigo = deudaCastigo;
    return this;
  }
   
  @ApiModelProperty(value = "Monto de la deuda castigada.")
  public Float getDeudaCastigo() {
    return deudaCastigo;
  }
  public void setDeudaCastigo(Float deudaCastigo) {
    this.deudaCastigo = deudaCastigo;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Situacion24Meses situacion24Meses = (Situacion24Meses) o;
    return Objects.equals(this.fechaPeriodo, situacion24Meses.fechaPeriodo) &&
        Objects.equals(this.deudaVencida, situacion24Meses.deudaVencida) &&
        Objects.equals(this.deudaVigente, situacion24Meses.deudaVigente) &&
        Objects.equals(this.deudaRR, situacion24Meses.deudaRR) &&
        Objects.equals(this.deudaJudicial, situacion24Meses.deudaJudicial) &&
        Objects.equals(this.deudaCastigo, situacion24Meses.deudaCastigo);
  }
  @Override
  public int hashCode() {
    return Objects.hash(fechaPeriodo, deudaVencida, deudaVigente, deudaRR, deudaJudicial, deudaCastigo);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Situacion24Meses {\n");
    
    sb.append("    fechaPeriodo: ").append(toIndentedString(fechaPeriodo)).append("\n");
    sb.append("    deudaVencida: ").append(toIndentedString(deudaVencida)).append("\n");
    sb.append("    deudaVigente: ").append(toIndentedString(deudaVigente)).append("\n");
    sb.append("    deudaRR: ").append(toIndentedString(deudaRR)).append("\n");
    sb.append("    deudaJudicial: ").append(toIndentedString(deudaJudicial)).append("\n");
    sb.append("    deudaCastigo: ").append(toIndentedString(deudaCastigo)).append("\n");
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
