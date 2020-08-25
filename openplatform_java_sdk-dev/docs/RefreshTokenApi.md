# RefreshTokenApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthRefreshTokenGet**](RefreshTokenApi.md#oauthRefreshTokenGet) | **GET** /oauth/refresh_token/ | 刷新access_token

<a name="oauthRefreshTokenGet"></a>
# **oauthRefreshTokenGet**
> Oauth2RefreshTokenInlineResponse200 oauthRefreshTokenGet(clientKey, grantType, refreshToken)

刷新access_token

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.RefreshTokenApi;


RefreshTokenApi apiInstance = new RefreshTokenApi();
String clientKey = "clientKey_example"; // String | 应用唯一标识
String grantType = "grantType_example"; // String | 填refresh_token
String refreshToken = "refreshToken_example"; // String | 填写通过access_token获取到的refresh_token参数
try {
    Oauth2RefreshTokenInlineResponse200 result = apiInstance.oauthRefreshTokenGet(clientKey, grantType, refreshToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RefreshTokenApi#oauthRefreshTokenGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientKey** | **String**| 应用唯一标识 |
 **grantType** | **String**| 填refresh_token | [enum: refresh_token]
 **refreshToken** | **String**| 填写通过access_token获取到的refresh_token参数 |

### Return type

[**Oauth2RefreshTokenInlineResponse200**](Oauth2RefreshTokenInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

