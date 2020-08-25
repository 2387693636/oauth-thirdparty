# VideoSearchApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**videoSearchGet**](VideoSearchApi.md#videoSearchGet) | **GET** /video/search/ | 关键词视频搜索

<a name="videoSearchGet"></a>
# **videoSearchGet**
> VideoSearchVideoSearchInlineResponse200 videoSearchGet(openId, accessToken, count, keyword, cursor)

关键词视频搜索

* Scope: &#x60;video.search&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.VideoSearchApi;


VideoSearchApi apiInstance = new VideoSearchApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer count = 56; // Integer | 每页数量
String keyword = "keyword_example"; // String | 关键词
Integer cursor = 56; // Integer | 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
try {
    VideoSearchVideoSearchInlineResponse200 result = apiInstance.videoSearchGet(openId, accessToken, count, keyword, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoSearchApi#videoSearchGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **count** | **Integer**| 每页数量 | [enum: ]
 **keyword** | **String**| 关键词 |
 **cursor** | **Integer**| 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 | [optional]

### Return type

[**VideoSearchVideoSearchInlineResponse200**](VideoSearchVideoSearchInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

