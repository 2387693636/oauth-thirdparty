# EnterpriseGrouponListApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterpriseGrouponListGet**](EnterpriseGrouponListApi.md#enterpriseGrouponListGet) | **GET** /enterprise/groupon/list/ | 团购活动列表

<a name="enterpriseGrouponListGet"></a>
# **enterpriseGrouponListGet**
> EnterpriseGrouponGrouponGrouponListInlineResponse200 enterpriseGrouponListGet(accessToken, openId, count, cursor, status)

团购活动列表

* Scope: &#x60;enterprise.groupon&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseGrouponListApi;


EnterpriseGrouponListApi apiInstance = new EnterpriseGrouponListApi();
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
Integer count = 56; // Integer | 每页数量
Integer cursor = 56; // Integer | 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。
Integer status = 56; // Integer | * 状态筛选   * 1: 有效   * 2: 审核中   * 3: 审核失败   * 4: 中止 
try {
    EnterpriseGrouponGrouponGrouponListInlineResponse200 result = apiInstance.enterpriseGrouponListGet(accessToken, openId, count, cursor, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseGrouponListApi#enterpriseGrouponListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **count** | **Integer**| 每页数量 | [enum: ]
 **cursor** | **Integer**| 分页游标, 第一页请求cursor是0, response中会返回下一页请求用到的cursor, 同时response还会返回has_more来表明是否有更多的数据。 | [optional]
 **status** | **Integer**| * 状态筛选   * 1: 有效   * 2: 审核中   * 3: 审核失败   * 4: 中止  | [optional] [enum: 1, 2, 3, 4]

### Return type

[**EnterpriseGrouponGrouponGrouponListInlineResponse200**](EnterpriseGrouponGrouponGrouponListInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

