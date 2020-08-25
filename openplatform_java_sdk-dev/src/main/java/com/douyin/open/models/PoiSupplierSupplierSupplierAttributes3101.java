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
import com.douyin.open.models.PoiSupplierSupplierNodeStruct;
import com.douyin.open.models.PoiSupplierSupplierSupplierAttributes3101Facility;
import com.douyin.open.models.PoiSupplierSupplierSupplierAttributes3101PreferentialPolicy;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
/**
 * 景区须知
 */
@Schema(description = "景区须知")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:08:47.759385+08:00[Asia/Shanghai]")
public class PoiSupplierSupplierSupplierAttributes3101 {
  @JsonProperty("open_time")
  private String openTime = null;

  @JsonProperty("open_time_ext")
  private List<PoiSupplierSupplierNodeStruct> openTimeExt = null;

  @JsonProperty("preferential_policy")
  private List<PoiSupplierSupplierSupplierAttributes3101PreferentialPolicy> preferentialPolicy = null;

  @JsonProperty("preferential_policy_ext")
  private List<PoiSupplierSupplierNodeStruct> preferentialPolicyExt = null;

  @JsonProperty("facility")
  private List<PoiSupplierSupplierSupplierAttributes3101Facility> facility = null;

  @JsonProperty("play_intro")
  private List<PoiSupplierSupplierNodeStruct> playIntro = null;

  @JsonProperty("traffic")
  private List<PoiSupplierSupplierNodeStruct> traffic = null;

  @JsonProperty("pet")
  private Integer pet = null;

  @JsonProperty("scenic_intro")
  private List<PoiSupplierSupplierNodeStruct> scenicIntro = null;

  public PoiSupplierSupplierSupplierAttributes3101 openTime(String openTime) {
    this.openTime = openTime;
    return this;
  }

   /**
   * 开放时间
   * @return openTime
  **/
  @Schema(example = "08:00-22:00(最晚入场时间17:00)", description = "开放时间")
  public String getOpenTime() {
    return openTime;
  }

  public void setOpenTime(String openTime) {
    this.openTime = openTime;
  }

  public PoiSupplierSupplierSupplierAttributes3101 openTimeExt(List<PoiSupplierSupplierNodeStruct> openTimeExt) {
    this.openTimeExt = openTimeExt;
    return this;
  }

  public PoiSupplierSupplierSupplierAttributes3101 addOpenTimeExtItem(PoiSupplierSupplierNodeStruct openTimeExtItem) {
    if (this.openTimeExt == null) {
      this.openTimeExt = new ArrayList<>();
    }
    this.openTimeExt.add(openTimeExtItem);
    return this;
  }

   /**
   * 开放时间-扩展区(不超过200个汉字)
   * @return openTimeExt
  **/
  @Schema(example = "[{\"node_type\":1,\"content\":\"以景区当天营业时间为准\"}]", description = "开放时间-扩展区(不超过200个汉字)")
  public List<PoiSupplierSupplierNodeStruct> getOpenTimeExt() {
    return openTimeExt;
  }

  public void setOpenTimeExt(List<PoiSupplierSupplierNodeStruct> openTimeExt) {
    this.openTimeExt = openTimeExt;
  }

  public PoiSupplierSupplierSupplierAttributes3101 preferentialPolicy(List<PoiSupplierSupplierSupplierAttributes3101PreferentialPolicy> preferentialPolicy) {
    this.preferentialPolicy = preferentialPolicy;
    return this;
  }

  public PoiSupplierSupplierSupplierAttributes3101 addPreferentialPolicyItem(PoiSupplierSupplierSupplierAttributes3101PreferentialPolicy preferentialPolicyItem) {
    if (this.preferentialPolicy == null) {
      this.preferentialPolicy = new ArrayList<>();
    }
    this.preferentialPolicy.add(preferentialPolicyItem);
    return this;
  }

   /**
   * 优待政策(不超过200个汉字)
   * @return preferentialPolicy
  **/
  @Schema(example = "[{\"population\":[1],\"condition\":\"3周岁以内\",\"discount\":\"免费\"},{\"population\":[3],\"condition\":\"65周岁及以上\",\"discount\":\"免费\"}]", description = "优待政策(不超过200个汉字)")
  public List<PoiSupplierSupplierSupplierAttributes3101PreferentialPolicy> getPreferentialPolicy() {
    return preferentialPolicy;
  }

