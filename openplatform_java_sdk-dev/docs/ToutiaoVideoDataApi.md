# ToutiaoVideoDataApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**toutiaoVideoDataPost**](ToutiaoVideoDataApi.md#toutiaoVideoDataPost) | **POST** /toutiao/video/data/ | 查询特定视频的视频信息

<a name="toutiaoVideoDataPost"></a>
# **toutiaoVideoDataPost**
> ToutiaoVideoDataVideoDataInlineResponse200 toutiaoVideoDataPost(body, openId, accessToken)

查询特定视频的视频信息

* Scope: &#x60;toutiao.video.data&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.ToutiaoVideoDataApi;


ToutiaoVideoDataApi apiInstance = new ToutiaoVideoDataApi();
ToutiaoVideoDataVideoDataBody body = new ToutiaoVideoDataVideoDataBody(); // ToutiaoVideoDataVideoDataBody | 
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    ToutiaoVideoDataVideoDataInlineResponse200 result = apiInstance.toutiaoVideoDataPost(body, openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToutiaoVideoDataApi#toutiaoVideoDataPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ToutiaoVideoDataVideoDataBody**](ToutiaoVideoDataVideoDataBody.md)|  |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**ToutiaoVideoDataVideoDataInlineResponse200**](ToutiaoVideoDataVideoDataInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

