package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import io.rc.pe.client.model.ComercioExterior;
import io.rc.pe.client.model.ComportamientoRCCMFNZ;
import io.rc.pe.client.model.Consultas;
import io.rc.pe.client.model.DatosConsulta;
import io.rc.pe.client.model.DatosGenerales;
import io.rc.pe.client.model.DetalleCreditos;
import io.rc.pe.client.model.OtrasObligaciones;
import io.rc.pe.client.model.ResumenCredito;

public class Respuesta {
  @SerializedName("datosConsulta")
  private DatosConsulta datosConsulta = null;
  @SerializedName("resumenCredito")
  private ResumenCredito resumenCredito = null;
  @SerializedName("comportamientoRCC_MFNZ")
  private ComportamientoRCCMFNZ comportamientoRCCMFNZ = null;
  @SerializedName("detallesCreditos")
  private DetalleCreditos detallesCreditos = null;
  @SerializedName("otrasObligaciones")
  private OtrasObligaciones otrasObligaciones = null;
  @SerializedName("comercioExterior")
  private ComercioExterior comercioExterior = null;
  @SerializedName("consultas")
  private Consultas consultas = null;
  @SerializedName("datosGenerales")
  private DatosGenerales datosGenerales = null;
  public Respuesta datosConsulta(DatosConsulta datosConsulta) {
    this.datosConsulta = datosConsulta;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public DatosConsulta getDatosConsulta() {
    return datosConsulta;
  }
  public void setDatosConsulta(DatosConsulta datosConsulta) {
    this.datosConsulta = datosConsulta;
  }
  public Respuesta resumenCredito(ResumenCredito resumenCredito) {
    this.resumenCredito = resumenCredito;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ResumenCredito getResumenCredito() {
    return resumenCredito;
  }
  public void setResumenCredito(ResumenCredito resumenCredito) {
    this.resumenCredito = resumenCredito;
  }
  public Respuesta comportamientoRCCMFNZ(ComportamientoRCCMFNZ comportamientoRCCMFNZ) {
    this.comportamientoRCCMFNZ = comportamientoRCCMFNZ;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ComportamientoRCCMFNZ getComportamientoRCCMFNZ() {
    return comportamientoRCCMFNZ;
  }
  public void setComportamientoRCCMFNZ(ComportamientoRCCMFNZ comportamientoRCCMFNZ) {
    this.comportamientoRCCMFNZ = comportamientoRCCMFNZ;
  }
  public Respuesta detallesCreditos(DetalleCreditos detallesCreditos) {
    this.detallesCreditos = detallesCreditos;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public DetalleCreditos getDetallesCreditos() {
    return detallesCreditos;
  }
  public void setDetallesCreditos(DetalleCreditos detallesCreditos) {
    this.detallesCreditos = detallesCreditos;
  }
  public Respuesta otrasObligaciones(OtrasObligaciones otrasObligaciones) {
    this.otrasObligaciones = otrasObligaciones;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public OtrasObligaciones getOtrasObligaciones() {
    return otrasObligaciones;
  }
  public void setOtrasObligaciones(OtrasObligaciones otrasObligaciones) {
    this.otrasObligaciones = otrasObligaciones;
  }
  public Respuesta comercioExterior(ComercioExterior comercioExterior) {
    this.comercioExterior = comercioExterior;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public ComercioExterior getComercioExterior() {
    return comercioExterior;
  }
  public void setComercioExterior(ComercioExterior comercioExterior) {
    this.comercioExterior = comercioExterior;
  }
  public Respuesta consultas(Consultas consultas) {
    this.consultas = consultas;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public Consultas getConsultas() {
    return consultas;
  }
  public void setConsultas(Consultas consultas) {
    this.consultas = consultas;
  }
  public Respuesta datosGenerales(DatosGenerales datosGenerales) {
    this.datosGenerales = datosGenerales;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public DatosGenerales getDatosGenerales() {
    return datosGenerales;
  }
  public void setDatosGenerales(DatosGenerales datosGenerales) {
    this.datosGenerales = datosGenerales;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Respuesta respuesta = (Respuesta) o;
    return Objects.equals(this.datosConsulta, respuesta.datosConsulta) &&
        Objects.equals(this.resumenCredito, respuesta.resumenCredito) &&
        Objects.equals(this.comportamientoRCCMFNZ, respuesta.comportamientoRCCMFNZ) &&
        Objects.equals(this.detallesCreditos, respuesta.detallesCreditos) &&
        Objects.equals(this.otrasObligaciones, respuesta.otrasObligaciones) &&
        Objects.equals(this.comercioExterior, respuesta.comercioExterior) &&
        Objects.equals(this.consultas, respuesta.consultas) &&
        Objects.equals(this.datosGenerales, respuesta.datosGenerales);
  }
  @Override
  public int hashCode() {
    return Objects.hash(datosConsulta, resumenCredito, comportamientoRCCMFNZ, detallesCreditos, otrasObligaciones, comercioExterior, consultas, datosGenerales);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Respuesta {\n");
    
    sb.append("    datosConsulta: ").append(toIndentedString(datosConsulta)).append("\n");
    sb.append("    resumenCredito: ").append(toIndentedString(resumenCredito)).append("\n");
    sb.append("    comportamientoRCCMFNZ: ").append(toIndentedString(comportamientoRCCMFNZ)).append("\n");
    sb.append("    detallesCreditos: ").append(toIndentedString(detallesCreditos)).append("\n");
    sb.append("    otrasObligaciones: ").append(toIndentedString(otrasObligaciones)).append("\n");
    sb.append("    comercioExterior: ").append(toIndentedString(comercioExterior)).append("\n");
    sb.append("    consultas: ").append(toIndentedString(consultas)).append("\n");
    sb.append("    datosGenerales: ").append(toIndentedString(datosGenerales)).append("\n");
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
