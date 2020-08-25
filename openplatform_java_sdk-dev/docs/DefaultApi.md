# DefaultApi

All URIs are relative to *https://open.snssdk.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthAccessTokenGet**](DefaultApi.md#oauthAccessTokenGet) | **GET** /oauth/access_token/ | 获取access_token
[**oauthRefreshTokenGet**](DefaultApi.md#oauthRefreshTokenGet) | **GET** /oauth/refresh_token/ | 刷新access_token

<a name="oauthAccessTokenGet"></a>
# **oauthAccessTokenGet**
> ToutiaoOauth2Oauth2InlineResponse200 oauthAccessTokenGet(clientKey, clientSecret, code, grantType)

获取access_token

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String clientKey = "clientKey_example"; // String | 应用唯一标识
String clientSecret = "clientSecret_example"; // String | 应用唯一标识对应的密钥
String code = "code_example"; // String | 授权码
String grantType = "grantType_example"; // String | 写死\"authorization_code\"即可
try {
    ToutiaoOauth2Oauth2InlineResponse200 result = apiInstance.oauthAccessTokenGet(clientKey, clientSecret, code, grantType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#oauthAccessTokenGet");
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

[**ToutiaoOauth2Oauth2InlineResponse200**](ToutiaoOauth2Oauth2InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="oauthRefreshTokenGet"></a>
# **oauthRefreshTokenGet**
> ToutiaoOauth2Oauth2InlineResponse2001 oauthRefreshTokenGet(clientKey, grantType, refreshToken)

刷新access_token

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
String clientKey = "clientKey_example"; // String | 应用唯一标识
String grantType = "grantType_example"; // String | 填refresh_token
String refreshToken = "refreshToken_example"; // String | 填写通过access_token获取到的refresh_token参数
try {
    ToutiaoOauth2Oauth2InlineResponse2001 result = apiInstance.oauthRefreshTokenGet(clientKey, grantType, refreshToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#oauthRefreshTokenGet");
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

[**ToutiaoOauth2Oauth2InlineResponse2001**](ToutiaoOauth2Oauth2InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

