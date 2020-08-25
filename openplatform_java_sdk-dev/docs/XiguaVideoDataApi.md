# XiguaVideoDataApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**xiguaVideoDataPost**](XiguaVideoDataApi.md#xiguaVideoDataPost) | **POST** /xigua/video/data/ | 查询特定视频的视频数据

<a name="xiguaVideoDataPost"></a>
# **xiguaVideoDataPost**
> XiguaDataVideoDataInlineResponse200 xiguaVideoDataPost(body, openId, accessToken)

查询特定视频的视频数据

* Scope: &#x60;xigua.video.data&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.XiguaVideoDataApi;


XiguaVideoDataApi apiInstance = new XiguaVideoDataApi();
XiguaDataVideoDataBody body = new XiguaDataVideoDataBody(); // XiguaDataVideoDataBody | 
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    XiguaDataVideoDataInlineResponse200 result = apiInstance.xiguaVideoDataPost(body, openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XiguaVideoDataApi#xiguaVideoDataPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**XiguaDataVideoDataBody**](XiguaDataVideoDataBody.md)|  |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**XiguaDataVideoDataInlineResponse200**](XiguaDataVideoDataInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

