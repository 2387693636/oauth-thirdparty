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
 * UserFollowingFollowingUser
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:09:25.484473+08:00[Asia/Shanghai]")
public class UserFollowingFollowingUser {
  @JsonProperty("open_id")
  private String openId = null;

  @JsonProperty("union_id")
  private String unionId = null;

  @JsonProperty("nickname")
  private String nickname = null;

  @JsonProperty("avatar")
  private String avatar = null;

  @JsonProperty("city")
  private String city = null;

  @JsonProperty("province")
  private String province = null;

  @JsonProperty("country")
  private String country = null;

  /**
   * 性别:   * &#x60;0&#x60; - 未知   * &#x60;1&#x60; - 男性   * &#x60;2&#x60; - 女性 
   */
  public enum GenderEnum {
    NUMBER_0(0),
    NUMBER_1(1),
    NUMBER_2(2);

    private Integer value;

    GenderEnum(Integer value) {
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
    public static GenderEnum fromValue(String text) {
      for (GenderEnum b : GenderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("gender")
  private GenderEnum gender = null;

  public UserFollowingFollowingUser openId(String openId) {
    this.openId = openId;
    return this;
  }

   /**
   * 用户在当前应用的唯一标识
   * @return openId
  **/
  @Schema(example = "0da22181-d833-447f-995f-1beefea5bef3", description = "用户在当前应用的唯一标识")
  public String getOpenId() {
    return openId;
  }

  public void setOpenId(String openId) {
    this.openId = openId;
  }

  public UserFollowingFollowingUser unionId(String unionId) {
    this.unionId = unionId;
    return this;
  }

   /**
   * 用户在当前开发者账号下的唯一标识（未绑定开发者账号没有该字段）
   * @return unionId
  **/
  @Schema(example = "1ad4e099-4a0c-47d1-a410-bffb4f2f64a4", description = "用户在当前开发者账号下的唯一标识（未绑定开发者账号没有该字段）")
  public String getUnionId() {
    return unionId;
  }

  public void setUnionId(String unionId) {
    this.unionId = unionId;
  }

  public UserFollowingFollowingUser nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

   /**
   * Get nickname
   * @return nickname
  **/
  @Schema(example = "张伟", description = "")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public UserFollowingFollowingUser avatar(String avatar) {
    this.avatar = avatar;
    return this;
  }

   /**
   * Get avatar
   * @return avatar
  **/
  @Schema(example = "https://example.com/x.jpeg", description = "")
  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

  public UserFollowingFollowingUser city(String city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @Schema(example = "上海", description = "")
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public UserFollowingFollowingUser province(String province) {
    this.province = province;
    return this;
  }

   /**
   * Get province
   * @return province
  **/
  @Schema(example = "上海", description = "")
  public String getProvince() {
    return province;
  }

  public void setProvince(String province) {
    this.province = province;
  }

  public UserFollowingFollowingUser country(String country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @Schema(example = "中国", description = "")
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public UserFollowingFollowingUser gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

   /**
   * 性别:   * &#x60;0&#x60; - 未知   * &#x60;1&#x60; - 男性   * &#x60;2&#x60; - 女性 
   * @return gender
  **/
  @Schema(description = "性别:   * `0` - 未知   * `1` - 男性   * `2` - 女性 ")
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserFollowingFollowingUser user = (UserFollowingFollowingUser) o;
    return Objects.equals(this.openId, user.openId) &&
        Objects.equals(this.unionId, user.unionId) &&
        Objects.equals(this.nickname, user.nickname) &&
        Objects.equals(this.avatar, user.avatar) &&
        Objects.equals(this.city, user.city) &&
        Objects.equals(this.province, user.province) &&
        Objects.equals(this.country, user.country) &&
        Objects.equals(this.gender, user.gender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openId, unionId, nickname, avatar, city, province, country, gender);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserFollowingFollowingUser {\n");
    
    sb.append("    openId: ").append(toIndentedString(openId)).append("\n");
    sb.append("    unionId: ").append(toIndentedString(unionId)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    avatar: ").append(toIndentedString(avatar)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    province: ").append(toIndentedString(province)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
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
