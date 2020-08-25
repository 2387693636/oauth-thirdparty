# EnterpriseGrouponOrderOverviewApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterpriseGrouponOrderOverviewGet**](EnterpriseGrouponOrderOverviewApi.md#enterpriseGrouponOrderOverviewGet) | **GET** /enterprise/groupon/order/overview/ | 团购活动订单汇总信息

<a name="enterpriseGrouponOrderOverviewGet"></a>
# **enterpriseGrouponOrderOverviewGet**
> EnterpriseGrouponGrouponOrderOrderOverviewInlineResponse200 enterpriseGrouponOrderOverviewGet(accessToken, openId, startTime, endTime)

团购活动订单汇总信息

* Scope: &#x60;enterprise.groupon&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseGrouponOrderOverviewApi;


EnterpriseGrouponOrderOverviewApi apiInstance = new EnterpriseGrouponOrderOverviewApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
Integer startTime = 56; // Integer | 订单开始时间，unix时间戳
Integer endTime = 56; // Integer | 订单结束时间，unix时间戳
try {
    EnterpriseGrouponGrouponOrderOrderOverviewInlineResponse200 result = apiInstance.enterpriseGrouponOrderOverviewGet(accessToken, openId, startTime, endTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseGrouponOrderOverviewApi#enterpriseGrouponOrderOverviewGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **startTime** | **Integer**| 订单开始时间，unix时间戳 |
 **endTime** | **Integer**| 订单结束时间，unix时间戳 |

### Return type

[**EnterpriseGrouponGrouponOrderOrderOverviewInlineResponse200**](EnterpriseGrouponGrouponOrderOrderOverviewInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

