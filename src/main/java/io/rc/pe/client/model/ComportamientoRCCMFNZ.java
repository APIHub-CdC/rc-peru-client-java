package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.rc.pe.client.model.Castigos;
import io.rc.pe.client.model.ComportamientoPago;
import io.rc.pe.client.model.ComportamientoUsoTarjeta;
import io.rc.pe.client.model.EndeudamientoProductoEntidad;
import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "Esta sección muestra el detalle de los castigos, endeudamiento, comportamiento de pago, comportamiento de uso de crédito, del sistema regulado y microcréditos no regulados, donde se pueden observar las entidades, los estatus, montos de deudas, % de uso de las líneas de crédito, castigos y atrasos.")
public class ComportamientoRCCMFNZ {
  @SerializedName("castigos")
  private List<Castigos> castigos = null;
  @SerializedName("endeudamientoProductoEntidad")
  private List<EndeudamientoProductoEntidad> endeudamientoProductoEntidad = null;
  @SerializedName("comportamientoPago")
  private List<ComportamientoPago> comportamientoPago = null;
  @SerializedName("comportamientoUsoTarjeta")
  private List<ComportamientoUsoTarjeta> comportamientoUsoTarjeta = null;
  public ComportamientoRCCMFNZ castigos(List<Castigos> castigos) {
    this.castigos = castigos;
    return this;
  }
  public ComportamientoRCCMFNZ addCastigosItem(Castigos castigosItem) {
    if (this.castigos == null) {
      this.castigos = new ArrayList<Castigos>();
    }
    this.castigos.add(castigosItem);
    return this;
  }
   
  @ApiModelProperty(example = "[{\"descripcionEntidad\":\"MICRO PROMUJER\",\"claveEstatusPago\":\"ACT\",\"fechaPrimerCastigo\":\"201912\",\"fechaUltimoCastigo\":\"201912\",\"montoUltimoCastigo\":1319.2},{\"descripcionEntidad\":\"BANCO AZTECA DEL PERU S A\",\"claveEstatusPago\":\"ACT\",\"fechaPrimerCastigo\":\"201612\",\"fechaUltimoCastigo\":\"201912\",\"montoUltimoCastigo\":592.39}]", value = "Muestra los castigos que tiene la persona o empresa consultada.")
  public List<Castigos> getCastigos() {
    return castigos;
  }
  public void setCastigos(List<Castigos> castigos) {
    this.castigos = castigos;
  }
  public ComportamientoRCCMFNZ endeudamientoProductoEntidad(List<EndeudamientoProductoEntidad> endeudamientoProductoEntidad) {
    this.endeudamientoProductoEntidad = endeudamientoProductoEntidad;
    return this;
  }
  public ComportamientoRCCMFNZ addEndeudamientoProductoEntidadItem(EndeudamientoProductoEntidad endeudamientoProductoEntidadItem) {
    if (this.endeudamientoProductoEntidad == null) {
      this.endeudamientoProductoEntidad = new ArrayList<EndeudamientoProductoEntidad>();
    }
    this.endeudamientoProductoEntidad.add(endeudamientoProductoEntidadItem);
    return this;
  }
   
