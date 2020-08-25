# EnterpriseImFancyCardSaveApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterpriseImFancyCardSavePost**](EnterpriseImFancyCardSaveApi.md#enterpriseImFancyCardSavePost) | **POST** /enterprise/im/fancy/card/save/ | 创建/更新动态消息卡片

<a name="enterpriseImFancyCardSavePost"></a>
# **enterpriseImFancyCardSavePost**
> EnterpriseImFancyCardCardSaveInlineResponse200 enterpriseImFancyCardSavePost(body, openId, accessToken)

创建/更新动态消息卡片

* Scope: &#x60;enterprise.im&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseImFancyCardSaveApi;


EnterpriseImFancyCardSaveApi apiInstance = new EnterpriseImFancyCardSaveApi();
EnterpriseImFancyCardCardSaveBody body = new EnterpriseImFancyCardCardSaveBody(); // EnterpriseImFancyCardCardSaveBody | 
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    EnterpriseImFancyCardCardSaveInlineResponse200 result = apiInstance.enterpriseImFancyCardSavePost(body, openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseImFancyCardSaveApi#enterpriseImFancyCardSavePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EnterpriseImFancyCardCardSaveBody**](EnterpriseImFancyCardCardSaveBody.md)|  |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**EnterpriseImFancyCardCardSaveInlineResponse200**](EnterpriseImFancyCardCardSaveInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

