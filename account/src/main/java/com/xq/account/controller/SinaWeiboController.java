package com.xq.account.controller;

import com.alibaba.fastjson.JSONObject;
import com.xq.account.service.DyOauthService;
import com.xq.account.service.WeiboService;
import com.xq.account.vo.BaseResult;
import com.xq.account.vo.DyOauthVo;
import com.xq.account.vo.WeiboOauthVo;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zou_xq
 * @description:
 * @date: 2020/8/26 14:40
 */
@RestController("/weibo")
public class SinaWeiboController {
    private  static final Logger logger = LoggerFactory.getLogger(TestConnectionDyController.class);

    @Autowired
    private WeiboService weiboService;

    /**
     *微博授权
     */
    @ApiOperation("微博授权页面")
    @RequestMapping(value = "/toWeiboAuthUrl",method = {RequestMethod.POST,RequestMethod.GET})
    public BaseResult<String> toWeiboAuthUrl(WeiboOauthVo vo)
    {
        logger.info("传入参数对象vo,{}", JSONObject.toJSONString(vo));
        String url = weiboService.toWeiboAuthUrl(vo).getData();
        return BaseResult.success(url);
    }

}
