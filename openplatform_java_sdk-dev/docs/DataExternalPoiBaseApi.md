# DataExternalPoiBaseApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dataExternalPoiBaseGet**](DataExternalPoiBaseApi.md#dataExternalPoiBaseGet) | **GET** /data/external/poi/base/ | 获取POI基础数据

<a name="dataExternalPoiBaseGet"></a>
# **dataExternalPoiBaseGet**
> ExternalDataPoiExternalDataPoiInlineResponse200 dataExternalPoiBaseGet(accessToken, poiId, beginDate, endDate)

获取POI基础数据

* Scope: &#x60;data.external.poi&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.DataExternalPoiBaseApi;


DataExternalPoiBaseApi apiInstance = new DataExternalPoiBaseApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
String poiId = "poiId_example"; // String | 抖音poi_id
String beginDate = "beginDate_example"; // String | 最近30天，开始日期(yyyy-MM-dd)
String endDate = "endDate_example"; // String | 最近30天，结束日期(yyyy-MM-dd)
try {
    ExternalDataPoiExternalDataPoiInlineResponse200 result = apiInstance.dataExternalPoiBaseGet(accessToken, poiId, beginDate, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExternalPoiBaseApi#dataExternalPoiBaseGet");
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

### Return type

[**ExternalDataPoiExternalDataPoiInlineResponse200**](ExternalDataPoiExternalDataPoiInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

