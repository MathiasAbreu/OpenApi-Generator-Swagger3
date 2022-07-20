package br.com.ufcg.demo.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Modelo de ProfessorDTO da aplicação.
 */

@Schema(name = "ProfessorDTO", description = "Modelo de ProfessorDTO da aplicação.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-20T09:56:59.482560800-03:00[America/Sao_Paulo]")
public class ProfessorDTO {

  @JsonProperty("name")
  private String name;

  @JsonProperty("password")
  private String password;

  @JsonProperty("serviceTime")
  private Integer serviceTime;

  @JsonProperty("discipline")
  private JsonNullable<String> discipline = JsonNullable.undefined();

  public ProfessorDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nome do professor
   * @return name
  */
  @NotNull 
  @Schema(name = "name", example = "Pedro", description = "Nome do professor", required = true)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProfessorDTO password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Senha
   * @return password
  */
  @NotNull @Size(min = 8, max = 16) 
  @Schema(name = "password", example = "1234Abcd", description = "Senha", required = true)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public ProfessorDTO serviceTime(Integer serviceTime) {
    this.serviceTime = serviceTime;
    return this;
  }

  /**
   * Get serviceTime
   * minimum: 0
   * maximum: 70
   * @return serviceTime
  */
  @Min(0) @Max(70) 
  @Schema(name = "serviceTime", example = "15", required = false)
  public Integer getServiceTime() {
    return serviceTime;
  }

  public void setServiceTime(Integer serviceTime) {
    this.serviceTime = serviceTime;
  }

  public ProfessorDTO discipline(String discipline) {
    this.discipline = JsonNullable.of(discipline);
    return this;
  }

  /**
   * Get discipline
   * @return discipline
  */
  
  @Schema(name = "discipline", example = "Lógica", required = false)
  public JsonNullable<String> getDiscipline() {
    return discipline;
  }

  public void setDiscipline(JsonNullable<String> discipline) {
    this.discipline = discipline;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProfessorDTO professorDTO = (ProfessorDTO) o;
    return Objects.equals(this.name, professorDTO.name) &&
        Objects.equals(this.password, professorDTO.password) &&
        Objects.equals(this.serviceTime, professorDTO.serviceTime) &&
        Objects.equals(this.discipline, professorDTO.discipline);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, password, serviceTime, discipline);
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
    sb.append("class ProfessorDTO {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    serviceTime: ").append(toIndentedString(serviceTime)).append("\n");
    sb.append("    discipline: ").append(toIndentedString(discipline)).append("\n");
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

