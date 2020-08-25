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

package com.douyin.open.api;

import com.douyin.open.models.VideoSearchVideoSearchInlineResponse200;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VideoSearchApi
 */
@Ignore
public class VideoSearchApiTest {

    private final VideoSearchApi api = new VideoSearchApi();

    /**
     * 关键词视频搜索
     *
     * * Scope: &#x60;video.search&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void videoSearchGetTest() {
        String openId = null;
        String accessToken = null;
        Integer count = null;
        String keyword = null;
        Integer cursor = null;
        VideoSearchVideoSearchInlineResponse200 response = api.videoSearchGet(openId, accessToken, count, keyword, cursor);

        // TODO: test validations
    }
}
