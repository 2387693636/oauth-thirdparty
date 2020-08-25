package com.xq.account.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author: zou_xq
 * @description: 抖音认证参数
 * @date: 2020/8/25 14:42
 */
@ApiModel(description = "抖音认证信息参数")
public class DyOauthVo extends BaseVo{

    @ApiModelProperty("appId")
    private String appId;
    @ApiModelProperty("appToken")
    private String appToken;
    @ApiModelProperty("CLIENT_KEY")
    private String clientKey;
    @ApiModelProperty("RESPONSE_TYPE")
    private String responseType;

    @ApiModelProperty("SCOPE")
    private String scope;
    @ApiModelProperty("REDIRECT_URI")
    private String redirectUri;
    @ApiModelProperty("STATE")
    private String state;
    @ApiModelProperty("hisId")
    private Long hisId;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppToken() {
        return appToken;
    }

    public void setAppToken(String appToken) {
        this.appToken = appToken;
    }

    public String getClientKey() {
        return clientKey;
    }

    public void setClientKey(String clientKey) {
        this.clientKey = clientKey;
    }

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(String responseType) {
        this.responseType = responseType;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Long getHisId() {
        return hisId;
    }

    public void setHisId(Long hisId) {
        this.hisId = hisId;
    }
}
