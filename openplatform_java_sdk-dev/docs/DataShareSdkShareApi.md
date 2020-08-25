# DataShareSdkShareApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dataExternalSdkShareGet**](DataShareSdkShareApi.md#dataExternalSdkShareGet) | **GET** /data/external/sdk_share/ | 获取SDK分享视频数据

<a name="dataExternalSdkShareGet"></a>
# **dataExternalSdkShareGet**
> ExternalDataSdkShareExternalDataSdkShareInlineResponse200 dataExternalSdkShareGet(accessToken, beginDate, endDate)

获取SDK分享视频数据

* Scope: &#x60;data.external.sdk_share&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.DataShareSdkShareApi;


DataShareSdkShareApi apiInstance = new DataShareSdkShareApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
String beginDate = "beginDate_example"; // String | 最近30天，开始日期(yyyy-MM-dd)
String endDate = "endDate_example"; // String | 最近30天，结束日期(yyyy-MM-dd)
try {
    ExternalDataSdkShareExternalDataSdkShareInlineResponse200 result = apiInstance.dataExternalSdkShareGet(accessToken, beginDate, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataShareSdkShareApi#dataExternalSdkShareGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |
 **beginDate** | **String**| 最近30天，开始日期(yyyy-MM-dd) |
 **endDate** | **String**| 最近30天，结束日期(yyyy-MM-dd) |

### Return type

[**ExternalDataSdkShareExternalDataSdkShareInlineResponse200**](ExternalDataSdkShareExternalDataSdkShareInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

