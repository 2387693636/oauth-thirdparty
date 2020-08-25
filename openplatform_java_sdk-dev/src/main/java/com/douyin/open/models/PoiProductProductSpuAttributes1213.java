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
import com.douyin.open.models.PoiProductProductSpuAttributes1213CancelAmend;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * 退改政策
 */
@Schema(description = "退改政策")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:54.684786+08:00[Asia/Shanghai]")
public class PoiProductProductSpuAttributes1213 {
  @JsonProperty("cancel_amend")
  private PoiProductProductSpuAttributes1213CancelAmend cancelAmend = null;

  @JsonProperty("extra")
  private String extra = null;

  public PoiProductProductSpuAttributes1213 cancelAmend(PoiProductProductSpuAttributes1213CancelAmend cancelAmend) {
    this.cancelAmend = cancelAmend;
    return this;
  }

   /**
   * Get cancelAmend
   * @return cancelAmend
  **/
  @Schema(required = true, description = "")
  public PoiProductProductSpuAttributes1213CancelAmend getCancelAmend() {
    return cancelAmend;
  }

  public void setCancelAmend(PoiProductProductSpuAttributes1213CancelAmend cancelAmend) {
    this.cancelAmend = cancelAmend;
  }

  public PoiProductProductSpuAttributes1213 extra(String extra) {
    this.extra = extra;
    return this;
  }

   /**
   * 退改政策自定义内容
   * @return extra
  **/
  @Schema(description = "退改政策自定义内容")
  public String getExtra() {
    return extra;
  }

  public void setExtra(String extra) {
    this.extra = extra;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiProductProductSpuAttributes1213 spuAttributes1213 = (PoiProductProductSpuAttributes1213) o;
    return Objects.equals(this.cancelAmend, spuAttributes1213.cancelAmend) &&
        Objects.equals(this.extra, spuAttributes1213.extra);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cancelAmend, extra);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiProductProductSpuAttributes1213 {\n");
    
    sb.append("    cancelAmend: ").append(toIndentedString(cancelAmend)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
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