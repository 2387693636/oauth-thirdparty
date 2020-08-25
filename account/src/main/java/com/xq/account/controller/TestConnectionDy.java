package com.xq.account.controller;

import com.alibaba.fastjson.JSONObject;
import com.douyin.open.api.OauthCodeApi;
import com.xq.account.constant.DyConstant;
import com.xq.account.service.DyOauthService;
import com.xq.account.vo.BaseResult;
import com.xq.account.vo.DyOauthVo;
import io.swagger.annotations.ApiModelProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestClientException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: zou_xq
 * @description:
 * @date: 2020/8/25 11:40
 */
@RestController("/dy")
public class TestConnectionDy {

    private  static final Logger logger = LoggerFactory.getLogger(TestConnectionDy.class);

    @Autowired
    private DyOauthService dyOauthService;

    /**
     *  douyin获取授权码(code)
     *  注意该URL不是用来请求的, 需要展示给用户用于扫码
     */
    @GetMapping(value = "/getCode")
    public BaseResult<Void> getCode(HttpServletRequest request, HttpServletResponse response,DyOauthVo codes)  throws IOException {
        logger.info("传入参数DyOauthVo:{}", JSONObject.toJSONString(codes));
        String requestUrl = dyOauthService.qrcodeAuth(codes).checkAndGetData();
        response.sendRedirect(requestUrl);
        return BaseResult.success();
    }
}
