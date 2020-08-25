# EnterpriseGrouponOrderRefundConfirmApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterpriseGrouponOrderRefundConfirmPost**](EnterpriseGrouponOrderRefundConfirmApi.md#enterpriseGrouponOrderRefundConfirmPost) | **POST** /enterprise/groupon/order/refund/confirm/ | 确认退款

<a name="enterpriseGrouponOrderRefundConfirmPost"></a>
# **enterpriseGrouponOrderRefundConfirmPost**
> EnterpriseGrouponGrouponOrderOrderRefundConfirmInlineResponse200 enterpriseGrouponOrderRefundConfirmPost(accessToken, openId, body)

确认退款

* Scope: &#x60;enterprise.groupon&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseGrouponOrderRefundConfirmApi;


EnterpriseGrouponOrderRefundConfirmApi apiInstance = new EnterpriseGrouponOrderRefundConfirmApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
EnterpriseGrouponGrouponOrderOrderRefundConfirmBody body = new EnterpriseGrouponGrouponOrderOrderRefundConfirmBody(); // EnterpriseGrouponGrouponOrderOrderRefundConfirmBody | 
try {
    EnterpriseGrouponGrouponOrderOrderRefundConfirmInlineResponse200 result = apiInstance.enterpriseGrouponOrderRefundConfirmPost(accessToken, openId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseGrouponOrderRefundConfirmApi#enterpriseGrouponOrderRefundConfirmPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **body** | [**EnterpriseGrouponGrouponOrderOrderRefundConfirmBody**](EnterpriseGrouponGrouponOrderOrderRefundConfirmBody.md)|  | [optional]

### Return type

[**EnterpriseGrouponGrouponOrderOrderRefundConfirmInlineResponse200**](EnterpriseGrouponGrouponOrderOrderRefundConfirmInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

