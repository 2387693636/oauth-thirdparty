# XiguaVideoPublishApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**xiguaVideoCreatePost**](XiguaVideoPublishApi.md#xiguaVideoCreatePost) | **POST** /xigua/video/create/ | 创建西瓜视频
[**xiguaVideoPartCompletePost**](XiguaVideoPublishApi.md#xiguaVideoPartCompletePost) | **POST** /xigua/video/part/complete/ | 完成上传
[**xiguaVideoPartInitPost**](XiguaVideoPublishApi.md#xiguaVideoPartInitPost) | **POST** /xigua/video/part/init/ | 初始化上传
[**xiguaVideoPartUploadPost**](XiguaVideoPublishApi.md#xiguaVideoPartUploadPost) | **POST** /xigua/video/part/upload/ | 上传视频分片到文件服务器
[**xiguaVideoUploadPost**](XiguaVideoPublishApi.md#xiguaVideoUploadPost) | **POST** /xigua/video/upload/ | 上传视频到文件服务器

<a name="xiguaVideoCreatePost"></a>
# **xiguaVideoCreatePost**
> XiguaVideoCreateInlineResponse2001 xiguaVideoCreatePost(openId, accessToken, body)

创建西瓜视频

* Scope: &#x60;xigua.video.create&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.XiguaVideoPublishApi;


XiguaVideoPublishApi apiInstance = new XiguaVideoPublishApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
XiguaVideoCreateBody1 body = new XiguaVideoCreateBody1(); // XiguaVideoCreateBody1 | 
try {
    XiguaVideoCreateInlineResponse2001 result = apiInstance.xiguaVideoCreatePost(openId, accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XiguaVideoPublishApi#xiguaVideoCreatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **body** | [**XiguaVideoCreateBody1**](XiguaVideoCreateBody1.md)|  | [optional]

### Return type

[**XiguaVideoCreateInlineResponse2001**](XiguaVideoCreateInlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="xiguaVideoPartCompletePost"></a>
# **xiguaVideoPartCompletePost**
> XiguaVideoCreateInlineResponse2004 xiguaVideoPartCompletePost(openId, accessToken, uploadId)

完成上传

* Scope: &#x60;xigua.video.create&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.XiguaVideoPublishApi;


XiguaVideoPublishApi apiInstance = new XiguaVideoPublishApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String uploadId = "uploadId_example"; // String | 分片上传的标记。有限时间为2小时。
try {
    XiguaVideoCreateInlineResponse2004 result = apiInstance.xiguaVideoPartCompletePost(openId, accessToken, uploadId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XiguaVideoPublishApi#xiguaVideoPartCompletePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **uploadId** | **String**| 分片上传的标记。有限时间为2小时。 |

### Return type

[**XiguaVideoCreateInlineResponse2004**](XiguaVideoCreateInlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="xiguaVideoPartInitPost"></a>
# **xiguaVideoPartInitPost**
> XiguaVideoCreateInlineResponse2002 xiguaVideoPartInitPost(openId, accessToken)

初始化上传

* Scope: &#x60;xigua.video.create&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.XiguaVideoPublishApi;


XiguaVideoPublishApi apiInstance = new XiguaVideoPublishApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    XiguaVideoCreateInlineResponse2002 result = apiInstance.xiguaVideoPartInitPost(openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XiguaVideoPublishApi#xiguaVideoPartInitPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**XiguaVideoCreateInlineResponse2002**](XiguaVideoCreateInlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="xiguaVideoPartUploadPost"></a>
# **xiguaVideoPartUploadPost**
> XiguaVideoCreateInlineResponse2003 xiguaVideoPartUploadPost(video, openId, accessToken, uploadId, partNumber)

上传视频分片到文件服务器

* Scope: &#x60;xigua.video.create&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.XiguaVideoPublishApi;


XiguaVideoPublishApi apiInstance = new XiguaVideoPublishApi();
File video = new File("video_example"); // File | 
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String uploadId = "uploadId_example"; // String | 分片上传的标记。有限时间为2小时。
Integer partNumber = 56; // Integer | 第几个分片，从1开始 
try {
    XiguaVideoCreateInlineResponse2003 result = apiInstance.xiguaVideoPartUploadPost(video, openId, accessToken, uploadId, partNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XiguaVideoPublishApi#xiguaVideoPartUploadPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **video** | **File**|  |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **uploadId** | **String**| 分片上传的标记。有限时间为2小时。 |
 **partNumber** | **Integer**| 第几个分片，从1开始  |

### Return type

[**XiguaVideoCreateInlineResponse2003**](XiguaVideoCreateInlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="xiguaVideoUploadPost"></a>
# **xiguaVideoUploadPost**
> XiguaVideoCreateInlineResponse200 xiguaVideoUploadPost(video, openId, accessToken)

上传视频到文件服务器

* Scope: &#x60;xigua.video.create&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.XiguaVideoPublishApi;


XiguaVideoPublishApi apiInstance = new XiguaVideoPublishApi();
File video = new File("video_example"); // File | 
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    XiguaVideoCreateInlineResponse200 result = apiInstance.xiguaVideoUploadPost(video, openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling XiguaVideoPublishApi#xiguaVideoUploadPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **video** | **File**|  |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**XiguaVideoCreateInlineResponse200**](XiguaVideoCreateInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

