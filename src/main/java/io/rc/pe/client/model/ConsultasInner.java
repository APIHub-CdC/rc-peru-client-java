package io.rc.pe.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import io.rc.pe.client.model.ConsultaMes;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class ConsultasInner {
  @SerializedName("claveTipoEntidad")
  private String claveTipoEntidad = null;
  @SerializedName("entidad")
  private String entidad = null;
  @SerializedName("totalUltimos12Meses")
  private BigDecimal totalUltimos12Meses = null;
  @SerializedName("consultaMes")
  private List<ConsultaMes> consultaMes = null;
  public ConsultasInner claveTipoEntidad(String claveTipoEntidad) {
    this.claveTipoEntidad = claveTipoEntidad;
    return this;
  }
   
  @ApiModelProperty(value = "Clave del giro de la entidad que realizo la consulta. <table><thead><tr><th>Clave Tipo Entidad</th><th>Tipo Entidad</th></tr></thead><tbody><tr><td>1</td><td>COMERCIAL - COMERCIAL</td></tr><tr><td>2</td><td>COMERCIAL - ADMINISTRADORA DE COBRANZA</td></tr><tr><td>3</td><td>COMERCIAL - COOPERATIVA</td></tr><tr><td>4</td><td>COMERCIAL - CRÉDITO</td></tr><tr><td>5</td><td>COMERCIAL - VENTA DIRECTA</td></tr><tr><td>6</td><td>COMERCIAL - NO GUBERNAMENTAL</td></tr><tr><td>7</td><td>COMERCIAL - SERVICIOS</td></tr><tr><td>8</td><td>COMERCIAL - TELECOMUNICACIONES</td></tr><tr><td>9</td><td>MICROCRÉDITO - BANCO</td></tr><tr><td>10</td><td>MICROCRÉDITO - COOPERATIVA</td></tr><tr><td>11</td><td>MICROCRÉDITO - NO GUBERNAMENTAL</td></tr><tr><td>12</td><td>MICROCRÉDITO - OTRO</td></tr><tr><td>13</td><td>RCC - BANCO</td></tr><tr><td>14</td><td>RCC - COOPERATIVAS</td></tr><tr><td>15</td><td>RCC - PYME</td></tr><tr><td>16</td><td>RCC - FINANCIERA</td></tr><tr><td>17</td><td>RCC - ADMINISTRADORA DE HIPOTECA</td></tr><tr><td>18</td><td>RCC - RETAIL</td></tr><tr><td>19</td><td>RCC - BANCO GUBERNAMENTAL DE AHORRO</td></tr><tr><td>20</td><td>RCC - BANCO RURAL DE AHORRO</td></tr><tr><td>21</td><td>Administradora de carteras</td></tr><tr><td>22</td><td>Almacenas de depósito</td></tr><tr><td>23</td><td>Arrendadoras financieras</td></tr><tr><td>24</td><td>Arrendadoras no financieras</td></tr><tr><td>25</td><td>Atención al consumidor</td></tr><tr><td>26</td><td>Automotriz</td></tr><tr><td>27</td><td>Autoridades</td></tr><tr><td>28</td><td>Bancos</td></tr><tr><td>29</td><td>Bienes raices</td></tr><tr><td>30</td><td>Cajas de ahorro</td></tr><tr><td>31</td><td>Camaras y asociaciones</td></tr><tr><td>32</td><td>Casa de bolsa</td></tr><tr><td>33</td><td>Casa de cambio</td></tr><tr><td>34</td><td>Círculo de Crédito</td></tr><tr><td>35</td><td>Companía de financiamiento automotríz</td></tr><tr><td>36</td><td>Comunicaciones</td></tr><tr><td>37</td><td>Editorial</td></tr><tr><td>38</td><td>Factoraje</td></tr><tr><td>39</td><td>Fondos y fideicomisos</td></tr><tr><td>40</td><td>Gobierno</td></tr><tr><td>41</td><td>Hipotecario no bancario</td></tr><tr><td>42</td><td>Mercancía para hogar y oficina</td></tr><tr><td>43</td><td>Monitoreo de crédito</td></tr><tr><td>44</td><td>Salud y servicios médicos</td></tr><tr><td>45</td><td>Seguros y fianzas</td></tr><tr><td>46</td><td>Servicios</td></tr><tr><td>47</td><td>SOFOL Automotríz</td></tr><tr><td>48</td><td>SOFOL Hipotecaria</td></tr><tr><td>49</td><td>SOFOL Préstamo personal</td></tr><tr><td>50</td><td>Tienda de autoservicio</td></tr><tr><td>51</td><td>Tienda de ropa</td></tr><tr><td>52</td><td>Tienda departamental</td></tr><tr><td>53</td><td>Unión de crédito</td></tr><tr><td>54</td><td>Venta por correo/teléfono</td></tr><tr><td>55</td><td>Compañía de financiamiento de motocicletas</td></tr><tr><td>56</td><td>Prueba de consultas</td></tr><tr><td>57</td><td>Casa de empeño</td></tr><tr><td>58</td><td>Cooperativa de ahorro y crédito</td></tr><tr><td>59</td><td>Telefonía celular</td></tr><tr><td>60</td><td>Servicio de telefonía de paga</td></tr><tr><td>61</td><td>Autofinanciamiento</td></tr><tr><td>62</td><td>Telefonía local y de larga distancia</td></tr><tr><td>63</td><td>Microfinanciera</td></tr><tr><td>64</td><td>Sociedades financieras populares</td></tr><tr><td>65</td><td>SOFOL Empresarial</td></tr><tr><td>66</td><td>Venta por catálogo</td></tr><tr><td>67</td><td>Sociedad financiera de objeto multiple</td></tr><tr><td>68</td><td>SIC</td></tr><tr><td>69</td><td>COMERCIAL - RETAIL</td></tr><tr><td>70</td><td>COMERCIAL - SERVICIOS PÚBLICOS</td></tr><tr><td>71</td><td>COMERCIAL - ORGANISMOS ESTATALES</td></tr><tr><td>72</td><td>COMERCIAL - OTROS</td></tr><tr><td>73</td><td>RCC - EDPYME</td></tr><tr><td>74</td><td>RCC - CAJA MUNICIPAL</td></tr><tr><td>75</td><td>RCC - CAJA RURAL</td></tr><tr><td>76</td><td>RCC - LEASING</td></tr><tr><td>77</td><td>AFP - ADMINISTRADORAS DE FONDOS DE PENSIONES</td></tr></tbody></table>")
  public String getClaveTipoEntidad() {
    return claveTipoEntidad;
  }
  public void setClaveTipoEntidad(String claveTipoEntidad) {
    this.claveTipoEntidad = claveTipoEntidad;
  }
  public ConsultasInner entidad(String entidad) {
    this.entidad = entidad;
    return this;
  }
   
  @ApiModelProperty(value = "Nombre comercial de la entidad financiera.")
  public String getEntidad() {
    return entidad;
  }
  public void setEntidad(String entidad) {
    this.entidad = entidad;
  }
  public ConsultasInner totalUltimos12Meses(BigDecimal totalUltimos12Meses) {
    this.totalUltimos12Meses = totalUltimos12Meses;
    return this;
  }
   
  @ApiModelProperty(value = "Muestra cuántas consultas se hicieron en los últimos doce meses.")
  public BigDecimal getTotalUltimos12Meses() {
    return totalUltimos12Meses;
  }
  public void setTotalUltimos12Meses(BigDecimal totalUltimos12Meses) {
    this.totalUltimos12Meses = totalUltimos12Meses;
  }
  public ConsultasInner consultaMes(List<ConsultaMes> consultaMes) {
    this.consultaMes = consultaMes;
    return this;
  }
  public ConsultasInner addConsultaMesItem(ConsultaMes consultaMesItem) {
    if (this.consultaMes == null) {
      this.consultaMes = new ArrayList<ConsultaMes>();
    }
    this.consultaMes.add(consultaMesItem);
    return this;
  }
   
  @ApiModelProperty(value = "Se mostrará la cantidad de consultas realizadas por periodos (Últimos 6 meses).")
  public List<ConsultaMes> getConsultaMes() {
    return consultaMes;
  }
  public void setConsultaMes(List<ConsultaMes> consultaMes) {
    this.consultaMes = consultaMes;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultasInner consultasInner = (ConsultasInner) o;
    return Objects.equals(this.claveTipoEntidad, consultasInner.claveTipoEntidad) &&
        Objects.equals(this.entidad, consultasInner.entidad) &&
        Objects.equals(this.totalUltimos12Meses, consultasInner.totalUltimos12Meses) &&
        Objects.equals(this.consultaMes, consultasInner.consultaMes);
  }
  @Override
  public int hashCode() {
    return Objects.hash(claveTipoEntidad, entidad, totalUltimos12Meses, consultaMes);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultasInner {\n");
    
    sb.append("    claveTipoEntidad: ").append(toIndentedString(claveTipoEntidad)).append("\n");
    sb.append("    entidad: ").append(toIndentedString(entidad)).append("\n");
    sb.append("    totalUltimos12Meses: ").append(toIndentedString(totalUltimos12Meses)).append("\n");
    sb.append("    consultaMes: ").append(toIndentedString(consultaMes)).append("\n");
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
