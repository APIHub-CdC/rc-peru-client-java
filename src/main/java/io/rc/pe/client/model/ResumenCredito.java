package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.rc.pe.client.model.DetalleProducto;
import io.rc.pe.client.model.DeudaTipoProductoRC;
import io.rc.pe.client.model.EndeudamientoTotal;
import io.rc.pe.client.model.IndicadoresSBS;
import io.rc.pe.client.model.ResumenCreditoCalificacion;
import io.rc.pe.client.model.ResumenCreditoSBSUltimos24Meses;
import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "Esta sección muestra de manera resumida la información reportada por las distintas entidades, lo que permite realizar un análisis rápido de la información de la persona natural/jurídica consultada.")
public class ResumenCredito {
  @SerializedName("endeudamientoTotal")
  private List<EndeudamientoTotal> endeudamientoTotal = null;
  @SerializedName("deudaTipoProductoRC")
  private List<DeudaTipoProductoRC> deudaTipoProductoRC = null;
  @SerializedName("detalleProducto")
  private List<DetalleProducto> detalleProducto = null;
  @SerializedName("indicadoresSBS")
  private List<IndicadoresSBS> indicadoresSBS = null;
  @SerializedName("calificacion")
  private ResumenCreditoCalificacion calificacion = null;
  @SerializedName("SBSUltimos24Meses")
  private ResumenCreditoSBSUltimos24Meses sbSUltimos24Meses = null;
  public ResumenCredito endeudamientoTotal(List<EndeudamientoTotal> endeudamientoTotal) {
    this.endeudamientoTotal = endeudamientoTotal;
    return this;
  }
  public ResumenCredito addEndeudamientoTotalItem(EndeudamientoTotal endeudamientoTotalItem) {
    if (this.endeudamientoTotal == null) {
      this.endeudamientoTotal = new ArrayList<EndeudamientoTotal>();
    }
    this.endeudamientoTotal.add(endeudamientoTotalItem);
    return this;
  }
   
  @ApiModelProperty(example = "[{\"claveConcepto\":\"DDIA\",\"monto\":12465.82,\"porcentaje\":35.05},{\"claveConcepto\":\"DMOR\",\"monto\":23101.12,\"porcentaje\":64.95},{\"claveConcepto\":\"DTOT\",\"monto\":35566.94,\"porcentaje\":100}]", value = "Esta sección muestra los  montos y porcentajes de deuda total, deuda al día y deuda morosa.   La deuda al día son todas las cuentas con situación de deuda vigente, reestructurada y refinanciada.   La deuda morosa es la suma del monto de cuentas con situación vencida, judicial, negativa (Protestos, Morosidad comercial), castigos y SUNAT. No incluye contingentes.")
  public List<EndeudamientoTotal> getEndeudamientoTotal() {
    return endeudamientoTotal;
  }
  public void setEndeudamientoTotal(List<EndeudamientoTotal> endeudamientoTotal) {
    this.endeudamientoTotal = endeudamientoTotal;
  }
  public ResumenCredito deudaTipoProductoRC(List<DeudaTipoProductoRC> deudaTipoProductoRC) {
    this.deudaTipoProductoRC = deudaTipoProductoRC;
    return this;
  }
  public ResumenCredito addDeudaTipoProductoRCItem(DeudaTipoProductoRC deudaTipoProductoRCItem) {
    if (this.deudaTipoProductoRC == null) {
      this.deudaTipoProductoRC = new ArrayList<DeudaTipoProductoRC>();
    }
    this.deudaTipoProductoRC.add(deudaTipoProductoRCItem);
    return this;
  }
   
