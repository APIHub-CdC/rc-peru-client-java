package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

public class DeudaTipoProductoRC {
  @SerializedName("claveConcepto")
  private String claveConcepto = null;
  @SerializedName("montoDia")
  private Float montoDia = null;
  @SerializedName("montoMorosa")
  private Float montoMorosa = null;
  @SerializedName("montoTotal")
  private Float montoTotal = null;
  @SerializedName("porcentajeDia")
  private Float porcentajeDia = null;
  @SerializedName("porcentajeMorosa")
  private Float porcentajeMorosa = null;
  @SerializedName("porcentajeTotal")
  private Float porcentajeTotal = null;
  public DeudaTipoProductoRC claveConcepto(String claveConcepto) {
    this.claveConcepto = claveConcepto;
    return this;
  }
   
  @ApiModelProperty(value = "<table><thead><tr><th>Clave Concepto</th><th>Concepto</th></tr></thead><tbody><tr><td>AFP</td><td>Deuda AFP</td></tr><tr><td>BMD</td><td>Bancos multilaterales de desarrollo</td></tr><tr><td>CAMFZ</td><td>Castigos Microfinanzas</td></tr><tr><td>CARCC</td><td>Castigos RCC</td></tr><tr><td>CC</td><td>Consumo</td></tr><tr><td>COR</td><td>Corporativo</td></tr><tr><td>ESF</td><td>Empresas del sistema financiero</td></tr><tr><td>ESP</td><td>Entidades del sector público</td></tr><tr><td>GDE</td><td>Grande empresa</td></tr><tr><td>HIP</td><td>Hipotecario</td></tr><tr><td>IV</td><td>Intermediarios de valores</td></tr><tr><td>MCF</td><td>Microfinanzas no supervisadas</td></tr><tr><td>MCOM</td><td>Morosidad comercial</td></tr><tr><td>MED</td><td>Mediana empresa</td></tr><tr><td>MIC</td><td>Microempresa</td></tr><tr><td>MOR</td><td>Morosidades</td></tr><tr><td>PQE</td><td>Pequeña empresa</td></tr><tr><td>PRO</td><td>Protestos no aclarados</td></tr><tr><td>SBR</td><td>Soberanos</td></tr><tr><td>SUN</td><td>Deuda SUNAT</td></tr></tbody></table>")
  public String getClaveConcepto() {
    return claveConcepto;
  }
  public void setClaveConcepto(String claveConcepto) {
    this.claveConcepto = claveConcepto;
  }
  public DeudaTipoProductoRC montoDia(Float montoDia) {
    this.montoDia = montoDia;
    return this;
  }
   
  @ApiModelProperty(value = "Monto de la deuda al día por producto crediticio.")
  public Float getMontoDia() {
    return montoDia;
  }
  public void setMontoDia(Float montoDia) {
    this.montoDia = montoDia;
  }
  public DeudaTipoProductoRC montoMorosa(Float montoMorosa) {
    this.montoMorosa = montoMorosa;
    return this;
  }
   
  @ApiModelProperty(value = "Monto de la deuda morosa por producto crediticio.")
  public Float getMontoMorosa() {
    return montoMorosa;
  }
  public void setMontoMorosa(Float montoMorosa) {
    this.montoMorosa = montoMorosa;
  }
  public DeudaTipoProductoRC montoTotal(Float montoTotal) {
    this.montoTotal = montoTotal;
    return this;
  }
   
  @ApiModelProperty(value = "Monto total de la deuda por producto crediticio.")
  public Float getMontoTotal() {
    return montoTotal;
  }
  public void setMontoTotal(Float montoTotal) {
    this.montoTotal = montoTotal;
  }
  public DeudaTipoProductoRC porcentajeDia(Float porcentajeDia) {
    this.porcentajeDia = porcentajeDia;
    return this;
  }
   
  @ApiModelProperty(value = "Porcentaje de la deuda al día por producto crediticio multiplicado por 100.")
  public Float getPorcentajeDia() {
    return porcentajeDia;
  }
  public void setPorcentajeDia(Float porcentajeDia) {
    this.porcentajeDia = porcentajeDia;
  }
  public DeudaTipoProductoRC porcentajeMorosa(Float porcentajeMorosa) {
    this.porcentajeMorosa = porcentajeMorosa;
    return this;
  }
   
  @ApiModelProperty(value = "Porcentaje de la deuda morosa por producto crediticio multiplicado por 100.")
  public Float getPorcentajeMorosa() {
    return porcentajeMorosa;
  }
  public void setPorcentajeMorosa(Float porcentajeMorosa) {
    this.porcentajeMorosa = porcentajeMorosa;
  }
  public DeudaTipoProductoRC porcentajeTotal(Float porcentajeTotal) {
    this.porcentajeTotal = porcentajeTotal;
    return this;
  }
   
  @ApiModelProperty(value = "Porcentaje del endeudamiento al día y moroso para cada tipo de crédito multiplicado por 100.")
  public Float getPorcentajeTotal() {
    return porcentajeTotal;
  }
  public void setPorcentajeTotal(Float porcentajeTotal) {
    this.porcentajeTotal = porcentajeTotal;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeudaTipoProductoRC deudaTipoProductoRC = (DeudaTipoProductoRC) o;
    return Objects.equals(this.claveConcepto, deudaTipoProductoRC.claveConcepto) &&
        Objects.equals(this.montoDia, deudaTipoProductoRC.montoDia) &&
        Objects.equals(this.montoMorosa, deudaTipoProductoRC.montoMorosa) &&
        Objects.equals(this.montoTotal, deudaTipoProductoRC.montoTotal) &&
        Objects.equals(this.porcentajeDia, deudaTipoProductoRC.porcentajeDia) &&
        Objects.equals(this.porcentajeMorosa, deudaTipoProductoRC.porcentajeMorosa) &&
        Objects.equals(this.porcentajeTotal, deudaTipoProductoRC.porcentajeTotal);
  }
  @Override
  public int hashCode() {
    return Objects.hash(claveConcepto, montoDia, montoMorosa, montoTotal, porcentajeDia, porcentajeMorosa, porcentajeTotal);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeudaTipoProductoRC {\n");
    
    sb.append("    claveConcepto: ").append(toIndentedString(claveConcepto)).append("\n");
    sb.append("    montoDia: ").append(toIndentedString(montoDia)).append("\n");
    sb.append("    montoMorosa: ").append(toIndentedString(montoMorosa)).append("\n");
    sb.append("    montoTotal: ").append(toIndentedString(montoTotal)).append("\n");
    sb.append("    porcentajeDia: ").append(toIndentedString(porcentajeDia)).append("\n");
    sb.append("    porcentajeMorosa: ").append(toIndentedString(porcentajeMorosa)).append("\n");
    sb.append("    porcentajeTotal: ").append(toIndentedString(porcentajeTotal)).append("\n");
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
