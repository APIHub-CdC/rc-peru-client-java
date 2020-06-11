package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;


public class ComportamientoUsoTarjeta {
  @SerializedName("claveProducto")
  private String claveProducto = null;
  @SerializedName("descripcionEntidad")
  private String descripcionEntidad = null;
  @SerializedName("claveSituacion")
  private String claveSituacion = null;
  @SerializedName("ultimaLineaCredito")
  private Float ultimaLineaCredito = null;
  @SerializedName("utilizacion24")
  private String utilizacion24 = null;
  @SerializedName("inicioPeriodoUtil")
  private String inicioPeriodoUtil = null;
  @SerializedName("finPeriodoUtil")
  private String finPeriodoUtil = null;
  @SerializedName("maximaDeuda")
  private Float maximaDeuda = null;
  @SerializedName("porcentajeMaximaDeuda")
  private Float porcentajeMaximaDeuda = null;
  @SerializedName("disposicion24")
  private String disposicion24 = null;
  @SerializedName("inicioPeriodoDisposicion")
  private String inicioPeriodoDisposicion = null;
  @SerializedName("finPeriodoDisposicion")
  private String finPeriodoDisposicion = null;
  @SerializedName("maximaDeudaEfectivo")
  private Float maximaDeudaEfectivo = null;
  @SerializedName("porcentajeMaximaDeudaEfectivo")
  private Float porcentajeMaximaDeudaEfectivo = null;
  @SerializedName("maximoLineaCredito")
  private Float maximoLineaCredito = null;
  @SerializedName("maximoFechaLineaCredito")
  private String maximoFechaLineaCredito = null;
  public ComportamientoUsoTarjeta claveProducto(String claveProducto) {
    this.claveProducto = claveProducto;
    return this;
  }
   
