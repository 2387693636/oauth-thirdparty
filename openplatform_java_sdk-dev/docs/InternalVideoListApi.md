# InternalVideoListApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**internalVideoListGet**](InternalVideoListApi.md#internalVideoListGet) | **GET** /internal/video/list/ | 列出已发布的视频

<a name="internalVideoListGet"></a>
# **internalVideoListGet**
> InternalVideoListInternalVideoListInlineResponse200 internalVideoListGet(openId, accessToken, count, cursor)

列出已发布的视频

* Scope: &#x60;internal.video.list&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.InternalVideoListApi;


InternalVideoListApi apiInstance = new InternalVideoListApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer count = 56; // Integer | 每页数量
Integer cursor = 56; // Integer | 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
try {
    InternalVideoListInternalVideoListInlineResponse200 result = apiInstance.internalVideoListGet(openId, accessToken, count, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InternalVideoListApi#internalVideoListGet");
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

[**InternalVideoListInternalVideoListInlineResponse200**](InternalVideoListInternalVideoListInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

