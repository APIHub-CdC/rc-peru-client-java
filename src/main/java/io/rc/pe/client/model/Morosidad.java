package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import io.rc.pe.client.model.Entidad;
import java.util.ArrayList;
import java.util.List;


public class Morosidad {
  @SerializedName("claveTipoEntidad")
  private String claveTipoEntidad = null;
  @SerializedName("entidad")
  private List<Entidad> entidad = null;
  public Morosidad claveTipoEntidad(String claveTipoEntidad) {
    this.claveTipoEntidad = claveTipoEntidad;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra el giro comercial de la empresa: <table><thead><tr><th>Clave Tipo Entidad</th><th> Tipo&nbsp;&nbsp;&nbsp;Entidad</th></tr></thead><tbody><tr><td>CL</td><td>Comercial</td></tr><tr><td>CM</td><td>Empresas de cobranzas</td></tr><tr><td>CO</td><td>Cooperativa</td></tr><tr><td>CR</td><td>Retail</td></tr><tr><td>DS</td><td>Venta directa</td></tr><tr><td>NG</td><td>No gubernamental</td></tr><tr><td>OE</td><td>Organismo del estado</td></tr><tr><td>SE</td><td>Servicios</td></tr><tr><td>SP</td><td>Servicio público</td></tr><tr><td>TE</td><td>Telecomunicaciones</td></tr></tbody></table>")
  public String getClaveTipoEntidad() {
    return claveTipoEntidad;
  }
  public void setClaveTipoEntidad(String claveTipoEntidad) {
    this.claveTipoEntidad = claveTipoEntidad;
  }
  public Morosidad entidad(List<Entidad> entidad) {
    this.entidad = entidad;
    return this;
  }
  public Morosidad addEntidadItem(Entidad entidadItem) {
    if (this.entidad == null) {
      this.entidad = new ArrayList<Entidad>();
    }
    this.entidad.add(entidadItem);
    return this;
  }
   
  @ApiModelProperty(value = "Muestra las entidades.")
  public List<Entidad> getEntidad() {
    return entidad;
  }
  public void setEntidad(List<Entidad> entidad) {
    this.entidad = entidad;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Morosidad morosidad = (Morosidad) o;
    return Objects.equals(this.claveTipoEntidad, morosidad.claveTipoEntidad) &&
        Objects.equals(this.entidad, morosidad.entidad);
  }
  @Override
  public int hashCode() {
    return Objects.hash(claveTipoEntidad, entidad);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Morosidad {\n");
    
    sb.append("    claveTipoEntidad: ").append(toIndentedString(claveTipoEntidad)).append("\n");
    sb.append("    entidad: ").append(toIndentedString(entidad)).append("\n");
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