  @ApiModelProperty(example = "[{\"claveProducto\":\"0403PRE\",\"informacionEntidad\":[{\"descripcionEntidad\":\"CAJA MUNICIPAL DE AHORRO Y CREDITO DE AREQUIPA\",\"claveSituacion\":\"ACT\",\"antiguedad\":4,\"fechaUltimoReporte\":\"201912\",\"vigente\":0,\"refinanciada\":0,\"vencida\":17299.43,\"judicial\":0,\"deudaTotal\":17299.43},{\"descripcionEntidad\":\"CAJA MUNICIPAL DE AHORRO Y CREDITO HUANCAYO\",\"claveSituacion\":\"ACT\",\"antiguedad\":4,\"fechaUltimoReporte\":\"201912\",\"vigente\":10167.41,\"refinanciada\":0,\"vencida\":0,\"judicial\":0,\"deudaTotal\":10167.41},{\"descripcionEntidad\":\"COMPARTAMOS FINANCIERA S.A.\",\"claveSituacion\":\"ACT\",\"antiguedad\":4,\"fechaUltimoReporte\":\"201912\",\"vigente\":2232,\"refinanciada\":0,\"vencida\":0,\"judicial\":0,\"deudaTotal\":2232}]}]", value = "Esta sección muestra el detalle de cómo se encuentra distribuido el endeudamiento a nivel producto y entidad.")
  public List<EndeudamientoProductoEntidad> getEndeudamientoProductoEntidad() {
    return endeudamientoProductoEntidad;
  }
  public void setEndeudamientoProductoEntidad(List<EndeudamientoProductoEntidad> endeudamientoProductoEntidad) {
    this.endeudamientoProductoEntidad = endeudamientoProductoEntidad;
  }
  public ComportamientoRCCMFNZ comportamientoPago(List<ComportamientoPago> comportamientoPago) {
    this.comportamientoPago = comportamientoPago;
    return this;
  }
  public ComportamientoRCCMFNZ addComportamientoPagoItem(ComportamientoPago comportamientoPagoItem) {
    if (this.comportamientoPago == null) {
      this.comportamientoPago = new ArrayList<ComportamientoPago>();
    }
    this.comportamientoPago.add(comportamientoPagoItem);
    return this;
  }
   
  @ApiModelProperty(example = "[{\"claveProducto\":\"0403PRE\",\"informacionEntidad24\":[{\"descripcionEntidad\":\"CAJA MUNICIPAL DE AHORRO Y CREDITO DE AREQUIPA\",\"claveSituacion\":\"ACT\",\"idCalificacion\":\"4\",\"diasAtraso\":154,\"maximoAtraso\":154,\"deudaMaximoAtraso\":17299.43,\"inicioPeriodo\":\"201802\",\"finPeriodo\":\"202001\",\"atrasos24\":\"999999999999999999934449\"},{\"descripcionEntidad\":\"CAJA MUNICIPAL DE AHORRO Y CREDITO HUANCAYO\",\"claveSituacion\":\"ACT\",\"idCalificacion\":\"4\",\"diasAtraso\":0,\"maximoAtraso\":0,\"deudaMaximoAtraso\":10167.41,\"inicioPeriodo\":201802,\"finPeriodo\":202001,\"atrasos24\":\"999999999999999999900009\"}]},{\"claveProducto\":\"1300MF\",\"informacionEntidad24\":[{\"descripcionEntidad\":\"PRESTAMOS CRECEFACIL\",\"claveSituacion\":\"ACT\",\"idCalificacion\":\"1\",\"diasAtraso\":2,\"maximoAtraso\":2,\"deudaMaximoAtraso\":2959.02,\"inicioPeriodo\":201802,\"finPeriodo\":202001,\"morosidad\":\"999999999999999999999991\"},{\"descripcionEntidad\":\"COOPAC CAJA SOLIDARIA\",\"claveSituacion\":\"ACT\",\"idCalificacion\":\"4\",\"diasAtraso\":141,\"maximoAtraso\":141,\"deudaMaximoAtraso\":865.89,\"inicioPeriodo\":201802,\"finPeriodo\":202001,\"morosidad\":\"999999999999999999999499\"}]}]", value = "Muestra cómo se han desarrollado los pagos de los créditos a nivel producto y entidad.")
  public List<ComportamientoPago> getComportamientoPago() {
    return comportamientoPago;
  }
  public void setComportamientoPago(List<ComportamientoPago> comportamientoPago) {
    this.comportamientoPago = comportamientoPago;
  }
  public ComportamientoRCCMFNZ comportamientoUsoTarjeta(List<ComportamientoUsoTarjeta> comportamientoUsoTarjeta) {
    this.comportamientoUsoTarjeta = comportamientoUsoTarjeta;
    return this;
  }
  public ComportamientoRCCMFNZ addComportamientoUsoTarjetaItem(ComportamientoUsoTarjeta comportamientoUsoTarjetaItem) {
    if (this.comportamientoUsoTarjeta == null) {
      this.comportamientoUsoTarjeta = new ArrayList<ComportamientoUsoTarjeta>();
    }
    this.comportamientoUsoTarjeta.add(comportamientoUsoTarjetaItem);
    return this;
  }
   
