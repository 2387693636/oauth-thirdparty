# AccessTokenApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthAccessTokenGet**](AccessTokenApi.md#oauthAccessTokenGet) | **GET** /oauth/access_token/ | 获取access_token

<a name="oauthAccessTokenGet"></a>
# **oauthAccessTokenGet**
> Oauth2UserTokenInlineResponse200 oauthAccessTokenGet(clientKey, clientSecret, code, grantType)

获取access_token

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.AccessTokenApi;


AccessTokenApi apiInstance = new AccessTokenApi();
String clientKey = "clientKey_example"; // String | 应用唯一标识
String clientSecret = "clientSecret_example"; // String | 应用唯一标识对应的密钥
String code = "code_example"; // String | 授权码
String grantType = "grantType_example"; // String | 写死\"authorization_code\"即可
try {
    Oauth2UserTokenInlineResponse200 result = apiInstance.oauthAccessTokenGet(clientKey, clientSecret, code, grantType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AccessTokenApi#oauthAccessTokenGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientKey** | **String**| 应用唯一标识 |
 **clientSecret** | **String**| 应用唯一标识对应的密钥 |
 **code** | **String**| 授权码 |
 **grantType** | **String**| 写死\&quot;authorization_code\&quot;即可 | [enum: authorization_code]

### Return type

[**Oauth2UserTokenInlineResponse200**](Oauth2UserTokenInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

