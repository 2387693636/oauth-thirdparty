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
 * ExternalDataSdkShareExternalDataSdkShareExternalSdkShare
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:06:30.168960+08:00[Asia/Shanghai]")
public class ExternalDataSdkShareExternalDataSdkShareExternalSdkShare {
  @JsonProperty("date")
  private String date = null;

  @JsonProperty("share_user_count")
  private Integer shareUserCount = null;

  @JsonProperty("share_item_count")
  private Integer shareItemCount = null;

  @JsonProperty("share_item_total")
  private Integer shareItemTotal = null;

  @JsonProperty("delete_item_total")
  private Integer deleteItemTotal = null;

  public ExternalDataSdkShareExternalDataSdkShareExternalSdkShare date(String date) {
    this.date = date;
    return this;
  }

   /**
   * 日期
   * @return date
  **/
  @Schema(example = "yyyy-MM-dd", description = "日期")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public ExternalDataSdkShareExternalDataSdkShareExternalSdkShare shareUserCount(Integer shareUserCount) {
    this.shareUserCount = shareUserCount;
    return this;
  }

   /**
   * 当日完成分享的用户数
   * @return shareUserCount
  **/
  @Schema(example = "200", description = "当日完成分享的用户数")
  public Integer getShareUserCount() {
    return shareUserCount;
  }

  public void setShareUserCount(Integer shareUserCount) {
    this.shareUserCount = shareUserCount;
  }

  public ExternalDataSdkShareExternalDataSdkShareExternalSdkShare shareItemCount(Integer shareItemCount) {
    this.shareItemCount = shareItemCount;
    return this;
  }

   /**
   * 当日分享到抖音的视频数
   * @return shareItemCount
  **/
  @Schema(example = "200", description = "当日分享到抖音的视频数")
  public Integer getShareItemCount() {
    return shareItemCount;
  }

  public void setShareItemCount(Integer shareItemCount) {
    this.shareItemCount = shareItemCount;
  }

  public ExternalDataSdkShareExternalDataSdkShareExternalSdkShare shareItemTotal(Integer shareItemTotal) {
    this.shareItemTotal = shareItemTotal;
    return this;
  }

   /**
   * 累计分享到抖音的视频总数
   * @return shareItemTotal
  **/
  @Schema(example = "200", description = "累计分享到抖音的视频总数")
  public Integer getShareItemTotal() {
    return shareItemTotal;
  }

  public void setShareItemTotal(Integer shareItemTotal) {
    this.shareItemTotal = shareItemTotal;
  }

  public ExternalDataSdkShareExternalDataSdkShareExternalSdkShare deleteItemTotal(Integer deleteItemTotal) {
    this.deleteItemTotal = deleteItemTotal;
    return this;
  }

   /**
   * 累计分享到抖音内且状态已被删除的视频总数
   * @return deleteItemTotal
  **/
  @Schema(example = "200", description = "累计分享到抖音内且状态已被删除的视频总数")
  public Integer getDeleteItemTotal() {
    return deleteItemTotal;
  }

  public void setDeleteItemTotal(Integer deleteItemTotal) {
    this.deleteItemTotal = deleteItemTotal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalDataSdkShareExternalDataSdkShareExternalSdkShare externalSdkShare = (ExternalDataSdkShareExternalDataSdkShareExternalSdkShare) o;
    return Objects.equals(this.date, externalSdkShare.date) &&
        Objects.equals(this.shareUserCount, externalSdkShare.shareUserCount) &&
        Objects.equals(this.shareItemCount, externalSdkShare.shareItemCount) &&
        Objects.equals(this.shareItemTotal, externalSdkShare.shareItemTotal) &&
        Objects.equals(this.deleteItemTotal, externalSdkShare.deleteItemTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, shareUserCount, shareItemCount, shareItemTotal, deleteItemTotal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalDataSdkShareExternalDataSdkShareExternalSdkShare {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    shareUserCount: ").append(toIndentedString(shareUserCount)).append("\n");
    sb.append("    shareItemCount: ").append(toIndentedString(shareItemCount)).append("\n");
    sb.append("    shareItemTotal: ").append(toIndentedString(shareItemTotal)).append("\n");
    sb.append("    deleteItemTotal: ").append(toIndentedString(deleteItemTotal)).append("\n");
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
