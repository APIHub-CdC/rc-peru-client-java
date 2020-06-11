package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

public class ResumenOtrasObligacionesInfoFuenteInformacion {
  @SerializedName("claveSituacion")
  private String claveSituacion = null;
  @SerializedName("obligaciones")
  private BigDecimal obligaciones = null;
  @SerializedName("monto")
  private Float monto = null;
  @SerializedName("primerVencimiento")
  private String primerVencimiento = null;
  @SerializedName("ultimoVencimiento")
  private String ultimoVencimiento = null;
  @SerializedName("obligaciones24Meses")
  private BigDecimal obligaciones24Meses = null;
  @SerializedName("monto24Meses")
  private Float monto24Meses = null;
  public ResumenOtrasObligacionesInfoFuenteInformacion claveSituacion(String claveSituacion) {
    this.claveSituacion = claveSituacion;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la situación actual de la deuda. <li> Actual y No aclarado - Cuando la persona fue reportada por algún aportante de una fuente en su última carga. <li> Histórico y Aclarado - es cuando no fue reportada en la última carga de un aportante, pero sí en alguna carga de los últimos 60 meses (siempre y cuando sea visible el registro). <table><thead><tr><th>CLAVE</th><th>SITUACIÓN</th></tr></thead><tbody><tr><td>ACT</td><td>Actual</td></tr><tr><td>HIS</td><td>Histórico</td></tr><tr><td>ACLA</td><td>Aclarado</td></tr><tr><td>NOACLA</td><td>No Aclarado</td></tr></tbody></table>")
  public String getClaveSituacion() {
    return claveSituacion;
  }
  public void setClaveSituacion(String claveSituacion) {
    this.claveSituacion = claveSituacion;
  }
  public ResumenOtrasObligacionesInfoFuenteInformacion obligaciones(BigDecimal obligaciones) {
    this.obligaciones = obligaciones;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la cantidad de registros visibles por cada fuente y situación.")
  public BigDecimal getObligaciones() {
    return obligaciones;
  }
  public void setObligaciones(BigDecimal obligaciones) {
    this.obligaciones = obligaciones;
  }
  public ResumenOtrasObligacionesInfoFuenteInformacion monto(Float monto) {
    this.monto = monto;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el monto total de la deuda reportada de la fuente.")
  public Float getMonto() {
    return monto;
  }
  public void setMonto(Float monto) {
    this.monto = monto;
  }
  public ResumenOtrasObligacionesInfoFuenteInformacion primerVencimiento(String primerVencimiento) {
    this.primerVencimiento = primerVencimiento;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el primer mes visible que presenta alguna obligación por cada fuente y situación: <table><thead><tr><th>Fuente</th><th>Interpretación</th></tr></thead><tbody><tr><td>Deuda SUNAT</td><td>Muestra el primer periodo tributario</td></tr><tr><td>Deuda AFP</td><td>Muestra el primer periodo de devengue</td></tr><tr><td>Morosidad comercial</td><td>Muestra la primera fecha de vencimiento</td></tr><tr><td>Protestos del aceptante</td><td>Muestra la primera fecha de protesto</td></tr></tbody></table> Formato: yyyymm")
  public String getPrimerVencimiento() {
    return primerVencimiento;
  }
  public void setPrimerVencimiento(String primerVencimiento) {
    this.primerVencimiento = primerVencimiento;
  }
  public ResumenOtrasObligacionesInfoFuenteInformacion ultimoVencimiento(String ultimoVencimiento) {
    this.ultimoVencimiento = ultimoVencimiento;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el último mes visible que presenta alguna obligación por cada fuente y situación. Formato: yyyymm")
  public String getUltimoVencimiento() {
    return ultimoVencimiento;
  }
  public void setUltimoVencimiento(String ultimoVencimiento) {
    this.ultimoVencimiento = ultimoVencimiento;
  }
  public ResumenOtrasObligacionesInfoFuenteInformacion obligaciones24Meses(BigDecimal obligaciones24Meses) {
    this.obligaciones24Meses = obligaciones24Meses;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la cantidad de registros visibles en los últimos 24 meses.")
  public BigDecimal getObligaciones24Meses() {
    return obligaciones24Meses;
  }
  public void setObligaciones24Meses(BigDecimal obligaciones24Meses) {
    this.obligaciones24Meses = obligaciones24Meses;
  }
  public ResumenOtrasObligacionesInfoFuenteInformacion monto24Meses(Float monto24Meses) {
    this.monto24Meses = monto24Meses;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la Suma de los montos de deuda en los últimos 24 meses.")
  public Float getMonto24Meses() {
    return monto24Meses;
  }
  public void setMonto24Meses(Float monto24Meses) {
    this.monto24Meses = monto24Meses;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumenOtrasObligacionesInfoFuenteInformacion resumenOtrasObligacionesInfoFuenteInformacion = (ResumenOtrasObligacionesInfoFuenteInformacion) o;
    return Objects.equals(this.claveSituacion, resumenOtrasObligacionesInfoFuenteInformacion.claveSituacion) &&
        Objects.equals(this.obligaciones, resumenOtrasObligacionesInfoFuenteInformacion.obligaciones) &&
        Objects.equals(this.monto, resumenOtrasObligacionesInfoFuenteInformacion.monto) &&
        Objects.equals(this.primerVencimiento, resumenOtrasObligacionesInfoFuenteInformacion.primerVencimiento) &&
        Objects.equals(this.ultimoVencimiento, resumenOtrasObligacionesInfoFuenteInformacion.ultimoVencimiento) &&
        Objects.equals(this.obligaciones24Meses, resumenOtrasObligacionesInfoFuenteInformacion.obligaciones24Meses) &&
        Objects.equals(this.monto24Meses, resumenOtrasObligacionesInfoFuenteInformacion.monto24Meses);
  }
  @Override
  public int hashCode() {
    return Objects.hash(claveSituacion, obligaciones, monto, primerVencimiento, ultimoVencimiento, obligaciones24Meses, monto24Meses);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumenOtrasObligacionesInfoFuenteInformacion {\n");
    
    sb.append("    claveSituacion: ").append(toIndentedString(claveSituacion)).append("\n");
    sb.append("    obligaciones: ").append(toIndentedString(obligaciones)).append("\n");
    sb.append("    monto: ").append(toIndentedString(monto)).append("\n");
    sb.append("    primerVencimiento: ").append(toIndentedString(primerVencimiento)).append("\n");
    sb.append("    ultimoVencimiento: ").append(toIndentedString(ultimoVencimiento)).append("\n");
    sb.append("    obligaciones24Meses: ").append(toIndentedString(obligaciones24Meses)).append("\n");
    sb.append("    monto24Meses: ").append(toIndentedString(monto24Meses)).append("\n");
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
