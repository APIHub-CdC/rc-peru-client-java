package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.rc.pe.client.model.DetalleAvalados;
import io.rc.pe.client.model.DetalleAvalistas;
import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "Esta sección muestra los avalistas y avalados.")
public class DetalleCreditosAvalistasAvalados {
  @SerializedName("detallesAvalistas")
  private List<DetalleAvalistas> detallesAvalistas = null;
  @SerializedName("detallesAvalados")
  private List<DetalleAvalados> detallesAvalados = null;
  public DetalleCreditosAvalistasAvalados detallesAvalistas(List<DetalleAvalistas> detallesAvalistas) {
    this.detallesAvalistas = detallesAvalistas;
    return this;
  }
  public DetalleCreditosAvalistasAvalados addDetallesAvalistasItem(DetalleAvalistas detallesAvalistasItem) {
    if (this.detallesAvalistas == null) {
      this.detallesAvalistas = new ArrayList<DetalleAvalistas>();
    }
    this.detallesAvalistas.add(detallesAvalistasItem);
    return this;
  }
   
  @ApiModelProperty(example = "[{\"periodo\":\"201912\",\"idCalificacion\":\"0\",\"idTipoDocumento\":\"1\",\"documento\":\"00663814\",\"nombre\":\"ANSELMA SIMONA CATACORA MAYTA\",\"entidad\":\"COMPARTAMOS FINANCIERA S.A.\",\"saldo\":2232},{\"periodo\":\"201912\",\"idCalificacion\":\"0\",\"idTipoDocumento\":\"1\",\"documento\":\"80184231\",\"nombre\":\"CLARA  SAHUA LAURA\",\"entidad\":\"COMPARTAMOS FINANCIERA S.A.\",\"saldo\":2232}]", value = "")
  public List<DetalleAvalistas> getDetallesAvalistas() {
    return detallesAvalistas;
  }
  public void setDetallesAvalistas(List<DetalleAvalistas> detallesAvalistas) {
    this.detallesAvalistas = detallesAvalistas;
  }
  public DetalleCreditosAvalistasAvalados detallesAvalados(List<DetalleAvalados> detallesAvalados) {
    this.detallesAvalados = detallesAvalados;
    return this;
  }
  public DetalleCreditosAvalistasAvalados addDetallesAvaladosItem(DetalleAvalados detallesAvaladosItem) {
    if (this.detallesAvalados == null) {
      this.detallesAvalados = new ArrayList<DetalleAvalados>();
    }
    this.detallesAvalados.add(detallesAvaladosItem);
    return this;
  }
   
  @ApiModelProperty(example = "[{\"periodo\":\"201912\",\"idCalificacion\":\"0\",\"idTipoDocumento\":\"1\",\"documento\":\"00663814\",\"nombre\":\"ANSELMA SIMONA CATACORA MAYTA\",\"entidad\":\"COMPARTAMOS FINANCIERA S.A.\",\"saldo\":1232},{\"periodo\":\"201912\",\"idCalificacion\":\"0\",\"idTipoDocumento\":\"1\",\"documento\":\"80184231\",\"nombre\":\"CLARA  SAHUA LAURA\",\"entidad\":\"COMPARTAMOS FINANCIERA S.A.\",\"saldo\":3232}]", value = "")
  public List<DetalleAvalados> getDetallesAvalados() {
    return detallesAvalados;
  }
  public void setDetallesAvalados(List<DetalleAvalados> detallesAvalados) {
    this.detallesAvalados = detallesAvalados;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetalleCreditosAvalistasAvalados detalleCreditosAvalistasAvalados = (DetalleCreditosAvalistasAvalados) o;
    return Objects.equals(this.detallesAvalistas, detalleCreditosAvalistasAvalados.detallesAvalistas) &&
        Objects.equals(this.detallesAvalados, detalleCreditosAvalistasAvalados.detallesAvalados);
  }
  @Override
  public int hashCode() {
    return Objects.hash(detallesAvalistas, detallesAvalados);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalleCreditosAvalistasAvalados {\n");
    
    sb.append("    detallesAvalistas: ").append(toIndentedString(detallesAvalistas)).append("\n");
    sb.append("    detallesAvalados: ").append(toIndentedString(detallesAvalados)).append("\n");
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
