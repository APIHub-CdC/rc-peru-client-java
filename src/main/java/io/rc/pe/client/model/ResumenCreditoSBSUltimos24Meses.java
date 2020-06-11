package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.rc.pe.client.model.Calificacion24Meses;
import io.rc.pe.client.model.Condicion24Meses;
import io.rc.pe.client.model.Situacion24Meses;
import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "Esta sección muestra el comportamiento de los últimos 24 meses con respecto a la deuda SBS compuesta por la información de la fuente de RCC.")
public class ResumenCreditoSBSUltimos24Meses {
  @SerializedName("condicion24Meses")
  private List<Condicion24Meses> condicion24Meses = null;
  @SerializedName("calificacion24Meses")
  private List<Calificacion24Meses> calificacion24Meses = null;
  @SerializedName("situacion24Meses")
  private List<Situacion24Meses> situacion24Meses = null;
  public ResumenCreditoSBSUltimos24Meses condicion24Meses(List<Condicion24Meses> condicion24Meses) {
    this.condicion24Meses = condicion24Meses;
    return this;
  }
  public ResumenCreditoSBSUltimos24Meses addCondicion24MesesItem(Condicion24Meses condicion24MesesItem) {
    if (this.condicion24Meses == null) {
      this.condicion24Meses = new ArrayList<Condicion24Meses>();
    }
    this.condicion24Meses.add(condicion24MesesItem);
    return this;
  }
   
  @ApiModelProperty(example = "[{\"fechaPeriodo\":\"201801\",\"deudaMorosa\":0,\"deudaAlDia\":408.66,\"peorCalificacion\":0},{\"fechaPeriodo\":\"201802\",\"deudaMorosa\":0,\"deudaAlDia\":144.71,\"peorCalificacion\":0}]", value = "Se muestran los montos por condiciónl, se incluyen la deuda directa y castigos.")
  public List<Condicion24Meses> getCondicion24Meses() {
    return condicion24Meses;
  }
  public void setCondicion24Meses(List<Condicion24Meses> condicion24Meses) {
    this.condicion24Meses = condicion24Meses;
  }
  public ResumenCreditoSBSUltimos24Meses calificacion24Meses(List<Calificacion24Meses> calificacion24Meses) {
    this.calificacion24Meses = calificacion24Meses;
    return this;
  }
  public ResumenCreditoSBSUltimos24Meses addCalificacion24MesesItem(Calificacion24Meses calificacion24MesesItem) {
    if (this.calificacion24Meses == null) {
      this.calificacion24Meses = new ArrayList<Calificacion24Meses>();
    }
    this.calificacion24Meses.add(calificacion24MesesItem);
    return this;
  }
   
  @ApiModelProperty(example = "[{\"fechaPeriodo\":\"201801\",\"deudaNormal\":408.66,\"deudaCPP\":0,\"deudaDeficiente\":0,\"deudaDudoso\":0,\"deudaPerdida\":0,\"numeroEntidades\":1},{\"fechaPeriodo\":\"201802\",\"deudaNormal\":144.71,\"deudaCPP\":0,\"deudaDeficiente\":0,\"deudaDudoso\":0,\"deudaPerdida\":0,\"numeroEntidades\":1}]", value = "Se muestran los montos por calificación, se incluyen la deuda directa, indirecta y castigos.")
  public List<Calificacion24Meses> getCalificacion24Meses() {
    return calificacion24Meses;
  }
  public void setCalificacion24Meses(List<Calificacion24Meses> calificacion24Meses) {
    this.calificacion24Meses = calificacion24Meses;
  }
  public ResumenCreditoSBSUltimos24Meses situacion24Meses(List<Situacion24Meses> situacion24Meses) {
    this.situacion24Meses = situacion24Meses;
    return this;
  }
  public ResumenCreditoSBSUltimos24Meses addSituacion24MesesItem(Situacion24Meses situacion24MesesItem) {
    if (this.situacion24Meses == null) {
      this.situacion24Meses = new ArrayList<Situacion24Meses>();
    }
    this.situacion24Meses.add(situacion24MesesItem);
    return this;
  }
   
  @ApiModelProperty(example = "[{\"fechaPeriodo\":\"201801\",\"deudaVencida\":0,\"deudaVigente\":408.66,\"deudaRR\":0,\"deudaJudicial\":0,\"deudaCastigo\":0},{\"fechaPeriodo\":\"201802\",\"deudaVencida\":0,\"deudaVigente\":144.71,\"deudaRR\":0,\"deudaJudicial\":0,\"deudaCastigo\":0}]", value = "Se muestran los montos por situación, se incluyen la deuda directa y castigos.")
  public List<Situacion24Meses> getSituacion24Meses() {
    return situacion24Meses;
  }
  public void setSituacion24Meses(List<Situacion24Meses> situacion24Meses) {
    this.situacion24Meses = situacion24Meses;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumenCreditoSBSUltimos24Meses resumenCreditoSBSUltimos24Meses = (ResumenCreditoSBSUltimos24Meses) o;
    return Objects.equals(this.condicion24Meses, resumenCreditoSBSUltimos24Meses.condicion24Meses) &&
        Objects.equals(this.calificacion24Meses, resumenCreditoSBSUltimos24Meses.calificacion24Meses) &&
        Objects.equals(this.situacion24Meses, resumenCreditoSBSUltimos24Meses.situacion24Meses);
  }
  @Override
  public int hashCode() {
    return Objects.hash(condicion24Meses, calificacion24Meses, situacion24Meses);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumenCreditoSBSUltimos24Meses {\n");
    
    sb.append("    condicion24Meses: ").append(toIndentedString(condicion24Meses)).append("\n");
    sb.append("    calificacion24Meses: ").append(toIndentedString(calificacion24Meses)).append("\n");
    sb.append("    situacion24Meses: ").append(toIndentedString(situacion24Meses)).append("\n");
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
