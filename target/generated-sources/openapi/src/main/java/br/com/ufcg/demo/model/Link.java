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
 * Link
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-07-13T09:51:29.574502700-03:00[America/Sao_Paulo]")
public class Link   {
  @JsonProperty("rel")
  private String rel;

  @JsonProperty("href")
  private String href;

  @JsonProperty("hreflang")
  private String hreflang;

  @JsonProperty("media")
  private String media;

  @JsonProperty("title")
  private String title;

  @JsonProperty("type")
  private String type;

  @JsonProperty("deprecation")
  private String deprecation;

  @JsonProperty("profile")
  private String profile;

  @JsonProperty("name")
  private String name;

  public Link rel(String rel) {
    this.rel = rel;
    return this;
  }

  /**
   * Get rel
   * @return rel
  */
  @ApiModelProperty(value = "")


  public String getRel() {
    return rel;
  }

  public void setRel(String rel) {
    this.rel = rel;
  }

  public Link href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Get href
   * @return href
  */
  @ApiModelProperty(value = "")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Link hreflang(String hreflang) {
    this.hreflang = hreflang;
    return this;
  }

  /**
   * Get hreflang
   * @return hreflang
  */
  @ApiModelProperty(value = "")


  public String getHreflang() {
    return hreflang;
  }

  public void setHreflang(String hreflang) {
    this.hreflang = hreflang;
  }

  public Link media(String media) {
    this.media = media;
    return this;
  }

  /**
   * Get media
   * @return media
  */
  @ApiModelProperty(value = "")


  public String getMedia() {
    return media;
  }

  public void setMedia(String media) {
    this.media = media;
  }

  public Link title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @ApiModelProperty(value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Link type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Link deprecation(String deprecation) {
    this.deprecation = deprecation;
    return this;
  }

  /**
   * Get deprecation
   * @return deprecation
  */
  @ApiModelProperty(value = "")


  public String getDeprecation() {
    return deprecation;
  }

  public void setDeprecation(String deprecation) {
    this.deprecation = deprecation;
  }

  public Link profile(String profile) {
    this.profile = profile;
    return this;
  }

  /**
   * Get profile
   * @return profile
  */
  @ApiModelProperty(value = "")


  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

  public Link name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Link link = (Link) o;
    return Objects.equals(this.rel, link.rel) &&
        Objects.equals(this.href, link.href) &&
        Objects.equals(this.hreflang, link.hreflang) &&
        Objects.equals(this.media, link.media) &&
        Objects.equals(this.title, link.title) &&
        Objects.equals(this.type, link.type) &&
        Objects.equals(this.deprecation, link.deprecation) &&
        Objects.equals(this.profile, link.profile) &&
        Objects.equals(this.name, link.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rel, href, hreflang, media, title, type, deprecation, profile, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Link {\n");
    
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    hreflang: ").append(toIndentedString(hreflang)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    deprecation: ").append(toIndentedString(deprecation)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

