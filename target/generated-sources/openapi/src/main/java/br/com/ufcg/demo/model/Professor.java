package br.com.ufcg.demo.model;

import java.net.URI;
import java.util.Objects;
import br.com.ufcg.demo.model.Link;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Modelo Professor da aplicação.
 */

@Schema(name = "Professor", description = "Modelo Professor da aplicação.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-20T09:56:59.482560800-03:00[America/Sao_Paulo]")
public class Professor {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("password")
  private String password;

  @JsonProperty("discipline")
  private JsonNullable<String> discipline = JsonNullable.undefined();

  @JsonProperty("links")
  @Valid
  private List<Link> links = null;

  public Professor id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Gerado automaticamente
   * @return id
  */
  
  @Schema(name = "id", accessMode = Schema.AccessMode.READ_ONLY, example = "1", description = "Gerado automaticamente", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Professor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nome do Professor
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "Francisco", description = "Nome do Professor", required = true)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Professor password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Senha de acesso.
   * @return password
  */
  @NotNull @Size(min = 8, max = 16) 
  @Schema(name = "password", example = "1234Abcd", description = "Senha de acesso.", required = true)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Professor discipline(String discipline) {
    this.discipline = JsonNullable.of(discipline);
    return this;
  }

  /**
   * Get discipline
   * @return discipline
  */
  
  @Schema(name = "discipline", example = "Cálculo 1", required = false)
  public JsonNullable<String> getDiscipline() {
    return discipline;
  }

  public void setDiscipline(JsonNullable<String> discipline) {
    this.discipline = discipline;
  }

  public Professor links(List<Link> links) {
    this.links = links;
    return this;
  }

  public Professor addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
  */
  @Valid 
  @Schema(name = "links", required = false)
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Professor professor = (Professor) o;
    return Objects.equals(this.id, professor.id) &&
        Objects.equals(this.name, professor.name) &&
        Objects.equals(this.password, professor.password) &&
        Objects.equals(this.discipline, professor.discipline) &&
        Objects.equals(this.links, professor.links);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, password, discipline, links);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Professor {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    discipline: ").append(toIndentedString(discipline)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

