# EnterpriseImPersonaListApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterpriseImPersonaListGet**](EnterpriseImPersonaListApi.md#enterpriseImPersonaListGet) | **GET** /enterprise/im/persona/list/ | 获取客服列表

<a name="enterpriseImPersonaListGet"></a>
# **enterpriseImPersonaListGet**
> EnterprisePersonaPersonaListInlineResponse200 enterpriseImPersonaListGet(openId, accessToken, count, cursor)

获取客服列表

* Scope: &#x60;enterprise.im&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseImPersonaListApi;


EnterpriseImPersonaListApi apiInstance = new EnterpriseImPersonaListApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer count = 56; // Integer | 每页数量
Integer cursor = 56; // Integer | 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
try {
    EnterprisePersonaPersonaListInlineResponse200 result = apiInstance.enterpriseImPersonaListGet(openId, accessToken, count, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseImPersonaListApi#enterpriseImPersonaListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **count** | **Integer**| 每页数量 | [enum: ]
 **cursor** | **Integer**| 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 | [optional]

### Return type

[**EnterprisePersonaPersonaListInlineResponse200**](EnterprisePersonaPersonaListInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

