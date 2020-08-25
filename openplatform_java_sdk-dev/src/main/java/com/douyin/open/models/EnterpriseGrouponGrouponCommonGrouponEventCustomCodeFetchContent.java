/*
 * 团购活动事件回调
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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * EnterpriseGrouponGrouponCommonGrouponEventCustomCodeFetchContent
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:13.558916+08:00[Asia/Shanghai]")
public class EnterpriseGrouponGrouponCommonGrouponEventCustomCodeFetchContent {
  @JsonProperty("groupon_id")
  private String grouponId = null;

  @JsonProperty("quantity")
  private Integer quantity = null;

  @JsonProperty("fetch_seq")
  private String fetchSeq = null;

  public EnterpriseGrouponGrouponCommonGrouponEventCustomCodeFetchContent grouponId(String grouponId) {
    this.grouponId = grouponId;
    return this;
  }

   /**
   * 团购活动的ID
   * @return grouponId
  **/
  @Schema(description = "团购活动的ID")
  public String getGrouponId() {
    return grouponId;
  }

  public void setGrouponId(String grouponId) {
    this.grouponId = grouponId;
  }

  public EnterpriseGrouponGrouponCommonGrouponEventCustomCodeFetchContent quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * 需要的券码数量
   * @return quantity
  **/
  @Schema(description = "需要的券码数量")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public EnterpriseGrouponGrouponCommonGrouponEventCustomCodeFetchContent fetchSeq(String fetchSeq) {
    this.fetchSeq = fetchSeq;
    return this;
  }

   /**
   * 同个sequence 结果幂等
   * @return fetchSeq
  **/
  @Schema(description = "同个sequence 结果幂等")
  public String getFetchSeq() {
    return fetchSeq;
  }

  public void setFetchSeq(String fetchSeq) {
    this.fetchSeq = fetchSeq;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseGrouponGrouponCommonGrouponEventCustomCodeFetchContent customCodeFetchContent = (EnterpriseGrouponGrouponCommonGrouponEventCustomCodeFetchContent) o;
    return Objects.equals(this.grouponId, customCodeFetchContent.grouponId) &&
        Objects.equals(this.quantity, customCodeFetchContent.quantity) &&
        Objects.equals(this.fetchSeq, customCodeFetchContent.fetchSeq);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grouponId, quantity, fetchSeq);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseGrouponGrouponCommonGrouponEventCustomCodeFetchContent {\n");
    
    sb.append("    grouponId: ").append(toIndentedString(grouponId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    fetchSeq: ").append(toIndentedString(fetchSeq)).append("\n");
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