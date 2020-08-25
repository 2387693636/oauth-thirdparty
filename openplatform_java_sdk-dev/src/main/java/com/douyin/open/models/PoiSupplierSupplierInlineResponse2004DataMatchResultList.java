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
import com.douyin.open.models.PoiSupplierSupplierMatchOriginData;
import com.douyin.open.models.PoiSupplierSupplierMatchResultData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * PoiSupplierSupplierInlineResponse2004DataMatchResultList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:47.759385+08:00[Asia/Shanghai]")
public class PoiSupplierSupplierInlineResponse2004DataMatchResultList {
  @JsonProperty("match_result")
  private PoiSupplierSupplierMatchResultData matchResult = null;

  @JsonProperty("last_match_data")
  private PoiSupplierSupplierMatchOriginData lastMatchData = null;

  public PoiSupplierSupplierInlineResponse2004DataMatchResultList matchResult(PoiSupplierSupplierMatchResultData matchResult) {
    this.matchResult = matchResult;
    return this;
  }

   /**
   * Get matchResult
   * @return matchResult
  **/
  @Schema(required = true, description = "")
  public PoiSupplierSupplierMatchResultData getMatchResult() {
    return matchResult;
  }

  public void setMatchResult(PoiSupplierSupplierMatchResultData matchResult) {
    this.matchResult = matchResult;
  }

  public PoiSupplierSupplierInlineResponse2004DataMatchResultList lastMatchData(PoiSupplierSupplierMatchOriginData lastMatchData) {
    this.lastMatchData = lastMatchData;
    return this;
  }

   /**
   * Get lastMatchData
   * @return lastMatchData
  **/
  @Schema(description = "")
  public PoiSupplierSupplierMatchOriginData getLastMatchData() {
    return lastMatchData;
  }

  public void setLastMatchData(PoiSupplierSupplierMatchOriginData lastMatchData) {
    this.lastMatchData = lastMatchData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiSupplierSupplierInlineResponse2004DataMatchResultList inlineResponse2004DataMatchResultList = (PoiSupplierSupplierInlineResponse2004DataMatchResultList) o;
    return Objects.equals(this.matchResult, inlineResponse2004DataMatchResultList.matchResult) &&
        Objects.equals(this.lastMatchData, inlineResponse2004DataMatchResultList.lastMatchData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchResult, lastMatchData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiSupplierSupplierInlineResponse2004DataMatchResultList {\n");
    
    sb.append("    matchResult: ").append(toIndentedString(matchResult)).append("\n");
    sb.append("    lastMatchData: ").append(toIndentedString(lastMatchData)).append("\n");
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