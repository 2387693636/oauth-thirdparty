# EnterpriseImConversationCreateApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterpriseImPersonaConversationCreatePost**](EnterpriseImConversationCreateApi.md#enterpriseImPersonaConversationCreatePost) | **POST** /enterprise/im/persona/conversation/create/ | 主动创建客服会话

<a name="enterpriseImPersonaConversationCreatePost"></a>
# **enterpriseImPersonaConversationCreatePost**
> EnterprisePersonaPersonaConvCreateInlineResponse200 enterpriseImPersonaConversationCreatePost(body, openId, accessToken)

主动创建客服会话

* Scope: &#x60;enterprise.im&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseImConversationCreateApi;


EnterpriseImConversationCreateApi apiInstance = new EnterpriseImConversationCreateApi();
EnterprisePersonaPersonaConvCreateBody body = new EnterprisePersonaPersonaConvCreateBody(); // EnterprisePersonaPersonaConvCreateBody | 
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    EnterprisePersonaPersonaConvCreateInlineResponse200 result = apiInstance.enterpriseImPersonaConversationCreatePost(body, openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseImConversationCreateApi#enterpriseImPersonaConversationCreatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EnterprisePersonaPersonaConvCreateBody**](EnterprisePersonaPersonaConvCreateBody.md)|  |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**EnterprisePersonaPersonaConvCreateInlineResponse200**](EnterprisePersonaPersonaConvCreateInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

