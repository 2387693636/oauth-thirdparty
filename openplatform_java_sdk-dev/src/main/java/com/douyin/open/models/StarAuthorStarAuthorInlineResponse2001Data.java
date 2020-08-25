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
 * StarAuthorStarAuthorInlineResponse2001Data
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:06:16.546471+08:00[Asia/Shanghai]")
public class StarAuthorStarAuthorInlineResponse2001Data {
  @JsonProperty("error_code")
  private Integer errorCode = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("update_timestamp")
  private Integer updateTimestamp = null;

  @JsonProperty("nick_name")
  private String nickName = null;

  @JsonProperty("unique_id")
  private String uniqueId = null;

  @JsonProperty("spread_score")
  private Double spreadScore = null;

  @JsonProperty("cp_score")
  private Double cpScore = null;

  @JsonProperty("growth_score")
  private Double growthScore = null;

  @JsonProperty("cooperation_score")
  private Double cooperationScore = null;

  @JsonProperty("shop_score")
  private Double shopScore = null;

  @JsonProperty("star_score")
  private Double starScore = null;

  public StarAuthorStarAuthorInlineResponse2001Data errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @Schema(required = true, description = "")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public StarAuthorStarAuthorInlineResponse2001Data description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(required = true, description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public StarAuthorStarAuthorInlineResponse2001Data updateTimestamp(Integer updateTimestamp) {
    this.updateTimestamp = updateTimestamp;
    return this;
  }

   /**
   * 达人指数更新时间戳
   * @return updateTimestamp
  **/
  @Schema(example = "1584418477", description = "达人指数更新时间戳")
  public Integer getUpdateTimestamp() {
    return updateTimestamp;
  }

  public void setUpdateTimestamp(Integer updateTimestamp) {
    this.updateTimestamp = updateTimestamp;
  }

  public StarAuthorStarAuthorInlineResponse2001Data nickName(String nickName) {
    this.nickName = nickName;
    return this;
  }

   /**
   * 达人昵称
   * @return nickName
  **/
  @Schema(description = "达人昵称")
  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }

  public StarAuthorStarAuthorInlineResponse2001Data uniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }

   /**
   * 达人抖音号
   * @return uniqueId
  **/
  @Schema(description = "达人抖音号")
  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  public StarAuthorStarAuthorInlineResponse2001Data spreadScore(Double spreadScore) {
    this.spreadScore = spreadScore;
    return this;
  }

   /**
   * 传播指数
   * @return spreadScore
  **/
  @Schema(example = "80.6", description = "传播指数")
  public Double getSpreadScore() {
    return spreadScore;
  }

  public void setSpreadScore(Double spreadScore) {
    this.spreadScore = spreadScore;
  }

  public StarAuthorStarAuthorInlineResponse2001Data cpScore(Double cpScore) {
    this.cpScore = cpScore;
    return this;
  }

   /**
   * 性价比指数
   * @return cpScore
  **/
  @Schema(example = "80.6", description = "性价比指数")
  public Double getCpScore() {
    return cpScore;
  }

  public void setCpScore(Double cpScore) {
    this.cpScore = cpScore;
  }

  public StarAuthorStarAuthorInlineResponse2001Data growthScore(Double growthScore) {
    this.growthScore = growthScore;
    return this;
  }

   /**
   * 涨粉指数
   * @return growthScore
  **/
  @Schema(example = "80.6", description = "涨粉指数")
  public Double getGrowthScore() {
    return growthScore;
  }

  public void setGrowthScore(Double growthScore) {
    this.growthScore = growthScore;
  }

  public StarAuthorStarAuthorInlineResponse2001Data cooperationScore(Double cooperationScore) {
    this.cooperationScore = cooperationScore;
    return this;
  }

   /**
   * 合作指数
   * @return cooperationScore
  **/
  @Schema(example = "80.6", description = "合作指数")
  public Double getCooperationScore() {
    return cooperationScore;
  }

  public void setCooperationScore(Double cooperationScore) {
    this.cooperationScore = cooperationScore;
  }

  public StarAuthorStarAuthorInlineResponse2001Data shopScore(Double shopScore) {
    this.shopScore = shopScore;
    return this;
  }

   /**
   * 种草指数
   * @return shopScore
  **/
  @Schema(example = "80.6", description = "种草指数")
  public Double getShopScore() {
    return shopScore;
  }

  public void setShopScore(Double shopScore) {
    this.shopScore = shopScore;
  }

  public StarAuthorStarAuthorInlineResponse2001Data starScore(Double starScore) {
    this.starScore = starScore;
    return this;
  }

   /**
   * 星图指数
   * @return starScore
  **/
  @Schema(example = "80.6", description = "星图指数")
  public Double getStarScore() {
    return starScore;
  }

  public void setStarScore(Double starScore) {
    this.starScore = starScore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarAuthorStarAuthorInlineResponse2001Data inlineResponse2001Data = (StarAuthorStarAuthorInlineResponse2001Data) o;
    return Objects.equals(this.errorCode, inlineResponse2001Data.errorCode) &&
        Objects.equals(this.description, inlineResponse2001Data.description) &&
        Objects.equals(this.updateTimestamp, inlineResponse2001Data.updateTimestamp) &&
        Objects.equals(this.nickName, inlineResponse2001Data.nickName) &&
        Objects.equals(this.uniqueId, inlineResponse2001Data.uniqueId) &&
        Objects.equals(this.spreadScore, inlineResponse2001Data.spreadScore) &&
        Objects.equals(this.cpScore, inlineResponse2001Data.cpScore) &&
        Objects.equals(this.growthScore, inlineResponse2001Data.growthScore) &&
        Objects.equals(this.cooperationScore, inlineResponse2001Data.cooperationScore) &&
        Objects.equals(this.shopScore, inlineResponse2001Data.shopScore) &&
        Objects.equals(this.starScore, inlineResponse2001Data.starScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, description, updateTimestamp, nickName, uniqueId, spreadScore, cpScore, growthScore, cooperationScore, shopScore, starScore);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarAuthorStarAuthorInlineResponse2001Data {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    updateTimestamp: ").append(toIndentedString(updateTimestamp)).append("\n");
    sb.append("    nickName: ").append(toIndentedString(nickName)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    spreadScore: ").append(toIndentedString(spreadScore)).append("\n");
    sb.append("    cpScore: ").append(toIndentedString(cpScore)).append("\n");
    sb.append("    growthScore: ").append(toIndentedString(growthScore)).append("\n");
    sb.append("    cooperationScore: ").append(toIndentedString(cooperationScore)).append("\n");
    sb.append("    shopScore: ").append(toIndentedString(shopScore)).append("\n");
    sb.append("    starScore: ").append(toIndentedString(starScore)).append("\n");
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
