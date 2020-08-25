# VideoSearchCommentApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**videoSearchCommentListGet**](VideoSearchCommentApi.md#videoSearchCommentListGet) | **GET** /video/search/comment/list/ | 评论列表
[**videoSearchCommentReplyListGet**](VideoSearchCommentApi.md#videoSearchCommentReplyListGet) | **GET** /video/search/comment/reply/list/ | 评论回复列表
[**videoSearchCommentReplyPost**](VideoSearchCommentApi.md#videoSearchCommentReplyPost) | **POST** /video/search/comment/reply/ | 回复视频评论

<a name="videoSearchCommentListGet"></a>
# **videoSearchCommentListGet**
> VideoSearchCommentVideoSearchCommentInlineResponse200 videoSearchCommentListGet(accessToken, count, secItemId, cursor)

评论列表

* Scope: &#x60;video.search.comment&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.VideoSearchCommentApi;


VideoSearchCommentApi apiInstance = new VideoSearchCommentApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
Integer count = 56; // Integer | 每页数量
String secItemId = "secItemId_example"; // String | 视频搜索接口返回的加密的视频id
Integer cursor = 56; // Integer | 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
try {
    VideoSearchCommentVideoSearchCommentInlineResponse200 result = apiInstance.videoSearchCommentListGet(accessToken, count, secItemId, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoSearchCommentApi#videoSearchCommentListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |
 **count** | **Integer**| 每页数量 | [enum: ]
 **secItemId** | **String**| 视频搜索接口返回的加密的视频id |
 **cursor** | **Integer**| 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 | [optional]

### Return type

[**VideoSearchCommentVideoSearchCommentInlineResponse200**](VideoSearchCommentVideoSearchCommentInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="videoSearchCommentReplyListGet"></a>
# **videoSearchCommentReplyListGet**
> VideoSearchCommentVideoSearchCommentInlineResponse200 videoSearchCommentReplyListGet(accessToken, count, secItemId, commentId, cursor)

评论回复列表

* Scope: &#x60;video.search.comment&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.VideoSearchCommentApi;


VideoSearchCommentApi apiInstance = new VideoSearchCommentApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
Integer count = 56; // Integer | 每页数量
String secItemId = "secItemId_example"; // String | 视频搜索接口返回的加密的视频id
String commentId = "commentId_example"; // String | 评论id
Integer cursor = 56; // Integer | 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
try {
    VideoSearchCommentVideoSearchCommentInlineResponse200 result = apiInstance.videoSearchCommentReplyListGet(accessToken, count, secItemId, commentId, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoSearchCommentApi#videoSearchCommentReplyListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |
 **count** | **Integer**| 每页数量 | [enum: ]
 **secItemId** | **String**| 视频搜索接口返回的加密的视频id |
 **commentId** | **String**| 评论id |
 **cursor** | **Integer**| 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 | [optional]

### Return type

[**VideoSearchCommentVideoSearchCommentInlineResponse200**](VideoSearchCommentVideoSearchCommentInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="videoSearchCommentReplyPost"></a>
# **videoSearchCommentReplyPost**
> VideoSearchCommentVideoSearchCommentInlineResponse2001 videoSearchCommentReplyPost(openId, accessToken, body)

回复视频评论

* Scope: &#x60;video.search.comment&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.VideoSearchCommentApi;


VideoSearchCommentApi apiInstance = new VideoSearchCommentApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
VideoSearchCommentVideoSearchCommentBody body = new VideoSearchCommentVideoSearchCommentBody(); // VideoSearchCommentVideoSearchCommentBody | 
try {
    VideoSearchCommentVideoSearchCommentInlineResponse2001 result = apiInstance.videoSearchCommentReplyPost(openId, accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoSearchCommentApi#videoSearchCommentReplyPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **body** | [**VideoSearchCommentVideoSearchCommentBody**](VideoSearchCommentVideoSearchCommentBody.md)|  | [optional]

### Return type

[**VideoSearchCommentVideoSearchCommentInlineResponse2001**](VideoSearchCommentVideoSearchCommentInlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

