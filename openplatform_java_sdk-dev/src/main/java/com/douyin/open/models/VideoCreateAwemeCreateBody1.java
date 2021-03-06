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
import java.util.ArrayList;
import java.util.List;
/**
 * VideoCreateAwemeCreateBody1
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-19T14:21:48.922886+08:00[Asia/Shanghai]")
public class VideoCreateAwemeCreateBody1 {
  @JsonProperty("video_id")
  private String videoId = null;

  @JsonProperty("text")
  private String text = null;

  @JsonProperty("poi_id")
  private String poiId = null;

  @JsonProperty("poi_name")
  private String poiName = null;

  @JsonProperty("micro_app_id")
  private String microAppId = null;

  @JsonProperty("micro_app_title")
  private String microAppTitle = null;

  @JsonProperty("micro_app_url")
  private String microAppUrl = null;

  @JsonProperty("article_id")
  private String articleId = null;

  @JsonProperty("article_title")
  private String articleTitle = null;

  @JsonProperty("timeliness_label")
  private Integer timelinessLabel = null;

  @JsonProperty("timeliness_keyword")
  private String timelinessKeyword = null;

  @JsonProperty("game_id")
  private String gameId = null;

  @JsonProperty("game_content")
  private String gameContent = null;

  @JsonProperty("cover_tsp")
  private Double coverTsp = null;

  @JsonProperty("at_users")
  private List<String> atUsers = null;

  public VideoCreateAwemeCreateBody1 videoId(String videoId) {
    this.videoId = videoId;
    return this;
  }

   /**
   * video_id, 通过/video/upload/接口得到。注意每次调用/video/create/都要调用/video/upload/生成新的video_id。
   * @return videoId
  **/
  @Schema(example = "v0201f510000smhdsr0ggl1v4a2b2ps1", required = true, description = "video_id, 通过/video/upload/接口得到。注意每次调用/video/create/都要调用/video/upload/生成新的video_id。")
  public String getVideoId() {
    return videoId;
  }

  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }

  public VideoCreateAwemeCreateBody1 text(String text) {
    this.text = text;
    return this;
  }

   /**
   * 视频标题， 可以带话题,@用户。 如title1#话题1 #话题2 @openid1  注意：   1. 话题审核依旧遵循抖音的审核逻辑，强烈建议第三方谨慎拟定话题名称，避免强导流行为。 
   * @return text
  **/
  @Schema(example = "title1#话题1 #话题2 @nickname1", description = "视频标题， 可以带话题,@用户。 如title1#话题1 #话题2 @openid1  注意：   1. 话题审核依旧遵循抖音的审核逻辑，强烈建议第三方谨慎拟定话题名称，避免强导流行为。 ")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public VideoCreateAwemeCreateBody1 poiId(String poiId) {
    this.poiId = poiId;
    return this;
  }

   /**
   * 地理位置id
   * @return poiId
  **/
  @Schema(description = "地理位置id")
  public String getPoiId() {
    return poiId;
  }

  public void setPoiId(String poiId) {
    this.poiId = poiId;
  }

  public VideoCreateAwemeCreateBody1 poiName(String poiName) {
    this.poiName = poiName;
    return this;
  }

   /**
   * 地理位置名称
   * @return poiName
  **/
  @Schema(description = "地理位置名称")
  public String getPoiName() {
    return poiName;
  }

  public void setPoiName(String poiName) {
    this.poiName = poiName;
  }

  public VideoCreateAwemeCreateBody1 microAppId(String microAppId) {
    this.microAppId = microAppId;
    return this;
  }

   /**
   * 小程序id
   * @return microAppId
  **/
  @Schema(example = "ttef9b112671b152ba", description = "小程序id")
  public String getMicroAppId() {
    return microAppId;
  }

  public void setMicroAppId(String microAppId) {
    this.microAppId = microAppId;
  }

  public VideoCreateAwemeCreateBody1 microAppTitle(String microAppTitle) {
    this.microAppTitle = microAppTitle;
    return this;
  }

   /**
   * 小程序标题
   * @return microAppTitle
  **/
  @Schema(example = "小程序标题", description = "小程序标题")
  public String getMicroAppTitle() {
    return microAppTitle;
  }

  public void setMicroAppTitle(String microAppTitle) {
    this.microAppTitle = microAppTitle;
  }

  public VideoCreateAwemeCreateBody1 microAppUrl(String microAppUrl) {
    this.microAppUrl = microAppUrl;
    return this;
  }

   /**
   * 吊起小程序时的参数
   * @return microAppUrl
  **/
  @Schema(description = "吊起小程序时的参数")
  public String getMicroAppUrl() {
    return microAppUrl;
  }

  public void setMicroAppUrl(String microAppUrl) {
    this.microAppUrl = microAppUrl;
  }

  public VideoCreateAwemeCreateBody1 articleId(String articleId) {
    this.articleId = articleId;
    return this;
  }

   /**
   * 文章ID，暂不开放
   * @return articleId
  **/
  @Schema(description = "文章ID，暂不开放")
  public String getArticleId() {
    return articleId;
  }

  public void setArticleId(String articleId) {
    this.articleId = articleId;
  }

  public VideoCreateAwemeCreateBody1 articleTitle(String articleTitle) {
    this.articleTitle = articleTitle;
    return this;
  }

   /**
   * 文章自定义标题，暂不开放
   * @return articleTitle
  **/
  @Schema(description = "文章自定义标题，暂不开放")
  public String getArticleTitle() {
    return articleTitle;
  }

  public void setArticleTitle(String articleTitle) {
    this.articleTitle = articleTitle;
  }

  public VideoCreateAwemeCreateBody1 timelinessLabel(Integer timelinessLabel) {
    this.timelinessLabel = timelinessLabel;
    return this;
  }

   /**
   * 时效新闻标签，1表示使用。暂不开放
   * @return timelinessLabel
  **/
  @Schema(description = "时效新闻标签，1表示使用。暂不开放")
  public Integer getTimelinessLabel() {
    return timelinessLabel;
  }

  public void setTimelinessLabel(Integer timelinessLabel) {
    this.timelinessLabel = timelinessLabel;
  }

  public VideoCreateAwemeCreateBody1 timelinessKeyword(String timelinessKeyword) {
    this.timelinessKeyword = timelinessKeyword;
    return this;
  }

   /**
   * 最多可添加3个，用&#x60;\\|&#x60;隔开。暂不开放
   * @return timelinessKeyword
  **/
  @Schema(description = "最多可添加3个，用`\\|`隔开。暂不开放")
  public String getTimelinessKeyword() {
    return timelinessKeyword;
  }

  public void setTimelinessKeyword(String timelinessKeyword) {
    this.timelinessKeyword = timelinessKeyword;
  }

  public VideoCreateAwemeCreateBody1 gameId(String gameId) {
    this.gameId = gameId;
    return this;
  }

   /**
   * 游戏id。暂不开放
   * @return gameId
  **/
  @Schema(description = "游戏id。暂不开放")
  public String getGameId() {
    return gameId;
  }

  public void setGameId(String gameId) {
    this.gameId = gameId;
  }

  public VideoCreateAwemeCreateBody1 gameContent(String gameContent) {
    this.gameContent = gameContent;
    return this;
  }

   /**
   * 游戏个性化参数
   * @return gameContent
  **/
  @Schema(description = "游戏个性化参数")
  public String getGameContent() {
    return gameContent;
  }

  public void setGameContent(String gameContent) {
    this.gameContent = gameContent;
  }

  public VideoCreateAwemeCreateBody1 coverTsp(Double coverTsp) {
    this.coverTsp = coverTsp;
    return this;
  }

   /**
   * 将传入的指定时间点对应帧设置为视频封面（单位：秒）
   * @return coverTsp
  **/
  @Schema(example = "2.3", description = "将传入的指定时间点对应帧设置为视频封面（单位：秒）")
  public Double getCoverTsp() {
    return coverTsp;
  }

  public void setCoverTsp(Double coverTsp) {
    this.coverTsp = coverTsp;
  }

  public VideoCreateAwemeCreateBody1 atUsers(List<String> atUsers) {
    this.atUsers = atUsers;
    return this;
  }

  public VideoCreateAwemeCreateBody1 addAtUsersItem(String atUsersItem) {
    if (this.atUsers == null) {
      this.atUsers = new ArrayList<>();
    }
    this.atUsers.add(atUsersItem);
    return this;
  }

   /**
   * 如果需要at其他用户。将text中@nickname对应的open_id放到这里。
   * @return atUsers
  **/
  @Schema(description = "如果需要at其他用户。将text中@nickname对应的open_id放到这里。")
  public List<String> getAtUsers() {
    return atUsers;
  }

  public void setAtUsers(List<String> atUsers) {
    this.atUsers = atUsers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoCreateAwemeCreateBody1 body1 = (VideoCreateAwemeCreateBody1) o;
    return Objects.equals(this.videoId, body1.videoId) &&
        Objects.equals(this.text, body1.text) &&
        Objects.equals(this.poiId, body1.poiId) &&
        Objects.equals(this.poiName, body1.poiName) &&
        Objects.equals(this.microAppId, body1.microAppId) &&
        Objects.equals(this.microAppTitle, body1.microAppTitle) &&
        Objects.equals(this.microAppUrl, body1.microAppUrl) &&
        Objects.equals(this.articleId, body1.articleId) &&
        Objects.equals(this.articleTitle, body1.articleTitle) &&
        Objects.equals(this.timelinessLabel, body1.timelinessLabel) &&
        Objects.equals(this.timelinessKeyword, body1.timelinessKeyword) &&
        Objects.equals(this.gameId, body1.gameId) &&
        Objects.equals(this.gameContent, body1.gameContent) &&
        Objects.equals(this.coverTsp, body1.coverTsp) &&
        Objects.equals(this.atUsers, body1.atUsers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(videoId, text, poiId, poiName, microAppId, microAppTitle, microAppUrl, articleId, articleTitle, timelinessLabel, timelinessKeyword, gameId, gameContent, coverTsp, atUsers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoCreateAwemeCreateBody1 {\n");
    
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    poiId: ").append(toIndentedString(poiId)).append("\n");
    sb.append("    poiName: ").append(toIndentedString(poiName)).append("\n");
    sb.append("    microAppId: ").append(toIndentedString(microAppId)).append("\n");
    sb.append("    microAppTitle: ").append(toIndentedString(microAppTitle)).append("\n");
    sb.append("    microAppUrl: ").append(toIndentedString(microAppUrl)).append("\n");
    sb.append("    articleId: ").append(toIndentedString(articleId)).append("\n");
    sb.append("    articleTitle: ").append(toIndentedString(articleTitle)).append("\n");
    sb.append("    timelinessLabel: ").append(toIndentedString(timelinessLabel)).append("\n");
    sb.append("    timelinessKeyword: ").append(toIndentedString(timelinessKeyword)).append("\n");
    sb.append("    gameId: ").append(toIndentedString(gameId)).append("\n");
    sb.append("    gameContent: ").append(toIndentedString(gameContent)).append("\n");
    sb.append("    coverTsp: ").append(toIndentedString(coverTsp)).append("\n");
    sb.append("    atUsers: ").append(toIndentedString(atUsers)).append("\n");
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
