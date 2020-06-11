package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.rc.pe.client.model.DetalleCreditosAvalistasAvalados;
import io.rc.pe.client.model.DetalleCreditosMFNZ;
import io.rc.pe.client.model.DetalleCreditosRCC;
import java.util.ArrayList;
import java.util.List;

@ApiModel(description = "Esta sección muestra el detalle de los créditos de la RCC y Microfinanzas no reguladas.")
public class DetalleCreditos {
  @SerializedName("detalleCreditosRCC")
  private List<DetalleCreditosRCC> detalleCreditosRCC = null;
  @SerializedName("detalleCreditosMFNZ")
  private List<DetalleCreditosMFNZ> detalleCreditosMFNZ = null;
  @SerializedName("avalistasAvalados")
  private DetalleCreditosAvalistasAvalados avalistasAvalados = null;
  public DetalleCreditos detalleCreditosRCC(List<DetalleCreditosRCC> detalleCreditosRCC) {
    this.detalleCreditosRCC = detalleCreditosRCC;
    return this;
  }
  public DetalleCreditos addDetalleCreditosRCCItem(DetalleCreditosRCC detalleCreditosRCCItem) {
    if (this.detalleCreditosRCC == null) {
      this.detalleCreditosRCC = new ArrayList<DetalleCreditosRCC>();
    }
    this.detalleCreditosRCC.add(detalleCreditosRCCItem);
    return this;
  }
   
  @ApiModelProperty(example = "[{\"claveMes\":\"201912\",\"numeroEntidades\":3,\"idPeorCalificacion\":\"4\",\"porcentajeCalificacion\":92,\"deudaVigente\":12399.41,\"deudaVencida\":17299.43,\"deudaJudicial\":0,\"deudaRR\":0,\"deudaIndirecta\":0,\"castigos\":0,\"provisiones\":27466.84,\"entidades\":[{\"nombreEntidad\":\"COMPARTAMOS FINANCIERA S.A.\",\"idCalificacion\":\"0\",\"porcentajeCalificacion\":8,\"detalleVigente\":2232,\"detalleVencida\":0,\"detalleJudicial\":0,\"detalleRR\":0,\"detalleIndirecta\":0,\"detalleCastigos\":0,\"detalleProvisiones\":0},{\"nombreEntidad\":\"CAJA MUNICIPAL DE AHORRO Y CREDITO DE AREQUIPA\",\"idCalificacion\":\"4\",\"porcentajeCalificacion\":92,\"detalleVigente\":0,\"detalleVencida\":17299.43,\"detalleJudicial\":0,\"detalleRR\":0,\"detalleIndirecta\":0,\"detalleCastigos\":0,\"detalleProvisiones\":17299.43}]},{\"claveMes\":\"201911\",\"numeroEntidades\":3,\"idPeorCalificacion\":\"4\",\"porcentajeCalificacion\":60,\"vigente\":11613.35,\"vencida\":17299.43,\"judicial\":0,\"refReest\":0,\"indirecta\":0,\"castigos\":0,\"provisiones\":19948.11,\"entidades\":[{\"nombreEntidad\":\"COMPARTAMOS FINANCIERA S.A.\",\"idCalificacion\":\"0\",\"porcentajeCalificacion\":4,\"detalleVigente\":1018.62,\"detalleVencida\":0,\"detalleJudicial\":0,\"detalleRR\":0,\"detalleIndirecta\":0,\"detalleCastigos\":0,\"detalleProvisiones\":0},{\"nombreEntidad\":\"CAJA MUNICIPAL DE AHORRO Y CREDITO HUANCAYO\",\"idCalificacion\":\"DEF\",\"porcentajeCalificacion\":37,\"detalleVigente\":10594.73,\"detalleVencida\":0,\"detalleJudicial\":0,\"detalleRR\":0,\"detalleIndirecta\":0,\"detalleCastigos\":0,\"detalleProvisiones\":2648.68}]}]", value = "Muestra el detalle de todos los créditos correspondientes a la RCC incluyendo la calificación.")
  public List<DetalleCreditosRCC> getDetalleCreditosRCC() {
    return detalleCreditosRCC;
  }
  public void setDetalleCreditosRCC(List<DetalleCreditosRCC> detalleCreditosRCC) {
    this.detalleCreditosRCC = detalleCreditosRCC;
  }
  public DetalleCreditos detalleCreditosMFNZ(List<DetalleCreditosMFNZ> detalleCreditosMFNZ) {
    this.detalleCreditosMFNZ = detalleCreditosMFNZ;
    return this;
  }
  public DetalleCreditos addDetalleCreditosMFNZItem(DetalleCreditosMFNZ detalleCreditosMFNZItem) {
    if (this.detalleCreditosMFNZ == null) {
      this.detalleCreditosMFNZ = new ArrayList<DetalleCreditosMFNZ>();
    }
    this.detalleCreditosMFNZ.add(detalleCreditosMFNZItem);
    return this;
  }
   
