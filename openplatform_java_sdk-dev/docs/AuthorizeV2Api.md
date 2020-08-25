# AuthorizeV2Api

All URIs are relative to *https://aweme.snssdk.com/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthAuthorizeV2Get**](AuthorizeV2Api.md#oauthAuthorizeV2Get) | **GET** /oauth/authorize/v2/ | 获取授权码(code)

<a name="oauthAuthorizeV2Get"></a>
# **oauthAuthorizeV2Get**
> oauthAuthorizeV2Get(clientKey, responseType, scope, redirectUri, state)

获取授权码(code)

注意该URL要在抖音端内的h5页面请求，这样才能带上抖音的登录态来获取用户的OpenId。 一旦clientKey有静默授权权限login_id，接口会以重定向的方式跳转到redirect_uri，并返回code。 拿到code之后再去调用https://open.douyin.com/oauth/access_token/。

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.AuthorizeV2Api;


AuthorizeV2Api apiInstance = new AuthorizeV2Api();
String clientKey = "clientKey_example"; // String | 应用唯一标识
String responseType = "responseType_example"; // String | 填写code
String scope = "scope_example"; // String | 填login_id
String redirectUri = "redirectUri_example"; // String | 授权成功后的回调地址，必须以http/https开头。域名要跟申请应用时填写的授权回调域一致。用于调用https://open.douyin.com/oauth/access_token/换token。
String state = "state_example"; // String | 用于保持请求和回调状态，授权请求后会原样返回给接入方,如果是App则不用传该参数
try {
    apiInstance.oauthAuthorizeV2Get(clientKey, responseType, scope, redirectUri, state);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthorizeV2Api#oauthAuthorizeV2Get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientKey** | **String**| 应用唯一标识 |
 **responseType** | **String**| 填写code | [enum: code]
 **scope** | **String**| 填login_id |
 **redirectUri** | **String**| 授权成功后的回调地址，必须以http/https开头。域名要跟申请应用时填写的授权回调域一致。用于调用https://open.douyin.com/oauth/access_token/换token。 |
 **state** | **String**| 用于保持请求和回调状态，授权请求后会原样返回给接入方,如果是App则不用传该参数 | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

