# ItemCommentApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemCommentListGet**](ItemCommentApi.md#itemCommentListGet) | **GET** /item/comment/list/ | 评论列表
[**itemCommentReplyListGet**](ItemCommentApi.md#itemCommentReplyListGet) | **GET** /item/comment/reply/list/ | 评论回复列表
[**itemCommentReplyPost**](ItemCommentApi.md#itemCommentReplyPost) | **POST** /item/comment/reply/ | 回复视频评论

<a name="itemCommentListGet"></a>
# **itemCommentListGet**
> ItemCommentItemCommentInlineResponse200 itemCommentListGet(openId, accessToken, count, itemId, cursor)

评论列表

* Scope: &#x60;item.comment&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.ItemCommentApi;


ItemCommentApi apiInstance = new ItemCommentApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer count = 56; // Integer | 每页数量
String itemId = "itemId_example"; // String | 视频id
Integer cursor = 56; // Integer | 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
try {
    ItemCommentItemCommentInlineResponse200 result = apiInstance.itemCommentListGet(openId, accessToken, count, itemId, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCommentApi#itemCommentListGet");
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

[**ItemCommentItemCommentInlineResponse200**](ItemCommentItemCommentInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="itemCommentReplyListGet"></a>
# **itemCommentReplyListGet**
> ItemCommentItemCommentInlineResponse200 itemCommentReplyListGet(openId, accessToken, count, itemId, commentId, cursor)

评论回复列表

* Scope: &#x60;item.comment&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.ItemCommentApi;


ItemCommentApi apiInstance = new ItemCommentApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer count = 56; // Integer | 每页数量
String itemId = "itemId_example"; // String | 视频id
String commentId = "commentId_example"; // String | 评论id
Integer cursor = 56; // Integer | 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
try {
    ItemCommentItemCommentInlineResponse200 result = apiInstance.itemCommentReplyListGet(openId, accessToken, count, itemId, commentId, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCommentApi#itemCommentReplyListGet");
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

[**ItemCommentItemCommentInlineResponse200**](ItemCommentItemCommentInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="itemCommentReplyPost"></a>
# **itemCommentReplyPost**
> ItemCommentItemCommentInlineResponse2001 itemCommentReplyPost(openId, accessToken, body)

回复视频评论

* Scope: &#x60;item.comment&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.ItemCommentApi;


ItemCommentApi apiInstance = new ItemCommentApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
ItemCommentItemCommentBody body = new ItemCommentItemCommentBody(); // ItemCommentItemCommentBody | 
try {
    ItemCommentItemCommentInlineResponse2001 result = apiInstance.itemCommentReplyPost(openId, accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemCommentApi#itemCommentReplyPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **body** | [**ItemCommentItemCommentBody**](ItemCommentItemCommentBody.md)|  | [optional]

### Return type

[**ItemCommentItemCommentInlineResponse2001**](ItemCommentItemCommentInlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

