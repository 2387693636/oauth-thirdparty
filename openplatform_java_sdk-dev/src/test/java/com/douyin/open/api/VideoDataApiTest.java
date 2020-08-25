/*
 * 
 * 通过抖音视频id批量获取已分享视频数据信息
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.douyin.open.api;

import com.douyin.open.models.VideoDataVideoDataBody;
import com.douyin.open.models.VideoDataVideoDataInlineResponse200;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VideoDataApi
 */
@Ignore
public class VideoDataApiTest {

    private final VideoDataApi api = new VideoDataApi();

    /**
     * 查询指定视频数据
     *
     * * Scope: &#x60;video.data&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void videoDataPostTest() {
        VideoDataVideoDataBody body = null;
        String openId = null;
        String accessToken = null;
        VideoDataVideoDataInlineResponse200 response = api.videoDataPost(body, openId, accessToken);

        // TODO: test validations
    }
}
