# RenewRefreshTokenApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthRenewRefreshTokenGet**](RenewRefreshTokenApi.md#oauthRenewRefreshTokenGet) | **GET** /oauth/renew_refresh_token/ | 刷新refresh_token

<a name="oauthRenewRefreshTokenGet"></a>
# **oauthRenewRefreshTokenGet**
> Oauth2NewRefreshTokenInlineResponse200 oauthRenewRefreshTokenGet(clientKey, refreshToken)

刷新refresh_token

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.RenewRefreshTokenApi;


RenewRefreshTokenApi apiInstance = new RenewRefreshTokenApi();
String clientKey = "clientKey_example"; // String | 应用唯一标识
String refreshToken = "refreshToken_example"; // String | 填写通过access_token获取到的refresh_token参数
try {
    Oauth2NewRefreshTokenInlineResponse200 result = apiInstance.oauthRenewRefreshTokenGet(clientKey, refreshToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RenewRefreshTokenApi#oauthRenewRefreshTokenGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientKey** | **String**| 应用唯一标识 |
 **refreshToken** | **String**| 填写通过access_token获取到的refresh_token参数 |

### Return type

[**Oauth2NewRefreshTokenInlineResponse200**](Oauth2NewRefreshTokenInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

