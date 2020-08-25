# PoiOrderApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**poiExtHotelOrderCancelPost**](PoiOrderApi.md#poiExtHotelOrderCancelPost) | **POST** /poi/ext/hotel/order/cancel/ | 取消订单(该接口由接入方实现)
[**poiExtHotelOrderCommitPost**](PoiOrderApi.md#poiExtHotelOrderCommitPost) | **POST** /poi/ext/hotel/order/commit/ | 下单接口(该接口由接入方实现)
[**poiExtHotelOrderStatusPost**](PoiOrderApi.md#poiExtHotelOrderStatusPost) | **POST** /poi/ext/hotel/order/status/ | 支付状态通知(该接口由接入方实现)
[**poiOrderStatusPost**](PoiOrderApi.md#poiOrderStatusPost) | **POST** /poi/order/status/ | 订单状态同步接口

<a name="poiExtHotelOrderCancelPost"></a>
# **poiExtHotelOrderCancelPost**
> PoiOrderOrderInlineResponse2003 poiExtHotelOrderCancelPost(body)

取消订单(该接口由接入方实现)

# 该接口由接入方实现 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.PoiOrderApi;


PoiOrderApi apiInstance = new PoiOrderApi();
PoiOrderOrderBody3 body = new PoiOrderOrderBody3(); // PoiOrderOrderBody3 | 
try {
    PoiOrderOrderInlineResponse2003 result = apiInstance.poiExtHotelOrderCancelPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiOrderApi#poiExtHotelOrderCancelPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoiOrderOrderBody3**](PoiOrderOrderBody3.md)|  | [optional]

### Return type

[**PoiOrderOrderInlineResponse2003**](PoiOrderOrderInlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="poiExtHotelOrderCommitPost"></a>
# **poiExtHotelOrderCommitPost**
> PoiOrderOrderInlineResponse2001 poiExtHotelOrderCommitPost(body)

下单接口(该接口由接入方实现)

# 该接口由接入方实现 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.PoiOrderApi;


PoiOrderApi apiInstance = new PoiOrderApi();
PoiOrderOrderBody1 body = new PoiOrderOrderBody1(); // PoiOrderOrderBody1 | 
try {
    PoiOrderOrderInlineResponse2001 result = apiInstance.poiExtHotelOrderCommitPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiOrderApi#poiExtHotelOrderCommitPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoiOrderOrderBody1**](PoiOrderOrderBody1.md)|  | [optional]

### Return type

[**PoiOrderOrderInlineResponse2001**](PoiOrderOrderInlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="poiExtHotelOrderStatusPost"></a>
# **poiExtHotelOrderStatusPost**
> PoiOrderOrderInlineResponse2002 poiExtHotelOrderStatusPost(body)

支付状态通知(该接口由接入方实现)

# 该接口由接入方实现 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.PoiOrderApi;


PoiOrderApi apiInstance = new PoiOrderApi();
PoiOrderOrderBody2 body = new PoiOrderOrderBody2(); // PoiOrderOrderBody2 | 
try {
    PoiOrderOrderInlineResponse2002 result = apiInstance.poiExtHotelOrderStatusPost(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiOrderApi#poiExtHotelOrderStatusPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoiOrderOrderBody2**](PoiOrderOrderBody2.md)|  | [optional]

### Return type

[**PoiOrderOrderInlineResponse2002**](PoiOrderOrderInlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="poiOrderStatusPost"></a>
# **poiOrderStatusPost**
> PoiOrderOrderInlineResponse200 poiOrderStatusPost(body, accessToken)

订单状态同步接口

* Scope: &#x60;poi.product&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.PoiOrderApi;


PoiOrderApi apiInstance = new PoiOrderApi();
PoiOrderOrderBody body = new PoiOrderOrderBody(); // PoiOrderOrderBody | 
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
try {
    PoiOrderOrderInlineResponse200 result = apiInstance.poiOrderStatusPost(body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiOrderApi#poiOrderStatusPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoiOrderOrderBody**](PoiOrderOrderBody.md)|  |
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |

### Return type

[**PoiOrderOrderInlineResponse200**](PoiOrderOrderInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