  public void setPreferentialPolicy(List<PoiSupplierSupplierSupplierAttributes3101PreferentialPolicy> preferentialPolicy) {
    this.preferentialPolicy = preferentialPolicy;
  }

  public PoiSupplierSupplierSupplierAttributes3101 preferentialPolicyExt(List<PoiSupplierSupplierNodeStruct> preferentialPolicyExt) {
    this.preferentialPolicyExt = preferentialPolicyExt;
    return this;
  }

  public PoiSupplierSupplierSupplierAttributes3101 addPreferentialPolicyExtItem(PoiSupplierSupplierNodeStruct preferentialPolicyExtItem) {
    if (this.preferentialPolicyExt == null) {
      this.preferentialPolicyExt = new ArrayList<>();
    }
    this.preferentialPolicyExt.add(preferentialPolicyExtItem);
    return this;
  }

   /**
   * 优待政策-扩展区(不超过1000个汉字)
   * @return preferentialPolicyExt
  **/
  @Schema(example = "[{\"node_type\":1,\"content\":\"儿童优惠\"}]", description = "优待政策-扩展区(不超过1000个汉字)")
  public List<PoiSupplierSupplierNodeStruct> getPreferentialPolicyExt() {
    return preferentialPolicyExt;
  }

  public void setPreferentialPolicyExt(List<PoiSupplierSupplierNodeStruct> preferentialPolicyExt) {
    this.preferentialPolicyExt = preferentialPolicyExt;
  }

  public PoiSupplierSupplierSupplierAttributes3101 facility(List<PoiSupplierSupplierSupplierAttributes3101Facility> facility) {
    this.facility = facility;
    return this;
  }

  public PoiSupplierSupplierSupplierAttributes3101 addFacilityItem(PoiSupplierSupplierSupplierAttributes3101Facility facilityItem) {
    if (this.facility == null) {
      this.facility = new ArrayList<>();
    }
    this.facility.add(facilityItem);
    return this;
  }

   /**
   * 服务设施列表
   * @return facility
  **/
  @Schema(example = "[{\"name\":\"免费停车场\"},{\"name\":\"婴儿车租赁\"}]", description = "服务设施列表")
  public List<PoiSupplierSupplierSupplierAttributes3101Facility> getFacility() {
    return facility;
  }

  public void setFacility(List<PoiSupplierSupplierSupplierAttributes3101Facility> facility) {
    this.facility = facility;
  }

  public PoiSupplierSupplierSupplierAttributes3101 playIntro(List<PoiSupplierSupplierNodeStruct> playIntro) {
    this.playIntro = playIntro;
    return this;
  }

  public PoiSupplierSupplierSupplierAttributes3101 addPlayIntroItem(PoiSupplierSupplierNodeStruct playIntroItem) {
    if (this.playIntro == null) {
      this.playIntro = new ArrayList<>();
    }
    this.playIntro.add(playIntroItem);
    return this;
  }

   /**
   * 玩法介绍(不超过200个汉字)
   * @return playIntro
  **/
  @Schema(example = "[{\"node_type\":1,\"content\":\"xx季节适合游玩\"},{\"node_type\":1,\"content\":\"xx季节适合游玩2\"}]", description = "玩法介绍(不超过200个汉字)")
  public List<PoiSupplierSupplierNodeStruct> getPlayIntro() {
    return playIntro;
  }

  public void setPlayIntro(List<PoiSupplierSupplierNodeStruct> playIntro) {
    this.playIntro = playIntro;
  }

  public PoiSupplierSupplierSupplierAttributes3101 traffic(List<PoiSupplierSupplierNodeStruct> traffic) {
    this.traffic = traffic;
    return this;
  }

  public PoiSupplierSupplierSupplierAttributes3101 addTrafficItem(PoiSupplierSupplierNodeStruct trafficItem) {
    if (this.traffic == null) {
      this.traffic = new ArrayList<>();
    }
    this.traffic.add(trafficItem);
    return this;
  }

