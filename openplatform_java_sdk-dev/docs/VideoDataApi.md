# VideoDataApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**videoDataPost**](VideoDataApi.md#videoDataPost) | **POST** /video/data/ | 查询指定视频数据

<a name="videoDataPost"></a>
# **videoDataPost**
> VideoDataVideoDataInlineResponse200 videoDataPost(body, openId, accessToken)

查询指定视频数据

* Scope: &#x60;video.data&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.VideoDataApi;


VideoDataApi apiInstance = new VideoDataApi();
VideoDataVideoDataBody body = new VideoDataVideoDataBody(); // VideoDataVideoDataBody | 
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    VideoDataVideoDataInlineResponse200 result = apiInstance.videoDataPost(body, openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoDataApi#videoDataPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VideoDataVideoDataBody**](VideoDataVideoDataBody.md)|  |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**VideoDataVideoDataInlineResponse200**](VideoDataVideoDataInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

