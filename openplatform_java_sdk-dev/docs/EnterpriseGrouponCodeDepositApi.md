# EnterpriseGrouponCodeDepositApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterpriseGrouponCodeDepositPost**](EnterpriseGrouponCodeDepositApi.md#enterpriseGrouponCodeDepositPost) | **POST** /enterprise/groupon/code/deposit/ | 自定义卷码预存

<a name="enterpriseGrouponCodeDepositPost"></a>
# **enterpriseGrouponCodeDepositPost**
> EnterpriseGrouponGrouponCodeCodeDepositInlineResponse200 enterpriseGrouponCodeDepositPost(accessToken, openId, body)

自定义卷码预存

* Scope: &#x60;enterprise.groupon&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseGrouponCodeDepositApi;


EnterpriseGrouponCodeDepositApi apiInstance = new EnterpriseGrouponCodeDepositApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
EnterpriseGrouponGrouponCodeCodeDepositBody body = new EnterpriseGrouponGrouponCodeCodeDepositBody(); // EnterpriseGrouponGrouponCodeCodeDepositBody | 
try {
    EnterpriseGrouponGrouponCodeCodeDepositInlineResponse200 result = apiInstance.enterpriseGrouponCodeDepositPost(accessToken, openId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseGrouponCodeDepositApi#enterpriseGrouponCodeDepositPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **body** | [**EnterpriseGrouponGrouponCodeCodeDepositBody**](EnterpriseGrouponGrouponCodeCodeDepositBody.md)|  | [optional]

### Return type

[**EnterpriseGrouponGrouponCodeCodeDepositInlineResponse200**](EnterpriseGrouponGrouponCodeCodeDepositInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