  @ApiModelProperty(example = "[{\"claveProducto\":\"0501TC\",\"descripcionEntidad\":\"BANCO BBVA PERÚ\",\"claveSituacion\":\"ACT\",\"ultimaLineaCredito\":60000,\"utilizacion24\":\"000000000000000000000000\",\"inicioPeriodoUtil\":\"201801\",\"finPeriodoUtil\":\"201912\",\"maximaDeuda\":0,\"porcentajeMaximaDeuda\":0,\"disposicion24\":\"000000000000000000000000\",\"inicioPeriodoDisposicion\":\"201801\",\"finPeriodoDisposicion\":\"201912\",\"maximaDeudaEfectivo\":0,\"porcentajeMaximaDeudaEfectivo\":0,\"maximoLineaCredito\":60000,\"maximoFechaLineaCredito\":\"201912\"},{\"idProducto\":\"0501TC\",\"descripcionEntidad\":\"BANCO DE CREDITO DEL PERÚ\",\"claveSituacion\":\"ACT\",\"ultimaLineaCredito\":3254,\"utilizacion24\":\"444444442321232232432224\",\"inicioPeriodoUtil\":\"201801\",\"finPeriodoUtil\":\"201912\",\"maximaDeuda\":9056,\"porcentajeMaximaDeuda\":96,\"disposicion24\":\"000000000000000000000000\",\"inicioPeriodoDisposicion\":\"201801\",\"finPeriodoDisposicion\":\"201912\",\"maximaDeudaEfectivo\":0,\"porcentajeMaximaDeudaEfectivo\":0,\"maximoLineaCredito\":9987,\"maximoFechaLineaCredito\":\"201909\"}]", value = "Muestra las tarjetas de crédito de RCC de sus diferentes tipos de crédito, no solamente Consumo.")
  public List<ComportamientoUsoTarjeta> getComportamientoUsoTarjeta() {
    return comportamientoUsoTarjeta;
  }
  public void setComportamientoUsoTarjeta(List<ComportamientoUsoTarjeta> comportamientoUsoTarjeta) {
    this.comportamientoUsoTarjeta = comportamientoUsoTarjeta;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComportamientoRCCMFNZ comportamientoRCCMFNZ = (ComportamientoRCCMFNZ) o;
    return Objects.equals(this.castigos, comportamientoRCCMFNZ.castigos) &&
        Objects.equals(this.endeudamientoProductoEntidad, comportamientoRCCMFNZ.endeudamientoProductoEntidad) &&
        Objects.equals(this.comportamientoPago, comportamientoRCCMFNZ.comportamientoPago) &&
        Objects.equals(this.comportamientoUsoTarjeta, comportamientoRCCMFNZ.comportamientoUsoTarjeta);
  }
  @Override
  public int hashCode() {
    return Objects.hash(castigos, endeudamientoProductoEntidad, comportamientoPago, comportamientoUsoTarjeta);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComportamientoRCCMFNZ {\n");
    
    sb.append("    castigos: ").append(toIndentedString(castigos)).append("\n");
    sb.append("    endeudamientoProductoEntidad: ").append(toIndentedString(endeudamientoProductoEntidad)).append("\n");
    sb.append("    comportamientoPago: ").append(toIndentedString(comportamientoPago)).append("\n");
    sb.append("    comportamientoUsoTarjeta: ").append(toIndentedString(comportamientoUsoTarjeta)).append("\n");
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
