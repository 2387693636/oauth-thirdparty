# EnterpriseGrouponCodeStatusApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterpriseGrouponCodeStatusPost**](EnterpriseGrouponCodeStatusApi.md#enterpriseGrouponCodeStatusPost) | **POST** /enterprise/groupon/code/status/ | 查看券码状态

<a name="enterpriseGrouponCodeStatusPost"></a>
# **enterpriseGrouponCodeStatusPost**
> EnterpriseGrouponGrouponCodeCodeStatusInlineResponse200 enterpriseGrouponCodeStatusPost(accessToken, openId, body)

查看券码状态

* Scope: &#x60;enterprise.groupon&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseGrouponCodeStatusApi;


EnterpriseGrouponCodeStatusApi apiInstance = new EnterpriseGrouponCodeStatusApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
EnterpriseGrouponGrouponCodeCodeStatusBody body = new EnterpriseGrouponGrouponCodeCodeStatusBody(); // EnterpriseGrouponGrouponCodeCodeStatusBody | 
try {
    EnterpriseGrouponGrouponCodeCodeStatusInlineResponse200 result = apiInstance.enterpriseGrouponCodeStatusPost(accessToken, openId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseGrouponCodeStatusApi#enterpriseGrouponCodeStatusPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **body** | [**EnterpriseGrouponGrouponCodeCodeStatusBody**](EnterpriseGrouponGrouponCodeCodeStatusBody.md)|  | [optional]

### Return type

[**EnterpriseGrouponGrouponCodeCodeStatusInlineResponse200**](EnterpriseGrouponGrouponCodeCodeStatusInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

