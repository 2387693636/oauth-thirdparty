/*
 * 团购活动订单详情
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
import com.douyin.open.models.EnterpriseGrouponGrouponOrderOrderDetailOrderInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * EnterpriseGrouponGrouponOrderOrderDetailInlineResponse200Data
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:07:18.275640+08:00[Asia/Shanghai]")
public class EnterpriseGrouponGrouponOrderOrderDetailInlineResponse200Data {
  @JsonProperty("error_code")
  private Integer errorCode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("order_info")
  private EnterpriseGrouponGrouponOrderOrderDetailOrderInfo orderInfo = null;

  public EnterpriseGrouponGrouponOrderOrderDetailInlineResponse200Data errorCode(Integer errorCode) {
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

  public EnterpriseGrouponGrouponOrderOrderDetailInlineResponse200Data description(String description) {
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

  public EnterpriseGrouponGrouponOrderOrderDetailInlineResponse200Data orderInfo(EnterpriseGrouponGrouponOrderOrderDetailOrderInfo orderInfo) {
    this.orderInfo = orderInfo;
    return this;
  }

   /**
   * Get orderInfo
   * @return orderInfo
  **/
  @Schema(description = "")
  public EnterpriseGrouponGrouponOrderOrderDetailOrderInfo getOrderInfo() {
    return orderInfo;
  }

  public void setOrderInfo(EnterpriseGrouponGrouponOrderOrderDetailOrderInfo orderInfo) {
    this.orderInfo = orderInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseGrouponGrouponOrderOrderDetailInlineResponse200Data inlineResponse200Data = (EnterpriseGrouponGrouponOrderOrderDetailInlineResponse200Data) o;
    return Objects.equals(this.errorCode, inlineResponse200Data.errorCode) &&
        Objects.equals(this.description, inlineResponse200Data.description) &&
        Objects.equals(this.orderInfo, inlineResponse200Data.orderInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, orderInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseGrouponGrouponOrderOrderDetailInlineResponse200Data {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    orderInfo: ").append(toIndentedString(orderInfo)).append("\n");
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
