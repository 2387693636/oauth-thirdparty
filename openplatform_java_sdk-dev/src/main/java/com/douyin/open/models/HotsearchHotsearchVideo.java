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
import com.douyin.open.models.HotsearchHotsearchVideoStatistics;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * HotsearchHotsearchVideo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:06:02.676044+08:00[Asia/Shanghai]")
public class HotsearchHotsearchVideo {
  @JsonProperty("item_id")
  private String itemId = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("cover")
  private String cover = null;

  @JsonProperty("is_top")
  private Boolean isTop = null;

  @JsonProperty("create_time")
  private Long createTime = null;

  @JsonProperty("is_reviewed")
  private Boolean isReviewed = null;

  @JsonProperty("video_status")
  private Integer videoStatus = null;

  @JsonProperty("share_url")
  private String shareUrl = null;

  @JsonProperty("statistics")
  private HotsearchHotsearchVideoStatistics statistics = null;

  public HotsearchHotsearchVideo itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * 视频id
   * @return itemId
  **/
  @Schema(example = "@8hxdhauTCMppanGnM4ltGM780mDqPP+KPpR0qQOmLVAXb/T060zdRmYqig357zEBq6CZRp4NVe6qLIJW/V/x1w==", required = true, description = "视频id")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public HotsearchHotsearchVideo title(String title) {
    this.title = title;
    return this;
  }

   /**
   * 视频标题
   * @return title
  **/
  @Schema(example = "测试视频 #测试话题 @抖音小助手", required = true, description = "视频标题")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public HotsearchHotsearchVideo cover(String cover) {
    this.cover = cover;
    return this;
  }

   /**
   * 视频封面
   * @return cover
  **/
  @Schema(example = "https://p3-dy.byteimg.com/img/tos-cn-p-0015/cfa0d6421bdc4580876cb16974539ff6~c5_300x400.jpeg", required = true, description = "视频封面")
  public String getCover() {
    return cover;
  }

  public void setCover(String cover) {
    this.cover = cover;
  }

  public HotsearchHotsearchVideo isTop(Boolean isTop) {
    this.isTop = isTop;
    return this;
  }

   /**
   * 是否置顶
   * @return isTop
  **/
  @Schema(example = "false", required = true, description = "是否置顶")
  public Boolean isIsTop() {
    return isTop;
  }

  public void setIsTop(Boolean isTop) {
    this.isTop = isTop;
  }

  public HotsearchHotsearchVideo createTime(Long createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * 视频创建时间戳
   * @return createTime
  **/
  @Schema(example = "1571075129", required = true, description = "视频创建时间戳")
  public Long getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }

  public HotsearchHotsearchVideo isReviewed(Boolean isReviewed) {
    this.isReviewed = isReviewed;
    return this;
  }

   /**
   * 表示是否审核结束。审核通过或者失败都会返回true，审核中返回false。
   * @return isReviewed
  **/
  @Schema(example = "true", required = true, description = "表示是否审核结束。审核通过或者失败都会返回true，审核中返回false。")
  public Boolean isIsReviewed() {
    return isReviewed;
  }

  public void setIsReviewed(Boolean isReviewed) {
    this.isReviewed = isReviewed;
  }

  public HotsearchHotsearchVideo videoStatus(Integer videoStatus) {
    this.videoStatus = videoStatus;
    return this;
  }

   /**
   * 表示视频状态。1:已发布;2:不适宜公开;4:审核中
   * @return videoStatus
  **/
  @Schema(example = "1", description = "表示视频状态。1:已发布;2:不适宜公开;4:审核中")
  public Integer getVideoStatus() {
    return videoStatus;
  }

  public void setVideoStatus(Integer videoStatus) {
    this.videoStatus = videoStatus;
  }

  public HotsearchHotsearchVideo shareUrl(String shareUrl) {
    this.shareUrl = shareUrl;
    return this;
  }

   /**
   * 视频播放页面。视频播放页可能会失效，请在观看视频前调用/video/data/获取最新的播放页。
   * @return shareUrl
  **/
  @Schema(example = "https://www.iesdouyin.com/share/video/QDlWd0EzdWVMU2Q0aU5tKzVaOElvVU03ODBtRHFQUCtLUHBSMHFRT21MVkFYYi9UMDYwemRSbVlxaWczNTd6RUJRc3MrM2hvRGlqK2EwNnhBc1lGUkpRPT0=/?region=CN&mid=6753173704399670023&u_code=12h9je425&titleType=title", required = true, description = "视频播放页面。视频播放页可能会失效，请在观看视频前调用/video/data/获取最新的播放页。")
  public String getShareUrl() {
    return shareUrl;
  }

  public void setShareUrl(String shareUrl) {
    this.shareUrl = shareUrl;
  }

  public HotsearchHotsearchVideo statistics(HotsearchHotsearchVideoStatistics statistics) {
    this.statistics = statistics;
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @Schema(required = true, description = "")
  public HotsearchHotsearchVideoStatistics getStatistics() {
    return statistics;
  }

  public void setStatistics(HotsearchHotsearchVideoStatistics statistics) {
    this.statistics = statistics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HotsearchHotsearchVideo video = (HotsearchHotsearchVideo) o;
    return Objects.equals(this.itemId, video.itemId) &&
        Objects.equals(this.title, video.title) &&
        Objects.equals(this.cover, video.cover) &&
        Objects.equals(this.isTop, video.isTop) &&
        Objects.equals(this.createTime, video.createTime) &&
        Objects.equals(this.isReviewed, video.isReviewed) &&
        Objects.equals(this.videoStatus, video.videoStatus) &&
        Objects.equals(this.shareUrl, video.shareUrl) &&
        Objects.equals(this.statistics, video.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, title, cover, isTop, createTime, isReviewed, videoStatus, shareUrl, statistics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HotsearchHotsearchVideo {\n");
    
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    cover: ").append(toIndentedString(cover)).append("\n");
    sb.append("    isTop: ").append(toIndentedString(isTop)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    isReviewed: ").append(toIndentedString(isReviewed)).append("\n");
    sb.append("    videoStatus: ").append(toIndentedString(videoStatus)).append("\n");
    sb.append("    shareUrl: ").append(toIndentedString(shareUrl)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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
