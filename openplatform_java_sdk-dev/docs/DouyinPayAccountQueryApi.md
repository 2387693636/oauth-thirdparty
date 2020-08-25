# DouyinPayAccountQueryApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**douyinPayAccountQueryGet**](DouyinPayAccountQueryApi.md#douyinPayAccountQueryGet) | **GET** /douyin-pay/account-query/ | 账户余额查询

<a name="douyinPayAccountQueryGet"></a>
# **douyinPayAccountQueryGet**
> DouyinPayDouyinPayInlineResponse2002 douyinPayAccountQueryGet(accessToken, merchantId, liveId)

账户余额查询

* Scope: &#x60;douyin.pay.op&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.DouyinPayAccountQueryApi;


DouyinPayAccountQueryApi apiInstance = new DouyinPayAccountQueryApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/client_token/生成的token，此token不需要用户授权。
Integer merchantId = 56; // Integer | 商户id
Integer liveId = 56; // Integer | 业务id
try {
    DouyinPayDouyinPayInlineResponse2002 result = apiInstance.douyinPayAccountQueryGet(accessToken, merchantId, liveId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DouyinPayAccountQueryApi#douyinPayAccountQueryGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/client_token/生成的token，此token不需要用户授权。 |
 **merchantId** | **Integer**| 商户id |
 **liveId** | **Integer**| 业务id |

### Return type

[**DouyinPayDouyinPayInlineResponse2002**](DouyinPayDouyinPayInlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

