package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;


public class Calificacion24Meses {
  @SerializedName("fechaPeriodo")
  private String fechaPeriodo = null;
  @SerializedName("deudaNormal")
  private Float deudaNormal = null;
  @SerializedName("deudaCPP")
  private Float deudaCPP = null;
  @SerializedName("deudaDeficiente")
  private Float deudaDeficiente = null;
  @SerializedName("deudaDudoso")
  private Float deudaDudoso = null;
  @SerializedName("deudaPerdida")
  private Float deudaPerdida = null;
  @SerializedName("numeroEntidades")
  private BigDecimal numeroEntidades = null;
  public Calificacion24Meses fechaPeriodo(String fechaPeriodo) {
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
  public Calificacion24Meses deudaNormal(Float deudaNormal) {
    this.deudaNormal = deudaNormal;
    return this;
  }
   
  @ApiModelProperty(value = "Deuda con calificación normal.")
  public Float getDeudaNormal() {
    return deudaNormal;
  }
  public void setDeudaNormal(Float deudaNormal) {
    this.deudaNormal = deudaNormal;
  }
  public Calificacion24Meses deudaCPP(Float deudaCPP) {
    this.deudaCPP = deudaCPP;
    return this;
  }
   
  @ApiModelProperty(value = "Deuda con calificación con problemas potenciales.")
  public Float getDeudaCPP() {
    return deudaCPP;
  }
  public void setDeudaCPP(Float deudaCPP) {
    this.deudaCPP = deudaCPP;
  }
  public Calificacion24Meses deudaDeficiente(Float deudaDeficiente) {
    this.deudaDeficiente = deudaDeficiente;
    return this;
  }
   
  @ApiModelProperty(value = "Deuda con calificación deficiente.")
  public Float getDeudaDeficiente() {
    return deudaDeficiente;
  }
  public void setDeudaDeficiente(Float deudaDeficiente) {
    this.deudaDeficiente = deudaDeficiente;
  }
  public Calificacion24Meses deudaDudoso(Float deudaDudoso) {
    this.deudaDudoso = deudaDudoso;
    return this;
  }
   
  @ApiModelProperty(value = "Deuda con calificación dudoso")
  public Float getDeudaDudoso() {
    return deudaDudoso;
  }
  public void setDeudaDudoso(Float deudaDudoso) {
    this.deudaDudoso = deudaDudoso;
  }
  public Calificacion24Meses deudaPerdida(Float deudaPerdida) {
    this.deudaPerdida = deudaPerdida;
    return this;
  }
   
  @ApiModelProperty(value = "Deuda con calificación pérdida.")
  public Float getDeudaPerdida() {
    return deudaPerdida;
  }
  public void setDeudaPerdida(Float deudaPerdida) {
    this.deudaPerdida = deudaPerdida;
  }
  public Calificacion24Meses numeroEntidades(BigDecimal numeroEntidades) {
    this.numeroEntidades = numeroEntidades;
    return this;
  }
   
  @ApiModelProperty(value = "Cantidad de entidades reportadas en el periodo.")
  public BigDecimal getNumeroEntidades() {
    return numeroEntidades;
  }
  public void setNumeroEntidades(BigDecimal numeroEntidades) {
    this.numeroEntidades = numeroEntidades;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Calificacion24Meses calificacion24Meses = (Calificacion24Meses) o;
    return Objects.equals(this.fechaPeriodo, calificacion24Meses.fechaPeriodo) &&
        Objects.equals(this.deudaNormal, calificacion24Meses.deudaNormal) &&
        Objects.equals(this.deudaCPP, calificacion24Meses.deudaCPP) &&
        Objects.equals(this.deudaDeficiente, calificacion24Meses.deudaDeficiente) &&
        Objects.equals(this.deudaDudoso, calificacion24Meses.deudaDudoso) &&
        Objects.equals(this.deudaPerdida, calificacion24Meses.deudaPerdida) &&
        Objects.equals(this.numeroEntidades, calificacion24Meses.numeroEntidades);
  }
  @Override
  public int hashCode() {
    return Objects.hash(fechaPeriodo, deudaNormal, deudaCPP, deudaDeficiente, deudaDudoso, deudaPerdida, numeroEntidades);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Calificacion24Meses {\n");
    
    sb.append("    fechaPeriodo: ").append(toIndentedString(fechaPeriodo)).append("\n");
    sb.append("    deudaNormal: ").append(toIndentedString(deudaNormal)).append("\n");
    sb.append("    deudaCPP: ").append(toIndentedString(deudaCPP)).append("\n");
    sb.append("    deudaDeficiente: ").append(toIndentedString(deudaDeficiente)).append("\n");
    sb.append("    deudaDudoso: ").append(toIndentedString(deudaDudoso)).append("\n");
    sb.append("    deudaPerdida: ").append(toIndentedString(deudaPerdida)).append("\n");
    sb.append("    numeroEntidades: ").append(toIndentedString(numeroEntidades)).append("\n");
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
