/*
 * 确认退款
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

import com.douyin.open.models.EnterpriseGrouponGrouponOrderOrderRefundConfirmBody;
import com.douyin.open.models.EnterpriseGrouponGrouponOrderOrderRefundConfirmInlineResponse200;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EnterpriseGrouponOrderRefundConfirmApi
 */
@Ignore
public class EnterpriseGrouponOrderRefundConfirmApiTest {

    private final EnterpriseGrouponOrderRefundConfirmApi api = new EnterpriseGrouponOrderRefundConfirmApi();

    /**
     * 确认退款
     *
     * * Scope: &#x60;enterprise.groupon&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enterpriseGrouponOrderRefundConfirmPostTest() {
        String accessToken = null;
        String openId = null;
        EnterpriseGrouponGrouponOrderOrderRefundConfirmBody body = null;
        EnterpriseGrouponGrouponOrderOrderRefundConfirmInlineResponse200 response = api.enterpriseGrouponOrderRefundConfirmPost(accessToken, openId, body);

        // TODO: test validations
    }
}