package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.rc.pe.client.model.DetalleCalificacion;
import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "Esta sección refleja cómo está conformado el saldo de la deuda directa en el último mes reportado por la SBS, lo que permite validar el comportamiento indicando que tan riesgoso o no es el cliente.")
public class ResumenCreditoCalificacion {
  @SerializedName("periodo")
  private String periodo = null;
  @SerializedName("detalle")
  private List<DetalleCalificacion> detalle = null;
  public ResumenCreditoCalificacion periodo(String periodo) {
    this.periodo = periodo;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la fecha del último reporte de la SBS. Formato yyyymm")
  public String getPeriodo() {
    return periodo;
  }
  public void setPeriodo(String periodo) {
    this.periodo = periodo;
  }
  public ResumenCreditoCalificacion detalle(List<DetalleCalificacion> detalle) {
    this.detalle = detalle;
    return this;
  }
  public ResumenCreditoCalificacion addDetalleItem(DetalleCalificacion detalleItem) {
    if (this.detalle == null) {
      this.detalle = new ArrayList<DetalleCalificacion>();
    }
    this.detalle.add(detalleItem);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<DetalleCalificacion> getDetalle() {
    return detalle;
  }
  public void setDetalle(List<DetalleCalificacion> detalle) {
    this.detalle = detalle;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumenCreditoCalificacion resumenCreditoCalificacion = (ResumenCreditoCalificacion) o;
    return Objects.equals(this.periodo, resumenCreditoCalificacion.periodo) &&
        Objects.equals(this.detalle, resumenCreditoCalificacion.detalle);
  }
  @Override
  public int hashCode() {
    return Objects.hash(periodo, detalle);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumenCreditoCalificacion {\n");
    
    sb.append("    periodo: ").append(toIndentedString(periodo)).append("\n");
    sb.append("    detalle: ").append(toIndentedString(detalle)).append("\n");
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
