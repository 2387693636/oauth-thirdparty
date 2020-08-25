# FansDataApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fansDataGet**](FansDataApi.md#fansDataGet) | **GET** /fans/data/ | 获取用户粉丝数据

<a name="fansDataGet"></a>
# **fansDataGet**
> FansDataFansDataInlineResponse200 fansDataGet(openId, accessToken)

获取用户粉丝数据

* Scope: &#x60;fans.data&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.FansDataApi;


FansDataApi apiInstance = new FansDataApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    FansDataFansDataInlineResponse200 result = apiInstance.fansDataGet(openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FansDataApi#fansDataGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**FansDataFansDataInlineResponse200**](FansDataFansDataInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

