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

import java.io.File;
import com.douyin.open.models.XiguaVideoCreateBody1;
import com.douyin.open.models.XiguaVideoCreateInlineResponse200;
import com.douyin.open.models.XiguaVideoCreateInlineResponse2001;
import com.douyin.open.models.XiguaVideoCreateInlineResponse2002;
import com.douyin.open.models.XiguaVideoCreateInlineResponse2003;
import com.douyin.open.models.XiguaVideoCreateInlineResponse2004;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for XiguaVideoPublishApi
 */
@Ignore
public class XiguaVideoPublishApiTest {

    private final XiguaVideoPublishApi api = new XiguaVideoPublishApi();

    /**
     * 创建西瓜视频
     *
     * * Scope: &#x60;xigua.video.create&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void xiguaVideoCreatePostTest() {
        String openId = null;
        String accessToken = null;
        XiguaVideoCreateBody1 body = null;
        XiguaVideoCreateInlineResponse2001 response = api.xiguaVideoCreatePost(openId, accessToken, body);

        // TODO: test validations
    }
    /**
     * 完成上传
     *
     * * Scope: &#x60;xigua.video.create&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void xiguaVideoPartCompletePostTest() {
        String openId = null;
        String accessToken = null;
        String uploadId = null;
        XiguaVideoCreateInlineResponse2004 response = api.xiguaVideoPartCompletePost(openId, accessToken, uploadId);

        // TODO: test validations
    }
    /**
     * 初始化上传
     *
     * * Scope: &#x60;xigua.video.create&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void xiguaVideoPartInitPostTest() {
        String openId = null;
        String accessToken = null;
        XiguaVideoCreateInlineResponse2002 response = api.xiguaVideoPartInitPost(openId, accessToken);

        // TODO: test validations
    }
    /**
     * 上传视频分片到文件服务器
     *
     * * Scope: &#x60;xigua.video.create&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void xiguaVideoPartUploadPostTest() {
        File video = null;
        String openId = null;
        String accessToken = null;
        String uploadId = null;
        Integer partNumber = null;
        XiguaVideoCreateInlineResponse2003 response = api.xiguaVideoPartUploadPost(video, openId, accessToken, uploadId, partNumber);

        // TODO: test validations
    }
    /**
     * 上传视频到文件服务器
     *
     * * Scope: &#x60;xigua.video.create&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void xiguaVideoUploadPostTest() {
        File video = null;
        String openId = null;
        String accessToken = null;
        XiguaVideoCreateInlineResponse200 response = api.xiguaVideoUploadPost(video, openId, accessToken);

        // TODO: test validations
    }
}
