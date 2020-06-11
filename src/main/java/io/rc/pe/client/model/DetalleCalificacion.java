package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

public class DetalleCalificacion {
  @SerializedName("idCalificacion")
  private String idCalificacion = null;
  @SerializedName("porcentaje")
  private Float porcentaje = null;
  @SerializedName("monto")
  private Float monto = null;
  public DetalleCalificacion idCalificacion(String idCalificacion) {
    this.idCalificacion = idCalificacion;
    return this;
  }
   
  @ApiModelProperty(value = "Clave de la calificación de la SBS.<table><thead><tr><th>Id Calificación</th><th>Calificación</th></tr></thead><tbody><tr><td>0</td><td>Normal</td></tr><tr><td>1</td><td>Problemas Potenciales</td></tr><tr><td>2</td><td>Deficiente</td></tr><tr><td>3</td><td>Dudoso</td></tr><tr><td>4</td><td>Pérdida</td></tr></tbody></table>")
  public String getIdCalificacion() {
    return idCalificacion;
  }
  public void setIdCalificacion(String idCalificacion) {
    this.idCalificacion = idCalificacion;
  }
  public DetalleCalificacion porcentaje(Float porcentaje) {
    this.porcentaje = porcentaje;
    return this;
  }
   
  @ApiModelProperty(value = "Porcentaje de la calificación con respecto al total de las calificaciones multiplicado por 100.")
  public Float getPorcentaje() {
    return porcentaje;
  }
  public void setPorcentaje(Float porcentaje) {
    this.porcentaje = porcentaje;
  }
  public DetalleCalificacion monto(Float monto) {
    this.monto = monto;
    return this;
  }
   
  @ApiModelProperty(value = "Monto de la deuda correspondiente a la calificación.")
  public Float getMonto() {
    return monto;
  }
  public void setMonto(Float monto) {
    this.monto = monto;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetalleCalificacion detalleCalificacion = (DetalleCalificacion) o;
    return Objects.equals(this.idCalificacion, detalleCalificacion.idCalificacion) &&
        Objects.equals(this.porcentaje, detalleCalificacion.porcentaje) &&
        Objects.equals(this.monto, detalleCalificacion.monto);
  }
  @Override
  public int hashCode() {
    return Objects.hash(idCalificacion, porcentaje, monto);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalleCalificacion {\n");
    
    sb.append("    idCalificacion: ").append(toIndentedString(idCalificacion)).append("\n");
    sb.append("    porcentaje: ").append(toIndentedString(porcentaje)).append("\n");
    sb.append("    monto: ").append(toIndentedString(monto)).append("\n");
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
