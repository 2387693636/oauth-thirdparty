package com.xq.account.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * @author: zou_xq
 * @description:  抖音发布图片信息
 * @date: 2020/8/26 15:23
 */
@ApiModel(description = "图片消息展示对象")
public class DyPublishImageVo {
    @ApiModelProperty("图片信息")
    private List<String> imageUrl;
    @ApiModelProperty("地理位置id")
    private String poi_id;
    @ApiModelProperty("地理位置名称")
    private String poi_name;
    @ApiModelProperty("标题，可以带话题。 如title1#话题1 #话题2 ")
    private String text;
    @ApiModelProperty("如果需要at其他用户。将text中@nickname对应的open_id放到这里。")
    private List<String> at_users;
    private String micro_app_id;
    private String micro_app_title;
    private String micro_app_url;

    public List<String> getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(List<String> imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPoi_id() {
        return poi_id;
    }

    public void setPoi_id(String poi_id) {
        this.poi_id = poi_id;
    }

    public String getPoi_name() {
        return poi_name;
    }

    public void setPoi_name(String poi_name) {
        this.poi_name = poi_name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getMicro_app_id() {
        return micro_app_id;
    }

    public void setMicro_app_id(String micro_app_id) {
        this.micro_app_id = micro_app_id;
    }

    public String getMicro_app_title() {
        return micro_app_title;
    }

    public void setMicro_app_title(String micro_app_title) {
        this.micro_app_title = micro_app_title;
    }

    public String getMicro_app_url() {
        return micro_app_url;
    }

    public void setMicro_app_url(String micro_app_url) {
        this.micro_app_url = micro_app_url;
    }

    public List<String> getAt_users() {
        return at_users;
    }

    public void setAt_users(List<String> at_users) {
        this.at_users = at_users;
    }
}
