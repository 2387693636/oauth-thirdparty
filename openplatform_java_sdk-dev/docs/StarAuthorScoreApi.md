# StarAuthorScoreApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**starAuthorScoreGet**](StarAuthorScoreApi.md#starAuthorScoreGet) | **GET** /star/author_score/ | 获取抖音星图达人指数
[**starAuthorScoreV2Get**](StarAuthorScoreApi.md#starAuthorScoreV2Get) | **GET** /star/author_score_v2/ | 获取抖音星图达人指数数据V2

<a name="starAuthorScoreGet"></a>
# **starAuthorScoreGet**
> StarAuthorStarAuthorInlineResponse200 starAuthorScoreGet(openId, accessToken)

获取抖音星图达人指数

* Scope: &#x60;star_top_score_display&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.StarAuthorScoreApi;


StarAuthorScoreApi apiInstance = new StarAuthorScoreApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    StarAuthorStarAuthorInlineResponse200 result = apiInstance.starAuthorScoreGet(openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StarAuthorScoreApi#starAuthorScoreGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**StarAuthorStarAuthorInlineResponse200**](StarAuthorStarAuthorInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="starAuthorScoreV2Get"></a>
# **starAuthorScoreV2Get**
> StarAuthorStarAuthorInlineResponse2001 starAuthorScoreV2Get(accessToken, uniqueId)

获取抖音星图达人指数数据V2

* Scope: &#x60;star_author_score_display&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.StarAuthorScoreApi;


StarAuthorScoreApi apiInstance = new StarAuthorScoreApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
String uniqueId = "uniqueId_example"; // String | 达人抖音号
try {
    StarAuthorStarAuthorInlineResponse2001 result = apiInstance.starAuthorScoreV2Get(accessToken, uniqueId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StarAuthorScoreApi#starAuthorScoreV2Get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |
 **uniqueId** | **String**| 达人抖音号 |

### Return type

[**StarAuthorStarAuthorInlineResponse2001**](StarAuthorStarAuthorInlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

