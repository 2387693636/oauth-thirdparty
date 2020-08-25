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
 * VideoSearchCommentVideoSearchCommentInlineResponse200DataList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:05:33.306577+08:00[Asia/Shanghai]")
public class VideoSearchCommentVideoSearchCommentInlineResponse200DataList {
  @JsonProperty("comment_id")
  private String commentId = null;

  @JsonProperty("comment_user_id")
  private String commentUserId = null;

  @JsonProperty("content")
  private String content = null;

  @JsonProperty("create_time")
  private Integer createTime = null;

  @JsonProperty("top")
  private Boolean top = null;

  @JsonProperty("digg_count")
  private Integer diggCount = null;

  @JsonProperty("reply_comment_total")
  private Integer replyCommentTotal = null;

  public VideoSearchCommentVideoSearchCommentInlineResponse200DataList commentId(String commentId) {
    this.commentId = commentId;
    return this;
  }

   /**
   * Get commentId
   * @return commentId
  **/
  @Schema(required = true, description = "")
  public String getCommentId() {
    return commentId;
  }

  public void setCommentId(String commentId) {
    this.commentId = commentId;
  }

  public VideoSearchCommentVideoSearchCommentInlineResponse200DataList commentUserId(String commentUserId) {
    this.commentUserId = commentUserId;
    return this;
  }

   /**
   * Get commentUserId
   * @return commentUserId
  **/
  @Schema(required = true, description = "")
  public String getCommentUserId() {
    return commentUserId;
  }

  public void setCommentUserId(String commentUserId) {
    this.commentUserId = commentUserId;
  }

  public VideoSearchCommentVideoSearchCommentInlineResponse200DataList content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @Schema(required = true, description = "")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public VideoSearchCommentVideoSearchCommentInlineResponse200DataList createTime(Integer createTime) {
    this.createTime = createTime;
    return this;
  }

   /**
   * 时间戳
   * @return createTime
  **/
  @Schema(required = true, description = "时间戳")
  public Integer getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Integer createTime) {
    this.createTime = createTime;
  }

  public VideoSearchCommentVideoSearchCommentInlineResponse200DataList top(Boolean top) {
    this.top = top;
    return this;
  }

   /**
   * 是否置顶评论
   * @return top
  **/
  @Schema(required = true, description = "是否置顶评论")
  public Boolean isTop() {
    return top;
  }

  public void setTop(Boolean top) {
    this.top = top;
  }

  public VideoSearchCommentVideoSearchCommentInlineResponse200DataList diggCount(Integer diggCount) {
    this.diggCount = diggCount;
    return this;
  }

   /**
   * Get diggCount
   * @return diggCount
  **/
  @Schema(required = true, description = "")
  public Integer getDiggCount() {
    return diggCount;
  }

  public void setDiggCount(Integer diggCount) {
    this.diggCount = diggCount;
  }

  public VideoSearchCommentVideoSearchCommentInlineResponse200DataList replyCommentTotal(Integer replyCommentTotal) {
    this.replyCommentTotal = replyCommentTotal;
    return this;
  }

   /**
   * 回复评论数
   * @return replyCommentTotal
  **/
  @Schema(required = true, description = "回复评论数")
  public Integer getReplyCommentTotal() {
    return replyCommentTotal;
  }

  public void setReplyCommentTotal(Integer replyCommentTotal) {
    this.replyCommentTotal = replyCommentTotal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoSearchCommentVideoSearchCommentInlineResponse200DataList inlineResponse200DataList = (VideoSearchCommentVideoSearchCommentInlineResponse200DataList) o;
    return Objects.equals(this.commentId, inlineResponse200DataList.commentId) &&
        Objects.equals(this.commentUserId, inlineResponse200DataList.commentUserId) &&
        Objects.equals(this.content, inlineResponse200DataList.content) &&
        Objects.equals(this.createTime, inlineResponse200DataList.createTime) &&
        Objects.equals(this.top, inlineResponse200DataList.top) &&
        Objects.equals(this.diggCount, inlineResponse200DataList.diggCount) &&
        Objects.equals(this.replyCommentTotal, inlineResponse200DataList.replyCommentTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commentId, commentUserId, content, createTime, top, diggCount, replyCommentTotal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoSearchCommentVideoSearchCommentInlineResponse200DataList {\n");
    
    sb.append("    commentId: ").append(toIndentedString(commentId)).append("\n");
    sb.append("    commentUserId: ").append(toIndentedString(commentUserId)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    top: ").append(toIndentedString(top)).append("\n");
    sb.append("    diggCount: ").append(toIndentedString(diggCount)).append("\n");
    sb.append("    replyCommentTotal: ").append(toIndentedString(replyCommentTotal)).append("\n");
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
