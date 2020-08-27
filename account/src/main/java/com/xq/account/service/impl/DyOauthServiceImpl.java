package com.xq.account.service.impl;

import ch.qos.logback.core.util.FileUtil;
import com.alibaba.fastjson.JSONObject;
import com.douyin.open.api.ImageApi;
import com.douyin.open.models.ImageCreateImageCreateBody1;
import com.douyin.open.models.ImageCreateImageCreateInlineResponse200;
import com.douyin.open.models.ImageCreateImageCreateInlineResponse2001;
import com.douyin.open.models.VideoDataVideoDataBody;
import com.xq.account.service.DyOauthService;
import com.xq.account.util.FileUtils;
import com.xq.account.vo.BaseResult;
import com.xq.account.vo.DyOauthVo;
import com.xq.account.vo.DyPublishImageVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.FileSystemUtils;

import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: zou_xq
 * @description:
 * @date: 2020/8/25 14:55
 */
@Service
public class DyOauthServiceImpl implements DyOauthService {
    private static final Logger logger = LoggerFactory.getLogger(DyOauthServiceImpl.class);

    @Override
    public BaseResult<String> toDouyinAuthUrl(DyOauthVo vo) {
        BaseResult<String> result = new BaseResult<>();
        String code = "https://open.douyin.com/platform/oauth/connect/?client_key=" + vo.getClientKey()
                + "&response_type=" + vo.getResponseType() + "&scope=" + vo.getScope() + "&redirect_uri=" + vo.getRedirectUri()
                + "&state=" + vo.getState();
        logger.info("qrConnect requestUrl=" + code);
        result.setCode(0);
        result.setData(code);
        return result;
    }

    @Override
    public BaseResult<Void> publishDouyinImage(DyOauthVo vo , DyPublishImageVo imageVo) {
        ImageApi imageApi = new ImageApi();
        List<String> imageUrls = imageVo.getImageUrl();
        File imageFile = new File(imageUrls.get(0));
        //先上传图片到服务器上 得到image_id
        ImageCreateImageCreateInlineResponse200 imageId = imageApi.imageUploadPost(imageFile,
                vo.getAppId(), vo.getAppToken());
        ImageCreateImageCreateBody1 body1 = new ImageCreateImageCreateBody1();
        body1.setImageId(imageId.getData().getImage().getImageId());
        body1.setText(imageVo.getText());
        //发布
        ImageCreateImageCreateInlineResponse2001 result = imageApi.imageCreatePost(vo.getAppId(), vo.getAppToken(), body1);
        logger.info("result:{}", JSONObject.toJSONString(result));
        return BaseResult.success();
    }
}
