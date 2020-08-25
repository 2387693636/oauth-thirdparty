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
import com.douyin.open.models.PoiProductProductOnlineStatus;
import com.douyin.open.models.PoiProductProductSpuAttributes;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * PoiProductProductBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:54.684786+08:00[Asia/Shanghai]")
public class PoiProductProductBody {
  @JsonProperty("supplier_ext_id")
  private String supplierExtId = null;

  @JsonProperty("spu_ext_id")
  private String spuExtId = null;

  /**
   * spu类型号，1-酒店民宿房型，90-景区门票，91-团购券 20 电商实体商品 21 电商虚拟商品
   */
  public enum SpuTypeEnum {
    NUMBER_1(1),
    NUMBER_20(20),
    NUMBER_21(21),
    NUMBER_90(90),
    NUMBER_91(91);

    private Integer value;

    SpuTypeEnum(Integer value) {
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
    public static SpuTypeEnum fromValue(String text) {
      for (SpuTypeEnum b : SpuTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("spu_type")
  private SpuTypeEnum spuType = null;

  @JsonProperty("status")
  private PoiProductProductOnlineStatus status = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("order")
  private Integer order = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("attributes")
  private PoiProductProductSpuAttributes attributes = null;

  public PoiProductProductBody supplierExtId(String supplierExtId) {
    this.supplierExtId = supplierExtId;
    return this;
  }

   /**
   * 接入方店铺ID
   * @return supplierExtId
  **/
  @Schema(example = "x0001", required = true, description = "接入方店铺ID")
  public String getSupplierExtId() {
    return supplierExtId;
  }

  public void setSupplierExtId(String supplierExtId) {
    this.supplierExtId = supplierExtId;
  }

  public PoiProductProductBody spuExtId(String spuExtId) {
    this.spuExtId = spuExtId;
    return this;
  }

   /**
   * 接入方SPU ID
   * @return spuExtId
  **/
  @Schema(example = "y0001", required = true, description = "接入方SPU ID")
  public String getSpuExtId() {
    return spuExtId;
  }

  public void setSpuExtId(String spuExtId) {
    this.spuExtId = spuExtId;
  }

  public PoiProductProductBody spuType(SpuTypeEnum spuType) {
    this.spuType = spuType;
    return this;
  }

   /**
   * spu类型号，1-酒店民宿房型，90-景区门票，91-团购券 20 电商实体商品 21 电商虚拟商品
   * @return spuType
  **/
  @Schema(description = "spu类型号，1-酒店民宿房型，90-景区门票，91-团购券 20 电商实体商品 21 电商虚拟商品")
  public SpuTypeEnum getSpuType() {
    return spuType;
  }

  public void setSpuType(SpuTypeEnum spuType) {
    this.spuType = spuType;
  }

  public PoiProductProductBody status(PoiProductProductOnlineStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @Schema(required = true, description = "")
  public PoiProductProductOnlineStatus getStatus() {
    return status;
  }

  public void setStatus(PoiProductProductOnlineStatus status) {
    this.status = status;
  }

  public PoiProductProductBody name(String name) {
    this.name = name;
    return this;
  }

   /**
   * SPU名称
   * @return name
  **/
  @Schema(example = "英伦风尚", required = true, description = "SPU名称")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PoiProductProductBody order(Integer order) {
    this.order = order;
    return this;
  }

   /**
   * SPU展示顺序,降序
   * @return order
  **/
  @Schema(example = "1", description = "SPU展示顺序,降序")
  public Integer getOrder() {
    return order;
  }

  public void setOrder(Integer order) {
    this.order = order;
  }

  public PoiProductProductBody description(String description) {
    this.description = description;
    return this;
  }

   /**
   * SPU描述
   * @return description
  **/
  @Schema(description = "SPU描述")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PoiProductProductBody attributes(PoiProductProductSpuAttributes attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @Schema(required = true, description = "")
  public PoiProductProductSpuAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(PoiProductProductSpuAttributes attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiProductProductBody body = (PoiProductProductBody) o;
    return Objects.equals(this.supplierExtId, body.supplierExtId) &&
        Objects.equals(this.spuExtId, body.spuExtId) &&
        Objects.equals(this.spuType, body.spuType) &&
        Objects.equals(this.status, body.status) &&
        Objects.equals(this.name, body.name) &&
        Objects.equals(this.order, body.order) &&
        Objects.equals(this.description, body.description) &&
        Objects.equals(this.attributes, body.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supplierExtId, spuExtId, spuType, status, name, order, description, attributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiProductProductBody {\n");
    
    sb.append("    supplierExtId: ").append(toIndentedString(supplierExtId)).append("\n");
    sb.append("    spuExtId: ").append(toIndentedString(spuExtId)).append("\n");
    sb.append("    spuType: ").append(toIndentedString(spuType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
