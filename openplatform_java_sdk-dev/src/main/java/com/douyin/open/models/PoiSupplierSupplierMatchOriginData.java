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
 * PoiSupplierSupplierMatchOriginData
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:47.759385+08:00[Asia/Shanghai]")
public class PoiSupplierSupplierMatchOriginData {
  @JsonProperty("supplier_ext_id")
  private String supplierExtId = null;

  @JsonProperty("amap_id")
  private String amapId = null;

  @JsonProperty("poi_name")
  private String poiName = null;

  @JsonProperty("province")
  private String province = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("address")
  private String address = null;

  @JsonProperty("latitude")
  private BigDecimal latitude = null;

  @JsonProperty("longitude")
  private BigDecimal longitude = null;

  public PoiSupplierSupplierMatchOriginData supplierExtId(String supplierExtId) {
    this.supplierExtId = supplierExtId;
    return this;
  }

   /**
   * 第三方商户ID
   * @return supplierExtId
  **/
  @Schema(required = true, description = "第三方商户ID")
  public String getSupplierExtId() {
    return supplierExtId;
  }

  public void setSupplierExtId(String supplierExtId) {
    this.supplierExtId = supplierExtId;
  }

  public PoiSupplierSupplierMatchOriginData amapId(String amapId) {
    this.amapId = amapId;
    return this;
  }

   /**
   * 高德POI ID
   * @return amapId
  **/
  @Schema(description = "高德POI ID")
  public String getAmapId() {
    return amapId;
  }

  public void setAmapId(String amapId) {
    this.amapId = amapId;
  }

  public PoiSupplierSupplierMatchOriginData poiName(String poiName) {
    this.poiName = poiName;
    return this;
  }

   /**
   * POI名称
   * @return poiName
  **/
  @Schema(required = true, description = "POI名称")
  public String getPoiName() {
    return poiName;
  }

  public void setPoiName(String poiName) {
    this.poiName = poiName;
  }

  public PoiSupplierSupplierMatchOriginData province(String province) {
    this.province = province;
    return this;
  }

   /**
   * POI所在省份
   * @return province
  **/
  @Schema(required = true, description = "POI所在省份")
  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public PoiSupplierSupplierMatchOriginData city(String city) {
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

  public PoiSupplierSupplierMatchOriginData address(String address) {
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

  public PoiSupplierSupplierMatchOriginData latitude(BigDecimal latitude) {
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

  public PoiSupplierSupplierMatchOriginData longitude(BigDecimal longitude) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiSupplierSupplierMatchOriginData matchOriginData = (PoiSupplierSupplierMatchOriginData) o;
    return Objects.equals(this.supplierExtId, matchOriginData.supplierExtId) &&
        Objects.equals(this.amapId, matchOriginData.amapId) &&
        Objects.equals(this.poiName, matchOriginData.poiName) &&
        Objects.equals(this.province, matchOriginData.province) &&
        Objects.equals(this.city, matchOriginData.city) &&
        Objects.equals(this.address, matchOriginData.address) &&
        Objects.equals(this.latitude, matchOriginData.latitude) &&
        Objects.equals(this.longitude, matchOriginData.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supplierExtId, amapId, poiName, province, city, address, latitude, longitude);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiSupplierSupplierMatchOriginData {\n");
    
    sb.append("    supplierExtId: ").append(toIndentedString(supplierExtId)).append("\n");
    sb.append("    amapId: ").append(toIndentedString(amapId)).append("\n");
    sb.append("    poiName: ").append(toIndentedString(poiName)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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
