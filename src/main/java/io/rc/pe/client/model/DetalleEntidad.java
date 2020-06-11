package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;


public class DetalleEntidad {
  @SerializedName("claveSituacion")
  private String claveSituacion = null;
  @SerializedName("monto")
  private Float monto = null;
  @SerializedName("fechaVencimiento")
  private String fechaVencimiento = null;
  @SerializedName("fechaReporte")
  private String fechaReporte = null;
  public DetalleEntidad claveSituacion(String claveSituacion) {
    this.claveSituacion = claveSituacion;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la situación actual de la deuda. <li> Actual - Cuando la persona fue reportada por algún aportante de una fuente en su última carga. <li> Histórico - es cuando no fue reportada en la última carga de un aportante, pero sí en alguna carga de los últimos 60 meses (siempre y cuando sea visible el registro).<table><thead><tr><th>CLAVE</th><th>SITUACIÓN</th></tr></thead><tbody><tr><td>ACT</td><td>Actual</td></tr><tr><td>HIS</td><td>Histórico</td></tr></tbody></table>")
  public String getClaveSituacion() {
    return claveSituacion;
  }
  public void setClaveSituacion(String claveSituacion) {
    this.claveSituacion = claveSituacion;
  }
  public DetalleEntidad monto(Float monto) {
    this.monto = monto;
    return this;
  }
   
  @ApiModelProperty(value = "Monto de la morosidad.")
  public Float getMonto() {
    return monto;
  }
  public void setMonto(Float monto) {
    this.monto = monto;
  }
  public DetalleEntidad fechaVencimiento(String fechaVencimiento) {
    this.fechaVencimiento = fechaVencimiento;
    return this;
  }
   
  @ApiModelProperty(value = "Es la fecha en la que expira. Formato: yyyymmdd")
  public String getFechaVencimiento() {
    return fechaVencimiento;
  }
  public void setFechaVencimiento(String fechaVencimiento) {
    this.fechaVencimiento = fechaVencimiento;
  }
  public DetalleEntidad fechaReporte(String fechaReporte) {
    this.fechaReporte = fechaReporte;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la última actualización de la información. Formato: yyyymmdd")
  public String getFechaReporte() {
    return fechaReporte;
  }
  public void setFechaReporte(String fechaReporte) {
    this.fechaReporte = fechaReporte;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetalleEntidad detalleEntidad = (DetalleEntidad) o;
    return Objects.equals(this.claveSituacion, detalleEntidad.claveSituacion) &&
        Objects.equals(this.monto, detalleEntidad.monto) &&
        Objects.equals(this.fechaVencimiento, detalleEntidad.fechaVencimiento) &&
        Objects.equals(this.fechaReporte, detalleEntidad.fechaReporte);
  }
  @Override
  public int hashCode() {
    return Objects.hash(claveSituacion, monto, fechaVencimiento, fechaReporte);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalleEntidad {\n");
    
    sb.append("    claveSituacion: ").append(toIndentedString(claveSituacion)).append("\n");
    sb.append("    monto: ").append(toIndentedString(monto)).append("\n");
    sb.append("    fechaVencimiento: ").append(toIndentedString(fechaVencimiento)).append("\n");
    sb.append("    fechaReporte: ").append(toIndentedString(fechaReporte)).append("\n");
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