  @ApiModelProperty(example = "[{\"claveConcepto\":\"PQE\",\"montoDia\":12465.82,\"montoMorosa\":17299.43,\"montoTotal\":29765.25,\"porcentajeDia\":41.88,\"porcentajeMorosa\":58.12,\"porcentajeTotal\":100},{\"claveConcepto\":\"MCF\",\"montoDia\":0,\"montoMorosa\":3824.91,\"montoTotal\":3824.91,\"porcentajeDia\":0,\"porcentajeMorosa\":100,\"porcentajeTotal\":12.85},{\"claveConcepto\":\"PRO\",\"montoDia\":0,\"montoMorosa\":1476.2,\"montoTotal\":1476.2,\"porcentajeDia\":0,\"porcentajeMorosa\":100,\"porcentajeTotal\":4.96}]", value = "Esta sección se muestra para cada producto crediticio los  montos y porcentajes de deuda total, deuda al día y deuda morosa.")
  public List<DeudaTipoProductoRC> getDeudaTipoProductoRC() {
    return deudaTipoProductoRC;
  }
  public void setDeudaTipoProductoRC(List<DeudaTipoProductoRC> deudaTipoProductoRC) {
    this.deudaTipoProductoRC = deudaTipoProductoRC;
  }
  public ResumenCredito detalleProducto(List<DetalleProducto> detalleProducto) {
    this.detalleProducto = detalleProducto;
    return this;
  }
  public ResumenCredito addDetalleProductoItem(DetalleProducto detalleProductoItem) {
    if (this.detalleProducto == null) {
      this.detalleProducto = new ArrayList<DetalleProducto>();
    }
    this.detalleProducto.add(detalleProductoItem);
    return this;
  }
   
  @ApiModelProperty(example = "[{\"claveProducto\":\"PR\",\"claveTipoProducto\":\"PQE\",\"idCalificacion\":\"4\",\"fechaReporteSBS\":\"20191231\",\"totalDeudaDirecta\":29698.84,\"maximaMorosidad24meses\":154,\"maximaMorosidadActual\":154,\"antiguedad\":4,\"entidadesRegistradas\":3,\"entidadesAtrasos\":2,\"deudaVigente\":12399.41,\"deudaReestructurada\":0,\"deudaRefinanciada\":0,\"deudaVencida\":17299.43,\"deudaVencidaMenor30\":null,\"deudaVencidaMayor30\":null,\"deudaJudicial\":0,\"porcentajeDeudaMorosa\":58.25,\"porcentajeDeudaMonedaExtranjera\":0,\"deudaIndirecta\":0,\"lineaCredito\":0},{\"claveProducto\":\"MCF\",\"claveTipoProducto\":\"MCF\",\"idCalificacion\":\"4\",\"fechaReporteSBS\":\"20200131\",\"totalDeudaDirecta\":3824.91,\"maximaMorosidad24meses\":141,\"maximaMorosidadActual\":141,\"antiguedad\":9,\"entidadesRegistradas\":2,\"entidadesAtrasos\":2,\"deudaVigente\":0,\"deudaReestructurada\":null,\"deudaRefinanciada\":0,\"deudaVencida\":null,\"deudaVencidaMenor30\":2959.02,\"deudaVencidaMayor30\":865.89,\"deudaJudicial\":0,\"porcentajeDeudaMorosa\":100,\"porcentajeDeudaMonedaExtranjera\":0,\"deudaIndirecta\":0,\"lineaCredito\":0},{\"claveProducto\":\"PR\",\"claveTipoProducto\":\"CC\",\"idCalificacion\":\"9\",\"fechaReporteSBS\":\"20150228\",\"totalDeudaDirecta\":667.57,\"maximaMorosidad24meses\":0,\"maximaMorosidadActual\":0,\"antiguedad\":60,\"entidadesRegistradas\":1,\"entidadesAtrasos\":0,\"deudaVigente\":667.57,\"deudaReestructurada\":0,\"deudaRefinanciada\":0,\"deudaVencida\":0,\"deudaVencidaMenor30\":null,\"deudaVencidaMayor30\":null,\"deudaJudicial\":0,\"porcentajeDeudaMorosa\":0,\"porcentajeDeudaMonedaExtranjera\":0,\"deudaIndirecta\":0,\"lineaCredito\":0}]", value = "Esta sección muestra para cada producto crediticio, un resumen con la información más importante para la toma de decisiones. Se mostrará un ítem para cada tipo de productos, ya sea que esté activo actualmente o que se haya dejado de reportar una cuenta.")
  public List<DetalleProducto> getDetalleProducto() {
    return detalleProducto;
  }
  public void setDetalleProducto(List<DetalleProducto> detalleProducto) {
    this.detalleProducto = detalleProducto;
  }
  public ResumenCredito indicadoresSBS(List<IndicadoresSBS> indicadoresSBS) {
    this.indicadoresSBS = indicadoresSBS;
    return this;
  }
  public ResumenCredito addIndicadoresSBSItem(IndicadoresSBS indicadoresSBSItem) {
    if (this.indicadoresSBS == null) {
      this.indicadoresSBS = new ArrayList<IndicadoresSBS>();
    }
    this.indicadoresSBS.add(indicadoresSBSItem);
    return this;
  }
   
