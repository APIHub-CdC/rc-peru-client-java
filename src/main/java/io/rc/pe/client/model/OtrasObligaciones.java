package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import io.rc.pe.client.model.DeudasAFP;
import io.rc.pe.client.model.DeudoresOmisos;
import io.rc.pe.client.model.Morosidad;
import io.rc.pe.client.model.ProtestosAceptante;
import io.rc.pe.client.model.ProtestosGirador;
import io.rc.pe.client.model.ResumenOtrasObligaciones;
import java.util.ArrayList;
import java.util.List;


public class OtrasObligaciones {
  @SerializedName("resumenOtrasObligaciones")
  private List<ResumenOtrasObligaciones> resumenOtrasObligaciones = null;
  @SerializedName("deudoresOmisos")
  private List<DeudoresOmisos> deudoresOmisos = null;
  @SerializedName("deudasAFP")
  private List<DeudasAFP> deudasAFP = null;
  @SerializedName("morosidad")
  private List<Morosidad> morosidad = null;
  @SerializedName("protestosAceptante")
  private List<ProtestosAceptante> protestosAceptante = null;
  @SerializedName("protestosGirador")
  private List<ProtestosGirador> protestosGirador = null;
  public OtrasObligaciones resumenOtrasObligaciones(List<ResumenOtrasObligaciones> resumenOtrasObligaciones) {
    this.resumenOtrasObligaciones = resumenOtrasObligaciones;
    return this;
  }
  public OtrasObligaciones addResumenOtrasObligacionesItem(ResumenOtrasObligaciones resumenOtrasObligacionesItem) {
    if (this.resumenOtrasObligaciones == null) {
      this.resumenOtrasObligaciones = new ArrayList<ResumenOtrasObligaciones>();
    }
    this.resumenOtrasObligaciones.add(resumenOtrasObligacionesItem);
    return this;
  }
   
  @ApiModelProperty(example = "[{\"claveFuente\":\"SUNAT\",\"infoFuenteInformacion\":null,\"claveSituacion\":\"ACT\",\"obligaciones\":3,\"monto\":1602,\"primerVencimiento\":\"201905\",\"ultimoVencimiento\":\"201908\",\"obligaciones24Meses\":3,\"monto24Meses\":1602},{\"claveFuente\":\"AFP\",\"infoFuenteInformacion\":null,\"claveSituacion\":\"ACT\",\"obligaciones\":51,\"monto\":55105.61,\"primerVencimiento\":\"201505\",\"ultimoVencimiento\":\"201907\",\"obligaciones24Meses\":18,\"monto24Meses\":20026.94}]", value = "Muestra el resumen de las obligaciones reportadas por las siguientes fuentes: Deuda SUNAT, Deuda AFP, Morosidad comercial, Protestos del aceptante y Protestos por girador.")
  public List<ResumenOtrasObligaciones> getResumenOtrasObligaciones() {
    return resumenOtrasObligaciones;
  }
  public void setResumenOtrasObligaciones(List<ResumenOtrasObligaciones> resumenOtrasObligaciones) {
    this.resumenOtrasObligaciones = resumenOtrasObligaciones;
  }
  public OtrasObligaciones deudoresOmisos(List<DeudoresOmisos> deudoresOmisos) {
    this.deudoresOmisos = deudoresOmisos;
    return this;
  }
  public OtrasObligaciones addDeudoresOmisosItem(DeudoresOmisos deudoresOmisosItem) {
    if (this.deudoresOmisos == null) {
      this.deudoresOmisos = new ArrayList<DeudoresOmisos>();
    }
    this.deudoresOmisos.add(deudoresOmisosItem);
    return this;
  }
   
  @ApiModelProperty(example = "[{\"tipo\":\"Deudor\",\"periodo\":\"201709\",\"claveSituacion\":\"ACT\",\"acreedorConcepto\":\"ONP\",\"fechaReporte\":\"20200131\",\"montoDeuda\":893},{\"tipo\":\"Deudor\",\"periodo\":\"201704\",\"claveSituacion\":\"ACT\",\"acreedorConcepto\":\"SUNAT\",\"fechaReporte\":\"20200131\",\"montoDeuda\":694}]", value = "Muestra el detalle de registros de La Superintendencia Nacional de Aduanas y de Administración tributaria.")
  public List<DeudoresOmisos> getDeudoresOmisos() {
    return deudoresOmisos;
  }
  public void setDeudoresOmisos(List<DeudoresOmisos> deudoresOmisos) {
    this.deudoresOmisos = deudoresOmisos;
  }
  public OtrasObligaciones deudasAFP(List<DeudasAFP> deudasAFP) {
    this.deudasAFP = deudasAFP;
    return this;
  }
  public OtrasObligaciones addDeudasAFPItem(DeudasAFP deudasAFPItem) {
    if (this.deudasAFP == null) {
      this.deudasAFP = new ArrayList<DeudasAFP>();
    }
    this.deudasAFP.add(deudasAFPItem);
    return this;
  }
   
