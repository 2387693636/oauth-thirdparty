# DataExternalPoiBillboardApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dataExternalPoiBillboardGet**](DataExternalPoiBillboardApi.md#dataExternalPoiBillboardGet) | **GET** /data/external/poi/billboard/ | POI热度榜

<a name="dataExternalPoiBillboardGet"></a>
# **dataExternalPoiBillboardGet**
> ExternalDataPoiExternalDataPoiInlineResponse2003 dataExternalPoiBillboardGet(accessToken, billboardType)

POI热度榜

* Scope: &#x60;data.external.poi&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.DataExternalPoiBillboardApi;


DataExternalPoiBillboardApi apiInstance = new DataExternalPoiBillboardApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
Integer billboardType = 56; // Integer | 10：近30日餐饮类POI的热度TOP500；20：近30日景点类POI的热度TOP500；30：近30日住宿类POI的热度TOP500
try {
    ExternalDataPoiExternalDataPoiInlineResponse2003 result = apiInstance.dataExternalPoiBillboardGet(accessToken, billboardType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExternalPoiBillboardApi#dataExternalPoiBillboardGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |
 **billboardType** | **Integer**| 10：近30日餐饮类POI的热度TOP500；20：近30日景点类POI的热度TOP500；30：近30日住宿类POI的热度TOP500 |

### Return type

[**ExternalDataPoiExternalDataPoiInlineResponse2003**](ExternalDataPoiExternalDataPoiInlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

