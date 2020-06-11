package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

public class ProtestosAceptante {
  @SerializedName("claveTipoValor")
  private String claveTipoValor = null;
  @SerializedName("fechaProtesto")
  private String fechaProtesto = null;
  @SerializedName("claveSituacion")
  private String claveSituacion = null;
  @SerializedName("fechaAclaracion")
  private String fechaAclaracion = null;
  @SerializedName("monto")
  private Float monto = null;
  @SerializedName("nombreGirador")
  private String nombreGirador = null;
  public ProtestosAceptante claveTipoValor(String claveTipoValor) {
    this.claveTipoValor = claveTipoValor;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el tipo de título valor: <table><thead><tr><th>Clave Tipo Valor</th><th>Descripción</th></tr></thead><tbody><tr><td>AM</td><td>Arbitrios municipales</td></tr><tr><td>BV</td><td>Boleta de venta</td></tr><tr><td>CBE</td><td>Certificado bancario moneda extranj</td></tr><tr><td>CBN</td><td>Certificador bancario menda naciona</td></tr><tr><td>CC</td><td>Cuenta corriente</td></tr><tr><td>CEM</td><td>Conocimiento de embarque</td></tr><tr><td>CH</td><td>Cheque</td></tr><tr><td>CL</td><td>Creditos por liquidar</td></tr><tr><td>CO</td><td>Consumo</td></tr><tr><td>CPO</td><td>Carta porte</td></tr><tr><td>FA</td><td>Factura</td></tr><tr><td>FAC</td><td>Factura conformada</td></tr><tr><td>FAN</td><td>Factura negociable</td></tr><tr><td>HI</td><td>Credito hipotecario</td></tr><tr><td>IA</td><td>Impuesto alcabala</td></tr><tr><td>IP</td><td>Impuesto predial</td></tr><tr><td>IV</td><td>Impuesto vehicular</td></tr><tr><td>LF</td><td>Licencia de funcionamiento</td></tr><tr><td>LS</td><td>Leasing</td></tr><tr><td>LT</td><td>Letra</td></tr><tr><td>MN</td><td>Multas no tributarias</td></tr><tr><td>MT</td><td>Multas tributarias</td></tr><tr><td>N</td><td>No indicado</td></tr><tr><td>ND</td><td>Nota de débito</td></tr><tr><td>OT</td><td>Otros</td></tr><tr><td>PA</td><td>Papelera</td></tr><tr><td>PG</td><td>Pagare</td></tr><tr><td>PR</td><td>Prestamos varios</td></tr><tr><td>RC</td><td>Recibo</td></tr><tr><td>RS</td><td>Resolucion de sancion</td></tr><tr><td>ST</td><td>Servicios telefonicos</td></tr><tr><td>TC</td><td>Tarjeta de credito</td></tr><tr><td>VC</td><td>Video ñ cable</td></tr><tr><td>VMO</td><td>Valores mobiliarios</td></tr><tr><td>WAR</td><td>Warrant</td></tr></tbody></table>")
  public String getClaveTipoValor() {
    return claveTipoValor;
  }
  public void setClaveTipoValor(String claveTipoValor) {
    this.claveTipoValor = claveTipoValor;
  }
  public ProtestosAceptante fechaProtesto(String fechaProtesto) {
    this.fechaProtesto = fechaProtesto;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el monto protestado reportado.")
  public String getFechaProtesto() {
    return fechaProtesto;
  }
  public void setFechaProtesto(String fechaProtesto) {
    this.fechaProtesto = fechaProtesto;
  }
  public ProtestosAceptante claveSituacion(String claveSituacion) {
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
  public ProtestosAceptante fechaAclaracion(String fechaAclaracion) {
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
  public ProtestosAceptante monto(Float monto) {
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
  public ProtestosAceptante nombreGirador(String nombreGirador) {
    this.nombreGirador = nombreGirador;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el nombre del girador (acreedor).")
  public String getNombreGirador() {
    return nombreGirador;
  }
  public void setNombreGirador(String nombreGirador) {
    this.nombreGirador = nombreGirador;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProtestosAceptante protestosAceptante = (ProtestosAceptante) o;
    return Objects.equals(this.claveTipoValor, protestosAceptante.claveTipoValor) &&
        Objects.equals(this.fechaProtesto, protestosAceptante.fechaProtesto) &&
        Objects.equals(this.claveSituacion, protestosAceptante.claveSituacion) &&
        Objects.equals(this.fechaAclaracion, protestosAceptante.fechaAclaracion) &&
        Objects.equals(this.monto, protestosAceptante.monto) &&
        Objects.equals(this.nombreGirador, protestosAceptante.nombreGirador);
  }
  @Override
  public int hashCode() {
    return Objects.hash(claveTipoValor, fechaProtesto, claveSituacion, fechaAclaracion, monto, nombreGirador);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtestosAceptante {\n");
    
    sb.append("    claveTipoValor: ").append(toIndentedString(claveTipoValor)).append("\n");
    sb.append("    fechaProtesto: ").append(toIndentedString(fechaProtesto)).append("\n");
    sb.append("    claveSituacion: ").append(toIndentedString(claveSituacion)).append("\n");
    sb.append("    fechaAclaracion: ").append(toIndentedString(fechaAclaracion)).append("\n");
    sb.append("    monto: ").append(toIndentedString(monto)).append("\n");
    sb.append("    nombreGirador: ").append(toIndentedString(nombreGirador)).append("\n");
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