  @ApiModelProperty(value = "<table><thead><tr><th>Clave Producto</th><th>Producto</th></tr></thead><tbody><tr><td>0101TC</td><td>Consumo</td></tr><tr><td>0301TC</td><td>Microempresa</td></tr><tr><td>0401TC</td><td>Pequeña empresa</td></tr><tr><td>0501TC</td><td>Mediana empresa</td></tr><tr><td>0601TC</td><td>Grande empresa</td></tr></tbody></table>")
  public String getClaveProducto() {
    return claveProducto;
  }
  public void setClaveProducto(String claveProducto) {
    this.claveProducto = claveProducto;
  }
  public ComportamientoUsoTarjeta descripcionEntidad(String descripcionEntidad) {
    this.descripcionEntidad = descripcionEntidad;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el nombre de la entidad acreedora.")
  public String getDescripcionEntidad() {
    return descripcionEntidad;
  }
  public void setDescripcionEntidad(String descripcionEntidad) {
    this.descripcionEntidad = descripcionEntidad;
  }
  public ComportamientoUsoTarjeta claveSituacion(String claveSituacion) {
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
  public ComportamientoUsoTarjeta ultimaLineaCredito(Float ultimaLineaCredito) {
    this.ultimaLineaCredito = ultimaLineaCredito;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la suma de los montos de líneas de crédito reportados por entidad y producto (tipo de crédito).")
  public Float getUltimaLineaCredito() {
    return ultimaLineaCredito;
  }
  public void setUltimaLineaCredito(Float ultimaLineaCredito) {
    this.ultimaLineaCredito = ultimaLineaCredito;
  }
  public ComportamientoUsoTarjeta utilizacion24(String utilizacion24) {
    this.utilizacion24 = utilizacion24;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra un vector de 24 meses del uso de la línea de crédito, con un indicativo del porcentaje de utilización descrito en la tabla de abajo. Dónde la primera posición a la izquierda es el incio periodo y la última posiciòn a la derecha es el fin periodo. <table><thead><tr><th>Clave</th><th>% de Utilización</th></tr></thead><tbody><tr><td>0</td><td>0</td></tr><tr><td>1</td><td>Hasta 25</td></tr><tr><td>2</td><td>Hasta 50</td></tr><tr><td>3</td><td>Hasta 75</td></tr><tr><td>4</td><td>Más del 75</td></tr><tr><td>-</td><td>Sin producto del mes.</td></tr></tbody></table>")
  public String getUtilizacion24() {
    return utilizacion24;
  }
  public void setUtilizacion24(String utilizacion24) {
    this.utilizacion24 = utilizacion24;
  }
  public ComportamientoUsoTarjeta inicioPeriodoUtil(String inicioPeriodoUtil) {
    this.inicioPeriodoUtil = inicioPeriodoUtil;
    return this;
  }
   
  @ApiModelProperty(value = "Periodo de inicio del vector de 24 meses de la variable utilizacion24. Formato yyyymm")
  public String getInicioPeriodoUtil() {
    return inicioPeriodoUtil;
  }
  public void setInicioPeriodoUtil(String inicioPeriodoUtil) {
    this.inicioPeriodoUtil = inicioPeriodoUtil;
  }
  public ComportamientoUsoTarjeta finPeriodoUtil(String finPeriodoUtil) {
    this.finPeriodoUtil = finPeriodoUtil;
    return this;
  }
   
  @ApiModelProperty(value = "Periodo de finalización del vector de 24 meses de la variable utilizacion24. Formato yyyymm")
  public String getFinPeriodoUtil() {
    return finPeriodoUtil;
  }
  public void setFinPeriodoUtil(String finPeriodoUtil) {
    this.finPeriodoUtil = finPeriodoUtil;
  }
  public ComportamientoUsoTarjeta maximaDeuda(Float maximaDeuda) {
    this.maximaDeuda = maximaDeuda;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el monto máximo utilizado en el periodo de 24 meses.")
  public Float getMaximaDeuda() {
    return maximaDeuda;
  }
  public void setMaximaDeuda(Float maximaDeuda) {
    this.maximaDeuda = maximaDeuda;
  }
  public ComportamientoUsoTarjeta porcentajeMaximaDeuda(Float porcentajeMaximaDeuda) {
    this.porcentajeMaximaDeuda = porcentajeMaximaDeuda;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra porcentaje multiplicado por 100 del máximo monto utilizado con respecto a la línea de crédito del mismo mes.")
  public Float getPorcentajeMaximaDeuda() {
    return porcentajeMaximaDeuda;
  }
  public void setPorcentajeMaximaDeuda(Float porcentajeMaximaDeuda) {
    this.porcentajeMaximaDeuda = porcentajeMaximaDeuda;
  }
  public ComportamientoUsoTarjeta disposicion24(String disposicion24) {
    this.disposicion24 = disposicion24;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra un vector de 24 meses de la disposición de efectivo, con un indicativo del porcentaje de la disposición descrito en la tabla de abajo. Dónde la primera posición a la izquierda es el incio periodo y la última posiciòn a la derecha es el fin periodo. <table><thead><tr><th>Clave</th><th>% de Disposición</th></tr></thead><tbody><tr><td>0</td><td>0</td></tr><tr><td>1</td><td>Hasta 25</td></tr><tr><td>2</td><td>Hasta 50</td></tr><tr><td>3</td><td>Hasta 75</td></tr><tr><td>4</td><td>Más del 75</td></tr><tr><td>-</td><td>Sin producto del mes.</td></tr></tbody></table>")
  public String getDisposicion24() {
    return disposicion24;
  }
  public void setDisposicion24(String disposicion24) {
    this.disposicion24 = disposicion24;
  }
  public ComportamientoUsoTarjeta inicioPeriodoDisposicion(String inicioPeriodoDisposicion) {
    this.inicioPeriodoDisposicion = inicioPeriodoDisposicion;
    return this;
  }
   
  @ApiModelProperty(value = "Periodo de inicio del vector de 24 meses de la variable disposicion24. Formato yyyymm")
  public String getInicioPeriodoDisposicion() {
    return inicioPeriodoDisposicion;
  }
  public void setInicioPeriodoDisposicion(String inicioPeriodoDisposicion) {
    this.inicioPeriodoDisposicion = inicioPeriodoDisposicion;
  }
  public ComportamientoUsoTarjeta finPeriodoDisposicion(String finPeriodoDisposicion) {
    this.finPeriodoDisposicion = finPeriodoDisposicion;
    return this;
  }
   
  @ApiModelProperty(value = "Periodo de finalización del vector de 24 meses de la variable disposicion24. Formato yyyymm")
  public String getFinPeriodoDisposicion() {
    return finPeriodoDisposicion;
  }
  public void setFinPeriodoDisposicion(String finPeriodoDisposicion) {
    this.finPeriodoDisposicion = finPeriodoDisposicion;
  }
  public ComportamientoUsoTarjeta maximaDeudaEfectivo(Float maximaDeudaEfectivo) {
    this.maximaDeudaEfectivo = maximaDeudaEfectivo;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el máximo monto dispuesto en el periodo de 24 meses.")
  public Float getMaximaDeudaEfectivo() {
    return maximaDeudaEfectivo;
  }
  public void setMaximaDeudaEfectivo(Float maximaDeudaEfectivo) {
    this.maximaDeudaEfectivo = maximaDeudaEfectivo;
  }
  public ComportamientoUsoTarjeta porcentajeMaximaDeudaEfectivo(Float porcentajeMaximaDeudaEfectivo) {
    this.porcentajeMaximaDeudaEfectivo = porcentajeMaximaDeudaEfectivo;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el porcentaje multiplicado por 100 dispuesto con respecto a la línea de crédito del mismo mes.")
  public Float getPorcentajeMaximaDeudaEfectivo() {
    return porcentajeMaximaDeudaEfectivo;
  }
  public void setPorcentajeMaximaDeudaEfectivo(Float porcentajeMaximaDeudaEfectivo) {
    this.porcentajeMaximaDeudaEfectivo = porcentajeMaximaDeudaEfectivo;
  }
  public ComportamientoUsoTarjeta maximoLineaCredito(Float maximoLineaCredito) {
    this.maximoLineaCredito = maximoLineaCredito;
    return this;
  }
   
  @ApiModelProperty(value = "Monto de la línea de crédito máxima en los últimos 60 meses.")
  public Float getMaximoLineaCredito() {
    return maximoLineaCredito;
  }
  public void setMaximoLineaCredito(Float maximoLineaCredito) {
    this.maximoLineaCredito = maximoLineaCredito;
  }
  public ComportamientoUsoTarjeta maximoFechaLineaCredito(String maximoFechaLineaCredito) {
    this.maximoFechaLineaCredito = maximoFechaLineaCredito;
    return this;
  }
   
  @ApiModelProperty(value = "Periodo en que tuvo la máxima la línea de crédito. Formato yyyymm")
  public String getMaximoFechaLineaCredito() {
    return maximoFechaLineaCredito;
  }
  public void setMaximoFechaLineaCredito(String maximoFechaLineaCredito) {
    this.maximoFechaLineaCredito = maximoFechaLineaCredito;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComportamientoUsoTarjeta comportamientoUsoTarjeta = (ComportamientoUsoTarjeta) o;
    return Objects.equals(this.claveProducto, comportamientoUsoTarjeta.claveProducto) &&
        Objects.equals(this.descripcionEntidad, comportamientoUsoTarjeta.descripcionEntidad) &&
        Objects.equals(this.claveSituacion, comportamientoUsoTarjeta.claveSituacion) &&
        Objects.equals(this.ultimaLineaCredito, comportamientoUsoTarjeta.ultimaLineaCredito) &&
        Objects.equals(this.utilizacion24, comportamientoUsoTarjeta.utilizacion24) &&
        Objects.equals(this.inicioPeriodoUtil, comportamientoUsoTarjeta.inicioPeriodoUtil) &&
        Objects.equals(this.finPeriodoUtil, comportamientoUsoTarjeta.finPeriodoUtil) &&
        Objects.equals(this.maximaDeuda, comportamientoUsoTarjeta.maximaDeuda) &&
        Objects.equals(this.porcentajeMaximaDeuda, comportamientoUsoTarjeta.porcentajeMaximaDeuda) &&
        Objects.equals(this.disposicion24, comportamientoUsoTarjeta.disposicion24) &&
        Objects.equals(this.inicioPeriodoDisposicion, comportamientoUsoTarjeta.inicioPeriodoDisposicion) &&
        Objects.equals(this.finPeriodoDisposicion, comportamientoUsoTarjeta.finPeriodoDisposicion) &&
        Objects.equals(this.maximaDeudaEfectivo, comportamientoUsoTarjeta.maximaDeudaEfectivo) &&
        Objects.equals(this.porcentajeMaximaDeudaEfectivo, comportamientoUsoTarjeta.porcentajeMaximaDeudaEfectivo) &&
        Objects.equals(this.maximoLineaCredito, comportamientoUsoTarjeta.maximoLineaCredito) &&
        Objects.equals(this.maximoFechaLineaCredito, comportamientoUsoTarjeta.maximoFechaLineaCredito);
  }
  @Override
  public int hashCode() {
    return Objects.hash(claveProducto, descripcionEntidad, claveSituacion, ultimaLineaCredito, utilizacion24, inicioPeriodoUtil, finPeriodoUtil, maximaDeuda, porcentajeMaximaDeuda, disposicion24, inicioPeriodoDisposicion, finPeriodoDisposicion, maximaDeudaEfectivo, porcentajeMaximaDeudaEfectivo, maximoLineaCredito, maximoFechaLineaCredito);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComportamientoUsoTarjeta {\n");
    
    sb.append("    claveProducto: ").append(toIndentedString(claveProducto)).append("\n");
    sb.append("    descripcionEntidad: ").append(toIndentedString(descripcionEntidad)).append("\n");
    sb.append("    claveSituacion: ").append(toIndentedString(claveSituacion)).append("\n");
    sb.append("    ultimaLineaCredito: ").append(toIndentedString(ultimaLineaCredito)).append("\n");
    sb.append("    utilizacion24: ").append(toIndentedString(utilizacion24)).append("\n");
    sb.append("    inicioPeriodoUtil: ").append(toIndentedString(inicioPeriodoUtil)).append("\n");
    sb.append("    finPeriodoUtil: ").append(toIndentedString(finPeriodoUtil)).append("\n");
    sb.append("    maximaDeuda: ").append(toIndentedString(maximaDeuda)).append("\n");
    sb.append("    porcentajeMaximaDeuda: ").append(toIndentedString(porcentajeMaximaDeuda)).append("\n");
    sb.append("    disposicion24: ").append(toIndentedString(disposicion24)).append("\n");
    sb.append("    inicioPeriodoDisposicion: ").append(toIndentedString(inicioPeriodoDisposicion)).append("\n");
    sb.append("    finPeriodoDisposicion: ").append(toIndentedString(finPeriodoDisposicion)).append("\n");
    sb.append("    maximaDeudaEfectivo: ").append(toIndentedString(maximaDeudaEfectivo)).append("\n");
    sb.append("    porcentajeMaximaDeudaEfectivo: ").append(toIndentedString(porcentajeMaximaDeudaEfectivo)).append("\n");
    sb.append("    maximoLineaCredito: ").append(toIndentedString(maximoLineaCredito)).append("\n");
    sb.append("    maximoFechaLineaCredito: ").append(toIndentedString(maximoFechaLineaCredito)).append("\n");
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