  @ApiModelProperty(example = "[{\"periodo\":\"202001\",\"entidades\":1,\"idPeorCalificacion\":\"0\",\"porcentaje\":100,\"vigente\":0,\"vencidaMenor30\":2959.02,\"vencidaMayor30\":0,\"judicial\":0,\"refinanciada\":0,\"indirecta\":0,\"castigos\":0,\"detalleEntidades\":[{\"nombreEntidad\":\"PRESTAMOS CRECEFACIL\",\"idCalificacionEntidad\":\"0\",\"porcentajeCalificacion\":100,\"detalleVigente\":0,\"detalleVencidaMenor30\":2959.02,\"detalleVencidaMayor30\":0,\"detalleJudicial\":0,\"detalleRefinanciada\":0,\"detalleIndirecta\":0,\"detalleCastigo\":0}]},{\"periodo\":\"201911\",\"entidades\":2,\"idPeorCalificacion\":\"4\",\"porcentaje\":16,\"vigente\":0,\"vencidaMenor30\":0,\"vencidaMayor30\":5575.67,\"judicial\":0,\"refinanciada\":0,\"indirecta\":0,\"castigos\":0,\"detalleEntidades\":[{\"nombreEntidad\":\"PRESTAMOS CRECEFACIL\",\"idCalificacionEntidad\":\"3\",\"porcentajeCalificacion\":84,\"detalleVigente\":0,\"detalleVencidaMenor30\":0,\"detalleVencidaMayor30\":4709.78,\"detalleJudicial\":0,\"detalleRefinanciada\":0,\"detalleIndirecta\":0,\"detalleCastigo\":0},{\"nombreEntidad\":\"COOPAC CAJA SOLIDARIA\",\"idCalificacionEntidad\":\"4\",\"porcentajeCalificacion\":16,\"detalleVigente\":0,\"detalleVencidaMenor30\":0,\"detalleVencidaMayor30\":865.89,\"detalleJudicial\":0,\"detalleRefinanciada\":0,\"detalleIndirecta\":0,\"detalleCastigo\":0}]}]", value = "Muestra el detalle de los créditos de Microfinanzas no supervisadas.")
  public List<DetalleCreditosMFNZ> getDetalleCreditosMFNZ() {
    return detalleCreditosMFNZ;
  }
  public void setDetalleCreditosMFNZ(List<DetalleCreditosMFNZ> detalleCreditosMFNZ) {
    this.detalleCreditosMFNZ = detalleCreditosMFNZ;
  }
  public DetalleCreditos avalistasAvalados(DetalleCreditosAvalistasAvalados avalistasAvalados) {
    this.avalistasAvalados = avalistasAvalados;
    return this;
  }
   
  @ApiModelProperty(value = "")
  public DetalleCreditosAvalistasAvalados getAvalistasAvalados() {
    return avalistasAvalados;
  }
  public void setAvalistasAvalados(DetalleCreditosAvalistasAvalados avalistasAvalados) {
    this.avalistasAvalados = avalistasAvalados;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetalleCreditos detalleCreditos = (DetalleCreditos) o;
    return Objects.equals(this.detalleCreditosRCC, detalleCreditos.detalleCreditosRCC) &&
        Objects.equals(this.detalleCreditosMFNZ, detalleCreditos.detalleCreditosMFNZ) &&
        Objects.equals(this.avalistasAvalados, detalleCreditos.avalistasAvalados);
  }
  @Override
  public int hashCode() {
    return Objects.hash(detalleCreditosRCC, detalleCreditosMFNZ, avalistasAvalados);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalleCreditos {\n");
    
    sb.append("    detalleCreditosRCC: ").append(toIndentedString(detalleCreditosRCC)).append("\n");
    sb.append("    detalleCreditosMFNZ: ").append(toIndentedString(detalleCreditosMFNZ)).append("\n");
    sb.append("    avalistasAvalados: ").append(toIndentedString(avalistasAvalados)).append("\n");
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
