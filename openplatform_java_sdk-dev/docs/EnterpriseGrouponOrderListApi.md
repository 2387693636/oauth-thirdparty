# EnterpriseGrouponOrderListApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterpriseGrouponOrderListGet**](EnterpriseGrouponOrderListApi.md#enterpriseGrouponOrderListGet) | **GET** /enterprise/groupon/order/list/ | 团购活动订单详情

<a name="enterpriseGrouponOrderListGet"></a>
# **enterpriseGrouponOrderListGet**
> EnterpriseGrouponGrouponOrderOrderListInlineResponse200 enterpriseGrouponOrderListGet(accessToken, openId, count, startTime, endTime, cursor, filterStatus)

团购活动订单详情

* Scope: &#x60;enterprise.groupon&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseGrouponOrderListApi;


EnterpriseGrouponOrderListApi apiInstance = new EnterpriseGrouponOrderListApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
Integer count = 56; // Integer | 每页数量
Integer startTime = 56; // Integer | 订单创建开始时间，unix时间戳
Integer endTime = 56; // Integer | 订单创建结束时间，unix时间戳
Integer cursor = 56; // Integer | 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
String filterStatus = "filterStatus_example"; // String | 过滤订单状态，用\",\"分隔，不传默认下发所有状态
try {
    EnterpriseGrouponGrouponOrderOrderListInlineResponse200 result = apiInstance.enterpriseGrouponOrderListGet(accessToken, openId, count, startTime, endTime, cursor, filterStatus);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseGrouponOrderListApi#enterpriseGrouponOrderListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **count** | **Integer**| 每页数量 | [enum: ]
 **startTime** | **Integer**| 订单创建开始时间，unix时间戳 |
 **endTime** | **Integer**| 订单创建结束时间，unix时间戳 |
 **cursor** | **Integer**| 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 | [optional]
 **filterStatus** | **String**| 过滤订单状态，用\&quot;,\&quot;分隔，不传默认下发所有状态 | [optional]

### Return type

[**EnterpriseGrouponGrouponOrderOrderListInlineResponse200**](EnterpriseGrouponGrouponOrderOrderListInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

