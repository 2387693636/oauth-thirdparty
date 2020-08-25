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
import java.util.ArrayList;
import java.util.List;
/**
 * 自定义券码获取的响应
 */
@Schema(description = "自定义券码获取的响应")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:13.558916+08:00[Asia/Shanghai]")
public class EnterpriseGrouponGrouponCommonGrouponEventCustomCodeFetchResponse {
  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("codes")
  private List<String> codes = null;

  public EnterpriseGrouponGrouponCommonGrouponEventCustomCodeFetchResponse status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * * 拉取的状态   * 1: 成功 
   * @return status
  **/
  @Schema(description = "* 拉取的状态   * 1: 成功 ")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public EnterpriseGrouponGrouponCommonGrouponEventCustomCodeFetchResponse codes(List<String> codes) {
    this.codes = codes;
    return this;
  }

  public EnterpriseGrouponGrouponCommonGrouponEventCustomCodeFetchResponse addCodesItem(String codesItem) {
    if (this.codes == null) {
      this.codes = new ArrayList<>();
    }
    this.codes.add(codesItem);
    return this;
  }

   /**
   * 券码列表
   * @return codes
  **/
  @Schema(description = "券码列表")
  public List<String> getCodes() {
    return codes;
  }

  public void setCodes(List<String> codes) {
    this.codes = codes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseGrouponGrouponCommonGrouponEventCustomCodeFetchResponse customCodeFetchResponse = (EnterpriseGrouponGrouponCommonGrouponEventCustomCodeFetchResponse) o;
    return Objects.equals(this.status, customCodeFetchResponse.status) &&
        Objects.equals(this.codes, customCodeFetchResponse.codes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, codes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseGrouponGrouponCommonGrouponEventCustomCodeFetchResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    codes: ").append(toIndentedString(codes)).append("\n");
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
