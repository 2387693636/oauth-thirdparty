/*
 * 创建团购活动
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
 * EnterpriseGrouponGrouponGrouponSaveGrouponItemGrouponGoods
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:07.343758+08:00[Asia/Shanghai]")
public class EnterpriseGrouponGrouponGrouponSaveGrouponItemGrouponGoods {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("price")
  private Integer price = null;

  public EnterpriseGrouponGrouponGrouponSaveGrouponItemGrouponGoods name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 商品名称
   * @return name
  **/
  @Schema(required = true, description = "商品名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public EnterpriseGrouponGrouponGrouponSaveGrouponItemGrouponGoods price(Integer price) {
    this.price = price;
    return this;
  }

   /**
   * 商品金额(单位分)
   * minimum: 1
   * maximum: 999999
   * @return price
  **/
  @Schema(required = true, description = "商品金额(单位分)")
  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseGrouponGrouponGrouponSaveGrouponItemGrouponGoods grouponItemGrouponGoods = (EnterpriseGrouponGrouponGrouponSaveGrouponItemGrouponGoods) o;
    return Objects.equals(this.name, grouponItemGrouponGoods.name) &&
        Objects.equals(this.price, grouponItemGrouponGoods.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, price);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseGrouponGrouponGrouponSaveGrouponItemGrouponGoods {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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
