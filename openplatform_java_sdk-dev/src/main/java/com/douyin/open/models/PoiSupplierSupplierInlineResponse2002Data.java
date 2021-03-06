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
import java.math.BigDecimal;
/**
 * PoiSupplierSupplierInlineResponse2002Data
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:47.759385+08:00[Asia/Shanghai]")
public class PoiSupplierSupplierInlineResponse2002Data {
  @JsonProperty("poi_id")
  private String poiId = null;

  @JsonProperty("poi_name")
  private String poiName = null;

  @JsonProperty("amap_id")
  private String amapId = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("latitude")
  private BigDecimal latitude = null;

  @JsonProperty("longitude")
  private BigDecimal longitude = null;

  @JsonProperty("error_code")
  private Integer errorCode = null;

  @JsonProperty("description")
  private String description = null;

  public PoiSupplierSupplierInlineResponse2002Data poiId(String poiId) {
    this.poiId = poiId;
    return this;
  }

   /**
   * 抖音POI ID
   * @return poiId
  **/
  @Schema(required = true, description = "抖音POI ID")
  public String getPoiId() {
    return poiId;
  }

  public void setPoiId(String poiId) {
    this.poiId = poiId;
  }

  public PoiSupplierSupplierInlineResponse2002Data poiName(String poiName) {
    this.poiName = poiName;
    return this;
  }

   /**
   * POI 名称
   * @return poiName
  **/
  @Schema(required = true, description = "POI 名称")
  public String getPoiName() {
    return poiName;
  }

  public void setPoiName(String poiName) {
    this.poiName = poiName;
  }

  public PoiSupplierSupplierInlineResponse2002Data amapId(String amapId) {
    this.amapId = amapId;
    return this;
  }

   /**
   * 高德POI ID
   * @return amapId
  **/
  @Schema(required = true, description = "高德POI ID")
  public String getAmapId() {
    return amapId;
  }

  public void setAmapId(String amapId) {
    this.amapId = amapId;
  }

  public PoiSupplierSupplierInlineResponse2002Data address(String address) {
    this.address = address;
    return this;
  }

   /**
   * POI地址
   * @return address
  **/
  @Schema(required = true, description = "POI地址")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public PoiSupplierSupplierInlineResponse2002Data city(String city) {
    this.city = city;
    return this;
  }

   /**
   * POI所在城市
   * @return city
  **/
  @Schema(required = true, description = "POI所在城市")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public PoiSupplierSupplierInlineResponse2002Data latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }

   /**
   * 纬度
   * @return latitude
  **/
  @Schema(required = true, description = "纬度")
  public BigDecimal getLatitude() {
    return latitude;
  }

  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  public PoiSupplierSupplierInlineResponse2002Data longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }

   /**
   * 经度
   * @return longitude
  **/
  @Schema(required = true, description = "经度")
  public BigDecimal getLongitude() {
    return longitude;
  }

  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  public PoiSupplierSupplierInlineResponse2002Data errorCode(Integer errorCode) {
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

  public PoiSupplierSupplierInlineResponse2002Data description(String description) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiSupplierSupplierInlineResponse2002Data inlineResponse2002Data = (PoiSupplierSupplierInlineResponse2002Data) o;
    return Objects.equals(this.poiId, inlineResponse2002Data.poiId) &&
        Objects.equals(this.poiName, inlineResponse2002Data.poiName) &&
        Objects.equals(this.amapId, inlineResponse2002Data.amapId) &&
        Objects.equals(this.address, inlineResponse2002Data.address) &&
        Objects.equals(this.city, inlineResponse2002Data.city) &&
        Objects.equals(this.latitude, inlineResponse2002Data.latitude) &&
        Objects.equals(this.longitude, inlineResponse2002Data.longitude) &&
        Objects.equals(this.errorCode, inlineResponse2002Data.errorCode) &&
        Objects.equals(this.description, inlineResponse2002Data.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(poiId, poiName, amapId, address, city, latitude, longitude, errorCode, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiSupplierSupplierInlineResponse2002Data {\n");
    
    sb.append("    poiId: ").append(toIndentedString(poiId)).append("\n");
    sb.append("    poiName: ").append(toIndentedString(poiName)).append("\n");
    sb.append("    amapId: ").append(toIndentedString(amapId)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
