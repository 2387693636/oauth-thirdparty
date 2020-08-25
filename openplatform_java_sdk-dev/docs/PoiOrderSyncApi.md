# PoiOrderSyncApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**poiOrderSyncPost**](PoiOrderSyncApi.md#poiOrderSyncPost) | **POST** /poi/order/sync/ | 订单同步

<a name="poiOrderSyncPost"></a>
# **poiOrderSyncPost**
> PoiOrderSyncOrderSyncInlineResponse200 poiOrderSyncPost(body, accessToken)

订单同步

* Scope: &#x60;poi.product&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.PoiOrderSyncApi;


PoiOrderSyncApi apiInstance = new PoiOrderSyncApi();
PoiOrderSyncOrderSyncBody body = new PoiOrderSyncOrderSyncBody(); // PoiOrderSyncOrderSyncBody | 
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
try {
    PoiOrderSyncOrderSyncInlineResponse200 result = apiInstance.poiOrderSyncPost(body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiOrderSyncApi#poiOrderSyncPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoiOrderSyncOrderSyncBody**](PoiOrderSyncOrderSyncBody.md)|  |
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |

### Return type

[**PoiOrderSyncOrderSyncInlineResponse200**](PoiOrderSyncOrderSyncInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

