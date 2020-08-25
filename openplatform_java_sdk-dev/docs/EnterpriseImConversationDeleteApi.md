# EnterpriseImConversationDeleteApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterpriseImPersonaConversationDeletePost**](EnterpriseImConversationDeleteApi.md#enterpriseImPersonaConversationDeletePost) | **POST** /enterprise/im/persona/conversation/delete/ | 删除客服会话

<a name="enterpriseImPersonaConversationDeletePost"></a>
# **enterpriseImPersonaConversationDeletePost**
> EnterprisePersonaPersonaConvDeleteInlineResponse200 enterpriseImPersonaConversationDeletePost(body, openId, accessToken)

删除客服会话

* Scope: &#x60;enterprise.im&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseImConversationDeleteApi;


EnterpriseImConversationDeleteApi apiInstance = new EnterpriseImConversationDeleteApi();
EnterprisePersonaPersonaConvDeleteBody body = new EnterprisePersonaPersonaConvDeleteBody(); // EnterprisePersonaPersonaConvDeleteBody | 
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    EnterprisePersonaPersonaConvDeleteInlineResponse200 result = apiInstance.enterpriseImPersonaConversationDeletePost(body, openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseImConversationDeleteApi#enterpriseImPersonaConversationDeletePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EnterprisePersonaPersonaConvDeleteBody**](EnterprisePersonaPersonaConvDeleteBody.md)|  |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**EnterprisePersonaPersonaConvDeleteInlineResponse200**](EnterprisePersonaPersonaConvDeleteInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

