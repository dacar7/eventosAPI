package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.hateoas.ResourceSupport;

/**
 * Concierto
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2017-10-28T14:35:58.392Z")

public class Concierto extends ResourceSupport {
  @JsonProperty("idConcierto")
  private String idConcierto = null;

  @JsonProperty("nombre")
  private String nombre = null;

  public Concierto id(String id) {
    this.idConcierto = id;
    return this;
  }

   /**
   * Get idConcierto
   * @return idConcierto
  **/
  @ApiModelProperty(example = "c123", required = true, value = "")
  public String getConciertoId() {
    return idConcierto;
  }

  public void setIdConcierto(String idConcierto) {
    this.idConcierto = idConcierto;
  }

  public Concierto nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

   /**
   * Get nombre
   * @return nombre
  **/
  @ApiModelProperty(example = "concierto bruno mars", required = true, value = "")
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Concierto concierto = (Concierto) o;
    return Objects.equals(this.idConcierto, concierto.idConcierto) &&
        Objects.equals(this.nombre, concierto.nombre);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idConcierto, nombre);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Concierto {\n");
    
    sb.append("    idConcierto: ").append(toIndentedString(idConcierto)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
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

