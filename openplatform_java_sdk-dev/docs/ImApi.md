# ImApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**imMsgSendPost**](ImApi.md#imMsgSendPost) | **POST** /im/msg/send/ | 给抖音用户发送消息

<a name="imMsgSendPost"></a>
# **imMsgSendPost**
> ImMsgSendImMsgSendInlineResponse200 imMsgSendPost(body, openId, accessToken)

给抖音用户发送消息

* Scope: &#x60;im.send&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.ImApi;


ImApi apiInstance = new ImApi();
ImMsgSendImMsgSendBody body = new ImMsgSendImMsgSendBody(); // ImMsgSendImMsgSendBody | 
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    ImMsgSendImMsgSendInlineResponse200 result = apiInstance.imMsgSendPost(body, openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImApi#imMsgSendPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ImMsgSendImMsgSendBody**](ImMsgSendImMsgSendBody.md)|  |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**ImMsgSendImMsgSendInlineResponse200**](ImMsgSendImMsgSendInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

