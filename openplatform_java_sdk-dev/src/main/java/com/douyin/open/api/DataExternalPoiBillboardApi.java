package com.douyin.open.api;

import com.douyin.open.ApiClient;

import com.douyin.open.models.ExternalDataPoiExternalDataPoiInlineResponse2003;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-13T12:09:15.723137+08:00[Asia/Shanghai]")@Component("com.douyin.open.api.DataExternalPoiBillboardApi")
public class DataExternalPoiBillboardApi {
    private ApiClient apiClient;

    public DataExternalPoiBillboardApi() {
        this(new ApiClient());
    }

    @Autowired
    public DataExternalPoiBillboardApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * POI热度榜
     * * Scope: &#x60;data.external.poi&#x60; 
     * <p><b>200</b>
     * @param accessToken 调用/oauth/client_token/生成的token，此token不需要用户授权。
     * @param billboardType 10：近30日餐饮类POI的热度TOP500；20：近30日景点类POI的热度TOP500；30：近30日住宿类POI的热度TOP500
     * @return ExternalDataPoiExternalDataPoiInlineResponse2003
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExternalDataPoiExternalDataPoiInlineResponse2003 dataExternalPoiBillboardGet(String accessToken, Integer billboardType) throws RestClientException {
        Object postBody = null;
        // verify the required parameter 'accessToken' is set
        if (accessToken == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessToken' when calling dataExternalPoiBillboardGet");
        }
        // verify the required parameter 'billboardType' is set
        if (billboardType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'billboardType' when calling dataExternalPoiBillboardGet");
        }
        String path = UriComponentsBuilder.fromPath("/data/external/poi/billboard/").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "access_token", accessToken));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "billboard_type", billboardType));

        final String[] accepts = { 
            "application/json"
         };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<ExternalDataPoiExternalDataPoiInlineResponse2003> returnType = new ParameterizedTypeReference<ExternalDataPoiExternalDataPoiInlineResponse2003>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
