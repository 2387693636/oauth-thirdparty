# EnterpriseGrouponSaveApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterpriseGrouponSavePost**](EnterpriseGrouponSaveApi.md#enterpriseGrouponSavePost) | **POST** /enterprise/groupon/save/ | 创建团购活动

<a name="enterpriseGrouponSavePost"></a>
# **enterpriseGrouponSavePost**
> EnterpriseGrouponGrouponGrouponSaveInlineResponse200 enterpriseGrouponSavePost(accessToken, openId, body)

创建团购活动

* Scope: &#x60;enterprise.groupon&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseGrouponSaveApi;


EnterpriseGrouponSaveApi apiInstance = new EnterpriseGrouponSaveApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
EnterpriseGrouponGrouponGrouponSaveGrouponItem body = new EnterpriseGrouponGrouponGrouponSaveGrouponItem(); // EnterpriseGrouponGrouponGrouponSaveGrouponItem | 
try {
    EnterpriseGrouponGrouponGrouponSaveInlineResponse200 result = apiInstance.enterpriseGrouponSavePost(accessToken, openId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseGrouponSaveApi#enterpriseGrouponSavePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **body** | [**EnterpriseGrouponGrouponGrouponSaveGrouponItem**](EnterpriseGrouponGrouponGrouponSaveGrouponItem.md)|  | [optional]

### Return type

[**EnterpriseGrouponGrouponGrouponSaveInlineResponse200**](EnterpriseGrouponGrouponGrouponSaveInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

