package io.swagger.model;

import java.util.List;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.hateoas.ResourceSupport;

/**
 * Evento
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-28T14:35:58.392Z")

public class Evento extends ResourceSupport {
  @JsonProperty("eventoId")
  private String eventoId = null;

  @JsonProperty("nombre")
  private String nombre = null;

  @JsonProperty("cliente")
  private String cliente = null;

  @JsonProperty("concierto")
  private List<Concierto> concierto = null;

  public Evento id(String id) {
    this.eventoId = id;
    return this;
  }

   /**
   * Get eventoId
   * @return eventoId
  **/
  @ApiModelProperty(example = "e123", required = true, value = "")
  public String getEventoId() {
    return eventoId;
  }

  public void setEventoId(String eventoId) {
    this.eventoId = eventoId;
  }

  public Evento nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

   /**
   * Get nombre
   * @return nombre
  **/
  @ApiModelProperty(example = "evento de feria", required = true, value = "")
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public Evento cliente(String cliente) {
    this.cliente = cliente;
    return this;
  }

   /**
   * Get cliente
   * @return cliente
  **/
  @ApiModelProperty(example = "Xproducciones", required = true, value = "")
  public String getCliente() {
    return cliente;
  }

  public void setCliente(String cliente) {
    this.cliente = cliente;
  }

  public Evento concierto(List<Concierto> concierto) {
    this.concierto = concierto;
    return this;
  }

   /**
   * Get concierto
   * @return concierto
  **/
  @ApiModelProperty(value = "")
  public List<Concierto> getConcierto() {
    return concierto;
  }

  public void setConcierto(List<Concierto> concierto) {
    this.concierto = concierto;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Evento evento = (Evento) o;
    return Objects.equals(this.eventoId, evento.eventoId) &&
        Objects.equals(this.nombre, evento.nombre) &&
        Objects.equals(this.cliente, evento.cliente) &&
        Objects.equals(this.concierto, evento.concierto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventoId, nombre, cliente, concierto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Evento {\n");
    
    sb.append("    eventoId: ").append(toIndentedString(eventoId)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    cliente: ").append(toIndentedString(cliente)).append("\n");
    sb.append("    concierto: ").append(toIndentedString(concierto)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

