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
 * Modelo de Student da aplicação.
 */
@ApiModel(description = "Modelo de Student da aplicação.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-06T11:18:00.272393600-03:00[America/Sao_Paulo]")
public class Student   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("password")
  private String password;

  @JsonProperty("registration")
  private String registration;

  public Student id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Gerado automaticamente
   * @return id
  */
  @ApiModelProperty(example = "2", readOnly = true, value = "Gerado automaticamente")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Student name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nome do Student
   * @return name
  */
  @ApiModelProperty(example = "Josué", required = true, value = "Nome do Student")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Student password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Senha de acesso
   * @return password
  */
  @ApiModelProperty(required = true, value = "Senha de acesso")
  @NotNull

@Size(min=8,max=24) 
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Student registration(String registration) {
    this.registration = registration;
    return this;
  }

  /**
   * Matricula do Student
   * @return registration
  */
  @ApiModelProperty(example = "118111398", value = "Matricula do Student")

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
    Student student = (Student) o;
    return Objects.equals(this.id, student.id) &&
        Objects.equals(this.name, student.name) &&
        Objects.equals(this.password, student.password) &&
        Objects.equals(this.registration, student.registration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, password, registration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Student {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
