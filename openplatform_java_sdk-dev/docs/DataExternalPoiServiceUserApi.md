# DataExternalPoiServiceUserApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dataExternalPoiServiceUserGet**](DataExternalPoiServiceUserApi.md#dataExternalPoiServiceUserGet) | **GET** /data/external/poi/service_user/ | POI服务成交用户数据

<a name="dataExternalPoiServiceUserGet"></a>
# **dataExternalPoiServiceUserGet**
> ExternalDataPoiExternalDataPoiInlineResponse2001 dataExternalPoiServiceUserGet(accessToken, poiId, dateType, serviceType)

POI服务成交用户数据

* Scope: &#x60;data.external.poi&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.DataExternalPoiServiceUserApi;


DataExternalPoiServiceUserApi apiInstance = new DataExternalPoiServiceUserApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
String poiId = "poiId_example"; // String | 抖音poi_id
Integer dateType = 56; // Integer | 近7/15/30天
Integer serviceType = 56; // Integer | 服务类型，40:民宿
try {
    ExternalDataPoiExternalDataPoiInlineResponse2001 result = apiInstance.dataExternalPoiServiceUserGet(accessToken, poiId, dateType, serviceType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExternalPoiServiceUserApi#dataExternalPoiServiceUserGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |
 **poiId** | **String**| 抖音poi_id |
 **dateType** | **Integer**| 近7/15/30天 |
 **serviceType** | **Integer**| 服务类型，40:民宿 | [optional]

### Return type

[**ExternalDataPoiExternalDataPoiInlineResponse2001**](ExternalDataPoiExternalDataPoiInlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

