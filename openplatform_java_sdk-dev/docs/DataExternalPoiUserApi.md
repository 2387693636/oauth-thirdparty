# DataExternalPoiUserApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dataExternalPoiUserGet**](DataExternalPoiUserApi.md#dataExternalPoiUserGet) | **GET** /data/external/poi/user/ | POI用户数据

<a name="dataExternalPoiUserGet"></a>
# **dataExternalPoiUserGet**
> ExternalDataPoiExternalDataPoiInlineResponse2001 dataExternalPoiUserGet(accessToken, poiId, dateType)

POI用户数据

* Scope: &#x60;data.external.poi&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.DataExternalPoiUserApi;


DataExternalPoiUserApi apiInstance = new DataExternalPoiUserApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
String poiId = "poiId_example"; // String | 抖音poi_id
Integer dateType = 56; // Integer | 近7/15/30天
try {
    ExternalDataPoiExternalDataPoiInlineResponse2001 result = apiInstance.dataExternalPoiUserGet(accessToken, poiId, dateType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExternalPoiUserApi#dataExternalPoiUserGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |
 **poiId** | **String**| 抖音poi_id |
 **dateType** | **Integer**| 近7/15/30天 |

### Return type

[**ExternalDataPoiExternalDataPoiInlineResponse2001**](ExternalDataPoiExternalDataPoiInlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

