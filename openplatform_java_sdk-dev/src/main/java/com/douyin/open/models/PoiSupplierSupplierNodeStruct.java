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
import com.douyin.open.models.PoiSupplierSupplierNodeTypeEnum;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * 富文本处理中的节点结构
 */
@Schema(description = "富文本处理中的节点结构")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:47.759385+08:00[Asia/Shanghai]")
public class PoiSupplierSupplierNodeStruct {
  @JsonProperty("node_type")
  private PoiSupplierSupplierNodeTypeEnum nodeType = null;

  @JsonProperty("content")
  private String content = null;

  public PoiSupplierSupplierNodeStruct nodeType(PoiSupplierSupplierNodeTypeEnum nodeType) {
    this.nodeType = nodeType;
    return this;
  }

   /**
   * Get nodeType
   * @return nodeType
  **/
  @Schema(required = true, description = "")
  public PoiSupplierSupplierNodeTypeEnum getNodeType() {
    return nodeType;
  }

  public void setNodeType(PoiSupplierSupplierNodeTypeEnum nodeType) {
    this.nodeType = nodeType;
  }

  public PoiSupplierSupplierNodeStruct content(String content) {
    this.content = content;
    return this;
  }

   /**
   * 节点内容
   * @return content
  **/
  @Schema(example = "节点内容: 文字，图片地址...", description = "节点内容")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiSupplierSupplierNodeStruct nodeStruct = (PoiSupplierSupplierNodeStruct) o;
    return Objects.equals(this.nodeType, nodeStruct.nodeType) &&
        Objects.equals(this.content, nodeStruct.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeType, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiSupplierSupplierNodeStruct {\n");
    
    sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
