package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;

public class DatosPersonales {
  @SerializedName("primerNombre")
  private String primerNombre = null;
  @SerializedName("segundoNombre")
  private String segundoNombre = null;
  @SerializedName("apellidoPaterno")
  private String apellidoPaterno = null;
  @SerializedName("apellidoMaterno")
  private String apellidoMaterno = null;
  @SerializedName("apellidoCasada")
  private String apellidoCasada = null;
  @SerializedName("fechaNacimiento")
  private String fechaNacimiento = null;
  @SerializedName("edad")
  private BigDecimal edad = null;
  @SerializedName("genero")
  private String genero = null;
  @SerializedName("tipoDocumento")
  private String tipoDocumento = null;
  @SerializedName("numeroDocumento")
  private String numeroDocumento = null;
  @SerializedName("RUC")
  private String RUC = null;
  @SerializedName("codigoSBS")
  private Float codigoSBS = null;
  @SerializedName("ubigeo")
  private String ubigeo = null;
  @SerializedName("departamento")
  private String departamento = null;
  @SerializedName("provincia")
  private String provincia = null;
  @SerializedName("distrito")
  private String distrito = null;
  @SerializedName("via")
  private String via = null;
  @SerializedName("numeroExterior")
  private String numeroExterior = null;
  @SerializedName("numeroInterior")
  private String numeroInterior = null;
  @SerializedName("zona")
  private String zona = null;
  @SerializedName("claveTipoPersona")
  private BigDecimal claveTipoPersona = null;
  @SerializedName("claveTipoEmpresa")
  private String claveTipoEmpresa = null;
  public DatosPersonales primerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
    return this;
  }
   
  @ApiModelProperty(value = "Persona Natutral: Primer nombre de la persona consultada. Persona jurírica: Razón social.")
  public String getPrimerNombre() {
    return primerNombre;
  }
  public void setPrimerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
  }
  public DatosPersonales segundoNombre(String segundoNombre) {
    this.segundoNombre = segundoNombre;
    return this;
  }
   
  @ApiModelProperty(value = "Segundo nombre de la persona consultada. Sólo aplica para personas naturales.")
  public String getSegundoNombre() {
    return segundoNombre;
  }
  public void setSegundoNombre(String segundoNombre) {
    this.segundoNombre = segundoNombre;
  }
  public DatosPersonales apellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
    return this;
  }
   
  @ApiModelProperty(value = "Apellido Paterno de la persona/empresa consultada. Sólo aplica para personas naturales.")
  public String getApellidoPaterno() {
    return apellidoPaterno;
  }
  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }
  public DatosPersonales apellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
    return this;
  }
   
  @ApiModelProperty(value = "Apellido Materno de la persona consultada. Sólo aplica para personas naturales.")
  public String getApellidoMaterno() {
    return apellidoMaterno;
  }
  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }
  public DatosPersonales apellidoCasada(String apellidoCasada) {
    this.apellidoCasada = apellidoCasada;
    return this;
  }
   
  @ApiModelProperty(value = "Apellido de casada de la persona consultada. Sólo aplica para personas naturales.")
  public String getApellidoCasada() {
    return apellidoCasada;
  }
  public void setApellidoCasada(String apellidoCasada) {
    this.apellidoCasada = apellidoCasada;
  }
  public DatosPersonales fechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
    return this;
  }
   
  @ApiModelProperty(value = "Día, mes y año de nacimiento. Formato: yyyymmdd. Sólo aplica para personas naturales.")
  public String getFechaNacimiento() {
    return fechaNacimiento;
  }
  public void setFechaNacimiento(String fechaNacimiento) {
    this.fechaNacimiento = fechaNacimiento;
  }
  public DatosPersonales edad(BigDecimal edad) {
    this.edad = edad;
    return this;
  }
   
  @ApiModelProperty(value = "Cantidad de años de la persona/empresa consultada. Sólo aplica para personas naturales.")
  public BigDecimal getEdad() {
    return edad;
  }
  public void setEdad(BigDecimal edad) {
    this.edad = edad;
  }
  public DatosPersonales genero(String genero) {
    this.genero = genero;
    return this;
  }
   
  @ApiModelProperty(value = "Genero de la persona consultada. Sólo aplica para personas naturales. <table><thead><tr><th>Genero</th><th>Descripción</th></tr></thead><tbody><tr><td>Masculino</td><td>Hombre</td></tr><tr><td>Femenino</td><td>Mujer</td></tr></tbody></table>")
  public String getGenero() {
    return genero;
  }
  public void setGenero(String genero) {
    this.genero = genero;
  }
  public DatosPersonales tipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
    return this;
  }
   
  @ApiModelProperty(value = "Tipo de documento con el que se consulta la persona: <table><thead><tr><th>Clave</th><th>Descripción</th></tr></thead><tbody><tr><td>1</td><td>DNI</td></tr><tr><td>2</td><td>Carnet de extranjería</td></tr><tr><td>10</td><td>RUC</td></tr></tbody></table>")
  public String getTipoDocumento() {
    return tipoDocumento;
  }
  public void setTipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }
  public DatosPersonales numeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
    return this;
  }
   
  @ApiModelProperty(value = "Número del documento de la persona/empresa consultada.")
  public String getNumeroDocumento() {
    return numeroDocumento;
  }
  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }
  public DatosPersonales RUC(String RUC) {
    this.RUC = RUC;
    return this;
  }
   
  @ApiModelProperty(value = "Número de RUC de la empresa/persona consultada.")
  public String getRUC() {
    return RUC;
  }
  public void setRUC(String RUC) {
    this.RUC = RUC;
  }
  public DatosPersonales codigoSBS(Float codigoSBS) {
    this.codigoSBS = codigoSBS;
    return this;
  }
   
  @ApiModelProperty(value = "Código emitido por la Superintendencia de Banca, Seguros y AFP.")
  public Float getCodigoSBS() {
    return codigoSBS;
  }
  public void setCodigoSBS(Float codigoSBS) {
    this.codigoSBS = codigoSBS;
  }
  public DatosPersonales ubigeo(String ubigeo) {
    this.ubigeo = ubigeo;
    return this;
  }
   
  @ApiModelProperty(value = "Son las siglas oficiales para Código de Ubicación Geográfica, que usa el INEI para codificar las circunscripciones territoriales del Perú.")
  public String getUbigeo() {
    return ubigeo;
  }
  public void setUbigeo(String ubigeo) {
    this.ubigeo = ubigeo;
  }
  public DatosPersonales departamento(String departamento) {
    this.departamento = departamento;
    return this;
  }
   
  @ApiModelProperty(value = "Departamento al que pertenece.")
  public String getDepartamento() {
    return departamento;
  }
  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }
  public DatosPersonales provincia(String provincia) {
    this.provincia = provincia;
    return this;
  }
   
  @ApiModelProperty(value = "Provincia a la que pertenece.")
  public String getProvincia() {
    return provincia;
  }
  public void setProvincia(String provincia) {
    this.provincia = provincia;
  }
  public DatosPersonales distrito(String distrito) {
    this.distrito = distrito;
    return this;
  }
   
  @ApiModelProperty(value = "Distrito al que pertenece.")
  public String getDistrito() {
    return distrito;
  }
  public void setDistrito(String distrito) {
    this.distrito = distrito;
  }
  public DatosPersonales via(String via) {
    this.via = via;
    return this;
  }
   
  @ApiModelProperty(value = "Calle o via de la dirección de la persona/empresa.")
  public String getVia() {
    return via;
  }
  public void setVia(String via) {
    this.via = via;
  }
  public DatosPersonales numeroExterior(String numeroExterior) {
    this.numeroExterior = numeroExterior;
    return this;
  }
   
  @ApiModelProperty(value = "Número exterior correspondiente a la dirección de la persona/empresa.")
  public String getNumeroExterior() {
    return numeroExterior;
  }
  public void setNumeroExterior(String numeroExterior) {
    this.numeroExterior = numeroExterior;
  }
  public DatosPersonales numeroInterior(String numeroInterior) {
    this.numeroInterior = numeroInterior;
    return this;
  }
   
  @ApiModelProperty(value = "Número interior correspondiente a la dirección de la persona/empresa.")
  public String getNumeroInterior() {
    return numeroInterior;
  }
  public void setNumeroInterior(String numeroInterior) {
    this.numeroInterior = numeroInterior;
  }
  public DatosPersonales zona(String zona) {
    this.zona = zona;
    return this;
  }
   
  @ApiModelProperty(value = "Colonia o zona correspondiente a la dirección de la persona/empresa.")
  public String getZona() {
    return zona;
  }
  public void setZona(String zona) {
    this.zona = zona;
  }
  public DatosPersonales claveTipoPersona(BigDecimal claveTipoPersona) {
    this.claveTipoPersona = claveTipoPersona;
    return this;
  }
   
  @ApiModelProperty(value = "Clave de tipo de persona: Natural o jurídica. <table><thead><tr><th>Tipo Persona</th><th>Descripción</th></tr></thead><tbody><tr><td>1</td><td>Natural</td></tr><tr><td>2</td><td>Jurídica</td></tr></tbody></table>")
  public BigDecimal getClaveTipoPersona() {
    return claveTipoPersona;
  }
  public void setClaveTipoPersona(BigDecimal claveTipoPersona) {
    this.claveTipoPersona = claveTipoPersona;
  }
  public DatosPersonales claveTipoEmpresa(String claveTipoEmpresa) {
    this.claveTipoEmpresa = claveTipoEmpresa;
    return this;
  }
   
  @ApiModelProperty(value = "Clave de tipo de empresa. <table><thead><tr><th>Clave Tipo Empresa</th><th>Descripción</th></tr></thead><tbody><tr><td>X</td><td>Empresa extranjera l</td></tr><tr><td>E</td><td>Empresa del Estado</td></tr><tr><td>M</td><td>Ministerios</td></tr><tr><td>O</td><td>Otro</td></tr></tbody></table>")
  public String getClaveTipoEmpresa() {
    return claveTipoEmpresa;
  }
  public void setClaveTipoEmpresa(String claveTipoEmpresa) {
    this.claveTipoEmpresa = claveTipoEmpresa;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatosPersonales datosPersonales = (DatosPersonales) o;
    return Objects.equals(this.primerNombre, datosPersonales.primerNombre) &&
        Objects.equals(this.segundoNombre, datosPersonales.segundoNombre) &&
        Objects.equals(this.apellidoPaterno, datosPersonales.apellidoPaterno) &&
        Objects.equals(this.apellidoMaterno, datosPersonales.apellidoMaterno) &&
        Objects.equals(this.apellidoCasada, datosPersonales.apellidoCasada) &&
        Objects.equals(this.fechaNacimiento, datosPersonales.fechaNacimiento) &&
        Objects.equals(this.edad, datosPersonales.edad) &&
        Objects.equals(this.genero, datosPersonales.genero) &&
        Objects.equals(this.tipoDocumento, datosPersonales.tipoDocumento) &&
        Objects.equals(this.numeroDocumento, datosPersonales.numeroDocumento) &&
        Objects.equals(this.RUC, datosPersonales.RUC) &&
        Objects.equals(this.codigoSBS, datosPersonales.codigoSBS) &&
        Objects.equals(this.ubigeo, datosPersonales.ubigeo) &&
        Objects.equals(this.departamento, datosPersonales.departamento) &&
        Objects.equals(this.provincia, datosPersonales.provincia) &&
        Objects.equals(this.distrito, datosPersonales.distrito) &&
        Objects.equals(this.via, datosPersonales.via) &&
        Objects.equals(this.numeroExterior, datosPersonales.numeroExterior) &&
        Objects.equals(this.numeroInterior, datosPersonales.numeroInterior) &&
        Objects.equals(this.zona, datosPersonales.zona) &&
        Objects.equals(this.claveTipoPersona, datosPersonales.claveTipoPersona) &&
        Objects.equals(this.claveTipoEmpresa, datosPersonales.claveTipoEmpresa);
  }
  @Override
  public int hashCode() {
    return Objects.hash(primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno, apellidoCasada, fechaNacimiento, edad, genero, tipoDocumento, numeroDocumento, RUC, codigoSBS, ubigeo, departamento, provincia, distrito, via, numeroExterior, numeroInterior, zona, claveTipoPersona, claveTipoEmpresa);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatosPersonales {\n");
    
    sb.append("    primerNombre: ").append(toIndentedString(primerNombre)).append("\n");
    sb.append("    segundoNombre: ").append(toIndentedString(segundoNombre)).append("\n");
    sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
    sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
    sb.append("    apellidoCasada: ").append(toIndentedString(apellidoCasada)).append("\n");
    sb.append("    fechaNacimiento: ").append(toIndentedString(fechaNacimiento)).append("\n");
    sb.append("    edad: ").append(toIndentedString(edad)).append("\n");
    sb.append("    genero: ").append(toIndentedString(genero)).append("\n");
    sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
    sb.append("    numeroDocumento: ").append(toIndentedString(numeroDocumento)).append("\n");
    sb.append("    RUC: ").append(toIndentedString(RUC)).append("\n");
    sb.append("    codigoSBS: ").append(toIndentedString(codigoSBS)).append("\n");
    sb.append("    ubigeo: ").append(toIndentedString(ubigeo)).append("\n");
    sb.append("    departamento: ").append(toIndentedString(departamento)).append("\n");
    sb.append("    provincia: ").append(toIndentedString(provincia)).append("\n");
    sb.append("    distrito: ").append(toIndentedString(distrito)).append("\n");
    sb.append("    via: ").append(toIndentedString(via)).append("\n");
    sb.append("    numeroExterior: ").append(toIndentedString(numeroExterior)).append("\n");
    sb.append("    numeroInterior: ").append(toIndentedString(numeroInterior)).append("\n");
    sb.append("    zona: ").append(toIndentedString(zona)).append("\n");
    sb.append("    claveTipoPersona: ").append(toIndentedString(claveTipoPersona)).append("\n");
    sb.append("    claveTipoEmpresa: ").append(toIndentedString(claveTipoEmpresa)).append("\n");
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
