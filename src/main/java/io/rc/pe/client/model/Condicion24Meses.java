package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;


public class Condicion24Meses {
  @SerializedName("fechaPeriodo")
  private String fechaPeriodo = null;
  @SerializedName("deudaMorosa")
  private Float deudaMorosa = null;
  @SerializedName("deudaAlDia")
  private Float deudaAlDia = null;
  @SerializedName("peorCalificacion")
  private BigDecimal peorCalificacion = null;
  public Condicion24Meses fechaPeriodo(String fechaPeriodo) {
    this.fechaPeriodo = fechaPeriodo;
    return this;
  }
   
  @ApiModelProperty(value = "Fecha periodo de reporte de la SBS. Formato yyyymm")
  public String getFechaPeriodo() {
    return fechaPeriodo;
  }
  public void setFechaPeriodo(String fechaPeriodo) {
    this.fechaPeriodo = fechaPeriodo;
  }
  public Condicion24Meses deudaMorosa(Float deudaMorosa) {
    this.deudaMorosa = deudaMorosa;
    return this;
  }
   
  @ApiModelProperty(value = "Sumatoria de la deuda vencida, judicial y deuda castigada.")
  public Float getDeudaMorosa() {
    return deudaMorosa;
  }
  public void setDeudaMorosa(Float deudaMorosa) {
    this.deudaMorosa = deudaMorosa;
  }
  public Condicion24Meses deudaAlDia(Float deudaAlDia) {
    this.deudaAlDia = deudaAlDia;
    return this;
  }
   
  @ApiModelProperty(value = "Sumatoria de la deuda vigente, reestructurada y refinanciada.")
  public Float getDeudaAlDia() {
    return deudaAlDia;
  }
  public void setDeudaAlDia(Float deudaAlDia) {
    this.deudaAlDia = deudaAlDia;
  }
  public Condicion24Meses peorCalificacion(BigDecimal peorCalificacion) {
    this.peorCalificacion = peorCalificacion;
    return this;
  }
   
  @ApiModelProperty(value = "Id de Peor calificación reportada en el periodo.<table><thead><tr><th>Id Calificación</th><th>Calificación</th></tr></thead><tbody><tr><td>0</td><td>Normal</td></tr><tr><td>1</td><td>Problemas Potenciales</td></tr><tr><td>2</td><td>Deficiente</td></tr><tr><td>3</td><td>Dudoso</td></tr><tr><td>4</td><td>Pérdida</td></tr><tr><td>5</td><td>Cerrada</td></tr><tr><td>6</td><td>Abierto</td></tr><tr><td>7</td><td>Sin Calificación</td></tr><tr><td>9</td><td>Histórico</td></tr></tbody></table>")
  public BigDecimal getPeorCalificacion() {
    return peorCalificacion;
  }
  public void setPeorCalificacion(BigDecimal peorCalificacion) {
    this.peorCalificacion = peorCalificacion;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Condicion24Meses condicion24Meses = (Condicion24Meses) o;
    return Objects.equals(this.fechaPeriodo, condicion24Meses.fechaPeriodo) &&
        Objects.equals(this.deudaMorosa, condicion24Meses.deudaMorosa) &&
        Objects.equals(this.deudaAlDia, condicion24Meses.deudaAlDia) &&
        Objects.equals(this.peorCalificacion, condicion24Meses.peorCalificacion);
  }
  @Override
  public int hashCode() {
    return Objects.hash(fechaPeriodo, deudaMorosa, deudaAlDia, peorCalificacion);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Condicion24Meses {\n");
    
    sb.append("    fechaPeriodo: ").append(toIndentedString(fechaPeriodo)).append("\n");
    sb.append("    deudaMorosa: ").append(toIndentedString(deudaMorosa)).append("\n");
    sb.append("    deudaAlDia: ").append(toIndentedString(deudaAlDia)).append("\n");
    sb.append("    peorCalificacion: ").append(toIndentedString(peorCalificacion)).append("\n");
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
