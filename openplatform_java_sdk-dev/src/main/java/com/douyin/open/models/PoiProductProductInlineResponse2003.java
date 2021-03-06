/*
 * 
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
import com.douyin.open.models.PoiProductProductInlineResponse2003Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * PoiProductProductInlineResponse2003
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:54.684786+08:00[Asia/Shanghai]")
public class PoiProductProductInlineResponse2003 {
  @JsonProperty("error_code")
  private Integer errorCode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("data")
  private List<PoiProductProductInlineResponse2003Data> data = new ArrayList<>();

  public PoiProductProductInlineResponse2003 errorCode(Integer errorCode) {
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

  public PoiProductProductInlineResponse2003 description(String description) {
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

  public PoiProductProductInlineResponse2003 data(List<PoiProductProductInlineResponse2003Data> data) {
    this.data = data;
    return this;
  }

  public PoiProductProductInlineResponse2003 addDataItem(PoiProductProductInlineResponse2003Data dataItem) {
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(required = true, description = "")
  public List<PoiProductProductInlineResponse2003Data> getData() {
    return data;
  }

  public void setData(List<PoiProductProductInlineResponse2003Data> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiProductProductInlineResponse2003 inlineResponse2003 = (PoiProductProductInlineResponse2003) o;
    return Objects.equals(this.errorCode, inlineResponse2003.errorCode) &&
        Objects.equals(this.description, inlineResponse2003.description) &&
        Objects.equals(this.data, inlineResponse2003.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiProductProductInlineResponse2003 {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
