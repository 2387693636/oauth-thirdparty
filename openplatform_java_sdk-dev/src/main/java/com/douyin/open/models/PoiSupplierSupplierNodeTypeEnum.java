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
import io.swagger.v3.oas.annotations.media.Schema;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * 富文本处理中的节点类型 1 - text 2 - image 
 */
public enum PoiSupplierSupplierNodeTypeEnum {
  NUMBER_1(1),
  NUMBER_2(2);

  private Integer value;

  PoiSupplierSupplierNodeTypeEnum(Integer value) {
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
  public static PoiSupplierSupplierNodeTypeEnum fromValue(String text) {
    for (PoiSupplierSupplierNodeTypeEnum b : PoiSupplierSupplierNodeTypeEnum.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