  @ApiModelProperty(example = "[{\"descripcionEntidad\":\"HABITAT\",\"fechaReporte\":\"20191210\",\"claveTipoDeuda\":\"4\",\"periodoDevengue\":\"201906\",\"importeDeudaFondo\":961.34,\"importeDeudaAFP\":166.31,\"claveCondicionDeuda\":\"A\",\"claveSituacion\":\"ACT\"},{\"descripcionEntidad\":\"HABITAT\",\"fechaReporte\":\"20191210\",\"claveTipoDeuda\":\"4\",\"periodoDevengue\":\"201905\",\"importeDeudaFondo\":961.34,\"importeDeudaAFP\":166.31,\"claveCondicionDeuda\":\"A\",\"claveSituacion\":\"ACT\"}]", value = "Muestra los saldos de deuda en AFP (Administradoras de Fondo de Pensiones del Perú).")
  public List<DeudasAFP> getDeudasAFP() {
    return deudasAFP;
  }
  public void setDeudasAFP(List<DeudasAFP> deudasAFP) {
    this.deudasAFP = deudasAFP;
  }
  public OtrasObligaciones morosidad(List<Morosidad> morosidad) {
    this.morosidad = morosidad;
    return this;
  }
  public OtrasObligaciones addMorosidadItem(Morosidad morosidadItem) {
    if (this.morosidad == null) {
      this.morosidad = new ArrayList<Morosidad>();
    }
    this.morosidad.add(morosidadItem);
    return this;
  }
   
  @ApiModelProperty(example = "[{\"claveTipoEntidad\":\"CR\",\"entidad\":[{\"descripcionEntidad\":\"DERCO\",\"detalleEntidad\":[{\"claveSituacion\":\"ACT\",\"monto\":1205.38,\"fechaVencimiento\":\"20180509\",\"fechaReporte\":\"20191231\"},{\"claveSituacion\":\"ACT\",\"monto\":850.28,\"fechaVencimiento\":\"20180426\",\"fechaReporte\":\"20191231\"},{\"claveSituacion\":\"ACT\",\"monto\":3080.05,\"fechaVencimiento\":\"20180420\",\"fechaReporte\":\"20191231\"}]}]},{\"claveTipoEntidad\":\"TE\",\"entidad\":[{\"descripcionEntidad\":\"CLARO\",\"detalleEntidad\":[{\"claveSituacion\":\"ACT\",\"monto\":52.01,\"fechaVencimiento\":\"20170519\",\"fechaReporte\":\"20190520\"},{\"claveSituacion\":\"ACT\",\"monto\":72.43,\"fechaVencimiento\":\"20170519\",\"fechaReporte\":\"20190520\"},{\"claveSituacion\":\"ACT\",\"monto\":183.21,\"fechaVencimiento\":\"20161210\",\"fechaReporte\":\"20190520\"}]},{\"descripcionEntidad\":\"MOVISTAR\",\"detalleEntidad\":[{\"claveSituacion\":\"HIS\",\"monto\":76.23,\"fechaVencimiento\":\"20170724\",\"fechaReporte\":\"20191227\"}]}]}]", value = "Atrasos de los últimos 24 meses de Morosidad Comercial.")
  public List<Morosidad> getMorosidad() {
    return morosidad;
  }
  public void setMorosidad(List<Morosidad> morosidad) {
    this.morosidad = morosidad;
  }
  public OtrasObligaciones protestosAceptante(List<ProtestosAceptante> protestosAceptante) {
    this.protestosAceptante = protestosAceptante;
    return this;
  }
  public OtrasObligaciones addProtestosAceptanteItem(ProtestosAceptante protestosAceptanteItem) {
    if (this.protestosAceptante == null) {
      this.protestosAceptante = new ArrayList<ProtestosAceptante>();
    }
    this.protestosAceptante.add(protestosAceptanteItem);
    return this;
  }
   
