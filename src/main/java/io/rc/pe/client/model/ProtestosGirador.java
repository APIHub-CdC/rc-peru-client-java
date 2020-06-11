package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;


public class ProtestosGirador {
  @SerializedName("nombreAceptante")
  private String nombreAceptante = null;
  @SerializedName("segundoNombreAceptante")
  private String segundoNombreAceptante = null;
  @SerializedName("apellidoPaternoAceptante")
  private String apellidoPaternoAceptante = null;
  @SerializedName("apellidoMaternoAceptante")
  private String apellidoMaternoAceptante = null;
  @SerializedName("claveSituacion")
  private String claveSituacion = null;
  @SerializedName("fechaProtesto")
  private String fechaProtesto = null;
  @SerializedName("fechaAclaracion")
  private String fechaAclaracion = null;
  @SerializedName("monto")
  private Float monto = null;
  @SerializedName("claveTipoValor")
  private String claveTipoValor = null;
  public ProtestosGirador nombreAceptante(String nombreAceptante) {
    this.nombreAceptante = nombreAceptante;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el primer nombre del aceptante.")
  public String getNombreAceptante() {
    return nombreAceptante;
  }
  public void setNombreAceptante(String nombreAceptante) {
    this.nombreAceptante = nombreAceptante;
  }
  public ProtestosGirador segundoNombreAceptante(String segundoNombreAceptante) {
    this.segundoNombreAceptante = segundoNombreAceptante;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el segundo nombre del aceptante, en caso de tener.")
  public String getSegundoNombreAceptante() {
    return segundoNombreAceptante;
  }
  public void setSegundoNombreAceptante(String segundoNombreAceptante) {
    this.segundoNombreAceptante = segundoNombreAceptante;
  }
  public ProtestosGirador apellidoPaternoAceptante(String apellidoPaternoAceptante) {
    this.apellidoPaternoAceptante = apellidoPaternoAceptante;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el apellido paterno del aceptante.")
  public String getApellidoPaternoAceptante() {
    return apellidoPaternoAceptante;
  }
  public void setApellidoPaternoAceptante(String apellidoPaternoAceptante) {
    this.apellidoPaternoAceptante = apellidoPaternoAceptante;
  }
  public ProtestosGirador apellidoMaternoAceptante(String apellidoMaternoAceptante) {
    this.apellidoMaternoAceptante = apellidoMaternoAceptante;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el apellido materno del aceptante.")
  public String getApellidoMaternoAceptante() {
    return apellidoMaternoAceptante;
  }
  public void setApellidoMaternoAceptante(String apellidoMaternoAceptante) {
    this.apellidoMaternoAceptante = apellidoMaternoAceptante;
  }
  public ProtestosGirador claveSituacion(String claveSituacion) {
    this.claveSituacion = claveSituacion;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la situación actual de la deuda. <li> No aclarado - Cuando la persona fue reportada por algún aportante de una fuente en su última carga. <li> Aclarado - es cuando no fue reportada en la última carga de un aportante, pero sí en alguna carga de los últimos 60 meses (siempre y cuando sea visible el registro). <table><thead><tr><th>CLAVE</th><th>SITUACIÓN</th></tr></thead><tbody><tr><td>ACLA</td><td>Aclarado</td></tr><tr><td>NOACLA</td><td>No Aclarado</td></tr></tbody></table>")
  public String getClaveSituacion() {
    return claveSituacion;
  }
  public void setClaveSituacion(String claveSituacion) {
    this.claveSituacion = claveSituacion;
  }
  public ProtestosGirador fechaProtesto(String fechaProtesto) {
    this.fechaProtesto = fechaProtesto;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la fecha del protesto. Formato: yyyymmdd")
  public String getFechaProtesto() {
    return fechaProtesto;
  }
  public void setFechaProtesto(String fechaProtesto) {
    this.fechaProtesto = fechaProtesto;
  }
  public ProtestosGirador fechaAclaracion(String fechaAclaracion) {
    this.fechaAclaracion = fechaAclaracion;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra la fecha de regularización del protesto. Formato: yyyymmdd")
  public String getFechaAclaracion() {
    return fechaAclaracion;
  }
  public void setFechaAclaracion(String fechaAclaracion) {
    this.fechaAclaracion = fechaAclaracion;
  }
  public ProtestosGirador monto(Float monto) {
    this.monto = monto;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el monto protestado reportado expresado en soles.")
  public Float getMonto() {
    return monto;
  }
  public void setMonto(Float monto) {
    this.monto = monto;
  }
  public ProtestosGirador claveTipoValor(String claveTipoValor) {
    this.claveTipoValor = claveTipoValor;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el tipo de título valor. <table><thead><tr><th>Clave Tipo Valor</th><th>Descripción</th></tr></thead><tbody><tr><td>AM</td><td>Arbitrios municipales</td></tr><tr><td>BV</td><td>Boleta de venta</td></tr><tr><td>CBE</td><td>Certificado bancario moneda extranj</td></tr><tr><td>CBN</td><td>Certificador bancario menda naciona</td></tr><tr><td>CC</td><td>Cuenta corriente</td></tr><tr><td>CEM</td><td>Conocimiento de embarque</td></tr><tr><td>CH</td><td>Cheque</td></tr><tr><td>CL</td><td>Creditos por liquidar</td></tr><tr><td>CO</td><td>Consumo</td></tr><tr><td>CPO</td><td>Carta porte</td></tr><tr><td>FA</td><td>Factura</td></tr><tr><td>FAC</td><td>Factura conformada</td></tr><tr><td>FAN</td><td>Factura negociable</td></tr><tr><td>HI</td><td>Credito hipotecario</td></tr><tr><td>IA</td><td>Impuesto alcabala</td></tr><tr><td>IP</td><td>Impuesto predial</td></tr><tr><td>IV</td><td>Impuesto vehicular</td></tr><tr><td>LF</td><td>Licencia de funcionamiento</td></tr><tr><td>LS</td><td>Leasing</td></tr><tr><td>LT</td><td>Letra</td></tr><tr><td>MN</td><td>Multas no tributarias</td></tr><tr><td>MT</td><td>Multas tributarias</td></tr><tr><td>N</td><td>No indicado</td></tr><tr><td>ND</td><td>Nota de débito</td></tr><tr><td>OT</td><td>Otros</td></tr><tr><td>PA</td><td>Papelera</td></tr><tr><td>PG</td><td>Pagare</td></tr><tr><td>PR</td><td>Prestamos varios</td></tr><tr><td>RC</td><td>Recibo</td></tr><tr><td>RS</td><td>Resolucion de sancion</td></tr><tr><td>ST</td><td>Servicios telefonicos</td></tr><tr><td>TC</td><td>Tarjeta de credito</td></tr><tr><td>VC</td><td>Video ñ cable</td></tr><tr><td>VMO</td><td>Valores mobiliarios</td></tr><tr><td>WAR</td><td>Warrant</td></tr></tbody></table>")
  public String getClaveTipoValor() {
    return claveTipoValor;
  }
  public void setClaveTipoValor(String claveTipoValor) {
    this.claveTipoValor = claveTipoValor;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProtestosGirador protestosGirador = (ProtestosGirador) o;
    return Objects.equals(this.nombreAceptante, protestosGirador.nombreAceptante) &&
        Objects.equals(this.segundoNombreAceptante, protestosGirador.segundoNombreAceptante) &&
        Objects.equals(this.apellidoPaternoAceptante, protestosGirador.apellidoPaternoAceptante) &&
        Objects.equals(this.apellidoMaternoAceptante, protestosGirador.apellidoMaternoAceptante) &&
        Objects.equals(this.claveSituacion, protestosGirador.claveSituacion) &&
        Objects.equals(this.fechaProtesto, protestosGirador.fechaProtesto) &&
        Objects.equals(this.fechaAclaracion, protestosGirador.fechaAclaracion) &&
        Objects.equals(this.monto, protestosGirador.monto) &&
        Objects.equals(this.claveTipoValor, protestosGirador.claveTipoValor);
  }
  @Override
  public int hashCode() {
    return Objects.hash(nombreAceptante, segundoNombreAceptante, apellidoPaternoAceptante, apellidoMaternoAceptante, claveSituacion, fechaProtesto, fechaAclaracion, monto, claveTipoValor);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtestosGirador {\n");
    
    sb.append("    nombreAceptante: ").append(toIndentedString(nombreAceptante)).append("\n");
    sb.append("    segundoNombreAceptante: ").append(toIndentedString(segundoNombreAceptante)).append("\n");
    sb.append("    apellidoPaternoAceptante: ").append(toIndentedString(apellidoPaternoAceptante)).append("\n");
    sb.append("    apellidoMaternoAceptante: ").append(toIndentedString(apellidoMaternoAceptante)).append("\n");
    sb.append("    claveSituacion: ").append(toIndentedString(claveSituacion)).append("\n");
    sb.append("    fechaProtesto: ").append(toIndentedString(fechaProtesto)).append("\n");
    sb.append("    fechaAclaracion: ").append(toIndentedString(fechaAclaracion)).append("\n");
    sb.append("    monto: ").append(toIndentedString(monto)).append("\n");
    sb.append("    claveTipoValor: ").append(toIndentedString(claveTipoValor)).append("\n");
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
