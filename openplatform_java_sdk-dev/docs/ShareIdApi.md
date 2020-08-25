# ShareIdApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**shareIdGet**](ShareIdApi.md#shareIdGet) | **GET** /share-id/ | 获取share-id

<a name="shareIdGet"></a>
# **shareIdGet**
> ShareIdShareIdInlineResponse200 shareIdGet(accessToken, needCallback, sourceStyleId, defaultHashtag, linkParam)

获取share-id

* Scope: &#x60;aweme.share&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.ShareIdApi;


ShareIdApi apiInstance = new ShareIdApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
Boolean needCallback = true; // Boolean | 如果需要知道视频分享成功的结果，need_callback设置为true
String sourceStyleId = "sourceStyleId_example"; // String | 多来源样式id（暂未开放）
String defaultHashtag = "defaultHashtag_example"; // String | 追踪分享默认hashtag
String linkParam = "linkParam_example"; // String | 分享来源url附加参数（暂未开放）
try {
    ShareIdShareIdInlineResponse200 result = apiInstance.shareIdGet(accessToken, needCallback, sourceStyleId, defaultHashtag, linkParam);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ShareIdApi#shareIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |
 **needCallback** | **Boolean**| 如果需要知道视频分享成功的结果，need_callback设置为true | [optional]
 **sourceStyleId** | **String**| 多来源样式id（暂未开放） | [optional]
 **defaultHashtag** | **String**| 追踪分享默认hashtag | [optional]
 **linkParam** | **String**| 分享来源url附加参数（暂未开放） | [optional]

### Return type

[**ShareIdShareIdInlineResponse200**](ShareIdShareIdInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

