/*
 * 发送消息
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

import com.douyin.open.models.ImMsgSendImMsgSendBody;
import com.douyin.open.models.ImMsgSendImMsgSendInlineResponse200;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ImApi
 */
@Ignore
public class ImApiTest {

    private final ImApi api = new ImApi();

    /**
     * 给抖音用户发送消息
     *
     * * Scope: &#x60;im.send&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void imMsgSendPostTest() {
        ImMsgSendImMsgSendBody body = null;
        String openId = null;
        String accessToken = null;
        ImMsgSendImMsgSendInlineResponse200 response = api.imMsgSendPost(body, openId, accessToken);

        // TODO: test validations
    }
}
