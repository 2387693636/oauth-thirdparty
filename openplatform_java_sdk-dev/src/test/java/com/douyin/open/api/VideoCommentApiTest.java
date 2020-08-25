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

import com.douyin.open.models.VideoCommentVideoCommentBody;
import com.douyin.open.models.VideoCommentVideoCommentBody1;
import com.douyin.open.models.VideoCommentVideoCommentCommonResponse;
import com.douyin.open.models.VideoCommentVideoCommentInlineResponse200;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VideoCommentApi
 */
@Ignore
public class VideoCommentApiTest {

    private final VideoCommentApi api = new VideoCommentApi();

    /**
     * 评论列表
     *
     * * Scope: &#x60;video.comment&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void videoCommentListGetTest() {
        String openId = null;
        String accessToken = null;
        Integer count = null;
        String itemId = null;
        Integer cursor = null;
        VideoCommentVideoCommentInlineResponse200 response = api.videoCommentListGet(openId, accessToken, count, itemId, cursor);

        // TODO: test validations
    }
    /**
     * 评论回复列表
     *
     * * Scope: &#x60;video.comment&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void videoCommentReplyListGetTest() {
        String openId = null;
        String accessToken = null;
        Integer count = null;
        String itemId = null;
        String commentId = null;
        Integer cursor = null;
        VideoCommentVideoCommentInlineResponse200 response = api.videoCommentReplyListGet(openId, accessToken, count, itemId, commentId, cursor);

        // TODO: test validations
    }
    /**
     * 回复视频评论
     *
     * * Scope: &#x60;video.comment&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void videoCommentReplyPostTest() {
        String openId = null;
        String accessToken = null;
        VideoCommentVideoCommentBody body = null;
        VideoCommentVideoCommentCommonResponse response = api.videoCommentReplyPost(openId, accessToken, body);

        // TODO: test validations
    }
    /**
     * 置顶视频评论(企业号)
     *
     * * Scope: &#x60;video.comment&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void videoCommentTopPostTest() {
        String openId = null;
        String accessToken = null;
        VideoCommentVideoCommentBody1 body = null;
        VideoCommentVideoCommentCommonResponse response = api.videoCommentTopPost(openId, accessToken, body);

        // TODO: test validations
    }
}
