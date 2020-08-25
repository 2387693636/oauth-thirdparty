# EnterpriseImFancyCardDelApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterpriseImFancyCardDeletePost**](EnterpriseImFancyCardDelApi.md#enterpriseImFancyCardDeletePost) | **POST** /enterprise/im/fancy/card/delete/ | 删除消息卡片

<a name="enterpriseImFancyCardDeletePost"></a>
# **enterpriseImFancyCardDeletePost**
> EnterpriseImFancyCardCardDeleteInlineResponse200 enterpriseImFancyCardDeletePost(body, openId, accessToken)

删除消息卡片

* Scope: &#x60;enterprise.im&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseImFancyCardDelApi;


EnterpriseImFancyCardDelApi apiInstance = new EnterpriseImFancyCardDelApi();
EnterpriseImFancyCardCardDeleteBody body = new EnterpriseImFancyCardCardDeleteBody(); // EnterpriseImFancyCardCardDeleteBody | 
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    EnterpriseImFancyCardCardDeleteInlineResponse200 result = apiInstance.enterpriseImFancyCardDeletePost(body, openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseImFancyCardDelApi#enterpriseImFancyCardDeletePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EnterpriseImFancyCardCardDeleteBody**](EnterpriseImFancyCardCardDeleteBody.md)|  |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**EnterpriseImFancyCardCardDeleteInlineResponse200**](EnterpriseImFancyCardCardDeleteInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

