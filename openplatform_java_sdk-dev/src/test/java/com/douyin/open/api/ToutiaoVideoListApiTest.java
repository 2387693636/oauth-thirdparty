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

import com.douyin.open.models.ToutiaoVideoListVideoListInlineResponse200;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ToutiaoVideoListApi
 */
@Ignore
public class ToutiaoVideoListApiTest {

    private final ToutiaoVideoListApi api = new ToutiaoVideoListApi();

    /**
     * 查询授权帐号的视频列表
     *
     * * Scope: &#x60;toutiao.video.data&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void toutiaoVideoListGetTest() {
        String openId = null;
        String accessToken = null;
        Integer count = null;
        Integer cursor = null;
        ToutiaoVideoListVideoListInlineResponse200 response = api.toutiaoVideoListGet(openId, accessToken, count, cursor);

        // TODO: test validations
    }
}
