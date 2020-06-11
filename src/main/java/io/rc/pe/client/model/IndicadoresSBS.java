package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

public class IndicadoresSBS {
  @SerializedName("deudaDirecta")
  private Float deudaDirecta = null;
  @SerializedName("deudaDirectaMorosa")
  private Float deudaDirectaMorosa = null;
  @SerializedName("deudaIndirecta")
  private Float deudaIndirecta = null;
  @SerializedName("deudaCastigada")
  private Float deudaCastigada = null;
  @SerializedName("numeroEntidades")
  private BigDecimal numeroEntidades = null;
  @SerializedName("entidadesDeudaDirecta")
  private BigDecimal entidadesDeudaDirecta = null;
  @SerializedName("maximoAtraso")
  private BigDecimal maximoAtraso = null;
  @SerializedName("antiguedadMaxima")
  private BigDecimal antiguedadMaxima = null;
  @SerializedName("entidadMayorDeuda")
  private String entidadMayorDeuda = null;
  public IndicadoresSBS deudaDirecta(Float deudaDirecta) {
    this.deudaDirecta = deudaDirecta;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la suma de las cuentas de deuda directa.")
  public Float getDeudaDirecta() {
    return deudaDirecta;
  }
  public void setDeudaDirecta(Float deudaDirecta) {
    this.deudaDirecta = deudaDirecta;
  }
  public IndicadoresSBS deudaDirectaMorosa(Float deudaDirectaMorosa) {
    this.deudaDirectaMorosa = deudaDirectaMorosa;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la suma de las cuentas de deuda directa Vencida y Judicial.")
  public Float getDeudaDirectaMorosa() {
    return deudaDirectaMorosa;
  }
  public void setDeudaDirectaMorosa(Float deudaDirectaMorosa) {
    this.deudaDirectaMorosa = deudaDirectaMorosa;
  }
  public IndicadoresSBS deudaIndirecta(Float deudaIndirecta) {
    this.deudaIndirecta = deudaIndirecta;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la suma de las cuentas de deuda indirecta.")
  public Float getDeudaIndirecta() {
    return deudaIndirecta;
  }
  public void setDeudaIndirecta(Float deudaIndirecta) {
    this.deudaIndirecta = deudaIndirecta;
  }
  public IndicadoresSBS deudaCastigada(Float deudaCastigada) {
    this.deudaCastigada = deudaCastigada;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la suma de las cuentas de deuda castigada.")
  public Float getDeudaCastigada() {
    return deudaCastigada;
  }
  public void setDeudaCastigada(Float deudaCastigada) {
    this.deudaCastigada = deudaCastigada;
  }
  public IndicadoresSBS numeroEntidades(BigDecimal numeroEntidades) {
    this.numeroEntidades = numeroEntidades;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la cantidad total de entidades que han reportado algún saldo (cualquier cuenta) en el último mes.")
  public BigDecimal getNumeroEntidades() {
    return numeroEntidades;
  }
  public void setNumeroEntidades(BigDecimal numeroEntidades) {
    this.numeroEntidades = numeroEntidades;
  }
  public IndicadoresSBS entidadesDeudaDirecta(BigDecimal entidadesDeudaDirecta) {
    this.entidadesDeudaDirecta = entidadesDeudaDirecta;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la cantidad de entidades que han reportado saldos de deuda directa en el último mes.")
  public BigDecimal getEntidadesDeudaDirecta() {
    return entidadesDeudaDirecta;
  }
  public void setEntidadesDeudaDirecta(BigDecimal entidadesDeudaDirecta) {
    this.entidadesDeudaDirecta = entidadesDeudaDirecta;
  }
  public IndicadoresSBS maximoAtraso(BigDecimal maximoAtraso) {
    this.maximoAtraso = maximoAtraso;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la mayor cantidad de días de atraso de cuentas de deuda directa en el último mes reportado.")
  public BigDecimal getMaximoAtraso() {
    return maximoAtraso;
  }
  public void setMaximoAtraso(BigDecimal maximoAtraso) {
    this.maximoAtraso = maximoAtraso;
  }
  public IndicadoresSBS antiguedadMaxima(BigDecimal antiguedadMaxima) {
    this.antiguedadMaxima = antiguedadMaxima;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la cantidad de meses desde el primer periodo reportado con cuentas de deuda directa.")
  public BigDecimal getAntiguedadMaxima() {
    return antiguedadMaxima;
  }
  public void setAntiguedadMaxima(BigDecimal antiguedadMaxima) {
    this.antiguedadMaxima = antiguedadMaxima;
  }
  public IndicadoresSBS entidadMayorDeuda(String entidadMayorDeuda) {
    this.entidadMayorDeuda = entidadMayorDeuda;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el nombre de la entidad con mayor deuda en el último mes reportado.")
  public String getEntidadMayorDeuda() {
    return entidadMayorDeuda;
  }
  public void setEntidadMayorDeuda(String entidadMayorDeuda) {
    this.entidadMayorDeuda = entidadMayorDeuda;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IndicadoresSBS indicadoresSBS = (IndicadoresSBS) o;
    return Objects.equals(this.deudaDirecta, indicadoresSBS.deudaDirecta) &&
        Objects.equals(this.deudaDirectaMorosa, indicadoresSBS.deudaDirectaMorosa) &&
        Objects.equals(this.deudaIndirecta, indicadoresSBS.deudaIndirecta) &&
        Objects.equals(this.deudaCastigada, indicadoresSBS.deudaCastigada) &&
        Objects.equals(this.numeroEntidades, indicadoresSBS.numeroEntidades) &&
        Objects.equals(this.entidadesDeudaDirecta, indicadoresSBS.entidadesDeudaDirecta) &&
        Objects.equals(this.maximoAtraso, indicadoresSBS.maximoAtraso) &&
        Objects.equals(this.antiguedadMaxima, indicadoresSBS.antiguedadMaxima) &&
        Objects.equals(this.entidadMayorDeuda, indicadoresSBS.entidadMayorDeuda);
  }
  @Override
  public int hashCode() {
    return Objects.hash(deudaDirecta, deudaDirectaMorosa, deudaIndirecta, deudaCastigada, numeroEntidades, entidadesDeudaDirecta, maximoAtraso, antiguedadMaxima, entidadMayorDeuda);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IndicadoresSBS {\n");
    
    sb.append("    deudaDirecta: ").append(toIndentedString(deudaDirecta)).append("\n");
    sb.append("    deudaDirectaMorosa: ").append(toIndentedString(deudaDirectaMorosa)).append("\n");
    sb.append("    deudaIndirecta: ").append(toIndentedString(deudaIndirecta)).append("\n");
    sb.append("    deudaCastigada: ").append(toIndentedString(deudaCastigada)).append("\n");
    sb.append("    numeroEntidades: ").append(toIndentedString(numeroEntidades)).append("\n");
    sb.append("    entidadesDeudaDirecta: ").append(toIndentedString(entidadesDeudaDirecta)).append("\n");
    sb.append("    maximoAtraso: ").append(toIndentedString(maximoAtraso)).append("\n");
    sb.append("    antiguedadMaxima: ").append(toIndentedString(antiguedadMaxima)).append("\n");
    sb.append("    entidadMayorDeuda: ").append(toIndentedString(entidadMayorDeuda)).append("\n");
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
