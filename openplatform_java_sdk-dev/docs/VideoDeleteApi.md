# VideoDeleteApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**videoDeletePost**](VideoDeleteApi.md#videoDeletePost) | **POST** /video/delete/ | 删除授权用户发布的视频

<a name="videoDeletePost"></a>
# **videoDeletePost**
> VideoDeleteAwemeDeleteInlineResponse200 videoDeletePost(openId, accessToken, body)

删除授权用户发布的视频

* Scope: &#x60;video.delete&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.VideoDeleteApi;


VideoDeleteApi apiInstance = new VideoDeleteApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
VideoDeleteAwemeDeleteBody body = new VideoDeleteAwemeDeleteBody(); // VideoDeleteAwemeDeleteBody | 
try {
    VideoDeleteAwemeDeleteInlineResponse200 result = apiInstance.videoDeletePost(openId, accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoDeleteApi#videoDeletePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **body** | [**VideoDeleteAwemeDeleteBody**](VideoDeleteAwemeDeleteBody.md)|  | [optional]

### Return type

[**VideoDeleteAwemeDeleteInlineResponse200**](VideoDeleteAwemeDeleteInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

