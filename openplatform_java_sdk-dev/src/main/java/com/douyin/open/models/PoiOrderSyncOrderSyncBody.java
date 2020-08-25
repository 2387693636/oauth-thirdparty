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
import com.douyin.open.models.PoiOrderSyncOrderSyncExtShopInfo;
import com.douyin.open.models.PoiOrderSyncOrderSyncPoiordersyncMiniApp;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
/**
 * PoiOrderSyncOrderSyncBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:09:11.552543+08:00[Asia/Shanghai]")
public class PoiOrderSyncOrderSyncBody {
  @JsonProperty("mini_app")
  private PoiOrderSyncOrderSyncPoiordersyncMiniApp miniApp = null;

  /**
   * 订单类型- 201 预约点餐订单, 202 餐厅预定订单, 203 餐厅排队订单, 9001 景区门票订单, 9101 团购券订单, 9201 在线预约订单, 9301 外卖订单
   */
  public enum OrderTypeEnum {
    NUMBER_201(201),
    NUMBER_202(202),
    NUMBER_203(203),
    NUMBER_9001(9001),
    NUMBER_9101(9101),
    NUMBER_9201(9201),
    NUMBER_9301(9301);

    private Integer value;

    OrderTypeEnum(Integer value) {
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
    public static OrderTypeEnum fromValue(String text) {
      for (OrderTypeEnum b : OrderTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("order_type")
  private OrderTypeEnum orderType = null;

  @JsonProperty("date_time")
  private Integer dateTime = null;

  @JsonProperty("order_detail")
  private String orderDetail = null;

  @JsonProperty("ext_shop_info")
  private PoiOrderSyncOrderSyncExtShopInfo extShopInfo = null;

  public PoiOrderSyncOrderSyncBody miniApp(PoiOrderSyncOrderSyncPoiordersyncMiniApp miniApp) {
    this.miniApp = miniApp;
    return this;
  }

   /**
   * Get miniApp
   * @return miniApp
  **/
  @Schema(description = "")
  public PoiOrderSyncOrderSyncPoiordersyncMiniApp getMiniApp() {
    return miniApp;
  }

  public void setMiniApp(PoiOrderSyncOrderSyncPoiordersyncMiniApp miniApp) {
    this.miniApp = miniApp;
  }

  public PoiOrderSyncOrderSyncBody orderType(OrderTypeEnum orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * 订单类型- 201 预约点餐订单, 202 餐厅预定订单, 203 餐厅排队订单, 9001 景区门票订单, 9101 团购券订单, 9201 在线预约订单, 9301 外卖订单
   * @return orderType
  **/
  @Schema(required = true, description = "订单类型- 201 预约点餐订单, 202 餐厅预定订单, 203 餐厅排队订单, 9001 景区门票订单, 9101 团购券订单, 9201 在线预约订单, 9301 外卖订单")
  public OrderTypeEnum getOrderType() {
    return orderType;
  }

  public void setOrderType(OrderTypeEnum orderType) {
    this.orderType = orderType;
  }

  public PoiOrderSyncOrderSyncBody dateTime(Integer dateTime) {
    this.dateTime = dateTime;
    return this;
  }

   /**
   * 发送请求的时间，精确到毫秒
   * @return dateTime
  **/
  @Schema(example = "1", required = true, description = "发送请求的时间，精确到毫秒")
  public Integer getDateTime() {
    return dateTime;
  }

  public void setDateTime(Integer dateTime) {
    this.dateTime = dateTime;
  }

  public PoiOrderSyncOrderSyncBody orderDetail(String orderDetail) {
    this.orderDetail = orderDetail;
    return this;
  }

   /**
   * 订单的细节，不同的订单业务有不同的结构体，请具体询问业务方字段结构
   * @return orderDetail
  **/
  @Schema(required = true, description = "订单的细节，不同的订单业务有不同的结构体，请具体询问业务方字段结构")
  public String getOrderDetail() {
    return orderDetail;
  }

  public void setOrderDetail(String orderDetail) {
    this.orderDetail = orderDetail;
  }

  public PoiOrderSyncOrderSyncBody extShopInfo(PoiOrderSyncOrderSyncExtShopInfo extShopInfo) {
    this.extShopInfo = extShopInfo;
    return this;
  }

   /**
   * Get extShopInfo
   * @return extShopInfo
  **/
  @Schema(required = true, description = "")
  public PoiOrderSyncOrderSyncExtShopInfo getExtShopInfo() {
    return extShopInfo;
  }

  public void setExtShopInfo(PoiOrderSyncOrderSyncExtShopInfo extShopInfo) {
    this.extShopInfo = extShopInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PoiOrderSyncOrderSyncBody body = (PoiOrderSyncOrderSyncBody) o;
    return Objects.equals(this.miniApp, body.miniApp) &&
        Objects.equals(this.orderType, body.orderType) &&
        Objects.equals(this.dateTime, body.dateTime) &&
        Objects.equals(this.orderDetail, body.orderDetail) &&
        Objects.equals(this.extShopInfo, body.extShopInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(miniApp, orderType, dateTime, orderDetail, extShopInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PoiOrderSyncOrderSyncBody {\n");
    
    sb.append("    miniApp: ").append(toIndentedString(miniApp)).append("\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    orderDetail: ").append(toIndentedString(orderDetail)).append("\n");
    sb.append("    extShopInfo: ").append(toIndentedString(extShopInfo)).append("\n");
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