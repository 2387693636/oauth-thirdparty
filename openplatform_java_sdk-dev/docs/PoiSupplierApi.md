# PoiSupplierApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**poiQueryGet**](PoiSupplierApi.md#poiQueryGet) | **GET** /poi/query/ | 获取抖音POI ID
[**poiSupplierMatchPost**](PoiSupplierApi.md#poiSupplierMatchPost) | **POST** /poi/supplier/match/ | 店铺匹配
[**poiSupplierMatchQueryGet**](PoiSupplierApi.md#poiSupplierMatchQueryGet) | **GET** /poi/supplier/match/query/ | 店铺匹配结果查询
[**poiSupplierQueryGet**](PoiSupplierApi.md#poiSupplierQueryGet) | **GET** /poi/supplier/query/ | 查询店铺
[**poiSupplierSyncPost**](PoiSupplierApi.md#poiSupplierSyncPost) | **POST** /poi/supplier/sync/ | 商铺同步

<a name="poiQueryGet"></a>
# **poiQueryGet**
> PoiSupplierSupplierInlineResponse2002 poiQueryGet(accessToken, amapId)

获取抖音POI ID

* Scope: &#x60;poi.product&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.PoiSupplierApi;


PoiSupplierApi apiInstance = new PoiSupplierApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
String amapId = "amapId_example"; // String | 
try {
    PoiSupplierSupplierInlineResponse2002 result = apiInstance.poiQueryGet(accessToken, amapId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiSupplierApi#poiQueryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |
 **amapId** | **String**|  |

### Return type

[**PoiSupplierSupplierInlineResponse2002**](PoiSupplierSupplierInlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="poiSupplierMatchPost"></a>
# **poiSupplierMatchPost**
> PoiSupplierSupplierInlineResponse2003 poiSupplierMatchPost(body, accessToken)

店铺匹配

* Scope: &#x60;poi.product&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.PoiSupplierApi;


PoiSupplierApi apiInstance = new PoiSupplierApi();
PoiSupplierSupplierBody1 body = new PoiSupplierSupplierBody1(); // PoiSupplierSupplierBody1 | 
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
try {
    PoiSupplierSupplierInlineResponse2003 result = apiInstance.poiSupplierMatchPost(body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiSupplierApi#poiSupplierMatchPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoiSupplierSupplierBody1**](PoiSupplierSupplierBody1.md)|  |
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |

### Return type

[**PoiSupplierSupplierInlineResponse2003**](PoiSupplierSupplierInlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="poiSupplierMatchQueryGet"></a>
# **poiSupplierMatchQueryGet**
> PoiSupplierSupplierInlineResponse2004 poiSupplierMatchQueryGet(body, accessToken)

店铺匹配结果查询

* Scope: &#x60;poi.product&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.PoiSupplierApi;


PoiSupplierApi apiInstance = new PoiSupplierApi();
PoiSupplierSupplierBody2 body = new PoiSupplierSupplierBody2(); // PoiSupplierSupplierBody2 | 
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
try {
    PoiSupplierSupplierInlineResponse2004 result = apiInstance.poiSupplierMatchQueryGet(body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiSupplierApi#poiSupplierMatchQueryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoiSupplierSupplierBody2**](PoiSupplierSupplierBody2.md)|  |
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |

### Return type

[**PoiSupplierSupplierInlineResponse2004**](PoiSupplierSupplierInlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="poiSupplierQueryGet"></a>
# **poiSupplierQueryGet**
> PoiSupplierSupplierInlineResponse2001 poiSupplierQueryGet(accessToken, supplierExtId)

查询店铺

* Scope: &#x60;poi.product&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.PoiSupplierApi;


PoiSupplierApi apiInstance = new PoiSupplierApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
String supplierExtId = "supplierExtId_example"; // String | 
try {
    PoiSupplierSupplierInlineResponse2001 result = apiInstance.poiSupplierQueryGet(accessToken, supplierExtId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiSupplierApi#poiSupplierQueryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |
 **supplierExtId** | **String**|  |

### Return type

[**PoiSupplierSupplierInlineResponse2001**](PoiSupplierSupplierInlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="poiSupplierSyncPost"></a>
# **poiSupplierSyncPost**
> PoiSupplierSupplierInlineResponse200 poiSupplierSyncPost(body, accessToken)

商铺同步

* Scope: &#x60;poi.product&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.PoiSupplierApi;


PoiSupplierApi apiInstance = new PoiSupplierApi();
PoiSupplierSupplierBody body = new PoiSupplierSupplierBody(); // PoiSupplierSupplierBody | 
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
try {
    PoiSupplierSupplierInlineResponse200 result = apiInstance.poiSupplierSyncPost(body, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PoiSupplierApi#poiSupplierSyncPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PoiSupplierSupplierBody**](PoiSupplierSupplierBody.md)|  |
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |

### Return type

[**PoiSupplierSupplierInlineResponse200**](PoiSupplierSupplierInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

