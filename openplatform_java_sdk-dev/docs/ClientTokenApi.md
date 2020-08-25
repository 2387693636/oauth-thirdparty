# ClientTokenApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthClientTokenGet**](ClientTokenApi.md#oauthClientTokenGet) | **GET** /oauth/client_token/ | 生成client_token

<a name="oauthClientTokenGet"></a>
# **oauthClientTokenGet**
> Oauth2ClientTokenInlineResponse200 oauthClientTokenGet(clientKey, clientSecret, grantType)

生成client_token

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.ClientTokenApi;


ClientTokenApi apiInstance = new ClientTokenApi();
String clientKey = "clientKey_example"; // String | 应用唯一标识
String clientSecret = "clientSecret_example"; // String | 应用唯一标识对应的密钥
String grantType = "grantType_example"; // String | 传client_credential
try {
    Oauth2ClientTokenInlineResponse200 result = apiInstance.oauthClientTokenGet(clientKey, clientSecret, grantType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientTokenApi#oauthClientTokenGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientKey** | **String**| 应用唯一标识 |
 **clientSecret** | **String**| 应用唯一标识对应的密钥 |
 **grantType** | **String**| 传client_credential | [enum: client_credential]

### Return type

[**Oauth2ClientTokenInlineResponse200**](Oauth2ClientTokenInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

