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

import com.douyin.open.models.HotsearchHotsearchInlineResponse200;
import com.douyin.open.models.HotsearchHotsearchInlineResponse2001;
import com.douyin.open.models.HotsearchHotsearchInlineResponse2002;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HotsearchApi
 */
@Ignore
public class HotsearchApiTest {

    private final HotsearchApi api = new HotsearchApi();

    /**
     * 获取实时热点词
     *
     * * Scope: &#x60;hotsearch&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void hotsearchSentencesGetTest() {
        String accessToken = null;
        HotsearchHotsearchInlineResponse200 response = api.hotsearchSentencesGet(accessToken);

        // TODO: test validations
    }
    /**
     * 获取上升词
     *
     * * Scope: &#x60;hotsearch&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void hotsearchTrendingSentencesGetTest() {
        String accessToken = null;
        Integer count = null;
        Integer cursor = null;
        HotsearchHotsearchInlineResponse2001 response = api.hotsearchTrendingSentencesGet(accessToken, count, cursor);

        // TODO: test validations
    }
    /**
     * 获取热点词聚合的视频
     *
     * * Scope: &#x60;hotsearch&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void hotsearchVideosGetTest() {
        String accessToken = null;
        String hotSentence = null;
        HotsearchHotsearchInlineResponse2002 response = api.hotsearchVideosGet(accessToken, hotSentence);

        // TODO: test validations
    }
}
