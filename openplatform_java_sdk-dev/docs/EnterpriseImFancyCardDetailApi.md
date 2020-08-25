# EnterpriseImFancyCardDetailApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterpriseImFancyCardDetailGet**](EnterpriseImFancyCardDetailApi.md#enterpriseImFancyCardDetailGet) | **GET** /enterprise/im/fancy/card/detail/ | 获取指定动态卡片模版

<a name="enterpriseImFancyCardDetailGet"></a>
# **enterpriseImFancyCardDetailGet**
> EnterpriseImFancyCardCardDetailInlineResponse200 enterpriseImFancyCardDetailGet(openId, accessToken, cardId)

获取指定动态卡片模版

* Scope: &#x60;enterprise.im&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseImFancyCardDetailApi;


EnterpriseImFancyCardDetailApi apiInstance = new EnterpriseImFancyCardDetailApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String cardId = "cardId_example"; // String | 卡片id
try {
    EnterpriseImFancyCardCardDetailInlineResponse200 result = apiInstance.enterpriseImFancyCardDetailGet(openId, accessToken, cardId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseImFancyCardDetailApi#enterpriseImFancyCardDetailGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **cardId** | **String**| 卡片id |

### Return type

[**EnterpriseImFancyCardCardDetailInlineResponse200**](EnterpriseImFancyCardCardDetailInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

