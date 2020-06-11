package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

public class DetalleProducto {
  @SerializedName("claveProducto")
  private String claveProducto = null;
  @SerializedName("claveTipoProducto")
  private String claveTipoProducto = null;
  @SerializedName("idCalificacion")
  private String idCalificacion = null;
  @SerializedName("fechaReporteSBS")
  private String fechaReporteSBS = null;
  @SerializedName("totalDeudaDirecta")
  private Float totalDeudaDirecta = null;
  @SerializedName("maximaMorosidad24meses")
  private BigDecimal maximaMorosidad24meses = null;
  @SerializedName("maximaMorosidadActual")
  private BigDecimal maximaMorosidadActual = null;
  @SerializedName("antiguedad")
  private BigDecimal antiguedad = null;
  @SerializedName("entidadesRegistradas")
  private BigDecimal entidadesRegistradas = null;
  @SerializedName("entidadesAtrasos")
  private BigDecimal entidadesAtrasos = null;
  @SerializedName("deudaVigente")
  private Float deudaVigente = null;
  @SerializedName("deudaReestructurada")
  private Float deudaReestructurada = null;
  @SerializedName("deudaRefinanciada")
  private Float deudaRefinanciada = null;
  @SerializedName("deudaVencida")
  private Float deudaVencida = null;
  @SerializedName("deudaVencidaMenor30")
  private Float deudaVencidaMenor30 = null;
  @SerializedName("deudaVencidaMayor30")
  private Float deudaVencidaMayor30 = null;
  @SerializedName("deudaJudicial")
  private Float deudaJudicial = null;
  @SerializedName("porcentajeDeudaMorosa")
  private Float porcentajeDeudaMorosa = null;
  @SerializedName("porcentajeDeudaMonedaExtranjera")
  private Float porcentajeDeudaMonedaExtranjera = null;
  @SerializedName("deudaIndirecta")
  private Float deudaIndirecta = null;
  @SerializedName("lineaCredito")
  private Float lineaCredito = null;
  public DetalleProducto claveProducto(String claveProducto) {
    this.claveProducto = claveProducto;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la clave del tipo de credito que ha tenido actividad.<table><thead><tr><th>Clave Producto</th><th>Producto</th></tr></thead><tbody><tr><td>AF</td><td>Arrendamiento financiero</td></tr><tr><td>BMD</td><td>Bancos multilaterales de desarrollo</td></tr><tr><td>COR</td><td>Corporativo</td></tr><tr><td>DES</td><td>Descuentos</td></tr><tr><td>ESF</td><td>Empresas del sistema financiero</td></tr><tr><td>ESP</td><td>Entidades del sector público</td></tr><tr><td>FMV</td><td>Fondo MiVivienda</td></tr><tr><td>IV</td><td>Intermediarios de valores</td></tr><tr><td>MCF</td><td>Microfinanzas no supervisadas</td></tr><tr><td>OCC</td><td>Otros créditos de consumo</td></tr><tr><td>OCG</td><td>Otros créditos grande empresa</td></tr><tr><td>OCH</td><td>Otros créditos hipotecarios</td></tr><tr><td>OCM</td><td>Otros créditos microempresa</td></tr><tr><td>OCM</td><td>Otros créditos mediana empresa</td></tr><tr><td>OCP</td><td>Otros créditos pequeña empresa</td></tr><tr><td>OP</td><td>Préstamos de consumo</td></tr><tr><td>PA</td><td>Préstamo vehicular</td></tr><tr><td>PIG</td><td>Pignoraticios</td></tr><tr><td>PR</td><td>Préstamos</td></tr><tr><td>SBR</td><td>Soberanos</td></tr><tr><td>SOB</td><td>Sobregiros en cuenta</td></tr><tr><td>TJ</td><td>Tarjeta de crédito</td></tr></tbody></table>")
  public String getClaveProducto() {
    return claveProducto;
  }
  public void setClaveProducto(String claveProducto) {
    this.claveProducto = claveProducto;
  }
  public DetalleProducto claveTipoProducto(String claveTipoProducto) {
    this.claveTipoProducto = claveTipoProducto;
    return this;
  }
   
  @ApiModelProperty(value = "Clave del producto que ha tenido actividad.<table><thead><tr><th>Clave Tipo Producto</th><th>Tipo Producto</th></tr></thead><tbody><tr><td>BMD</td><td>Bancos multilaterales de desarrollo</td></tr><tr><td>CC</td><td>Consumo</td></tr><tr><td>COR</td><td>Corporativo</td></tr><tr><td>ESF</td><td>Empresas del sistema financiero</td></tr><tr><td>ESP</td><td>Entidades del sector público</td></tr><tr><td>GDE</td><td>Grande empresa</td></tr><tr><td>HIP</td><td>Hipotecario</td></tr><tr><td>IV</td><td>Intermediarios de valores</td></tr><tr><td>MCF</td><td>Microfinanzas no supervisadas</td></tr><tr><td>MED</td><td>Mediana empresa</td></tr><tr><td>MIC</td><td>Microempresa</td></tr><tr><td>PQE</td><td>Pequeña empresa</td></tr><tr><td>SBR</td><td>Soberanos</td></tr></tbody></table>")
  public String getClaveTipoProducto() {
    return claveTipoProducto;
  }
  public void setClaveTipoProducto(String claveTipoProducto) {
    this.claveTipoProducto = claveTipoProducto;
  }
  public DetalleProducto idCalificacion(String idCalificacion) {
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
  public DetalleProducto fechaReporteSBS(String fechaReporteSBS) {
    this.fechaReporteSBS = fechaReporteSBS;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la fecha de reporte por parte de la SBS Corresponde  la fecha del reporte más reciente donde  la persona fue reportada con el tipo de crédito. Formato: yyyymm")
  public String getFechaReporteSBS() {
    return fechaReporteSBS;
  }
  public void setFechaReporteSBS(String fechaReporteSBS) {
    this.fechaReporteSBS = fechaReporteSBS;
  }
  public DetalleProducto totalDeudaDirecta(Float totalDeudaDirecta) {
    this.totalDeudaDirecta = totalDeudaDirecta;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la deuda directa que corresponde al producto.")
  public Float getTotalDeudaDirecta() {
    return totalDeudaDirecta;
  }
  public void setTotalDeudaDirecta(Float totalDeudaDirecta) {
    this.totalDeudaDirecta = totalDeudaDirecta;
  }
  public DetalleProducto maximaMorosidad24meses(BigDecimal maximaMorosidad24meses) {
    this.maximaMorosidad24meses = maximaMorosidad24meses;
    return this;
  }
   
  @ApiModelProperty(value = "Peor morosidad en días con la información reportada por la SBS en los últimos 24 meses a partir del último periodo reportado por la SBS. Se representa el valor en días.")
  public BigDecimal getMaximaMorosidad24meses() {
    return maximaMorosidad24meses;
  }
  public void setMaximaMorosidad24meses(BigDecimal maximaMorosidad24meses) {
    this.maximaMorosidad24meses = maximaMorosidad24meses;
  }
  public DetalleProducto maximaMorosidadActual(BigDecimal maximaMorosidadActual) {
    this.maximaMorosidadActual = maximaMorosidadActual;
    return this;
  }
   
  @ApiModelProperty(value = "Máxima morosidad en días a nivel producto/fuente en la información más reciente reportada por la SBS. Se representa el valor en días.")
  public BigDecimal getMaximaMorosidadActual() {
    return maximaMorosidadActual;
  }
  public void setMaximaMorosidadActual(BigDecimal maximaMorosidadActual) {
    this.maximaMorosidadActual = maximaMorosidadActual;
  }
  public DetalleProducto antiguedad(BigDecimal antiguedad) {
    this.antiguedad = antiguedad;
    return this;
  }
   
  @ApiModelProperty(value = "Meses desde  primera cuenta/dato registrado a la fecha del reporte.La observación se realiza desde hace 60 meses.")
  public BigDecimal getAntiguedad() {
    return antiguedad;
  }
  public void setAntiguedad(BigDecimal antiguedad) {
    this.antiguedad = antiguedad;
  }
  public DetalleProducto entidadesRegistradas(BigDecimal entidadesRegistradas) {
    this.entidadesRegistradas = entidadesRegistradas;
    return this;
  }
   
  @ApiModelProperty(value = "Cantidad de entidades con deuda en el periodo de reporte.")
  public BigDecimal getEntidadesRegistradas() {
    return entidadesRegistradas;
  }
  public void setEntidadesRegistradas(BigDecimal entidadesRegistradas) {
    this.entidadesRegistradas = entidadesRegistradas;
  }
  public DetalleProducto entidadesAtrasos(BigDecimal entidadesAtrasos) {
    this.entidadesAtrasos = entidadesAtrasos;
    return this;
  }
   
  @ApiModelProperty(value = "Cantidad de entidades con deuda en el producto que tenga atraso mayor a cero en el último mes.")
  public BigDecimal getEntidadesAtrasos() {
    return entidadesAtrasos;
  }
  public void setEntidadesAtrasos(BigDecimal entidadesAtrasos) {
    this.entidadesAtrasos = entidadesAtrasos;
  }
  public DetalleProducto deudaVigente(Float deudaVigente) {
    this.deudaVigente = deudaVigente;
    return this;
  }
   
  @ApiModelProperty(value = "Monto de deuda en el producto con situación vigente.")
  public Float getDeudaVigente() {
    return deudaVigente;
  }
  public void setDeudaVigente(Float deudaVigente) {
    this.deudaVigente = deudaVigente;
  }
  public DetalleProducto deudaReestructurada(Float deudaReestructurada) {
    this.deudaReestructurada = deudaReestructurada;
    return this;
  }
   
  @ApiModelProperty(value = "Monto de deuda en el producto con situación reestructurado. Esta información es relevante sólo cuándo la clave del producto y el tipo de producto es diferente a MCF, en cuyo caso será 0.")
  public Float getDeudaReestructurada() {
    return deudaReestructurada;
  }
  public void setDeudaReestructurada(Float deudaReestructurada) {
    this.deudaReestructurada = deudaReestructurada;
  }
  public DetalleProducto deudaRefinanciada(Float deudaRefinanciada) {
    this.deudaRefinanciada = deudaRefinanciada;
    return this;
  }
   
  @ApiModelProperty(value = "Monto de deuda en el producto con situación refinanciado.")
  public Float getDeudaRefinanciada() {
    return deudaRefinanciada;
  }
  public void setDeudaRefinanciada(Float deudaRefinanciada) {
    this.deudaRefinanciada = deudaRefinanciada;
  }
  public DetalleProducto deudaVencida(Float deudaVencida) {
    this.deudaVencida = deudaVencida;
    return this;
  }
   
  @ApiModelProperty(value = "Monto de deuda en el producto con situación vencida. Esta información es relevante sólo cuándo la clave del producto y el tipo de producto es diferente a MCF, en cuyo caso será 0")
  public Float getDeudaVencida() {
    return deudaVencida;
  }
  public void setDeudaVencida(Float deudaVencida) {
    this.deudaVencida = deudaVencida;
  }
  public DetalleProducto deudaVencidaMenor30(Float deudaVencidaMenor30) {
    this.deudaVencidaMenor30 = deudaVencidaMenor30;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la deuda vencida menor a 30 días de las microfinancieras no supervisadas. Esta información es relevante sólo cuándo la clave del producto y el tipo de producto es MCF, en otro caso será 0.")
  public Float getDeudaVencidaMenor30() {
    return deudaVencidaMenor30;
  }
  public void setDeudaVencidaMenor30(Float deudaVencidaMenor30) {
    this.deudaVencidaMenor30 = deudaVencidaMenor30;
  }
  public DetalleProducto deudaVencidaMayor30(Float deudaVencidaMayor30) {
    this.deudaVencidaMayor30 = deudaVencidaMayor30;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la deuda vencida mayor a 30 días de las microfinancieras no supervisadas. Esta información es relevante sólo cuándo la clave del producto y el tipo de producto es MCF, en otro caso será 0.")
  public Float getDeudaVencidaMayor30() {
    return deudaVencidaMayor30;
  }
  public void setDeudaVencidaMayor30(Float deudaVencidaMayor30) {
    this.deudaVencidaMayor30 = deudaVencidaMayor30;
  }
  public DetalleProducto deudaJudicial(Float deudaJudicial) {
    this.deudaJudicial = deudaJudicial;
    return this;
  }
   
  @ApiModelProperty(value = "Monto de deuda en el producto con situación judicial.")
  public Float getDeudaJudicial() {
    return deudaJudicial;
  }
  public void setDeudaJudicial(Float deudaJudicial) {
    this.deudaJudicial = deudaJudicial;
  }
  public DetalleProducto porcentajeDeudaMorosa(Float porcentajeDeudaMorosa) {
    this.porcentajeDeudaMorosa = porcentajeDeudaMorosa;
    return this;
  }
   
  @ApiModelProperty(value = "Porcentaje de la deuda morosa en el producto multiplicado por 100.")
  public Float getPorcentajeDeudaMorosa() {
    return porcentajeDeudaMorosa;
  }
  public void setPorcentajeDeudaMorosa(Float porcentajeDeudaMorosa) {
    this.porcentajeDeudaMorosa = porcentajeDeudaMorosa;
  }
  public DetalleProducto porcentajeDeudaMonedaExtranjera(Float porcentajeDeudaMonedaExtranjera) {
    this.porcentajeDeudaMonedaExtranjera = porcentajeDeudaMonedaExtranjera;
    return this;
  }
   
  @ApiModelProperty(value = "Porcentaje de la deuda en moneda extranjera multiplicado por 100.")
  public Float getPorcentajeDeudaMonedaExtranjera() {
    return porcentajeDeudaMonedaExtranjera;
  }
  public void setPorcentajeDeudaMonedaExtranjera(Float porcentajeDeudaMonedaExtranjera) {
    this.porcentajeDeudaMonedaExtranjera = porcentajeDeudaMonedaExtranjera;
  }
  public DetalleProducto deudaIndirecta(Float deudaIndirecta) {
    this.deudaIndirecta = deudaIndirecta;
    return this;
  }
   
  @ApiModelProperty(value = "Deuda indirecta del producto.")
  public Float getDeudaIndirecta() {
    return deudaIndirecta;
  }
  public void setDeudaIndirecta(Float deudaIndirecta) {
    this.deudaIndirecta = deudaIndirecta;
  }
  public DetalleProducto lineaCredito(Float lineaCredito) {
    this.lineaCredito = lineaCredito;
    return this;
  }
   
  @ApiModelProperty(value = "Línea de crédito del producto. Solo es relevante cuándo la claveProducto es TJ y la claveTipoProducto es CC.")
  public Float getLineaCredito() {
    return lineaCredito;
  }
  public void setLineaCredito(Float lineaCredito) {
    this.lineaCredito = lineaCredito;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetalleProducto detalleProducto = (DetalleProducto) o;
    return Objects.equals(this.claveProducto, detalleProducto.claveProducto) &&
        Objects.equals(this.claveTipoProducto, detalleProducto.claveTipoProducto) &&
        Objects.equals(this.idCalificacion, detalleProducto.idCalificacion) &&
        Objects.equals(this.fechaReporteSBS, detalleProducto.fechaReporteSBS) &&
        Objects.equals(this.totalDeudaDirecta, detalleProducto.totalDeudaDirecta) &&
        Objects.equals(this.maximaMorosidad24meses, detalleProducto.maximaMorosidad24meses) &&
        Objects.equals(this.maximaMorosidadActual, detalleProducto.maximaMorosidadActual) &&
        Objects.equals(this.antiguedad, detalleProducto.antiguedad) &&
        Objects.equals(this.entidadesRegistradas, detalleProducto.entidadesRegistradas) &&
        Objects.equals(this.entidadesAtrasos, detalleProducto.entidadesAtrasos) &&
        Objects.equals(this.deudaVigente, detalleProducto.deudaVigente) &&
        Objects.equals(this.deudaReestructurada, detalleProducto.deudaReestructurada) &&
        Objects.equals(this.deudaRefinanciada, detalleProducto.deudaRefinanciada) &&
        Objects.equals(this.deudaVencida, detalleProducto.deudaVencida) &&
        Objects.equals(this.deudaVencidaMenor30, detalleProducto.deudaVencidaMenor30) &&
        Objects.equals(this.deudaVencidaMayor30, detalleProducto.deudaVencidaMayor30) &&
        Objects.equals(this.deudaJudicial, detalleProducto.deudaJudicial) &&
        Objects.equals(this.porcentajeDeudaMorosa, detalleProducto.porcentajeDeudaMorosa) &&
        Objects.equals(this.porcentajeDeudaMonedaExtranjera, detalleProducto.porcentajeDeudaMonedaExtranjera) &&
        Objects.equals(this.deudaIndirecta, detalleProducto.deudaIndirecta) &&
        Objects.equals(this.lineaCredito, detalleProducto.lineaCredito);
  }
  @Override
  public int hashCode() {
    return Objects.hash(claveProducto, claveTipoProducto, idCalificacion, fechaReporteSBS, totalDeudaDirecta, maximaMorosidad24meses, maximaMorosidadActual, antiguedad, entidadesRegistradas, entidadesAtrasos, deudaVigente, deudaReestructurada, deudaRefinanciada, deudaVencida, deudaVencidaMenor30, deudaVencidaMayor30, deudaJudicial, porcentajeDeudaMorosa, porcentajeDeudaMonedaExtranjera, deudaIndirecta, lineaCredito);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalleProducto {\n");
    
    sb.append("    claveProducto: ").append(toIndentedString(claveProducto)).append("\n");
    sb.append("    claveTipoProducto: ").append(toIndentedString(claveTipoProducto)).append("\n");
    sb.append("    idCalificacion: ").append(toIndentedString(idCalificacion)).append("\n");
    sb.append("    fechaReporteSBS: ").append(toIndentedString(fechaReporteSBS)).append("\n");
    sb.append("    totalDeudaDirecta: ").append(toIndentedString(totalDeudaDirecta)).append("\n");
    sb.append("    maximaMorosidad24meses: ").append(toIndentedString(maximaMorosidad24meses)).append("\n");
    sb.append("    maximaMorosidadActual: ").append(toIndentedString(maximaMorosidadActual)).append("\n");
    sb.append("    antiguedad: ").append(toIndentedString(antiguedad)).append("\n");
    sb.append("    entidadesRegistradas: ").append(toIndentedString(entidadesRegistradas)).append("\n");
    sb.append("    entidadesAtrasos: ").append(toIndentedString(entidadesAtrasos)).append("\n");
    sb.append("    deudaVigente: ").append(toIndentedString(deudaVigente)).append("\n");
    sb.append("    deudaReestructurada: ").append(toIndentedString(deudaReestructurada)).append("\n");
    sb.append("    deudaRefinanciada: ").append(toIndentedString(deudaRefinanciada)).append("\n");
    sb.append("    deudaVencida: ").append(toIndentedString(deudaVencida)).append("\n");
    sb.append("    deudaVencidaMenor30: ").append(toIndentedString(deudaVencidaMenor30)).append("\n");
    sb.append("    deudaVencidaMayor30: ").append(toIndentedString(deudaVencidaMayor30)).append("\n");
    sb.append("    deudaJudicial: ").append(toIndentedString(deudaJudicial)).append("\n");
    sb.append("    porcentajeDeudaMorosa: ").append(toIndentedString(porcentajeDeudaMorosa)).append("\n");
    sb.append("    porcentajeDeudaMonedaExtranjera: ").append(toIndentedString(porcentajeDeudaMonedaExtranjera)).append("\n");
    sb.append("    deudaIndirecta: ").append(toIndentedString(deudaIndirecta)).append("\n");
    sb.append("    lineaCredito: ").append(toIndentedString(lineaCredito)).append("\n");
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
