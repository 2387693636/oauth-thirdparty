/*
 * 消息卡片列表
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

import com.douyin.open.models.EnterpriseImCardCardListInlineResponse200;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EnterpriseImCardListApi
 */
@Ignore
public class EnterpriseImCardListApiTest {

    private final EnterpriseImCardListApi api = new EnterpriseImCardListApi();

    /**
     * 获取消息卡片列表
     *
     * * Scope: &#x60;enterprise.im&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enterpriseImCardListGetTest() {
        String openId = null;
        String accessToken = null;
        Integer count = null;
        Integer cursor = null;
        EnterpriseImCardCardListInlineResponse200 response = api.enterpriseImCardListGet(openId, accessToken, count, cursor);

        // TODO: test validations
    }
}
