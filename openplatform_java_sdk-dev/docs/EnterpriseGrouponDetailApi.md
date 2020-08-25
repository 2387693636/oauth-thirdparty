# EnterpriseGrouponDetailApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterpriseGrouponDetailGet**](EnterpriseGrouponDetailApi.md#enterpriseGrouponDetailGet) | **GET** /enterprise/groupon/detail/ | 团购活动详情

<a name="enterpriseGrouponDetailGet"></a>
# **enterpriseGrouponDetailGet**
> EnterpriseGrouponGrouponGrouponDetailInlineResponse200 enterpriseGrouponDetailGet(accessToken, openId, grouponIds)

团购活动详情

* Scope: &#x60;enterprise.groupon&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseGrouponDetailApi;


EnterpriseGrouponDetailApi apiInstance = new EnterpriseGrouponDetailApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
List<String> grouponIds = Arrays.asList("grouponIds_example"); // List<String> | 团购活动的Id
try {
    EnterpriseGrouponGrouponGrouponDetailInlineResponse200 result = apiInstance.enterpriseGrouponDetailGet(accessToken, openId, grouponIds);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseGrouponDetailApi#enterpriseGrouponDetailGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **grouponIds** | [**List&lt;String&gt;**](String.md)| 团购活动的Id |

### Return type

[**EnterpriseGrouponGrouponGrouponDetailInlineResponse200**](EnterpriseGrouponGrouponGrouponDetailInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

