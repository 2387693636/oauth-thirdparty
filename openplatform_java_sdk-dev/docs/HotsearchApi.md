# HotsearchApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**hotsearchSentencesGet**](HotsearchApi.md#hotsearchSentencesGet) | **GET** /hotsearch/sentences/ | 获取实时热点词
[**hotsearchTrendingSentencesGet**](HotsearchApi.md#hotsearchTrendingSentencesGet) | **GET** /hotsearch/trending/sentences/ | 获取上升词
[**hotsearchVideosGet**](HotsearchApi.md#hotsearchVideosGet) | **GET** /hotsearch/videos/ | 获取热点词聚合的视频

<a name="hotsearchSentencesGet"></a>
# **hotsearchSentencesGet**
> HotsearchHotsearchInlineResponse200 hotsearchSentencesGet(accessToken)

获取实时热点词

* Scope: &#x60;hotsearch&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.HotsearchApi;


HotsearchApi apiInstance = new HotsearchApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
try {
    HotsearchHotsearchInlineResponse200 result = apiInstance.hotsearchSentencesGet(accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HotsearchApi#hotsearchSentencesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |

### Return type

[**HotsearchHotsearchInlineResponse200**](HotsearchHotsearchInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="hotsearchTrendingSentencesGet"></a>
# **hotsearchTrendingSentencesGet**
> HotsearchHotsearchInlineResponse2001 hotsearchTrendingSentencesGet(accessToken, count, cursor)

获取上升词

* Scope: &#x60;hotsearch&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.HotsearchApi;


HotsearchApi apiInstance = new HotsearchApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
Integer count = 56; // Integer | 每页数量
Integer cursor = 56; // Integer | 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
try {
    HotsearchHotsearchInlineResponse2001 result = apiInstance.hotsearchTrendingSentencesGet(accessToken, count, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HotsearchApi#hotsearchTrendingSentencesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |
 **count** | **Integer**| 每页数量 | [enum: ]
 **cursor** | **Integer**| 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 | [optional]

### Return type

[**HotsearchHotsearchInlineResponse2001**](HotsearchHotsearchInlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="hotsearchVideosGet"></a>
# **hotsearchVideosGet**
> HotsearchHotsearchInlineResponse2002 hotsearchVideosGet(accessToken, hotSentence)

获取热点词聚合的视频

* Scope: &#x60;hotsearch&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.HotsearchApi;


HotsearchApi apiInstance = new HotsearchApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
String hotSentence = "hotSentence_example"; // String | 热点词
try {
    HotsearchHotsearchInlineResponse2002 result = apiInstance.hotsearchVideosGet(accessToken, hotSentence);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HotsearchApi#hotsearchVideosGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |
 **hotSentence** | **String**| 热点词 |

### Return type

[**HotsearchHotsearchInlineResponse2002**](HotsearchHotsearchInlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

