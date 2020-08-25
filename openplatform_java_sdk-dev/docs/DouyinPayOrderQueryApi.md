# DouyinPayOrderQueryApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**douyinPayOrderQueryGet**](DouyinPayOrderQueryApi.md#douyinPayOrderQueryGet) | **GET** /douyin-pay/order-query/ | 订单查询，可查询一个月内的订单，优先级biz_order_no&gt;pay_order_no

<a name="douyinPayOrderQueryGet"></a>
# **douyinPayOrderQueryGet**
> DouyinPayDouyinPayInlineResponse2001 douyinPayOrderQueryGet(accessToken, merchantId, liveId, bizOrderNo, payOrderNo)

订单查询，可查询一个月内的订单，优先级biz_order_no&gt;pay_order_no

* Scope: &#x60;douyin.pay.op&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.DouyinPayOrderQueryApi;


DouyinPayOrderQueryApi apiInstance = new DouyinPayOrderQueryApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
Integer merchantId = 56; // Integer | 商户id
Integer liveId = 56; // Integer | 业务id
String bizOrderNo = "bizOrderNo_example"; // String | 外部订单号，由调用方生成
String payOrderNo = "payOrderNo_example"; // String | 抖音订单号，由抖音生成
try {
    DouyinPayDouyinPayInlineResponse2001 result = apiInstance.douyinPayOrderQueryGet(accessToken, merchantId, liveId, bizOrderNo, payOrderNo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DouyinPayOrderQueryApi#douyinPayOrderQueryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |
 **merchantId** | **Integer**| 商户id |
 **liveId** | **Integer**| 业务id |
 **bizOrderNo** | **String**| 外部订单号，由调用方生成 | [optional]
 **payOrderNo** | **String**| 抖音订单号，由抖音生成 | [optional]

### Return type

[**DouyinPayDouyinPayInlineResponse2001**](DouyinPayDouyinPayInlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

