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

import com.douyin.open.models.ExternalDataPoiExternalDataPoiInlineResponse2004;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DataExternalPoiClaimListApi
 */
@Ignore
public class DataExternalPoiClaimListApiTest {

    private final DataExternalPoiClaimListApi api = new DataExternalPoiClaimListApi();

    /**
     * POI认领列表
     *
     * * Scope: &#x60;data.external.poi&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dataExternalPoiClaimListGetTest() {
        String accessToken = null;
        String openId = null;
        Integer count = null;
        Integer cursor = null;
        ExternalDataPoiExternalDataPoiInlineResponse2004 response = api.dataExternalPoiClaimListGet(accessToken, openId, count, cursor);

        // TODO: test validations
    }
}
