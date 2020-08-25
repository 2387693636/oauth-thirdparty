# VideoCommentApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**videoCommentListGet**](VideoCommentApi.md#videoCommentListGet) | **GET** /video/comment/list/ | 评论列表
[**videoCommentReplyListGet**](VideoCommentApi.md#videoCommentReplyListGet) | **GET** /video/comment/reply/list/ | 评论回复列表
[**videoCommentReplyPost**](VideoCommentApi.md#videoCommentReplyPost) | **POST** /video/comment/reply/ | 回复视频评论
[**videoCommentTopPost**](VideoCommentApi.md#videoCommentTopPost) | **POST** /video/comment/top/ | 置顶视频评论(企业号)

<a name="videoCommentListGet"></a>
# **videoCommentListGet**
> VideoCommentVideoCommentInlineResponse200 videoCommentListGet(openId, accessToken, count, itemId, cursor)

评论列表

* Scope: &#x60;video.comment&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.VideoCommentApi;


VideoCommentApi apiInstance = new VideoCommentApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer count = 56; // Integer | 每页数量
String itemId = "itemId_example"; // String | 视频id
Integer cursor = 56; // Integer | 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
try {
    VideoCommentVideoCommentInlineResponse200 result = apiInstance.videoCommentListGet(openId, accessToken, count, itemId, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoCommentApi#videoCommentListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **count** | **Integer**| 每页数量 | [enum: ]
 **itemId** | **String**| 视频id |
 **cursor** | **Integer**| 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 | [optional]

### Return type

[**VideoCommentVideoCommentInlineResponse200**](VideoCommentVideoCommentInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="videoCommentReplyListGet"></a>
# **videoCommentReplyListGet**
> VideoCommentVideoCommentInlineResponse200 videoCommentReplyListGet(openId, accessToken, count, itemId, commentId, cursor)

评论回复列表

* Scope: &#x60;video.comment&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.VideoCommentApi;


VideoCommentApi apiInstance = new VideoCommentApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer count = 56; // Integer | 每页数量
String itemId = "itemId_example"; // String | 视频id
String commentId = "commentId_example"; // String | 评论id
Integer cursor = 56; // Integer | 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
try {
    VideoCommentVideoCommentInlineResponse200 result = apiInstance.videoCommentReplyListGet(openId, accessToken, count, itemId, commentId, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoCommentApi#videoCommentReplyListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **count** | **Integer**| 每页数量 | [enum: ]
 **itemId** | **String**| 视频id |
 **commentId** | **String**| 评论id |
 **cursor** | **Integer**| 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 | [optional]

### Return type

[**VideoCommentVideoCommentInlineResponse200**](VideoCommentVideoCommentInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="videoCommentReplyPost"></a>
# **videoCommentReplyPost**
> VideoCommentVideoCommentCommonResponse videoCommentReplyPost(openId, accessToken, body)

回复视频评论

* Scope: &#x60;video.comment&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.VideoCommentApi;


VideoCommentApi apiInstance = new VideoCommentApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
VideoCommentVideoCommentBody body = new VideoCommentVideoCommentBody(); // VideoCommentVideoCommentBody | 
try {
    VideoCommentVideoCommentCommonResponse result = apiInstance.videoCommentReplyPost(openId, accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoCommentApi#videoCommentReplyPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **body** | [**VideoCommentVideoCommentBody**](VideoCommentVideoCommentBody.md)|  | [optional]

### Return type

[**VideoCommentVideoCommentCommonResponse**](VideoCommentVideoCommentCommonResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="videoCommentTopPost"></a>
# **videoCommentTopPost**
> VideoCommentVideoCommentCommonResponse videoCommentTopPost(openId, accessToken, body)

置顶视频评论(企业号)

* Scope: &#x60;video.comment&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.VideoCommentApi;


VideoCommentApi apiInstance = new VideoCommentApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
VideoCommentVideoCommentBody1 body = new VideoCommentVideoCommentBody1(); // VideoCommentVideoCommentBody1 | 
try {
    VideoCommentVideoCommentCommonResponse result = apiInstance.videoCommentTopPost(openId, accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoCommentApi#videoCommentTopPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **body** | [**VideoCommentVideoCommentBody1**](VideoCommentVideoCommentBody1.md)|  | [optional]

### Return type

[**VideoCommentVideoCommentCommonResponse**](VideoCommentVideoCommentCommonResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