   /**
   * 交通(不超过200个汉字)
   * @return traffic
  **/
  @Schema(example = "[{\"node_type\":1,\"content\":\"乘坐轨道交通11号线，在迪士尼站下车\"}]", description = "交通(不超过200个汉字)")
  public List<PoiSupplierSupplierNodeStruct> getTraffic() {
    return traffic;
  }

  public void setTraffic(List<PoiSupplierSupplierNodeStruct> traffic) {
    this.traffic = traffic;
  }

  public PoiSupplierSupplierSupplierAttributes3101 pet(Integer pet) {
    this.pet = pet;
    return this;
  }

   /**
   * 宠物携带(1:可携带宠物，2:不可携带宠物)
   * @return pet
  **/
  @Schema(example = "1", description = "宠物携带(1:可携带宠物，2:不可携带宠物)")
  public Integer getPet() {
    return pet;
  }

  public void setPet(Integer pet) {
    this.pet = pet;
  }

  public PoiSupplierSupplierSupplierAttributes3101 scenicIntro(List<PoiSupplierSupplierNodeStruct> scenicIntro) {
    this.scenicIntro = scenicIntro;
    return this;
  }

  public PoiSupplierSupplierSupplierAttributes3101 addScenicIntroItem(PoiSupplierSupplierNodeStruct scenicIntroItem) {
    if (this.scenicIntro == null) {
      this.scenicIntro = new ArrayList<>();
    }
    this.scenicIntro.add(scenicIntroItem);
    return this;
  }

   /**
   * 景点介绍(不超过2000个汉字)
   * @return scenicIntro
  **/
  @Schema(example = "[{\"node_type\":1,\"content\":\"好地方\"},{\"node_type\":2,\"content\":\"https://xx.com/x.jpg\"}]", description = "景点介绍(不超过2000个汉字)")
  public List<PoiSupplierSupplierNodeStruct> getScenicIntro() {
    return scenicIntro;
  }

  public void setScenicIntro(List<PoiSupplierSupplierNodeStruct> scenicIntro) {
    this.scenicIntro = scenicIntro;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiSupplierSupplierSupplierAttributes3101 supplierAttributes3101 = (PoiSupplierSupplierSupplierAttributes3101) o;
    return Objects.equals(this.openTime, supplierAttributes3101.openTime) &&
        Objects.equals(this.openTimeExt, supplierAttributes3101.openTimeExt) &&
        Objects.equals(this.preferentialPolicy, supplierAttributes3101.preferentialPolicy) &&
        Objects.equals(this.preferentialPolicyExt, supplierAttributes3101.preferentialPolicyExt) &&
        Objects.equals(this.facility, supplierAttributes3101.facility) &&
        Objects.equals(this.playIntro, supplierAttributes3101.playIntro) &&
        Objects.equals(this.traffic, supplierAttributes3101.traffic) &&
        Objects.equals(this.pet, supplierAttributes3101.pet) &&
        Objects.equals(this.scenicIntro, supplierAttributes3101.scenicIntro);
  }

  @Override
  public int hashCode() {
    return Objects.hash(openTime, openTimeExt, preferentialPolicy, preferentialPolicyExt, facility, playIntro, traffic, pet, scenicIntro);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiSupplierSupplierSupplierAttributes3101 {\n");
    
    sb.append("    openTime: ").append(toIndentedString(openTime)).append("\n");
    sb.append("    openTimeExt: ").append(toIndentedString(openTimeExt)).append("\n");
    sb.append("    preferentialPolicy: ").append(toIndentedString(preferentialPolicy)).append("\n");
    sb.append("    preferentialPolicyExt: ").append(toIndentedString(preferentialPolicyExt)).append("\n");
    sb.append("    facility: ").append(toIndentedString(facility)).append("\n");
    sb.append("    playIntro: ").append(toIndentedString(playIntro)).append("\n");
    sb.append("    traffic: ").append(toIndentedString(traffic)).append("\n");
    sb.append("    pet: ").append(toIndentedString(pet)).append("\n");
    sb.append("    scenicIntro: ").append(toIndentedString(scenicIntro)).append("\n");
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
