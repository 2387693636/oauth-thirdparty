# EnterpriseGrouponOfflineApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterpriseGrouponOfflinePost**](EnterpriseGrouponOfflineApi.md#enterpriseGrouponOfflinePost) | **POST** /enterprise/groupon/offline/ | 团购活动下线

<a name="enterpriseGrouponOfflinePost"></a>
# **enterpriseGrouponOfflinePost**
> EnterpriseGrouponGrouponGrouponOfflineInlineResponse200 enterpriseGrouponOfflinePost(accessToken, openId, body)

团购活动下线

* Scope: &#x60;enterprise.groupon&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseGrouponOfflineApi;


EnterpriseGrouponOfflineApi apiInstance = new EnterpriseGrouponOfflineApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
EnterpriseGrouponGrouponGrouponOfflineBody body = new EnterpriseGrouponGrouponGrouponOfflineBody(); // EnterpriseGrouponGrouponGrouponOfflineBody | 
try {
    EnterpriseGrouponGrouponGrouponOfflineInlineResponse200 result = apiInstance.enterpriseGrouponOfflinePost(accessToken, openId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseGrouponOfflineApi#enterpriseGrouponOfflinePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **body** | [**EnterpriseGrouponGrouponGrouponOfflineBody**](EnterpriseGrouponGrouponGrouponOfflineBody.md)|  | [optional]

### Return type

[**EnterpriseGrouponGrouponGrouponOfflineInlineResponse200**](EnterpriseGrouponGrouponGrouponOfflineInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

