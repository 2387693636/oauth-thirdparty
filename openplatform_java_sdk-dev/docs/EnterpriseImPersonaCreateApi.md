# EnterpriseImPersonaCreateApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterpriseImPersonaCreatePost**](EnterpriseImPersonaCreateApi.md#enterpriseImPersonaCreatePost) | **POST** /enterprise/im/persona/create/ | 客服账号

<a name="enterpriseImPersonaCreatePost"></a>
# **enterpriseImPersonaCreatePost**
> EnterprisePersonaPersonaCreateInlineResponse200 enterpriseImPersonaCreatePost(body, openId, accessToken)

客服账号

* Scope: &#x60;enterprise.im&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseImPersonaCreateApi;


EnterpriseImPersonaCreateApi apiInstance = new EnterpriseImPersonaCreateApi();
EnterprisePersonaPersonaCreateBody body = new EnterprisePersonaPersonaCreateBody(); // EnterprisePersonaPersonaCreateBody | 
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    EnterprisePersonaPersonaCreateInlineResponse200 result = apiInstance.enterpriseImPersonaCreatePost(body, openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseImPersonaCreateApi#enterpriseImPersonaCreatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EnterprisePersonaPersonaCreateBody**](EnterprisePersonaPersonaCreateBody.md)|  |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**EnterprisePersonaPersonaCreateInlineResponse200**](EnterprisePersonaPersonaCreateInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

