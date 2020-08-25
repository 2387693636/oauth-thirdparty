/*
 * 客服列表
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.douyin.open.models;

import java.util.Objects;
import java.util.Arrays;
import com.douyin.open.models.EnterprisePersonaPersonaListPersona;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * EnterprisePersonaPersonaListInlineResponse200Data
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:07:06.483326+08:00[Asia/Shanghai]")
public class EnterprisePersonaPersonaListInlineResponse200Data {
  @JsonProperty("error_code")
  private Integer errorCode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("cursor")
  private Integer cursor = null;

  @JsonProperty("has_more")
  private Boolean hasMore = null;

  @JsonProperty("personas")
  private List<EnterprisePersonaPersonaListPersona> personas = null;

  public EnterprisePersonaPersonaListInlineResponse200Data errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @Schema(required = true, description = "")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public EnterprisePersonaPersonaListInlineResponse200Data description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(required = true, description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public EnterprisePersonaPersonaListInlineResponse200Data cursor(Integer cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * Get cursor
   * @return cursor
  **/
  @Schema(required = true, description = "")
  public Integer getCursor() {
    return cursor;
  }

  public void setCursor(Integer cursor) {
    this.cursor = cursor;
  }

  public EnterprisePersonaPersonaListInlineResponse200Data hasMore(Boolean hasMore) {
    this.hasMore = hasMore;
    return this;
  }

   /**
   * Get hasMore
   * @return hasMore
  **/
  @Schema(required = true, description = "")
  public Boolean getHasMore() {
    return hasMore;
  }

  public void setHasMore(Boolean hasMore) {
    this.hasMore = hasMore;
  }

  public EnterprisePersonaPersonaListInlineResponse200Data personas(List<EnterprisePersonaPersonaListPersona> personas) {
    this.personas = personas;
    return this;
  }

  public EnterprisePersonaPersonaListInlineResponse200Data addPersonasItem(EnterprisePersonaPersonaListPersona personasItem) {
    if (this.personas == null) {
      this.personas = new ArrayList<>();
    }
    this.personas.add(personasItem);
    return this;
  }

   /**
   * Get personas
   * @return personas
  **/
  @Schema(description = "")
  public List<EnterprisePersonaPersonaListPersona> getPersonas() {
    return personas;
  }

  public void setPersonas(List<EnterprisePersonaPersonaListPersona> personas) {
    this.personas = personas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterprisePersonaPersonaListInlineResponse200Data inlineResponse200Data = (EnterprisePersonaPersonaListInlineResponse200Data) o;
    return Objects.equals(this.errorCode, inlineResponse200Data.errorCode) &&
        Objects.equals(this.description, inlineResponse200Data.description) &&
        Objects.equals(this.cursor, inlineResponse200Data.cursor) &&
        Objects.equals(this.hasMore, inlineResponse200Data.hasMore) &&
        Objects.equals(this.personas, inlineResponse200Data.personas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, cursor, hasMore, personas);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterprisePersonaPersonaListInlineResponse200Data {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    hasMore: ").append(toIndentedString(hasMore)).append("\n");
    sb.append("    personas: ").append(toIndentedString(personas)).append("\n");
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
