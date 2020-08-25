# EnterpriseGrouponOrderDetailApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterpriseGrouponOrderDetailGet**](EnterpriseGrouponOrderDetailApi.md#enterpriseGrouponOrderDetailGet) | **GET** /enterprise/groupon/order/detail/ | 团购活动订单详情

<a name="enterpriseGrouponOrderDetailGet"></a>
# **enterpriseGrouponOrderDetailGet**
> EnterpriseGrouponGrouponOrderOrderDetailInlineResponse200 enterpriseGrouponOrderDetailGet(accessToken, openId, orderId)

团购活动订单详情

* Scope: &#x60;enterprise.groupon&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseGrouponOrderDetailApi;


EnterpriseGrouponOrderDetailApi apiInstance = new EnterpriseGrouponOrderDetailApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String orderId = "orderId_example"; // String | 订单id
try {
    EnterpriseGrouponGrouponOrderOrderDetailInlineResponse200 result = apiInstance.enterpriseGrouponOrderDetailGet(accessToken, openId, orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseGrouponOrderDetailApi#enterpriseGrouponOrderDetailGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **orderId** | **String**| 订单id |

### Return type

[**EnterpriseGrouponGrouponOrderOrderDetailInlineResponse200**](EnterpriseGrouponGrouponOrderOrderDetailInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

