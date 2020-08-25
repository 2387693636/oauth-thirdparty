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
 * 外部商家信息
 */
@Schema(description = "外部商家信息")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:09:11.552543+08:00[Asia/Shanghai]")
public class PoiOrderSyncOrderSyncExtShopInfo {
  @JsonProperty("shop_id")
  private String shopId = null;

  @JsonProperty("ext_shop_id")
  private String extShopId = null;

  public PoiOrderSyncOrderSyncExtShopInfo shopId(String shopId) {
    this.shopId = shopId;
    return this;
  }

   /**
   * 抖音商户ID
   * @return shopId
  **/
  @Schema(example = "34543534", description = "抖音商户ID")
  public String getShopId() {
    return shopId;
  }

  public void setShopId(String shopId) {
    this.shopId = shopId;
  }

  public PoiOrderSyncOrderSyncExtShopInfo extShopId(String extShopId) {
    this.extShopId = extShopId;
    return this;
  }

   /**
   * 外部商户ID
   * @return extShopId
  **/
  @Schema(example = "543534", required = true, description = "外部商户ID")
  public String getExtShopId() {
    return extShopId;
  }

  public void setExtShopId(String extShopId) {
    this.extShopId = extShopId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiOrderSyncOrderSyncExtShopInfo extShopInfo = (PoiOrderSyncOrderSyncExtShopInfo) o;
    return Objects.equals(this.shopId, extShopInfo.shopId) &&
        Objects.equals(this.extShopId, extShopInfo.extShopId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopId, extShopId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiOrderSyncOrderSyncExtShopInfo {\n");
    
    sb.append("    shopId: ").append(toIndentedString(shopId)).append("\n");
    sb.append("    extShopId: ").append(toIndentedString(extShopId)).append("\n");
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
