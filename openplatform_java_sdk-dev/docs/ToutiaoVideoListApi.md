# ToutiaoVideoListApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**toutiaoVideoListGet**](ToutiaoVideoListApi.md#toutiaoVideoListGet) | **GET** /toutiao/video/list/ | 查询授权帐号的视频列表

<a name="toutiaoVideoListGet"></a>
# **toutiaoVideoListGet**
> ToutiaoVideoListVideoListInlineResponse200 toutiaoVideoListGet(openId, accessToken, count, cursor)

查询授权帐号的视频列表

* Scope: &#x60;toutiao.video.data&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.ToutiaoVideoListApi;


ToutiaoVideoListApi apiInstance = new ToutiaoVideoListApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer count = 56; // Integer | 每页数量
Integer cursor = 56; // Integer | 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
try {
    ToutiaoVideoListVideoListInlineResponse200 result = apiInstance.toutiaoVideoListGet(openId, accessToken, count, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToutiaoVideoListApi#toutiaoVideoListGet");
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

[**ToutiaoVideoListVideoListInlineResponse200**](ToutiaoVideoListVideoListInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

