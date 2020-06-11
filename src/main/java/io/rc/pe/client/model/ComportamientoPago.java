package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import io.rc.pe.client.model.InformacionEntidad24;
import java.util.ArrayList;
import java.util.List;


public class ComportamientoPago {
  @SerializedName("claveProducto")
  private String claveProducto = null;
  @SerializedName("informacionEntidad24")
  private List<InformacionEntidad24> informacionEntidad24 = null;
  public ComportamientoPago claveProducto(String claveProducto) {
    this.claveProducto = claveProducto;
    return this;
  }
   
  @ApiModelProperty(value = "<table><thead><tr><th>Clave Producto</th><th>Producto</th></tr></thead><tbody><tr><td>0101TC</td><td>Consumo - Tarjeta de crédito</td></tr><tr><td>0102PV</td><td>Consumo - Préstamo vehicular</td></tr><tr><td>0103PRE</td><td>Consumo - Préstamos</td></tr><tr><td>0104PIG</td><td>Consumo - Pignoraticios</td></tr><tr><td>0105OC</td><td>Consumo - Otros créditos</td></tr><tr><td>0201PRE</td><td>Hipotecario - Préstamos</td></tr><tr><td>0202FM</td><td>Hipotecario - Fondo MiVivienda</td></tr><tr><td>0203OC</td><td>Hipotecario - Otros créditos</td></tr><tr><td>0301TC</td><td>Microempresa - Tarjeta de crédito</td></tr><tr><td>0302SC</td><td>Microempresa - Sobregiros en cuenta</td></tr><tr><td>0303PRE</td><td>Microempresa - Préstamos</td></tr><tr><td>0304AF</td><td>Microempresa - Arrendamiento financiero</td></tr><tr><td>0305OC</td><td>Microempresa - Otros créditos</td></tr><tr><td>0401TC</td><td>Pequeña empresa - Tarjeta de crédito</td></tr><tr><td>0402SC</td><td>Pequeña empresa - Sobregiros en cuenta</td></tr><tr><td>0403PRE</td><td>Pequeña empresa - Préstamos</td></tr><tr><td>0404AF</td><td>Pequeña empresa - Arrendamiento financiero</td></tr><tr><td>0405OC</td><td>Pequeña empresa - Otros créditos</td></tr><tr><td>0501TC</td><td>Mediana empresa - Tarjeta de crédito</td></tr><tr><td>0502SC</td><td>Mediana empresa - Sobregiros en cuenta</td></tr><tr><td>0503DES</td><td>Mediana empresa - Descuentos</td></tr><tr><td>0504PRE</td><td>Mediana empresa - Préstamos</td></tr><tr><td>0505AF</td><td>Mediana empresa - Arrendamiento financiero</td></tr><tr><td>0506OC</td><td>Mediana empresa - Otros créditos</td></tr><tr><td>0601TC</td><td>Grande empresa - Tarjeta de crédito</td></tr><tr><td>0602D</td><td>Grande empresa - Descuentos</td></tr><tr><td>0603PRE</td><td>Grande empresa - Préstamos</td></tr><tr><td>0604AF</td><td>Grande empresa - Arrendamiento financiero</td></tr><tr><td>0605OC</td><td>Grande empresa - Otros créditos</td></tr><tr><td>0700COR</td><td>Corporativo</td></tr><tr><td>0800BAN</td><td>Bancos multilaterales de desarrollo</td></tr><tr><td>0900SOB</td><td>Soberanos</td></tr><tr><td>1000SP</td><td>Entidades del sector público</td></tr><tr><td>1100INT</td><td>Intermediarios de valores</td></tr><tr><td>1200EMP</td><td>Empresas del sistema financiero</td></tr><tr><td>1300MF</td><td>Microfinanzas no supervisadas</td></tr></tbody></table>")
  public String getClaveProducto() {
    return claveProducto;
  }
  public void setClaveProducto(String claveProducto) {
    this.claveProducto = claveProducto;
  }
  public ComportamientoPago informacionEntidad24(List<InformacionEntidad24> informacionEntidad24) {
    this.informacionEntidad24 = informacionEntidad24;
    return this;
  }
  public ComportamientoPago addInformacionEntidad24Item(InformacionEntidad24 informacionEntidad24Item) {
    if (this.informacionEntidad24 == null) {
      this.informacionEntidad24 = new ArrayList<InformacionEntidad24>();
    }
    this.informacionEntidad24.add(informacionEntidad24Item);
    return this;
  }
   
  @ApiModelProperty(value = "")
  public List<InformacionEntidad24> getInformacionEntidad24() {
    return informacionEntidad24;
  }
  public void setInformacionEntidad24(List<InformacionEntidad24> informacionEntidad24) {
    this.informacionEntidad24 = informacionEntidad24;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComportamientoPago comportamientoPago = (ComportamientoPago) o;
    return Objects.equals(this.claveProducto, comportamientoPago.claveProducto) &&
        Objects.equals(this.informacionEntidad24, comportamientoPago.informacionEntidad24);
  }
  @Override
  public int hashCode() {
    return Objects.hash(claveProducto, informacionEntidad24);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComportamientoPago {\n");
    
    sb.append("    claveProducto: ").append(toIndentedString(claveProducto)).append("\n");
    sb.append("    informacionEntidad24: ").append(toIndentedString(informacionEntidad24)).append("\n");
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
