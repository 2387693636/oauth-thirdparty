/*
 * 客服会话删除
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
 * EnterprisePersonaPersonaConvDeleteBody
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:06:46.137934+08:00[Asia/Shanghai]")
public class EnterprisePersonaPersonaConvDeleteBody {
  @JsonProperty("to_user_id")
  private String toUserId = null;

  @JsonProperty("persona_id")
  private String personaId = null;

  public EnterprisePersonaPersonaConvDeleteBody toUserId(String toUserId) {
    this.toUserId = toUserId;
    return this;
  }

   /**
   * 会话对方的open_id
   * @return toUserId
  **/
  @Schema(example = "ba253642-0590-40bc-9bdf-9a1334b94059", required = true, description = "会话对方的open_id")
  public String getToUserId() {
    return toUserId;
  }

  public void setToUserId(String toUserId) {
    this.toUserId = toUserId;
  }

  public EnterprisePersonaPersonaConvDeleteBody personaId(String personaId) {
    this.personaId = personaId;
    return this;
  }

   /**
   * 客服id
   * @return personaId
  **/
  @Schema(example = "12345", required = true, description = "客服id")
  public String getPersonaId() {
    return personaId;
  }

  public void setPersonaId(String personaId) {
    this.personaId = personaId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterprisePersonaPersonaConvDeleteBody body = (EnterprisePersonaPersonaConvDeleteBody) o;
    return Objects.equals(this.toUserId, body.toUserId) &&
        Objects.equals(this.personaId, body.personaId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(toUserId, personaId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterprisePersonaPersonaConvDeleteBody {\n");
    
    sb.append("    toUserId: ").append(toIndentedString(toUserId)).append("\n");
    sb.append("    personaId: ").append(toIndentedString(personaId)).append("\n");
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
