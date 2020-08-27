package com.xq.account.controller;

import com.alibaba.fastjson.JSONObject;
import com.douyin.open.api.OauthCodeApi;
import com.xq.account.constant.DyConstant;
import com.xq.account.service.DyOauthService;
import com.xq.account.vo.BaseResult;
import com.xq.account.vo.DyOauthVo;
import com.xq.account.vo.DyPublishImageVo;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
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
public class TestConnectionDyController {

    private  static final Logger logger = LoggerFactory.getLogger(TestConnectionDyController.class);

    @Autowired
    private DyOauthService dyOauthService;

    /**
     *  douyin获取授权码(code)
     *  注意该URL不是用来请求的, 需要展示给用户用于扫码
     */
    @ApiOperation("抖音授权页面")
    @RequestMapping(value = "/toDouyinAuthUrl",method = {RequestMethod.POST,RequestMethod.GET})
    public BaseResult<String> toDouyinAuthUrl(DyOauthVo vo)
    {
        logger.info("抖音授权页面传入参数对象vo,{}",JSONObject.toJSONString(vo));
        String url = dyOauthService.toDouyinAuthUrl(vo).getData();
        return BaseResult.success(url);
    }

    @ApiOperation("抖音发布视频接口")
    @PostMapping(value = "/publishDouyinVideo")
    public BaseResult<String> publishDouyinVideo(DyOauthVo vo)
    {
        logger.info("抖音发布视频接口传入参数对象vo,{}",JSONObject.toJSONString(vo));
        String url = dyOauthService.toDouyinAuthUrl(vo).getData();
        return BaseResult.success(url);
    }

    @ApiOperation("抖音发布图片文件接口")
    @PostMapping(value = "/publishDouyinImage")
    public BaseResult<Void> publishDouyinImage(DyOauthVo vo , DyPublishImageVo imageVo)
    {
        logger.info("抖音发布图片文件接口传入参数对象vo,{}",JSONObject.toJSONString(vo));
        dyOauthService.publishDouyinImage(vo,imageVo);
        return BaseResult.success();
    }


}
