# DataExternalUserApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**dataExternalUserCommentGet**](DataExternalUserApi.md#dataExternalUserCommentGet) | **GET** /data/external/user/comment/ | 获取用户评论数
[**dataExternalUserFansGet**](DataExternalUserApi.md#dataExternalUserFansGet) | **GET** /data/external/user/fans/ | 获取用户粉丝数
[**dataExternalUserItemGet**](DataExternalUserApi.md#dataExternalUserItemGet) | **GET** /data/external/user/item/ | 获取用户视频情况
[**dataExternalUserLikeGet**](DataExternalUserApi.md#dataExternalUserLikeGet) | **GET** /data/external/user/like/ | 获取用户点赞数
[**dataExternalUserProfileGet**](DataExternalUserApi.md#dataExternalUserProfileGet) | **GET** /data/external/user/profile/ | 获取用户主页访问数
[**dataExternalUserShareGet**](DataExternalUserApi.md#dataExternalUserShareGet) | **GET** /data/external/user/share/ | 获取用户分享数

<a name="dataExternalUserCommentGet"></a>
# **dataExternalUserCommentGet**
> ExternalDataUserExternalDataUserInlineResponse2003 dataExternalUserCommentGet(openId, accessToken, dateType)

获取用户评论数

* Scope: &#x60;data.external.user&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.DataExternalUserApi;


DataExternalUserApi apiInstance = new DataExternalUserApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer dateType = 56; // Integer | 近7/15天；输入7代表7天、15代表15天、30代表30天
try {
    ExternalDataUserExternalDataUserInlineResponse2003 result = apiInstance.dataExternalUserCommentGet(openId, accessToken, dateType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExternalUserApi#dataExternalUserCommentGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **dateType** | **Integer**| 近7/15天；输入7代表7天、15代表15天、30代表30天 |

### Return type

[**ExternalDataUserExternalDataUserInlineResponse2003**](ExternalDataUserExternalDataUserInlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dataExternalUserFansGet"></a>
# **dataExternalUserFansGet**
> ExternalDataUserExternalDataUserInlineResponse2001 dataExternalUserFansGet(openId, accessToken, dateType)

获取用户粉丝数

* Scope: &#x60;data.external.user&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.DataExternalUserApi;


DataExternalUserApi apiInstance = new DataExternalUserApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer dateType = 56; // Integer | 近7/15天；输入7代表7天、15代表15天、30代表30天
try {
    ExternalDataUserExternalDataUserInlineResponse2001 result = apiInstance.dataExternalUserFansGet(openId, accessToken, dateType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExternalUserApi#dataExternalUserFansGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **dateType** | **Integer**| 近7/15天；输入7代表7天、15代表15天、30代表30天 |

### Return type

[**ExternalDataUserExternalDataUserInlineResponse2001**](ExternalDataUserExternalDataUserInlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dataExternalUserItemGet"></a>
# **dataExternalUserItemGet**
> ExternalDataUserExternalDataUserInlineResponse200 dataExternalUserItemGet(openId, accessToken, dateType)

获取用户视频情况

* Scope: &#x60;data.external.user&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.DataExternalUserApi;


DataExternalUserApi apiInstance = new DataExternalUserApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer dateType = 56; // Integer | 近7/15天；输入7代表7天、15代表15天、30代表30天
try {
    ExternalDataUserExternalDataUserInlineResponse200 result = apiInstance.dataExternalUserItemGet(openId, accessToken, dateType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExternalUserApi#dataExternalUserItemGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **dateType** | **Integer**| 近7/15天；输入7代表7天、15代表15天、30代表30天 |

### Return type

[**ExternalDataUserExternalDataUserInlineResponse200**](ExternalDataUserExternalDataUserInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dataExternalUserLikeGet"></a>
# **dataExternalUserLikeGet**
> ExternalDataUserExternalDataUserInlineResponse2002 dataExternalUserLikeGet(openId, accessToken, dateType)

获取用户点赞数

* Scope: &#x60;data.external.user&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.DataExternalUserApi;


DataExternalUserApi apiInstance = new DataExternalUserApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer dateType = 56; // Integer | 近7/15天；输入7代表7天、15代表15天、30代表30天
try {
    ExternalDataUserExternalDataUserInlineResponse2002 result = apiInstance.dataExternalUserLikeGet(openId, accessToken, dateType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExternalUserApi#dataExternalUserLikeGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **dateType** | **Integer**| 近7/15天；输入7代表7天、15代表15天、30代表30天 |

### Return type

[**ExternalDataUserExternalDataUserInlineResponse2002**](ExternalDataUserExternalDataUserInlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dataExternalUserProfileGet"></a>
# **dataExternalUserProfileGet**
> ExternalDataUserExternalDataUserInlineResponse2005 dataExternalUserProfileGet(openId, accessToken, dateType)

获取用户主页访问数

* Scope: &#x60;data.external.user&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.DataExternalUserApi;


DataExternalUserApi apiInstance = new DataExternalUserApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer dateType = 56; // Integer | 近7/15天；输入7代表7天、15代表15天、30代表30天
try {
    ExternalDataUserExternalDataUserInlineResponse2005 result = apiInstance.dataExternalUserProfileGet(openId, accessToken, dateType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExternalUserApi#dataExternalUserProfileGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **dateType** | **Integer**| 近7/15天；输入7代表7天、15代表15天、30代表30天 |

### Return type

[**ExternalDataUserExternalDataUserInlineResponse2005**](ExternalDataUserExternalDataUserInlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="dataExternalUserShareGet"></a>
# **dataExternalUserShareGet**
> ExternalDataUserExternalDataUserInlineResponse2004 dataExternalUserShareGet(openId, accessToken, dateType)

获取用户分享数

* Scope: &#x60;data.external.user&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.DataExternalUserApi;


DataExternalUserApi apiInstance = new DataExternalUserApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer dateType = 56; // Integer | 近7/15天；输入7代表7天、15代表15天、30代表30天
try {
    ExternalDataUserExternalDataUserInlineResponse2004 result = apiInstance.dataExternalUserShareGet(openId, accessToken, dateType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DataExternalUserApi#dataExternalUserShareGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **dateType** | **Integer**| 近7/15天；输入7代表7天、15代表15天、30代表30天 |

### Return type

[**ExternalDataUserExternalDataUserInlineResponse2004**](ExternalDataUserExternalDataUserInlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

