# VideoPublishApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**videoCreatePost**](VideoPublishApi.md#videoCreatePost) | **POST** /video/create/ | 创建抖音视频
[**videoPartCompletePost**](VideoPublishApi.md#videoPartCompletePost) | **POST** /video/part/complete/ | 完成上传
[**videoPartInitPost**](VideoPublishApi.md#videoPartInitPost) | **POST** /video/part/init/ | 初始化上传
[**videoPartUploadPost**](VideoPublishApi.md#videoPartUploadPost) | **POST** /video/part/upload/ | 上传视频分片到文件服务器
[**videoUploadPost**](VideoPublishApi.md#videoUploadPost) | **POST** /video/upload/ | 上传视频到文件服务器

<a name="videoCreatePost"></a>
# **videoCreatePost**
> VideoCreateAwemeCreateInlineResponse2001 videoCreatePost(openId, accessToken, body)

创建抖音视频

* Scope: &#x60;video.create&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.VideoPublishApi;


VideoPublishApi apiInstance = new VideoPublishApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
VideoCreateAwemeCreateBody1 body = new VideoCreateAwemeCreateBody1(); // VideoCreateAwemeCreateBody1 | 
try {
    VideoCreateAwemeCreateInlineResponse2001 result = apiInstance.videoCreatePost(openId, accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoPublishApi#videoCreatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **body** | [**VideoCreateAwemeCreateBody1**](VideoCreateAwemeCreateBody1.md)|  | [optional]

### Return type

[**VideoCreateAwemeCreateInlineResponse2001**](VideoCreateAwemeCreateInlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="videoPartCompletePost"></a>
# **videoPartCompletePost**
> VideoCreateAwemeCreateInlineResponse2004 videoPartCompletePost(openId, accessToken, uploadId)

完成上传

* Scope: &#x60;video.create&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.VideoPublishApi;


VideoPublishApi apiInstance = new VideoPublishApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String uploadId = "uploadId_example"; // String | 分片上传的标记。有限时间为2小时。
try {
    VideoCreateAwemeCreateInlineResponse2004 result = apiInstance.videoPartCompletePost(openId, accessToken, uploadId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoPublishApi#videoPartCompletePost");
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

[**VideoCreateAwemeCreateInlineResponse2004**](VideoCreateAwemeCreateInlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="videoPartInitPost"></a>
# **videoPartInitPost**
> VideoCreateAwemeCreateInlineResponse2002 videoPartInitPost(openId, accessToken)

初始化上传

* Scope: &#x60;video.create&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.VideoPublishApi;


VideoPublishApi apiInstance = new VideoPublishApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    VideoCreateAwemeCreateInlineResponse2002 result = apiInstance.videoPartInitPost(openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoPublishApi#videoPartInitPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**VideoCreateAwemeCreateInlineResponse2002**](VideoCreateAwemeCreateInlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="videoPartUploadPost"></a>
# **videoPartUploadPost**
> VideoCreateAwemeCreateInlineResponse2003 videoPartUploadPost(video, openId, accessToken, uploadId, partNumber)

上传视频分片到文件服务器

* Scope: &#x60;video.create&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.VideoPublishApi;


VideoPublishApi apiInstance = new VideoPublishApi();
File video = new File("video_example"); // File | 
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String uploadId = "uploadId_example"; // String | 分片上传的标记。有限时间为2小时。
Integer partNumber = 56; // Integer | 第几个分片，从1开始 
try {
    VideoCreateAwemeCreateInlineResponse2003 result = apiInstance.videoPartUploadPost(video, openId, accessToken, uploadId, partNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoPublishApi#videoPartUploadPost");
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

[**VideoCreateAwemeCreateInlineResponse2003**](VideoCreateAwemeCreateInlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="videoUploadPost"></a>
# **videoUploadPost**
> VideoCreateAwemeCreateInlineResponse200 videoUploadPost(video, openId, accessToken)

上传视频到文件服务器

* Scope: &#x60;video.create&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.VideoPublishApi;


VideoPublishApi apiInstance = new VideoPublishApi();
File video = new File("video_example"); // File | 
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    VideoCreateAwemeCreateInlineResponse200 result = apiInstance.videoUploadPost(video, openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VideoPublishApi#videoUploadPost");
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

[**VideoCreateAwemeCreateInlineResponse200**](VideoCreateAwemeCreateInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

