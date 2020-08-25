# DataExternalItemApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dataExternalItemBaseGet**](DataExternalItemApi.md#dataExternalItemBaseGet) | **GET** /data/external/item/base/ | 获取视频基础数据
[**dataExternalItemCommentGet**](DataExternalItemApi.md#dataExternalItemCommentGet) | **GET** /data/external/item/comment/ | 获取视频评论数据
[**dataExternalItemLikeGet**](DataExternalItemApi.md#dataExternalItemLikeGet) | **GET** /data/external/item/like/ | 获取视频点赞数据
[**dataExternalItemPlayGet**](DataExternalItemApi.md#dataExternalItemPlayGet) | **GET** /data/external/item/play/ | 获取视频播放数据
[**dataExternalItemShareGet**](DataExternalItemApi.md#dataExternalItemShareGet) | **GET** /data/external/item/share/ | 获取视频分享数据

<a name="dataExternalItemBaseGet"></a>
# **dataExternalItemBaseGet**
> ExternalDataItemExternalDataItemInlineResponse200 dataExternalItemBaseGet(openId, accessToken, itemId)

获取视频基础数据

* Scope: &#x60;data.external.item&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.DataExternalItemApi;


DataExternalItemApi apiInstance = new DataExternalItemApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String itemId = "itemId_example"; // String | item_id，仅能查询access_token对应用户上传的视频
try {
    ExternalDataItemExternalDataItemInlineResponse200 result = apiInstance.dataExternalItemBaseGet(openId, accessToken, itemId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExternalItemApi#dataExternalItemBaseGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **itemId** | **String**| item_id，仅能查询access_token对应用户上传的视频 |

### Return type

[**ExternalDataItemExternalDataItemInlineResponse200**](ExternalDataItemExternalDataItemInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dataExternalItemCommentGet"></a>
# **dataExternalItemCommentGet**
> ExternalDataItemExternalDataItemInlineResponse2002 dataExternalItemCommentGet(openId, accessToken, itemId, dateType)

获取视频评论数据

* Scope: &#x60;data.external.item&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.DataExternalItemApi;


DataExternalItemApi apiInstance = new DataExternalItemApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String itemId = "itemId_example"; // String | item_id，仅能查询access_token对应用户上传的视频
Integer dateType = 56; // Integer | 近7/15天；输入7代表7天、15代表15天
try {
    ExternalDataItemExternalDataItemInlineResponse2002 result = apiInstance.dataExternalItemCommentGet(openId, accessToken, itemId, dateType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExternalItemApi#dataExternalItemCommentGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **itemId** | **String**| item_id，仅能查询access_token对应用户上传的视频 |
 **dateType** | **Integer**| 近7/15天；输入7代表7天、15代表15天 |

### Return type

[**ExternalDataItemExternalDataItemInlineResponse2002**](ExternalDataItemExternalDataItemInlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dataExternalItemLikeGet"></a>
# **dataExternalItemLikeGet**
> ExternalDataItemExternalDataItemInlineResponse2001 dataExternalItemLikeGet(openId, accessToken, itemId, dateType)

获取视频点赞数据

* Scope: &#x60;data.external.item&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.DataExternalItemApi;


DataExternalItemApi apiInstance = new DataExternalItemApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String itemId = "itemId_example"; // String | item_id，仅能查询access_token对应用户上传的视频
Integer dateType = 56; // Integer | 近7/15天；输入7代表7天、15代表15天
try {
    ExternalDataItemExternalDataItemInlineResponse2001 result = apiInstance.dataExternalItemLikeGet(openId, accessToken, itemId, dateType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExternalItemApi#dataExternalItemLikeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **itemId** | **String**| item_id，仅能查询access_token对应用户上传的视频 |
 **dateType** | **Integer**| 近7/15天；输入7代表7天、15代表15天 |

### Return type

[**ExternalDataItemExternalDataItemInlineResponse2001**](ExternalDataItemExternalDataItemInlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dataExternalItemPlayGet"></a>
# **dataExternalItemPlayGet**
> ExternalDataItemExternalDataItemInlineResponse2003 dataExternalItemPlayGet(openId, accessToken, itemId, dateType)

获取视频播放数据

* Scope: &#x60;data.external.item&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.DataExternalItemApi;


DataExternalItemApi apiInstance = new DataExternalItemApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String itemId = "itemId_example"; // String | item_id，仅能查询access_token对应用户上传的视频
Integer dateType = 56; // Integer | 近7/15天；输入7代表7天、15代表15天
try {
    ExternalDataItemExternalDataItemInlineResponse2003 result = apiInstance.dataExternalItemPlayGet(openId, accessToken, itemId, dateType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExternalItemApi#dataExternalItemPlayGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **itemId** | **String**| item_id，仅能查询access_token对应用户上传的视频 |
 **dateType** | **Integer**| 近7/15天；输入7代表7天、15代表15天 |

### Return type

[**ExternalDataItemExternalDataItemInlineResponse2003**](ExternalDataItemExternalDataItemInlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dataExternalItemShareGet"></a>
# **dataExternalItemShareGet**
> ExternalDataItemExternalDataItemInlineResponse2004 dataExternalItemShareGet(openId, accessToken, itemId, dateType)

获取视频分享数据

* Scope: &#x60;data.external.item&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.DataExternalItemApi;


DataExternalItemApi apiInstance = new DataExternalItemApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String itemId = "itemId_example"; // String | item_id，仅能查询access_token对应用户上传的视频
Integer dateType = 56; // Integer | 近7/15天；输入7代表7天、15代表15天
try {
    ExternalDataItemExternalDataItemInlineResponse2004 result = apiInstance.dataExternalItemShareGet(openId, accessToken, itemId, dateType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExternalItemApi#dataExternalItemShareGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **itemId** | **String**| item_id，仅能查询access_token对应用户上传的视频 |
 **dateType** | **Integer**| 近7/15天；输入7代表7天、15代表15天 |

### Return type

[**ExternalDataItemExternalDataItemInlineResponse2004**](ExternalDataItemExternalDataItemInlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

