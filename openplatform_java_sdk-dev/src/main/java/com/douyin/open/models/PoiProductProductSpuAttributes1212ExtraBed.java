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
 * 加床政策
 */
@Schema(description = "加床政策")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:54.684786+08:00[Asia/Shanghai]")
public class PoiProductProductSpuAttributes1212ExtraBed {
  /**
   * 加床政策; 0 - 不支持加床; 1 - 支持加床
   */
  public enum TypeEnum {
    NUMBER_0(0),
    NUMBER_1(1);

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

  public PoiProductProductSpuAttributes1212ExtraBed type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * 加床政策; 0 - 不支持加床; 1 - 支持加床
   * @return type
  **/
  @Schema(required = true, description = "加床政策; 0 - 不支持加床; 1 - 支持加床")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public PoiProductProductSpuAttributes1212ExtraBed price(Integer price) {
    this.price = price;
    return this;
  }

   /**
   * 加床费用/每人，单位人民币分 不支持加床填0
   * @return price
  **/
  @Schema(required = true, description = "加床费用/每人，单位人民币分 不支持加床填0")
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
    PoiProductProductSpuAttributes1212ExtraBed spuAttributes1212ExtraBed = (PoiProductProductSpuAttributes1212ExtraBed) o;
    return Objects.equals(this.type, spuAttributes1212ExtraBed.type) &&
        Objects.equals(this.price, spuAttributes1212ExtraBed.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, price);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiProductProductSpuAttributes1212ExtraBed {\n");
    
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
