package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

public class Exportaciones {
  @SerializedName("periodo")
  private String periodo = null;
  @SerializedName("monto")
  private Float monto = null;
  public Exportaciones periodo(String periodo) {
    this.periodo = periodo;
    return this;
  }
   
  @ApiModelProperty(value = "Fecha de los últimos 12 meses. Formato: yyyymm")
  public String getPeriodo() {
    return periodo;
  }
  public void setPeriodo(String periodo) {
    this.periodo = periodo;
  }
  public Exportaciones monto(Float monto) {
    this.monto = monto;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el monto en soles de lo exportado.")
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
    Exportaciones exportaciones = (Exportaciones) o;
    return Objects.equals(this.periodo, exportaciones.periodo) &&
        Objects.equals(this.monto, exportaciones.monto);
  }
  @Override
  public int hashCode() {
    return Objects.hash(periodo, monto);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Exportaciones {\n");
    
    sb.append("    periodo: ").append(toIndentedString(periodo)).append("\n");
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
