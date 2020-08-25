# PoiBaseApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**poiBaseQueryAmapGet**](PoiBaseApi.md#poiBaseQueryAmapGet) | **GET** /poi/base/query/amap/ | 通过高德POI ID获取抖音POI ID

<a name="poiBaseQueryAmapGet"></a>
# **poiBaseQueryAmapGet**
> PoiBaseBaseInlineResponse200 poiBaseQueryAmapGet(accessToken, amapId)

通过高德POI ID获取抖音POI ID

* Scope: &#x60;poi.base&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.PoiBaseApi;


PoiBaseApi apiInstance = new PoiBaseApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
String amapId = "amapId_example"; // String | 高德POI ID
try {
    PoiBaseBaseInlineResponse200 result = apiInstance.poiBaseQueryAmapGet(accessToken, amapId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiBaseApi#poiBaseQueryAmapGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |
 **amapId** | **String**| 高德POI ID |

### Return type

[**PoiBaseBaseInlineResponse200**](PoiBaseBaseInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

