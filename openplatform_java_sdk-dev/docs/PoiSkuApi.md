# PoiSkuApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**poiExtHotelSkuGet**](PoiSkuApi.md#poiExtHotelSkuGet) | **GET** /poi/ext/hotel/sku/ | sku拉取(该接口由接入方实现)

<a name="poiExtHotelSkuGet"></a>
# **poiExtHotelSkuGet**
> PoiProductProductInlineResponse2003 poiExtHotelSkuGet(spuExtId, startDate, endDate)

sku拉取(该接口由接入方实现)

# 该接口由接入方实现 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.PoiSkuApi;


PoiSkuApi apiInstance = new PoiSkuApi();
List<String> spuExtId = Arrays.asList("spuExtId_example"); // List<String> | 接入方SPU ID 列表
String startDate = "startDate_example"; // String | 拉取价格时间区间[start_date, end_date)
String endDate = "endDate_example"; // String | 拉取价格时间区间[start_date, end_date)
try {
    PoiProductProductInlineResponse2003 result = apiInstance.poiExtHotelSkuGet(spuExtId, startDate, endDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiSkuApi#poiExtHotelSkuGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **spuExtId** | [**List&lt;String&gt;**](String.md)| 接入方SPU ID 列表 |
 **startDate** | **String**| 拉取价格时间区间[start_date, end_date) |
 **endDate** | **String**| 拉取价格时间区间[start_date, end_date) |

### Return type

[**PoiProductProductInlineResponse2003**](PoiProductProductInlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

