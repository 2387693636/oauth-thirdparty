# EnterpriseGrouponOrderRefundListApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterpriseGrouponOrderRefundApplyListGet**](EnterpriseGrouponOrderRefundListApi.md#enterpriseGrouponOrderRefundApplyListGet) | **GET** /enterprise/groupon/order/refund/apply/list/ | 团购活动用户申请退款订单列表

<a name="enterpriseGrouponOrderRefundApplyListGet"></a>
# **enterpriseGrouponOrderRefundApplyListGet**
> EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200 enterpriseGrouponOrderRefundApplyListGet(accessToken, openId, count, startTime, endTime, cursor, status)

团购活动用户申请退款订单列表

* Scope: &#x60;enterprise.groupon&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseGrouponOrderRefundListApi;


EnterpriseGrouponOrderRefundListApi apiInstance = new EnterpriseGrouponOrderRefundListApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
Integer count = 56; // Integer | 每页数量
Integer startTime = 56; // Integer | 退款申请开始时间，unix时间戳
Integer endTime = 56; // Integer | 退款申请结束时间，unix时间戳
Integer cursor = 56; // Integer | 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
Integer status = 56; // Integer | * 状态筛选   * 1: 待确认   * 2: 已确认 
try {
    EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200 result = apiInstance.enterpriseGrouponOrderRefundApplyListGet(accessToken, openId, count, startTime, endTime, cursor, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseGrouponOrderRefundListApi#enterpriseGrouponOrderRefundApplyListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **count** | **Integer**| 每页数量 | [enum: ]
 **startTime** | **Integer**| 退款申请开始时间，unix时间戳 |
 **endTime** | **Integer**| 退款申请结束时间，unix时间戳 |
 **cursor** | **Integer**| 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 | [optional]
 **status** | **Integer**| * 状态筛选   * 1: 待确认   * 2: 已确认  | [optional] [enum: 1, 2]

### Return type

[**EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200**](EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

