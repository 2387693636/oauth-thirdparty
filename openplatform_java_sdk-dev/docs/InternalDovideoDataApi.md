# InternalDovideoDataApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**internalVideoDataPost**](InternalDovideoDataApi.md#internalVideoDataPost) | **POST** /internal/video/data/ | 批量获取视频数据信息

<a name="internalVideoDataPost"></a>
# **internalVideoDataPost**
> InternalVideoDataInternalVideoDataInlineResponse200 internalVideoDataPost(body, openId, accessToken)

批量获取视频数据信息

* Scope: &#x60;internal.video.data&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.InternalDovideoDataApi;


InternalDovideoDataApi apiInstance = new InternalDovideoDataApi();
InternalVideoDataInternalVideoDataBody body = new InternalVideoDataInternalVideoDataBody(); // InternalVideoDataInternalVideoDataBody | 
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    InternalVideoDataInternalVideoDataInlineResponse200 result = apiInstance.internalVideoDataPost(body, openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InternalDovideoDataApi#internalVideoDataPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InternalVideoDataInternalVideoDataBody**](InternalVideoDataInternalVideoDataBody.md)|  |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**InternalVideoDataInternalVideoDataInlineResponse200**](InternalVideoDataInternalVideoDataInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

