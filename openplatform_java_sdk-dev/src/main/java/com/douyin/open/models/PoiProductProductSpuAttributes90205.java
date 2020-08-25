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
import com.douyin.open.models.PoiProductProductSpuAttributes90205EntryMiniApp;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * spu跳转入口
 */
@Schema(description = "spu跳转入口")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:54.684786+08:00[Asia/Shanghai]")
public class PoiProductProductSpuAttributes90205 {
  /**
   * 入口类型(1:H5，2:抖音小程序，3:抖音链接)
   */
  public enum EntryTypeEnum {
    NUMBER_1(1),
    NUMBER_2(2);

    private Integer value;

    EntryTypeEnum(Integer value) {
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
    public static EntryTypeEnum fromValue(String text) {
      for (EntryTypeEnum b : EntryTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("entry_type")
  private EntryTypeEnum entryType = null;

  @JsonProperty("entry_mini_app")
  private PoiProductProductSpuAttributes90205EntryMiniApp entryMiniApp = null;

  @JsonProperty("entry_url")
  private String entryUrl = null;

  public PoiProductProductSpuAttributes90205 entryType(EntryTypeEnum entryType) {
    this.entryType = entryType;
    return this;
  }

   /**
   * 入口类型(1:H5，2:抖音小程序，3:抖音链接)
   * @return entryType
  **/
  @Schema(description = "入口类型(1:H5，2:抖音小程序，3:抖音链接)")
  public EntryTypeEnum getEntryType() {
    return entryType;
  }

  public void setEntryType(EntryTypeEnum entryType) {
    this.entryType = entryType;
  }

  public PoiProductProductSpuAttributes90205 entryMiniApp(PoiProductProductSpuAttributes90205EntryMiniApp entryMiniApp) {
    this.entryMiniApp = entryMiniApp;
    return this;
  }

   /**
   * Get entryMiniApp
   * @return entryMiniApp
  **/
  @Schema(description = "")
  public PoiProductProductSpuAttributes90205EntryMiniApp getEntryMiniApp() {
    return entryMiniApp;
  }

  public void setEntryMiniApp(PoiProductProductSpuAttributes90205EntryMiniApp entryMiniApp) {
    this.entryMiniApp = entryMiniApp;
  }

  public PoiProductProductSpuAttributes90205 entryUrl(String entryUrl) {
    this.entryUrl = entryUrl;
    return this;
  }

   /**
   * 跳转链接
   * @return entryUrl
  **/
  @Schema(example = "https://open.douyin.com/platform/doc/OpenAPI-poi-product", description = "跳转链接")
  public String getEntryUrl() {
    return entryUrl;
  }

  public void setEntryUrl(String entryUrl) {
    this.entryUrl = entryUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiProductProductSpuAttributes90205 spuAttributes90205 = (PoiProductProductSpuAttributes90205) o;
    return Objects.equals(this.entryType, spuAttributes90205.entryType) &&
        Objects.equals(this.entryMiniApp, spuAttributes90205.entryMiniApp) &&
        Objects.equals(this.entryUrl, spuAttributes90205.entryUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entryType, entryMiniApp, entryUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiProductProductSpuAttributes90205 {\n");
    
    sb.append("    entryType: ").append(toIndentedString(entryType)).append("\n");
    sb.append("    entryMiniApp: ").append(toIndentedString(entryMiniApp)).append("\n");
    sb.append("    entryUrl: ").append(toIndentedString(entryUrl)).append("\n");
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
