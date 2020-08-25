/*
 * 发送消息
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
 * ImMsgSendImMsgSendBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:09:42.581807+08:00[Asia/Shanghai]")
public class ImMsgSendImMsgSendBody {
  @JsonProperty("to_user_id")
  private String toUserId = null;

  /**
   * 消息内容格式:   * &#x60;text&#x60; - 文本消息   * &#x60;image&#x60; - 图片消息 
   */
  public enum MessageTypeEnum {
    TEXT("text"),
    IMAGE("image");

    private String value;

    MessageTypeEnum(String value) {
      this.value = value;
    }
    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    @JsonCreator
    public static MessageTypeEnum fromValue(String text) {
      for (MessageTypeEnum b : MessageTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

  }  @JsonProperty("message_type")
  private MessageTypeEnum messageType = null;

  @JsonProperty("content")
  private String content = null;

  @JsonProperty("media_id")
  private String mediaId = null;

  public ImMsgSendImMsgSendBody toUserId(String toUserId) {
    this.toUserId = toUserId;
    return this;
  }

   /**
   * 发送消息的接收方openid
   * @return toUserId
  **/
  @Schema(example = "0da22181-d833-447f-995f-1beefea5bef3", required = true, description = "发送消息的接收方openid")
  public String getToUserId() {
    return toUserId;
  }

  public void setToUserId(String toUserId) {
    this.toUserId = toUserId;
  }

  public ImMsgSendImMsgSendBody messageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
    return this;
  }

   /**
   * 消息内容格式:   * &#x60;text&#x60; - 文本消息   * &#x60;image&#x60; - 图片消息 
   * @return messageType
  **/
  @Schema(example = "text", required = true, description = "消息内容格式:   * `text` - 文本消息   * `image` - 图片消息 ")
  public MessageTypeEnum getMessageType() {
    return messageType;
  }

  public void setMessageType(MessageTypeEnum messageType) {
    this.messageType = messageType;
  }

  public ImMsgSendImMsgSendBody content(String content) {
    this.content = content;
    return this;
  }

   /**
   * 文本内容
   * @return content
  **/
  @Schema(example = "这是一条文本消息", required = true, description = "文本内容")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public ImMsgSendImMsgSendBody mediaId(String mediaId) {
    this.mediaId = mediaId;
    return this;
  }

   /**
   * 素材id
   * @return mediaId
  **/
  @Schema(example = "media id", required = true, description = "素材id")
  public String getMediaId() {
    return mediaId;
  }

  public void setMediaId(String mediaId) {
    this.mediaId = mediaId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImMsgSendImMsgSendBody body = (ImMsgSendImMsgSendBody) o;
    return Objects.equals(this.toUserId, body.toUserId) &&
        Objects.equals(this.messageType, body.messageType) &&
        Objects.equals(this.content, body.content) &&
        Objects.equals(this.mediaId, body.mediaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toUserId, messageType, content, mediaId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImMsgSendImMsgSendBody {\n");
    
    sb.append("    toUserId: ").append(toIndentedString(toUserId)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    mediaId: ").append(toIndentedString(mediaId)).append("\n");
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
