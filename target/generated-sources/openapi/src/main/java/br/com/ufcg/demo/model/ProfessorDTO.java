package br.com.ufcg.demo.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Modelo de ProfessorDTO da aplicação.
 */
@ApiModel(description = "Modelo de ProfessorDTO da aplicação.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-13T09:51:29.574502700-03:00[America/Sao_Paulo]")
public class ProfessorDTO   {
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
  @ApiModelProperty(example = "Pedro", required = true, value = "Nome do professor")
  @NotNull


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
  @ApiModelProperty(example = "1234Abcd", required = true, value = "Senha")
  @NotNull

@Size(min=8,max=16) 
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
  @ApiModelProperty(example = "15", value = "")

@Min(0) @Max(70) 
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
  @ApiModelProperty(example = "Lógica", value = "")


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

  @Override
  public int hashCode() {
    return Objects.hash(name, password, serviceTime, discipline);
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

