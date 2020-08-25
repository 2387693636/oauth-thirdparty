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
import java.io.File;
/**
 * VideoCreateAwemeCreateBody2
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-19T14:21:48.922886+08:00[Asia/Shanghai]")
public class VideoCreateAwemeCreateBody2 {
  @JsonProperty("video")
  private File video = null;

  public VideoCreateAwemeCreateBody2 video(File video) {
    this.video = video;
    return this;
  }

   /**
   * 视频分片，建议20MB。但不能小于5MB。 
   * @return video
  **/
  @Schema(required = true, description = "视频分片，建议20MB。但不能小于5MB。 ")
  public File getVideo() {
    return video;
  }

  public void setVideo(File video) {
    this.video = video;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VideoCreateAwemeCreateBody2 body2 = (VideoCreateAwemeCreateBody2) o;
    return Objects.equals(this.video, body2.video);
  }

  @Override
  public int hashCode() {
    return Objects.hash(Objects.hashCode(video));
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoCreateAwemeCreateBody2 {\n");
    
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
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
