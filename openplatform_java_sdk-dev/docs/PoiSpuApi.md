# PoiSpuApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**poiSkuSyncPost**](PoiSpuApi.md#poiSkuSyncPost) | **POST** /poi/sku/sync/ | SKU同步
[**poiSpuQueryGet**](PoiSpuApi.md#poiSpuQueryGet) | **GET** /poi/spu/query/ | 查询SPU
[**poiSpuSyncPost**](PoiSpuApi.md#poiSpuSyncPost) | **POST** /poi/spu/sync/ | SPU同步

<a name="poiSkuSyncPost"></a>
# **poiSkuSyncPost**
> PoiProductProductInlineResponse2002 poiSkuSyncPost(body, accessToken)

SKU同步

* Scope: &#x60;poi.product&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.PoiSpuApi;


PoiSpuApi apiInstance = new PoiSpuApi();
PoiProductProductBody1 body = new PoiProductProductBody1(); // PoiProductProductBody1 | 
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
try {
    PoiProductProductInlineResponse2002 result = apiInstance.poiSkuSyncPost(body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiSpuApi#poiSkuSyncPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoiProductProductBody1**](PoiProductProductBody1.md)|  |
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |

### Return type

[**PoiProductProductInlineResponse2002**](PoiProductProductInlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="poiSpuQueryGet"></a>
# **poiSpuQueryGet**
> PoiProductProductInlineResponse2001 poiSpuQueryGet(accessToken, spuExtId)

查询SPU

* Scope: &#x60;poi.product&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.PoiSpuApi;


PoiSpuApi apiInstance = new PoiSpuApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
String spuExtId = "spuExtId_example"; // String | 
try {
    PoiProductProductInlineResponse2001 result = apiInstance.poiSpuQueryGet(accessToken, spuExtId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiSpuApi#poiSpuQueryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |
 **spuExtId** | **String**|  |

### Return type

[**PoiProductProductInlineResponse2001**](PoiProductProductInlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="poiSpuSyncPost"></a>
# **poiSpuSyncPost**
> PoiProductProductInlineResponse200 poiSpuSyncPost(body, accessToken)

SPU同步

* Scope: &#x60;poi.product&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.PoiSpuApi;


PoiSpuApi apiInstance = new PoiSpuApi();
PoiProductProductBody body = new PoiProductProductBody(); // PoiProductProductBody | 
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
try {
    PoiProductProductInlineResponse200 result = apiInstance.poiSpuSyncPost(body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiSpuApi#poiSpuSyncPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoiProductProductBody**](PoiProductProductBody.md)|  |
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |

### Return type

[**PoiProductProductInlineResponse200**](PoiProductProductInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

