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
 * 早餐政策
 */
@Schema(description = "早餐政策")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:47.759385+08:00[Asia/Shanghai]")
public class PoiSupplierSupplierSupplierAttributes1104Breakfast {
  /**
   * 早餐类型。0 - 无早餐, 1 - 早餐, 2 - 自助早餐
   */
  public enum TypeEnum {
    NUMBER_0(0),
    NUMBER_1(1),
    NUMBER_2(2);

    private Integer value;

    TypeEnum(Integer value) {
      this.value = value;
    }
    @JsonValue
    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("price")
  private Integer price = null;

  public PoiSupplierSupplierSupplierAttributes1104Breakfast type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * 早餐类型。0 - 无早餐, 1 - 早餐, 2 - 自助早餐
   * @return type
  **/
  @Schema(description = "早餐类型。0 - 无早餐, 1 - 早餐, 2 - 自助早餐")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public PoiSupplierSupplierSupplierAttributes1104Breakfast price(Integer price) {
    this.price = price;
    return this;
  }

   /**
   * 早餐价格(单位人民币分)
   * @return price
  **/
  @Schema(example = "10000", description = "早餐价格(单位人民币分)")
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
    PoiSupplierSupplierSupplierAttributes1104Breakfast supplierAttributes1104Breakfast = (PoiSupplierSupplierSupplierAttributes1104Breakfast) o;
    return Objects.equals(this.type, supplierAttributes1104Breakfast.type) &&
        Objects.equals(this.price, supplierAttributes1104Breakfast.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, price);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiSupplierSupplierSupplierAttributes1104Breakfast {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
