# MusicCollectionApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**musicCollectionListGet**](MusicCollectionApi.md#musicCollectionListGet) | **GET** /music/collection/list/ | 音乐收藏列表

<a name="musicCollectionListGet"></a>
# **musicCollectionListGet**
> MusicCollectionListMusicCollectionListInlineResponse200 musicCollectionListGet(openId, accessToken, count, cursor)

音乐收藏列表

* Scope: &#x60;music.collection.list&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.MusicCollectionApi;


MusicCollectionApi apiInstance = new MusicCollectionApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer count = 56; // Integer | 每页数量
Integer cursor = 56; // Integer | 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
try {
    MusicCollectionListMusicCollectionListInlineResponse200 result = apiInstance.musicCollectionListGet(openId, accessToken, count, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MusicCollectionApi#musicCollectionListGet");
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

[**MusicCollectionListMusicCollectionListInlineResponse200**](MusicCollectionListMusicCollectionListInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

