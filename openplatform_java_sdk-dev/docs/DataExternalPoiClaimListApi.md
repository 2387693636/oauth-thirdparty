# DataExternalPoiClaimListApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dataExternalPoiClaimListGet**](DataExternalPoiClaimListApi.md#dataExternalPoiClaimListGet) | **GET** /data/external/poi/claim/list/ | POI认领列表

<a name="dataExternalPoiClaimListGet"></a>
# **dataExternalPoiClaimListGet**
> ExternalDataPoiExternalDataPoiInlineResponse2004 dataExternalPoiClaimListGet(accessToken, openId, count, cursor)

POI认领列表

* Scope: &#x60;data.external.poi&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.DataExternalPoiClaimListApi;


DataExternalPoiClaimListApi apiInstance = new DataExternalPoiClaimListApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
Integer count = 56; // Integer | 每页数量
Integer cursor = 56; // Integer | 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
try {
    ExternalDataPoiExternalDataPoiInlineResponse2004 result = apiInstance.dataExternalPoiClaimListGet(accessToken, openId, count, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExternalPoiClaimListApi#dataExternalPoiClaimListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **count** | **Integer**| 每页数量 | [enum: ]
 **cursor** | **Integer**| 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 | [optional]

### Return type

[**ExternalDataPoiExternalDataPoiInlineResponse2004**](ExternalDataPoiExternalDataPoiInlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

