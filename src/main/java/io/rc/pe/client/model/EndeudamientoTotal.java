package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;


public class EndeudamientoTotal {
  @SerializedName("claveConcepto")
  private String claveConcepto = null;
  @SerializedName("monto")
  private Float monto = null;
  @SerializedName("porcentaje")
  private Float porcentaje = null;
  public EndeudamientoTotal claveConcepto(String claveConcepto) {
    this.claveConcepto = claveConcepto;
    return this;
  }
   
  @ApiModelProperty(value = "Identificador del calculo que representa.<table><thead><tr><th>Clave Concepto</th><th>Concepto</th></tr></thead><tbody><tr><td>DDIA</td><td>Deuda al día</td></tr><tr><td>DMOR</td><td>Deuda morosa</td></tr><tr><td>DTOT</td><td>Endeudamiento total</td></tr></tbody></table>")
  public String getClaveConcepto() {
    return claveConcepto;
  }
  public void setClaveConcepto(String claveConcepto) {
    this.claveConcepto = claveConcepto;
  }
  public EndeudamientoTotal monto(Float monto) {
    this.monto = monto;
    return this;
  }
   
  @ApiModelProperty(value = "Monto de deuda")
  public Float getMonto() {
    return monto;
  }
  public void setMonto(Float monto) {
    this.monto = monto;
  }
  public EndeudamientoTotal porcentaje(Float porcentaje) {
    this.porcentaje = porcentaje;
    return this;
  }
   
  @ApiModelProperty(value = "Porcentaje de la deuda sobre el total multiplicado por 100.")
  public Float getPorcentaje() {
    return porcentaje;
  }
  public void setPorcentaje(Float porcentaje) {
    this.porcentaje = porcentaje;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndeudamientoTotal endeudamientoTotal = (EndeudamientoTotal) o;
    return Objects.equals(this.claveConcepto, endeudamientoTotal.claveConcepto) &&
        Objects.equals(this.monto, endeudamientoTotal.monto) &&
        Objects.equals(this.porcentaje, endeudamientoTotal.porcentaje);
  }
  @Override
  public int hashCode() {
    return Objects.hash(claveConcepto, monto, porcentaje);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndeudamientoTotal {\n");
    
    sb.append("    claveConcepto: ").append(toIndentedString(claveConcepto)).append("\n");
    sb.append("    monto: ").append(toIndentedString(monto)).append("\n");
    sb.append("    porcentaje: ").append(toIndentedString(porcentaje)).append("\n");
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
