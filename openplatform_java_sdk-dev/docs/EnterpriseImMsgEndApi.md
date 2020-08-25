# EnterpriseImMsgEndApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterpriseImMessageSendPost**](EnterpriseImMsgEndApi.md#enterpriseImMessageSendPost) | **POST** /enterprise/im/message/send/ | 发送消息

<a name="enterpriseImMessageSendPost"></a>
# **enterpriseImMessageSendPost**
> EnterpriseImEnterpriseImInlineResponse200 enterpriseImMessageSendPost(body, openId, accessToken)

发送消息

* Scope: &#x60;enterprise.im&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseImMsgEndApi;


EnterpriseImMsgEndApi apiInstance = new EnterpriseImMsgEndApi();
EnterpriseImEnterpriseImBody body = new EnterpriseImEnterpriseImBody(); // EnterpriseImEnterpriseImBody | 
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    EnterpriseImEnterpriseImInlineResponse200 result = apiInstance.enterpriseImMessageSendPost(body, openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseImMsgEndApi#enterpriseImMessageSendPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**EnterpriseImEnterpriseImBody**](EnterpriseImEnterpriseImBody.md)|  |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**EnterpriseImEnterpriseImInlineResponse200**](EnterpriseImEnterpriseImInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

