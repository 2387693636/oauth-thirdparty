# VideoListApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**videoListGet**](VideoListApi.md#videoListGet) | **GET** /video/list/ | 查询授权账号视频数据

<a name="videoListGet"></a>
# **videoListGet**
> VideoListVideoListInlineResponse200 videoListGet(openId, accessToken, count, cursor)

查询授权账号视频数据

* Scope: &#x60;video.list&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.VideoListApi;


VideoListApi apiInstance = new VideoListApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer count = 56; // Integer | 每页数量
Integer cursor = 56; // Integer | 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
try {
    VideoListVideoListInlineResponse200 result = apiInstance.videoListGet(openId, accessToken, count, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoListApi#videoListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **count** | **Integer**| 每页数量 | [enum: ]
 **cursor** | **Integer**| 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 | [optional]

### Return type

[**VideoListVideoListInlineResponse200**](VideoListVideoListInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

