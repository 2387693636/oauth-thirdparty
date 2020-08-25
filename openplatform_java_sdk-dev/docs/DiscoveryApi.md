# DiscoveryApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**discoveryEntRankItemGet**](DiscoveryApi.md#discoveryEntRankItemGet) | **GET** /discovery/ent/rank/item/ | 获取抖音电影榜、抖音电视剧榜、抖音综艺榜
[**discoveryEntRankVersionGet**](DiscoveryApi.md#discoveryEntRankVersionGet) | **GET** /discovery/ent/rank/version/ | 获取抖音影视综榜单版本

<a name="discoveryEntRankItemGet"></a>
# **discoveryEntRankItemGet**
> DiscoveryEntRankRankInlineResponse200 discoveryEntRankItemGet(accessToken, type, version)

获取抖音电影榜、抖音电视剧榜、抖音综艺榜

* Scope: &#x60;discovery.ent&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.DiscoveryApi;


DiscoveryApi apiInstance = new DiscoveryApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
Integer type = 56; // Integer | 榜单类型：   * 1 - 电影    * 2 - 电视剧    * 3 - 综艺 
Integer version = 56; // Integer | 榜单版本：空值默认为本周榜单
try {
    DiscoveryEntRankRankInlineResponse200 result = apiInstance.discoveryEntRankItemGet(accessToken, type, version);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiscoveryApi#discoveryEntRankItemGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |
 **type** | **Integer**| 榜单类型：   * 1 - 电影    * 2 - 电视剧    * 3 - 综艺  |
 **version** | **Integer**| 榜单版本：空值默认为本周榜单 | [optional]

### Return type

[**DiscoveryEntRankRankInlineResponse200**](DiscoveryEntRankRankInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="discoveryEntRankVersionGet"></a>
# **discoveryEntRankVersionGet**
> DiscoveryEntRankRankInlineResponse2001 discoveryEntRankVersionGet(accessToken, count, type, cursor)

获取抖音影视综榜单版本

* Scope: &#x60;discovery.ent&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.DiscoveryApi;


DiscoveryApi apiInstance = new DiscoveryApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
Integer count = 56; // Integer | 每页数量
Integer type = 56; // Integer | 榜单类型：   * 1 - 电影    * 2 - 电视剧    * 3 - 综艺 
Integer cursor = 56; // Integer | 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
try {
    DiscoveryEntRankRankInlineResponse2001 result = apiInstance.discoveryEntRankVersionGet(accessToken, count, type, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiscoveryApi#discoveryEntRankVersionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |
 **count** | **Integer**| 每页数量 | [enum: ]
 **type** | **Integer**| 榜单类型：   * 1 - 电影    * 2 - 电视剧    * 3 - 综艺  |
 **cursor** | **Integer**| 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 | [optional]

### Return type

[**DiscoveryEntRankRankInlineResponse2001**](DiscoveryEntRankRankInlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