  @ApiModelProperty(example = "[{\"claveTipoValor\":\"FAN\",\"fechaprotesto\":\"20180409\",\"claveSituacion\":\"ACLA\",\"fechaAclaracion\":\"20181109\",\"monto\":3783,\"nombreGirador\":\"BANCO DE CREDITO DEL PERU\"},{\"claveTipoValor\":\"FAN\",\"fechaprotesto\":\"20180409\",\"claveSituacion\":\"ACLA\",\"fechaAclaracion\":\"20181109\",\"monto\":1649,\"nombreGirador\":\"BANCO DE CREDITO DEL PERU\"}]", value = "Detalle de los registros de protestos del aceptante.")
  public List<ProtestosAceptante> getProtestosAceptante() {
    return protestosAceptante;
  }
  public void setProtestosAceptante(List<ProtestosAceptante> protestosAceptante) {
    this.protestosAceptante = protestosAceptante;
  }
  public OtrasObligaciones protestosGirador(List<ProtestosGirador> protestosGirador) {
    this.protestosGirador = protestosGirador;
    return this;
  }
  public OtrasObligaciones addProtestosGiradorItem(ProtestosGirador protestosGiradorItem) {
    if (this.protestosGirador == null) {
      this.protestosGirador = new ArrayList<ProtestosGirador>();
    }
    this.protestosGirador.add(protestosGiradorItem);
    return this;
  }
   
  @ApiModelProperty(example = "[{\"nombreAceptante\":\"REPRESENTACIONES MEGACENTER SAC\",\"segundoNombreAceptante\":\"\",\"apellidoPaternoAceptante\":\"\",\"apellidoMaternoAceptante\":\"\",\"claveSituacion\":\"NOACLA\",\"fechaProtesto\":\"20190919\",\"fechaAclaracion\":\"\",\"monto\":29773.36,\"claveTipoValor\":\"LT\"},{\"nombreAceptante\":\"CASAS & CERAMICOS SAC\",\"segundoNombreAceptante\":\"\",\"apellidoPaternoAceptante\":\"\",\"apellidoMaternoAceptante\":\"\",\"claveSituacion\":\"NOACLA\",\"fechaProtesto\":\"20190911\",\"fechaAclaracion\":\"\",\"monto\":135000,\"claveTipoValor\":\"LT\"}]", value = "Detalle de los registros de protestos del girador (deuda a favor del titular del reporte).")
  public List<ProtestosGirador> getProtestosGirador() {
    return protestosGirador;
  }
  public void setProtestosGirador(List<ProtestosGirador> protestosGirador) {
    this.protestosGirador = protestosGirador;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OtrasObligaciones otrasObligaciones = (OtrasObligaciones) o;
    return Objects.equals(this.resumenOtrasObligaciones, otrasObligaciones.resumenOtrasObligaciones) &&
        Objects.equals(this.deudoresOmisos, otrasObligaciones.deudoresOmisos) &&
        Objects.equals(this.deudasAFP, otrasObligaciones.deudasAFP) &&
        Objects.equals(this.morosidad, otrasObligaciones.morosidad) &&
        Objects.equals(this.protestosAceptante, otrasObligaciones.protestosAceptante) &&
        Objects.equals(this.protestosGirador, otrasObligaciones.protestosGirador);
  }
  @Override
  public int hashCode() {
    return Objects.hash(resumenOtrasObligaciones, deudoresOmisos, deudasAFP, morosidad, protestosAceptante, protestosGirador);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OtrasObligaciones {\n");
    
    sb.append("    resumenOtrasObligaciones: ").append(toIndentedString(resumenOtrasObligaciones)).append("\n");
    sb.append("    deudoresOmisos: ").append(toIndentedString(deudoresOmisos)).append("\n");
    sb.append("    deudasAFP: ").append(toIndentedString(deudasAFP)).append("\n");
    sb.append("    morosidad: ").append(toIndentedString(morosidad)).append("\n");
    sb.append("    protestosAceptante: ").append(toIndentedString(protestosAceptante)).append("\n");
    sb.append("    protestosGirador: ").append(toIndentedString(protestosGirador)).append("\n");
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
