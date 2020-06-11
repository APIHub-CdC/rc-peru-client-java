package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.rc.pe.client.model.DatasGeneralesSunat;
import io.rc.pe.client.model.DatosPersonales;
import io.rc.pe.client.model.Direcciones;
import io.rc.pe.client.model.Representantes;
import io.rc.pe.client.model.Telefono;
import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "Esta sección muestra información general de la persona jurídica/ natural según sea el caso.")
public class DatosGenerales {
  @SerializedName("datosPersonales")
  private DatosPersonales datosPersonales = null;
  @SerializedName("datosGeneralesSunat")
  private DatasGeneralesSunat datosGeneralesSunat = null;
  @SerializedName("representantes")
  private List<Representantes> representantes = null;
  @SerializedName("direcciones")
  private List<Direcciones> direcciones = null;
  @SerializedName("telefonos")
  private List<Telefono> telefonos = null;
  public DatosGenerales datosPersonales(DatosPersonales datosPersonales) {
    this.datosPersonales = datosPersonales;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public DatosPersonales getDatosPersonales() {
    return datosPersonales;
  }
  public void setDatosPersonales(DatosPersonales datosPersonales) {
    this.datosPersonales = datosPersonales;
  }
  public DatosGenerales datosGeneralesSunat(DatasGeneralesSunat datosGeneralesSunat) {
    this.datosGeneralesSunat = datosGeneralesSunat;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public DatasGeneralesSunat getDatosGeneralesSunat() {
    return datosGeneralesSunat;
  }
  public void setDatosGeneralesSunat(DatasGeneralesSunat datosGeneralesSunat) {
    this.datosGeneralesSunat = datosGeneralesSunat;
  }
  public DatosGenerales representantes(List<Representantes> representantes) {
    this.representantes = representantes;
    return this;
  }
  public DatosGenerales addRepresentantesItem(Representantes representantesItem) {
    if (this.representantes == null) {
      this.representantes = new ArrayList<Representantes>();
    }
    this.representantes.add(representantesItem);
    return this;
  }
   
  @ApiModelProperty(example = "[{\"claveRespuesta\":\"RL\",\"fechaReporte\\\"\":\"201905\",\"documentoIdentidad\":\"07941222\",\"nombre\":\"NISHII ASLLA MIGUEL ANTONIO\",\"cargo\":\"GERENTE GENERAL\",\"fechaInicioCargo\":\"200802\",\"fechaActaRepresentante\":\"200803\"},{\"claveRespuesta\":\"RL\",\"fechareporte\":\"201905\",\"documentoIdentidad\":\"07965533\",\"nombre\":\"NISHII ASLLA ROCIO MILAGROS\",\"cargo\":\"APODERADO\",\"fechaInicioCargo\":\"201003\",\"fechaActaRepresentante\":\"201901\"}]", value = "Muestra la información correspondiente a los representantes legales de la empresa consultada / las empresas relacionadas de la persona consultada.")
  public List<Representantes> getRepresentantes() {
    return representantes;
  }
  public void setRepresentantes(List<Representantes> representantes) {
    this.representantes = representantes;
  }
  public DatosGenerales direcciones(List<Direcciones> direcciones) {
    this.direcciones = direcciones;
    return this;
  }
  public DatosGenerales addDireccionesItem(Direcciones direccionesItem) {
    if (this.direcciones == null) {
      this.direcciones = new ArrayList<Direcciones>();
    }
    this.direcciones.add(direccionesItem);
    return this;
  }
   
  @ApiModelProperty(example = "[{\"fuente\":\"SUNAT\",\"ubigeo\":\"230101\",\"departamento\":\"TACNA\",\"provincia\":\"TACNA\",\"distrito\":\"TACNA\",\"nombreVia\":\"DOS DE MAYO\",\"numeroExterior\":\"834\",\"numeroInterior\":\"\",\"nombreZona\":\"CENTRO COMERCIAL TACNA CE\",\"referencia\":\"\",\"fecha\":\"201607\",\"fechaActualizaciontSunat\":\"\"},{\"fuente\":\"SUNAT\",\"ubigeo\":\"230101\",\"departamento\":\"TACNA\",\"provincia\":\"TACNA\",\"distrito\":\"TACNA\",\"nombreVia\":\"\",\"numeroExterior\":\"\",\"numeroInterior\":\"\",\"nombreZona\":\"CENTRO COM TACNA CENTRO\",\"referencia\":\"\",\"fecha\":\"201403\",\"fechaActualizaciontSunat\":\"201704\"}]", value = "Muestra todas las direcciones registradas para personas naturales y jurídicas según sea el caso.")
  public List<Direcciones> getDirecciones() {
    return direcciones;
  }
  public void setDirecciones(List<Direcciones> direcciones) {
    this.direcciones = direcciones;
  }
  public DatosGenerales telefonos(List<Telefono> telefonos) {
    this.telefonos = telefonos;
    return this;
  }
  public DatosGenerales addTelefonosItem(Telefono telefonosItem) {
    if (this.telefonos == null) {
      this.telefonos = new ArrayList<Telefono>();
    }
    this.telefonos.add(telefonosItem);
    return this;
  }
   
  @ApiModelProperty(example = "[{\"fuente\":\"SUNAT\",\"telefono\":\"3550741\",\"codigo\":\"\",\"fechaActualizacion\":\"201212\"},{\"fuente\":\"SUNAT\",\"telefono\":\"3496367\",\"codigo\":\"\",\"fechaActualizacion\":\"201203\"}]", value = "Muestra los números telefónicos registrados de la persona natural/jurídica según sea el caso.")
  public List<Telefono> getTelefonos() {
    return telefonos;
  }
  public void setTelefonos(List<Telefono> telefonos) {
    this.telefonos = telefonos;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatosGenerales datosGenerales = (DatosGenerales) o;
    return Objects.equals(this.datosPersonales, datosGenerales.datosPersonales) &&
        Objects.equals(this.datosGeneralesSunat, datosGenerales.datosGeneralesSunat) &&
        Objects.equals(this.representantes, datosGenerales.representantes) &&
        Objects.equals(this.direcciones, datosGenerales.direcciones) &&
        Objects.equals(this.telefonos, datosGenerales.telefonos);
  }
  @Override
  public int hashCode() {
    return Objects.hash(datosPersonales, datosGeneralesSunat, representantes, direcciones, telefonos);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatosGenerales {\n");
    
    sb.append("    datosPersonales: ").append(toIndentedString(datosPersonales)).append("\n");
    sb.append("    datosGeneralesSunat: ").append(toIndentedString(datosGeneralesSunat)).append("\n");
    sb.append("    representantes: ").append(toIndentedString(representantes)).append("\n");
    sb.append("    direcciones: ").append(toIndentedString(direcciones)).append("\n");
    sb.append("    telefonos: ").append(toIndentedString(telefonos)).append("\n");
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
