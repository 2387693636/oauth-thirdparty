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
 * PoiSupplierSupplierSupplierAttributes3101PreferentialPolicy
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:47.759385+08:00[Asia/Shanghai]")
public class PoiSupplierSupplierSupplierAttributes3101PreferentialPolicy {
  @JsonProperty("population")
  private String population = null;

  @JsonProperty("condition")
  private String condition = null;

  @JsonProperty("discount")
  private String discount = null;

  public PoiSupplierSupplierSupplierAttributes3101PreferentialPolicy population(String population) {
    this.population = population;
    return this;
  }

   /**
   * 优待政策-人群(婴儿、儿童、老人、军人、残障人士，不超过30个汉字)
   * @return population
  **/
  @Schema(example = "婴儿", description = "优待政策-人群(婴儿、儿童、老人、军人、残障人士，不超过30个汉字)")
  public String getPopulation() {
    return population;
  }

  public void setPopulation(String population) {
    this.population = population;
  }

  public PoiSupplierSupplierSupplierAttributes3101PreferentialPolicy condition(String condition) {
    this.condition = condition;
    return this;
  }

   /**
   * 优待政策-适用条件(不超过200个汉字)
   * @return condition
  **/
  @Schema(example = "3周岁以内", description = "优待政策-适用条件(不超过200个汉字)")
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public PoiSupplierSupplierSupplierAttributes3101PreferentialPolicy discount(String discount) {
    this.discount = discount;
    return this;
  }

   /**
   * 优待政策-优待内容(免费、优惠、半价)
   * @return discount
  **/
  @Schema(example = "免费", description = "优待政策-优待内容(免费、优惠、半价)")
  public String getDiscount() {
    return discount;
  }

  public void setDiscount(String discount) {
    this.discount = discount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiSupplierSupplierSupplierAttributes3101PreferentialPolicy supplierAttributes3101PreferentialPolicy = (PoiSupplierSupplierSupplierAttributes3101PreferentialPolicy) o;
    return Objects.equals(this.population, supplierAttributes3101PreferentialPolicy.population) &&
        Objects.equals(this.condition, supplierAttributes3101PreferentialPolicy.condition) &&
        Objects.equals(this.discount, supplierAttributes3101PreferentialPolicy.discount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(population, condition, discount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiSupplierSupplierSupplierAttributes3101PreferentialPolicy {\n");
    
    sb.append("    population: ").append(toIndentedString(population)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
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
