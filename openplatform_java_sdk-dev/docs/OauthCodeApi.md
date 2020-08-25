# OauthCodeApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**platformOauthConnectGet**](OauthCodeApi.md#platformOauthConnectGet) | **GET** /platform/oauth/connect/ | 获取授权码(code)

<a name="platformOauthConnectGet"></a>
# **platformOauthConnectGet**
> platformOauthConnectGet(clientKey, responseType, scope, redirectUri, state)

获取授权码(code)

注意该URL不是用来请求的, 需要展示给用户用于扫码。 在抖音APP支持端内唤醒的版本内打开的话会弹出客户端原生授权页面。  使用本接口前提: 1. 首先你需要去官网申请，使你的应用可以使用特定的Scope，具体需要哪些Scope，请查看各接口定义。 2. 其次你需要在本URL的scope字段中填上用户需要授权给你的Scope。 3. 用户授权通过后，你才可以调用相应的接口。

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.OauthCodeApi;


OauthCodeApi apiInstance = new OauthCodeApi();
String clientKey = "clientKey_example"; // String | 应用唯一标识
String responseType = "responseType_example"; // String | 填写code
String scope = "scope_example"; // String | 应用授权作用域,多个授权作用域以英文逗号（,）分隔
String redirectUri = "redirectUri_example"; // String | 授权成功后的回调地址，必须以http/https开头。域名必须对应申请应用时填写的域名，如不清楚请联系应用申请人。
String state = "state_example"; // String | 用于保持请求和回调的状态
try {
    apiInstance.platformOauthConnectGet(clientKey, responseType, scope, redirectUri, state);
} catch (ApiException e) {
    System.err.println("Exception when calling OauthCodeApi#platformOauthConnectGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientKey** | **String**| 应用唯一标识 |
 **responseType** | **String**| 填写code | [enum: code]
 **scope** | **String**| 应用授权作用域,多个授权作用域以英文逗号（,）分隔 |
 **redirectUri** | **String**| 授权成功后的回调地址，必须以http/https开头。域名必须对应申请应用时填写的域名，如不清楚请联系应用申请人。 |
 **state** | **String**| 用于保持请求和回调的状态 | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

