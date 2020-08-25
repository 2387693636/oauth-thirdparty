# EnterpriseGrouponCodeCertApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterpriseGrouponCodeVerificationPost**](EnterpriseGrouponCodeCertApi.md#enterpriseGrouponCodeVerificationPost) | **POST** /enterprise/groupon/code/verification/ | 券码核销

<a name="enterpriseGrouponCodeVerificationPost"></a>
# **enterpriseGrouponCodeVerificationPost**
> EnterpriseGrouponGrouponCodeCodeVerificationInlineResponse200 enterpriseGrouponCodeVerificationPost(accessToken, openId, body)

券码核销

* Scope: &#x60;enterprise.groupon&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseGrouponCodeCertApi;


EnterpriseGrouponCodeCertApi apiInstance = new EnterpriseGrouponCodeCertApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
EnterpriseGrouponGrouponCodeCodeVerificationBody body = new EnterpriseGrouponGrouponCodeCodeVerificationBody(); // EnterpriseGrouponGrouponCodeCodeVerificationBody | 
try {
    EnterpriseGrouponGrouponCodeCodeVerificationInlineResponse200 result = apiInstance.enterpriseGrouponCodeVerificationPost(accessToken, openId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseGrouponCodeCertApi#enterpriseGrouponCodeVerificationPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **body** | [**EnterpriseGrouponGrouponCodeCodeVerificationBody**](EnterpriseGrouponGrouponCodeCodeVerificationBody.md)|  | [optional]

### Return type

[**EnterpriseGrouponGrouponCodeCodeVerificationInlineResponse200**](EnterpriseGrouponGrouponCodeCodeVerificationInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

