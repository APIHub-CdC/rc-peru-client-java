package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

public class ConsultaMes {
  @SerializedName("periodo")
  private String periodo = null;
  @SerializedName("consultas")
  private BigDecimal consultas = null;
  public ConsultaMes periodo(String periodo) {
    this.periodo = periodo;
    return this;
  }
   
  @ApiModelProperty(value = "Periodo de la consulta. Formato: yyyymm")
  public String getPeriodo() {
    return periodo;
  }
  public void setPeriodo(String periodo) {
    this.periodo = periodo;
  }
  public ConsultaMes consultas(BigDecimal consultas) {
    this.consultas = consultas;
    return this;
  }
   
  @ApiModelProperty(value = "Número de consultas realizadas en el periodo")
  public BigDecimal getConsultas() {
    return consultas;
  }
  public void setConsultas(BigDecimal consultas) {
    this.consultas = consultas;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaMes consultaMes = (ConsultaMes) o;
    return Objects.equals(this.periodo, consultaMes.periodo) &&
        Objects.equals(this.consultas, consultaMes.consultas);
  }
  @Override
  public int hashCode() {
    return Objects.hash(periodo, consultas);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaMes {\n");
    
    sb.append("    periodo: ").append(toIndentedString(periodo)).append("\n");
    sb.append("    consultas: ").append(toIndentedString(consultas)).append("\n");
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
