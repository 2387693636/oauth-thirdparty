# EnterpriseImCardSaveApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterpriseImCardSavePost**](EnterpriseImCardSaveApi.md#enterpriseImCardSavePost) | **POST** /enterprise/im/card/save/ | 创建/更新消息卡片

<a name="enterpriseImCardSavePost"></a>
# **enterpriseImCardSavePost**
> EnterpriseImCardCardSaveInlineResponse200 enterpriseImCardSavePost(body, openId, accessToken)

创建/更新消息卡片

* Scope: &#x60;enterprise.im&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseImCardSaveApi;


EnterpriseImCardSaveApi apiInstance = new EnterpriseImCardSaveApi();
EnterpriseImCardCardSaveBody body = new EnterpriseImCardCardSaveBody(); // EnterpriseImCardCardSaveBody | 
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    EnterpriseImCardCardSaveInlineResponse200 result = apiInstance.enterpriseImCardSavePost(body, openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseImCardSaveApi#enterpriseImCardSavePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EnterpriseImCardCardSaveBody**](EnterpriseImCardCardSaveBody.md)|  |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**EnterpriseImCardCardSaveInlineResponse200**](EnterpriseImCardCardSaveInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

