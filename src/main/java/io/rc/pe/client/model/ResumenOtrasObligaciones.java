package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import io.rc.pe.client.model.ResumenOtrasObligacionesInfoFuenteInformacion;

public class ResumenOtrasObligaciones {
  @SerializedName("claveFuente")
  private String claveFuente = null;
  @SerializedName("infoFuenteInformacion")
  private ResumenOtrasObligacionesInfoFuenteInformacion infoFuenteInformacion = null;
  public ResumenOtrasObligaciones claveFuente(String claveFuente) {
    this.claveFuente = claveFuente;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la clave correspondiente a la fuente de donde proviene la obligación. <table><thead><tr><th>claveFuente</th><th>Descripción Fuente</th></tr></thead><tbody><tr><td>AFP </td><td>Deuda AFP</td></tr><tr><td>Deudor </td><td>Deuda SUNAT</td></tr><tr><td>MOROSIDAD </td><td>Morosidad Comercial</td></tr><tr><td>PROTESTO </td><td>Protestos del aceptante</td></tr><tr><td>GIRADOR</td><td>Protestos por girador</td></tr></tbody></table>")
  public String getClaveFuente() {
    return claveFuente;
  }
  public void setClaveFuente(String claveFuente) {
    this.claveFuente = claveFuente;
  }
  public ResumenOtrasObligaciones infoFuenteInformacion(ResumenOtrasObligacionesInfoFuenteInformacion infoFuenteInformacion) {
    this.infoFuenteInformacion = infoFuenteInformacion;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResumenOtrasObligacionesInfoFuenteInformacion getInfoFuenteInformacion() {
    return infoFuenteInformacion;
  }
  public void setInfoFuenteInformacion(ResumenOtrasObligacionesInfoFuenteInformacion infoFuenteInformacion) {
    this.infoFuenteInformacion = infoFuenteInformacion;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResumenOtrasObligaciones resumenOtrasObligaciones = (ResumenOtrasObligaciones) o;
    return Objects.equals(this.claveFuente, resumenOtrasObligaciones.claveFuente) &&
        Objects.equals(this.infoFuenteInformacion, resumenOtrasObligaciones.infoFuenteInformacion);
  }
  @Override
  public int hashCode() {
    return Objects.hash(claveFuente, infoFuenteInformacion);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResumenOtrasObligaciones {\n");
    
    sb.append("    claveFuente: ").append(toIndentedString(claveFuente)).append("\n");
    sb.append("    infoFuenteInformacion: ").append(toIndentedString(infoFuenteInformacion)).append("\n");
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
