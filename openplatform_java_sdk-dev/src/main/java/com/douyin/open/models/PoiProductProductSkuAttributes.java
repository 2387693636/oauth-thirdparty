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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * SKU属性字段
 */
@Schema(description = "SKU属性字段")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:54.684786+08:00[Asia/Shanghai]")
public class PoiProductProductSkuAttributes {
  @JsonProperty("1301")
  private String _1301 = null;

  public PoiProductProductSkuAttributes _1301(String _1301) {
    this._1301 = _1301;
    return this;
  }

   /**
   * 酒店、名宿SKU日期
   * @return _1301
  **/
  @Schema(example = "20191001", description = "酒店、名宿SKU日期")
  public String get1301() {
    return _1301;
  }

  public void set1301(String _1301) {
    this._1301 = _1301;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiProductProductSkuAttributes skuAttributes = (PoiProductProductSkuAttributes) o;
    return Objects.equals(this._1301, skuAttributes._1301);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_1301);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiProductProductSkuAttributes {\n");
    
    sb.append("    _1301: ").append(toIndentedString(_1301)).append("\n");
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
