package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

public class DetalleAvalistas {
  @SerializedName("periodo")
  private String periodo = null;
  @SerializedName("idCalificacion")
  private String idCalificacion = null;
  @SerializedName("idTipoDocumento")
  private String idTipoDocumento = null;
  @SerializedName("documento")
  private String documento = null;
  @SerializedName("nombre")
  private String nombre = null;
  @SerializedName("entidad")
  private String entidad = null;
  @SerializedName("saldo")
  private Float saldo = null;
  public DetalleAvalistas periodo(String periodo) {
    this.periodo = periodo;
    return this;
  }
   
  @ApiModelProperty(value = " Periodo reportado por la SBS. Formato yyyymm")
  public String getPeriodo() {
    return periodo;
  }
  public void setPeriodo(String periodo) {
    this.periodo = periodo;
  }
  public DetalleAvalistas idCalificacion(String idCalificacion) {
    this.idCalificacion = idCalificacion;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la peor calificación del avalista reportada en el último periodo reportado por la SBS. Si la fecha de reporte SBS no corresponde a al último periodo reportado por la SBS, la peor calificación indicará 9 (Histórico). <table><thead><tr><th>Id Calificación</th><th>Calificación</th></tr></thead><tbody><tr><td>0</td><td>Normal</td></tr><tr><td>1</td><td>Problemas Potenciales</td></tr><tr><td>2</td><td>Deficiente</td></tr><tr><td>3</td><td>Dudoso</td></tr><tr><td>4</td><td>Pérdida</td></tr><tr><td>5</td><td>Cerrada</td></tr><tr><td>6</td><td>Abierto</td></tr><tr><td>7</td><td>Sin Calificación</td></tr><tr><td>9</td><td>Histórico</td></tr></tbody></table>")
  public String getIdCalificacion() {
    return idCalificacion;
  }
  public void setIdCalificacion(String idCalificacion) {
    this.idCalificacion = idCalificacion;
  }
  public DetalleAvalistas idTipoDocumento(String idTipoDocumento) {
    this.idTipoDocumento = idTipoDocumento;
    return this;
  }
   
  @ApiModelProperty(value = "Tipo de documento de la persona que lo avala. <table><thead><tr><th>Tipo Documento</th><th>Descripción</th></tr></thead><tbody><tr><td>1</td><td>DNI</td></tr><tr><td>2</td><td>Carnet De Extranjeria</td></tr><tr><td>3</td><td>Carnet De Identidad De Las FF PP</td></tr><tr><td>4</td><td>Carnet De Identidad De Las FF AA</td></tr><tr><td>5</td><td>Pasaporte</td></tr><tr><td>6</td><td>Libreta tributaria</td></tr><tr><td>7</td><td>Carnet De Identidad</td></tr><tr><td>8</td><td>NIT</td></tr><tr><td>10</td><td>RUC</td></tr><tr><td>11</td><td>Sin Documento</td></tr><tr><td>12</td><td>Otro Documento</td></tr><tr><td>13</td><td>Carnet De Identidad Emitido Por El Ministerio De Relaciones Exteriores</td></tr><tr><td>14</td><td>Carnet De Permiso Temporal De Permanencia</td></tr></tbody></table>")
  public String getIdTipoDocumento() {
    return idTipoDocumento;
  }
  public void setIdTipoDocumento(String idTipoDocumento) {
    this.idTipoDocumento = idTipoDocumento;
  }
  public DetalleAvalistas documento(String documento) {
    this.documento = documento;
    return this;
  }
   
  @ApiModelProperty(value = "Número de documento de la persona que lo avala.")
  public String getDocumento() {
    return documento;
  }
  public void setDocumento(String documento) {
    this.documento = documento;
  }
  public DetalleAvalistas nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }
   
  @ApiModelProperty(value = "Nombre de la persona que lo avala.")
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public DetalleAvalistas entidad(String entidad) {
    this.entidad = entidad;
    return this;
  }
   
  @ApiModelProperty(value = "Entidad en la cual esta siendo avalado.")
  public String getEntidad() {
    return entidad;
  }
  public void setEntidad(String entidad) {
    this.entidad = entidad;
  }
  public DetalleAvalistas saldo(Float saldo) {
    this.saldo = saldo;
    return this;
  }
   
  @ApiModelProperty(value = "Entidad en la cual esta siendo avalado.")
  public Float getSaldo() {
    return saldo;
  }
  public void setSaldo(Float saldo) {
    this.saldo = saldo;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetalleAvalistas detalleAvalistas = (DetalleAvalistas) o;
    return Objects.equals(this.periodo, detalleAvalistas.periodo) &&
        Objects.equals(this.idCalificacion, detalleAvalistas.idCalificacion) &&
        Objects.equals(this.idTipoDocumento, detalleAvalistas.idTipoDocumento) &&
        Objects.equals(this.documento, detalleAvalistas.documento) &&
        Objects.equals(this.nombre, detalleAvalistas.nombre) &&
        Objects.equals(this.entidad, detalleAvalistas.entidad) &&
        Objects.equals(this.saldo, detalleAvalistas.saldo);
  }
  @Override
  public int hashCode() {
    return Objects.hash(periodo, idCalificacion, idTipoDocumento, documento, nombre, entidad, saldo);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalleAvalistas {\n");
    
    sb.append("    periodo: ").append(toIndentedString(periodo)).append("\n");
    sb.append("    idCalificacion: ").append(toIndentedString(idCalificacion)).append("\n");
    sb.append("    idTipoDocumento: ").append(toIndentedString(idTipoDocumento)).append("\n");
    sb.append("    documento: ").append(toIndentedString(documento)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    entidad: ").append(toIndentedString(entidad)).append("\n");
    sb.append("    saldo: ").append(toIndentedString(saldo)).append("\n");
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
