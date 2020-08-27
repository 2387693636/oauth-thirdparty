package com.xq.account.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: zou_xq
 * @description: 微博认证参数
 * @date: 2020/8/26 14:43
 */
@ApiModel(description = "微博认证参数信息")
public class WeiboOauthVo {
    @ApiModelProperty("微博应用账户ID")
    private String client_id;
    @ApiModelProperty("微博账户token")
    private String access_token;
    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }
}