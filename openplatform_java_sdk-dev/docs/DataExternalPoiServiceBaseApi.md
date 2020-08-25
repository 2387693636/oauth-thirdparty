# DataExternalPoiServiceBaseApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dataExternalPoiServiceBaseGet**](DataExternalPoiServiceBaseApi.md#dataExternalPoiServiceBaseGet) | **GET** /data/external/poi/service_base/ | POI服务基础数据

<a name="dataExternalPoiServiceBaseGet"></a>
# **dataExternalPoiServiceBaseGet**
> ExternalDataPoiExternalDataPoiInlineResponse2002 dataExternalPoiServiceBaseGet(accessToken, poiId, beginDate, endDate, serviceType)

POI服务基础数据

* Scope: &#x60;data.external.poi&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.DataExternalPoiServiceBaseApi;


DataExternalPoiServiceBaseApi apiInstance = new DataExternalPoiServiceBaseApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
String poiId = "poiId_example"; // String | 抖音poi_id
String beginDate = "beginDate_example"; // String | 最近30天，开始日期(yyyy-MM-dd)
String endDate = "endDate_example"; // String | 最近30天，结束日期(yyyy-MM-dd)
Integer serviceType = 56; // Integer | 服务类型，40:民宿
try {
    ExternalDataPoiExternalDataPoiInlineResponse2002 result = apiInstance.dataExternalPoiServiceBaseGet(accessToken, poiId, beginDate, endDate, serviceType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExternalPoiServiceBaseApi#dataExternalPoiServiceBaseGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |
 **poiId** | **String**| 抖音poi_id |
 **beginDate** | **String**| 最近30天，开始日期(yyyy-MM-dd) |
 **endDate** | **String**| 最近30天，结束日期(yyyy-MM-dd) |
 **serviceType** | **Integer**| 服务类型，40:民宿 | [optional]

### Return type

[**ExternalDataPoiExternalDataPoiInlineResponse2002**](ExternalDataPoiExternalDataPoiInlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

