# EnterpriseImPersonaDeleteApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterpriseImPersonaDeletePost**](EnterpriseImPersonaDeleteApi.md#enterpriseImPersonaDeletePost) | **POST** /enterprise/im/persona/delete/ | 删除客服账号

<a name="enterpriseImPersonaDeletePost"></a>
# **enterpriseImPersonaDeletePost**
> EnterprisePersonaPersonaDeleteInlineResponse200 enterpriseImPersonaDeletePost(body, openId, accessToken)

删除客服账号

* Scope: &#x60;enterprise.im&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseImPersonaDeleteApi;


EnterpriseImPersonaDeleteApi apiInstance = new EnterpriseImPersonaDeleteApi();
EnterprisePersonaPersonaDeleteBody body = new EnterprisePersonaPersonaDeleteBody(); // EnterprisePersonaPersonaDeleteBody | 
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    EnterprisePersonaPersonaDeleteInlineResponse200 result = apiInstance.enterpriseImPersonaDeletePost(body, openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseImPersonaDeleteApi#enterpriseImPersonaDeletePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EnterprisePersonaPersonaDeleteBody**](EnterprisePersonaPersonaDeleteBody.md)|  |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**EnterprisePersonaPersonaDeleteInlineResponse200**](EnterprisePersonaPersonaDeleteInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

