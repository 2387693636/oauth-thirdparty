# DouyinPayAccountTransApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**douyinPayAccountTransPost**](DouyinPayAccountTransApi.md#douyinPayAccountTransPost) | **POST** /douyin-pay/account-trans/ | 商户向用户转账

<a name="douyinPayAccountTransPost"></a>
# **douyinPayAccountTransPost**
> DouyinPayDouyinPayInlineResponse200 douyinPayAccountTransPost(body, openId, accessToken)

商户向用户转账

* Scope: &#x60;douyin.pay&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.DouyinPayAccountTransApi;


DouyinPayAccountTransApi apiInstance = new DouyinPayAccountTransApi();
DouyinPayDouyinPayBody body = new DouyinPayDouyinPayBody(); // DouyinPayDouyinPayBody | 
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    DouyinPayDouyinPayInlineResponse200 result = apiInstance.douyinPayAccountTransPost(body, openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DouyinPayAccountTransApi#douyinPayAccountTransPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**DouyinPayDouyinPayBody**](DouyinPayDouyinPayBody.md)|  |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**DouyinPayDouyinPayInlineResponse200**](DouyinPayDouyinPayInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

