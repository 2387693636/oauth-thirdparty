/*
 * 删除消息卡片
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

import com.douyin.open.models.EnterpriseImCardCardDeleteBody;
import com.douyin.open.models.EnterpriseImCardCardDeleteInlineResponse200;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EnterpriseImCardDelApi
 */
@Ignore
public class EnterpriseImCardDelApiTest {

    private final EnterpriseImCardDelApi api = new EnterpriseImCardDelApi();

    /**
     * 删除消息卡片
     *
     * * Scope: &#x60;enterprise.im&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enterpriseImCardDeletePostTest() {
        EnterpriseImCardCardDeleteBody body = null;
        String openId = null;
        String accessToken = null;
        EnterpriseImCardCardDeleteInlineResponse200 response = api.enterpriseImCardDeletePost(body, openId, accessToken);

        // TODO: test validations
    }
}
