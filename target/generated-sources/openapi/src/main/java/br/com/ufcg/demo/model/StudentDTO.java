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
 * Modelo de StudentDTO da aplicação.
 */
@ApiModel(description = "Modelo de StudentDTO da aplicação.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-06T11:18:00.272393600-03:00[America/Sao_Paulo]")
public class StudentDTO   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("password")
  private String password;

  @JsonProperty("registration")
  private String registration;

  public StudentDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nome do Estudante
   * @return name
  */
  @ApiModelProperty(example = "José", required = true, value = "Nome do Estudante")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StudentDTO password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Senha de acesso
   * @return password
  */
  @ApiModelProperty(example = "78adRf99", required = true, value = "Senha de acesso")
  @NotNull

@Size(min=8,max=24) 
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public StudentDTO registration(String registration) {
    this.registration = registration;
    return this;
  }

  /**
   * Matrícula do Estudante
   * @return registration
  */
  @ApiModelProperty(example = "118111693", value = "Matrícula do Estudante")

@Size(max=9) 
  public String getRegistration() {
    return registration;
  }

  public void setRegistration(String registration) {
    this.registration = registration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentDTO studentDTO = (StudentDTO) o;
    return Objects.equals(this.name, studentDTO.name) &&
        Objects.equals(this.password, studentDTO.password) &&
        Objects.equals(this.registration, studentDTO.registration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, password, registration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    registration: ").append(toIndentedString(registration)).append("\n");
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

