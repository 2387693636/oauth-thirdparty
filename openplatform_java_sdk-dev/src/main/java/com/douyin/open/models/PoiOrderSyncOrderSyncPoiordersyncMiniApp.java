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
 * 小程序形式对接抖音时，该字段必传
 */
@Schema(description = "小程序形式对接抖音时，该字段必传")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:09:11.552543+08:00[Asia/Shanghai]")
public class PoiOrderSyncOrderSyncPoiordersyncMiniApp {
  @JsonProperty("app_id")
  private String appId = null;

  @JsonProperty("user_open_id")
  private String userOpenId = null;

  public PoiOrderSyncOrderSyncPoiordersyncMiniApp appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * 小程序的appid
   * @return appId
  **/
  @Schema(example = "tt34843ubcs", required = true, description = "小程序的appid")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public PoiOrderSyncOrderSyncPoiordersyncMiniApp userOpenId(String userOpenId) {
    this.userOpenId = userOpenId;
    return this;
  }

   /**
   * 用户的抖音小程序openid
   * @return userOpenId
  **/
  @Schema(example = "x0001", required = true, description = "用户的抖音小程序openid")
  public String getUserOpenId() {
    return userOpenId;
  }

  public void setUserOpenId(String userOpenId) {
    this.userOpenId = userOpenId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiOrderSyncOrderSyncPoiordersyncMiniApp poiordersyncMiniApp = (PoiOrderSyncOrderSyncPoiordersyncMiniApp) o;
    return Objects.equals(this.appId, poiordersyncMiniApp.appId) &&
        Objects.equals(this.userOpenId, poiordersyncMiniApp.userOpenId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, userOpenId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiOrderSyncOrderSyncPoiordersyncMiniApp {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    userOpenId: ").append(toIndentedString(userOpenId)).append("\n");
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