  @ApiModelProperty(example = "[{\"deudaDirecta\":29699,\"deudaDirectaMorosa\":17299,\"deudaIndirecta\":0,\"deudaCastigada\":0,\"numeroEntidades\":3,\"entidadesDeudaDirecta\":3,\"maximoAtraso\":154,\"antiguedadMaxima\":60,\"entidadMayorDeuda\":\"CAJA MUNICIPAL DE AHORRO Y CREDITO DE AREQUIPA\"}]", value = "Esta sección muestra todos los rubros que son cargados por la SBS, de una manera concentrada y de fácil lectura para realizar una interpretación de la situación actual del cliente.")
  public List<IndicadoresSBS> getIndicadoresSBS() {
    return indicadoresSBS;
  }
  public void setIndicadoresSBS(List<IndicadoresSBS> indicadoresSBS) {
    this.indicadoresSBS = indicadoresSBS;
  }
  public ResumenCredito calificacion(ResumenCreditoCalificacion calificacion) {
    this.calificacion = calificacion;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResumenCreditoCalificacion getCalificacion() {
    return calificacion;
  }
  public void setCalificacion(ResumenCreditoCalificacion calificacion) {
    this.calificacion = calificacion;
  }
  public ResumenCredito sbSUltimos24Meses(ResumenCreditoSBSUltimos24Meses sbSUltimos24Meses) {
    this.sbSUltimos24Meses = sbSUltimos24Meses;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResumenCreditoSBSUltimos24Meses getSbSUltimos24Meses() {
    return sbSUltimos24Meses;
  }
  public void setSbSUltimos24Meses(ResumenCreditoSBSUltimos24Meses sbSUltimos24Meses) {
    this.sbSUltimos24Meses = sbSUltimos24Meses;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumenCredito resumenCredito = (ResumenCredito) o;
    return Objects.equals(this.endeudamientoTotal, resumenCredito.endeudamientoTotal) &&
        Objects.equals(this.deudaTipoProductoRC, resumenCredito.deudaTipoProductoRC) &&
        Objects.equals(this.detalleProducto, resumenCredito.detalleProducto) &&
        Objects.equals(this.indicadoresSBS, resumenCredito.indicadoresSBS) &&
        Objects.equals(this.calificacion, resumenCredito.calificacion) &&
        Objects.equals(this.sbSUltimos24Meses, resumenCredito.sbSUltimos24Meses);
  }
  @Override
  public int hashCode() {
    return Objects.hash(endeudamientoTotal, deudaTipoProductoRC, detalleProducto, indicadoresSBS, calificacion, sbSUltimos24Meses);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumenCredito {\n");
    
    sb.append("    endeudamientoTotal: ").append(toIndentedString(endeudamientoTotal)).append("\n");
    sb.append("    deudaTipoProductoRC: ").append(toIndentedString(deudaTipoProductoRC)).append("\n");
    sb.append("    detalleProducto: ").append(toIndentedString(detalleProducto)).append("\n");
    sb.append("    indicadoresSBS: ").append(toIndentedString(indicadoresSBS)).append("\n");
    sb.append("    calificacion: ").append(toIndentedString(calificacion)).append("\n");
    sb.append("    sbSUltimos24Meses: ").append(toIndentedString(sbSUltimos24Meses)).append("\n");
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
