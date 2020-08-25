/*
 * 
 * 通过抖音视频id批量获取已分享视频数据信息
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
import com.douyin.open.models.InternalVideoDataInternalVideoDataExtraBody;
import com.douyin.open.models.InternalVideoDataInternalVideoDataInlineResponse200Data;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * InternalVideoDataInternalVideoDataInlineResponse200
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:09:34.019319+08:00[Asia/Shanghai]")
public class InternalVideoDataInternalVideoDataInlineResponse200 {
  @JsonProperty("extra")
  private InternalVideoDataInternalVideoDataExtraBody extra = null;

  @JsonProperty("data")
  private InternalVideoDataInternalVideoDataInlineResponse200Data data = null;

  public InternalVideoDataInternalVideoDataInlineResponse200 extra(InternalVideoDataInternalVideoDataExtraBody extra) {
    this.extra = extra;
    return this;
  }

   /**
   * Get extra
   * @return extra
  **/
  @Schema(description = "")
  public InternalVideoDataInternalVideoDataExtraBody getExtra() {
    return extra;
  }

  public void setExtra(InternalVideoDataInternalVideoDataExtraBody extra) {
    this.extra = extra;
  }

  public InternalVideoDataInternalVideoDataInlineResponse200 data(InternalVideoDataInternalVideoDataInlineResponse200Data data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @Schema(description = "")
  public InternalVideoDataInternalVideoDataInlineResponse200Data getData() {
    return data;
  }

  public void setData(InternalVideoDataInternalVideoDataInlineResponse200Data data) {
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
    InternalVideoDataInternalVideoDataInlineResponse200 inlineResponse200 = (InternalVideoDataInternalVideoDataInlineResponse200) o;
    return Objects.equals(this.extra, inlineResponse200.extra) &&
        Objects.equals(this.data, inlineResponse200.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extra, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InternalVideoDataInternalVideoDataInlineResponse200 {\n");
    
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
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
