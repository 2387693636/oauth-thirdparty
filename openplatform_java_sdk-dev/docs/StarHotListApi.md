# StarHotListApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**starHotListGet**](StarHotListApi.md#starHotListGet) | **GET** /star/hot_list/ | 获取抖音星图达人热榜

<a name="starHotListGet"></a>
# **starHotListGet**
> StarDataStarDataInlineResponse200 starHotListGet(accessToken, hotListType)

获取抖音星图达人热榜

* Scope: &#x60;star_tops&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.StarHotListApi;


StarHotListApi apiInstance = new StarHotListApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
Integer hotListType = 56; // Integer | 达人热榜类型 * `1` - 星图指数榜 * `2` - 涨粉指数榜 * `3` - 性价比指数榜 * `4` - 种草指数榜 * `5` - 精选指数榜 * `6` - 传播指数榜
try {
    StarDataStarDataInlineResponse200 result = apiInstance.starHotListGet(accessToken, hotListType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StarHotListApi#starHotListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |
 **hotListType** | **Integer**| 达人热榜类型 * &#x60;1&#x60; - 星图指数榜 * &#x60;2&#x60; - 涨粉指数榜 * &#x60;3&#x60; - 性价比指数榜 * &#x60;4&#x60; - 种草指数榜 * &#x60;5&#x60; - 精选指数榜 * &#x60;6&#x60; - 传播指数榜 | [enum: 1, 2, 3, 4, 5, 6]

### Return type

[**StarDataStarDataInlineResponse200**](StarDataStarDataInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

