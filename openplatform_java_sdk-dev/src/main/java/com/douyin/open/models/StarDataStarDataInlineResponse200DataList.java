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
 * StarDataStarDataInlineResponse200DataList
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:06:10.297280+08:00[Asia/Shanghai]")
public class StarDataStarDataInlineResponse200DataList {
  @JsonProperty("rank")
  private Integer rank = null;

  @JsonProperty("nick_name")
  private String nickName = null;

  @JsonProperty("tags")
  private List<String> tags = new ArrayList<>();

  @JsonProperty("follower")
  private Integer follower = null;

  @JsonProperty("score")
  private Double score = null;

  @JsonProperty("unique_id")
  private String uniqueId = null;

  public StarDataStarDataInlineResponse200DataList rank(Integer rank) {
    this.rank = rank;
    return this;
  }

   /**
   * 热榜排名
   * @return rank
  **/
  @Schema(required = true, description = "热榜排名")
  public Integer getRank() {
    return rank;
  }

  public void setRank(Integer rank) {
    this.rank = rank;
  }

  public StarDataStarDataInlineResponse200DataList nickName(String nickName) {
    this.nickName = nickName;
    return this;
  }

   /**
   * 达人昵称
   * @return nickName
  **/
  @Schema(required = true, description = "达人昵称")
  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public StarDataStarDataInlineResponse200DataList tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public StarDataStarDataInlineResponse200DataList addTagsItem(String tagsItem) {
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @Schema(required = true, description = "")
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public StarDataStarDataInlineResponse200DataList follower(Integer follower) {
    this.follower = follower;
    return this;
  }

   /**
   * 粉丝数
   * @return follower
  **/
  @Schema(required = true, description = "粉丝数")
  public Integer getFollower() {
    return follower;
  }

  public void setFollower(Integer follower) {
    this.follower = follower;
  }

  public StarDataStarDataInlineResponse200DataList score(Double score) {
    this.score = score;
    return this;
  }

   /**
   * 热榜类型对应的热榜指数
   * @return score
  **/
  @Schema(example = "80.6", required = true, description = "热榜类型对应的热榜指数")
  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public StarDataStarDataInlineResponse200DataList uniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * 抖音号
   * @return uniqueId
  **/
  @Schema(description = "抖音号")
  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDataStarDataInlineResponse200DataList inlineResponse200DataList = (StarDataStarDataInlineResponse200DataList) o;
    return Objects.equals(this.rank, inlineResponse200DataList.rank) &&
        Objects.equals(this.nickName, inlineResponse200DataList.nickName) &&
        Objects.equals(this.tags, inlineResponse200DataList.tags) &&
        Objects.equals(this.follower, inlineResponse200DataList.follower) &&
        Objects.equals(this.score, inlineResponse200DataList.score) &&
        Objects.equals(this.uniqueId, inlineResponse200DataList.uniqueId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rank, nickName, tags, follower, score, uniqueId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDataStarDataInlineResponse200DataList {\n");
    
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    follower: ").append(toIndentedString(follower)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
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
