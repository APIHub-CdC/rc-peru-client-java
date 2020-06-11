package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

public class InformacionEntidad24 {
  @SerializedName("descripcionEntidad")
  private String descripcionEntidad = null;
  @SerializedName("claveSituacion")
  private String claveSituacion = null;
  @SerializedName("idCalificacion")
  private String idCalificacion = null;
  @SerializedName("diasAtraso")
  private BigDecimal diasAtraso = null;
  @SerializedName("maximoAtraso")
  private BigDecimal maximoAtraso = null;
  @SerializedName("deudaMaximoAtraso")
  private Float deudaMaximoAtraso = null;
  @SerializedName("inicioPeriodo")
  private String inicioPeriodo = null;
  @SerializedName("finPeriodo")
  private String finPeriodo = null;
  @SerializedName("atrasos24")
  private String atrasos24 = null;
  public InformacionEntidad24 descripcionEntidad(String descripcionEntidad) {
    this.descripcionEntidad = descripcionEntidad;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el nombre de la entidad con la que se tiene el producto.")
  public String getDescripcionEntidad() {
    return descripcionEntidad;
  }
  public void setDescripcionEntidad(String descripcionEntidad) {
    this.descripcionEntidad = descripcionEntidad;
  }
  public InformacionEntidad24 claveSituacion(String claveSituacion) {
    this.claveSituacion = claveSituacion;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la situación en la que se encuentra: <li> ACT: Es cuando la persona o empresa fue reportada por alguna entidad de la SBS en la última carga de RCC o en la última carga de algún aportante de Deuda Micro. <li> HIS: Es cuando no fue reportada por alguna entidad en la última carga, pero sí en alguna de los últimos 60 meses (siempre y cuando sea visible).<table><thead><tr><th>Clave</th><th>Situación</th></tr></thead><tbody><tr><td>ACT</td><td>Actual</td></tr><tr><td>HIS</td><td>Histórico</td></tr></tbody></table>")
  public String getClaveSituacion() {
    return claveSituacion;
  }
  public void setClaveSituacion(String claveSituacion) {
    this.claveSituacion = claveSituacion;
  }
  public InformacionEntidad24 idCalificacion(String idCalificacion) {
    this.idCalificacion = idCalificacion;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la peor calificación de las entidades reportadas en el último periodo reportado por la SBS. Si la fecha de reporte SBS no corresponde a al último periodo reportado por la SBS, la peor calificación indicará 9 (Histórico).<table><thead><tr><th>Id Calificación</th><th>Calificación</th></tr></thead><tbody><tr><td>0</td><td>Normal</td></tr><tr><td>1</td><td>Problemas Potenciales</td></tr><tr><td>2</td><td>Deficiente</td></tr><tr><td>3</td><td>Dudoso</td></tr><tr><td>4</td><td>Pérdida</td></tr><tr><td>5</td><td>Cerrada</td></tr><tr><td>6</td><td>Abierto</td></tr><tr><td>7</td><td>Sin Calificación</td></tr><tr><td>9</td><td>Histórico</td></tr></tbody></table>")
  public String getIdCalificacion() {
    return idCalificacion;
  }
  public void setIdCalificacion(String idCalificacion) {
    this.idCalificacion = idCalificacion;
  }
  public InformacionEntidad24 diasAtraso(BigDecimal diasAtraso) {
    this.diasAtraso = diasAtraso;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la mayor cantidad de días de atraso para dicha entidad y producto. Para situación actual usa última carga, para histórico usa carga en la que se reportó por última vez.")
  public BigDecimal getDiasAtraso() {
    return diasAtraso;
  }
  public void setDiasAtraso(BigDecimal diasAtraso) {
    this.diasAtraso = diasAtraso;
  }
  public InformacionEntidad24 maximoAtraso(BigDecimal maximoAtraso) {
    this.maximoAtraso = maximoAtraso;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el mayor atraso en los 24 meses para el producto y entidad.")
  public BigDecimal getMaximoAtraso() {
    return maximoAtraso;
  }
  public void setMaximoAtraso(BigDecimal maximoAtraso) {
    this.maximoAtraso = maximoAtraso;
  }
  public InformacionEntidad24 deudaMaximoAtraso(Float deudaMaximoAtraso) {
    this.deudaMaximoAtraso = deudaMaximoAtraso;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el monto de deuda con el mayor atraso  en  los  últimos 24 meses.")
  public Float getDeudaMaximoAtraso() {
    return deudaMaximoAtraso;
  }
  public void setDeudaMaximoAtraso(Float deudaMaximoAtraso) {
    this.deudaMaximoAtraso = deudaMaximoAtraso;
  }
  public InformacionEntidad24 inicioPeriodo(String inicioPeriodo) {
    this.inicioPeriodo = inicioPeriodo;
    return this;
  }
   
  @ApiModelProperty(value = "Periodo de inicio del vector de 24 meses de la variable atrasos24. Formato yyyymm")
  public String getInicioPeriodo() {
    return inicioPeriodo;
  }
  public void setInicioPeriodo(String inicioPeriodo) {
    this.inicioPeriodo = inicioPeriodo;
  }
  public InformacionEntidad24 finPeriodo(String finPeriodo) {
    this.finPeriodo = finPeriodo;
    return this;
  }
   
  @ApiModelProperty(value = "Periodo de finalización del vector de 24 meses de la variable atrasos24. Formato yyyymm")
  public String getFinPeriodo() {
    return finPeriodo;
  }
  public void setFinPeriodo(String finPeriodo) {
    this.finPeriodo = finPeriodo;
  }
  public InformacionEntidad24 atrasos24(String atrasos24) {
    this.atrasos24 = atrasos24;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra un vector de 24 meses, con un indicativo de días de atraso descritos en la tabla de abajo. Dónde la primera posición a la izquierda es el incio periodo y la última posición a la derecha es el fin periodo.<table><thead><tr><th>Indicador</th><th>Días de atraso</th></tr></thead><tbody><tr><td>0</td><td>0</td></tr><tr><td>1</td><td> 1 a 30</td></tr><tr><td>2</td><td> 31 a 60</td></tr><tr><td>3</td><td> 61 a 90</td></tr><tr><td>4</td><td> Más de 90</td></tr><tr><td>-</td><td>Sin el producto en el mes</td></tr></tbody></table>")
  public String getAtrasos24() {
    return atrasos24;
  }
  public void setAtrasos24(String atrasos24) {
    this.atrasos24 = atrasos24;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InformacionEntidad24 informacionEntidad24 = (InformacionEntidad24) o;
    return Objects.equals(this.descripcionEntidad, informacionEntidad24.descripcionEntidad) &&
        Objects.equals(this.claveSituacion, informacionEntidad24.claveSituacion) &&
        Objects.equals(this.idCalificacion, informacionEntidad24.idCalificacion) &&
        Objects.equals(this.diasAtraso, informacionEntidad24.diasAtraso) &&
        Objects.equals(this.maximoAtraso, informacionEntidad24.maximoAtraso) &&
        Objects.equals(this.deudaMaximoAtraso, informacionEntidad24.deudaMaximoAtraso) &&
        Objects.equals(this.inicioPeriodo, informacionEntidad24.inicioPeriodo) &&
        Objects.equals(this.finPeriodo, informacionEntidad24.finPeriodo) &&
        Objects.equals(this.atrasos24, informacionEntidad24.atrasos24);
  }
  @Override
  public int hashCode() {
    return Objects.hash(descripcionEntidad, claveSituacion, idCalificacion, diasAtraso, maximoAtraso, deudaMaximoAtraso, inicioPeriodo, finPeriodo, atrasos24);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InformacionEntidad24 {\n");
    
    sb.append("    descripcionEntidad: ").append(toIndentedString(descripcionEntidad)).append("\n");
    sb.append("    claveSituacion: ").append(toIndentedString(claveSituacion)).append("\n");
    sb.append("    idCalificacion: ").append(toIndentedString(idCalificacion)).append("\n");
    sb.append("    diasAtraso: ").append(toIndentedString(diasAtraso)).append("\n");
    sb.append("    maximoAtraso: ").append(toIndentedString(maximoAtraso)).append("\n");
    sb.append("    deudaMaximoAtraso: ").append(toIndentedString(deudaMaximoAtraso)).append("\n");
    sb.append("    inicioPeriodo: ").append(toIndentedString(inicioPeriodo)).append("\n");
    sb.append("    finPeriodo: ").append(toIndentedString(finPeriodo)).append("\n");
    sb.append("    atrasos24: ").append(toIndentedString(atrasos24)).append("\n");
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
