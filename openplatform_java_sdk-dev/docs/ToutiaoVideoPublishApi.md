# ToutiaoVideoPublishApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**toutiaoVideoCreatePost**](ToutiaoVideoPublishApi.md#toutiaoVideoCreatePost) | **POST** /toutiao/video/create/ | 创建头条视频
[**toutiaoVideoPartCompletePost**](ToutiaoVideoPublishApi.md#toutiaoVideoPartCompletePost) | **POST** /toutiao/video/part/complete/ | 完成上传
[**toutiaoVideoPartInitPost**](ToutiaoVideoPublishApi.md#toutiaoVideoPartInitPost) | **POST** /toutiao/video/part/init/ | 初始化上传
[**toutiaoVideoPartUploadPost**](ToutiaoVideoPublishApi.md#toutiaoVideoPartUploadPost) | **POST** /toutiao/video/part/upload/ | 上传视频分片到文件服务器
[**toutiaoVideoUploadPost**](ToutiaoVideoPublishApi.md#toutiaoVideoUploadPost) | **POST** /toutiao/video/upload/ | 上传视频到文件服务器

<a name="toutiaoVideoCreatePost"></a>
# **toutiaoVideoCreatePost**
> ToutiaoVideoCreateCreateInlineResponse2001 toutiaoVideoCreatePost(openId, accessToken, body)

创建头条视频

* Scope: &#x60;toutiao.video.create&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.ToutiaoVideoPublishApi;


ToutiaoVideoPublishApi apiInstance = new ToutiaoVideoPublishApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
ToutiaoVideoCreateCreateBody1 body = new ToutiaoVideoCreateCreateBody1(); // ToutiaoVideoCreateCreateBody1 | 
try {
    ToutiaoVideoCreateCreateInlineResponse2001 result = apiInstance.toutiaoVideoCreatePost(openId, accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToutiaoVideoPublishApi#toutiaoVideoCreatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **body** | [**ToutiaoVideoCreateCreateBody1**](ToutiaoVideoCreateCreateBody1.md)|  | [optional]

### Return type

[**ToutiaoVideoCreateCreateInlineResponse2001**](ToutiaoVideoCreateCreateInlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="toutiaoVideoPartCompletePost"></a>
# **toutiaoVideoPartCompletePost**
> ToutiaoVideoCreateCreateInlineResponse2004 toutiaoVideoPartCompletePost(openId, accessToken, uploadId)

完成上传

* Scope: &#x60;toutiao.video.create&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.ToutiaoVideoPublishApi;


ToutiaoVideoPublishApi apiInstance = new ToutiaoVideoPublishApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String uploadId = "uploadId_example"; // String | 分片上传的标记。有限时间为2小时。
try {
    ToutiaoVideoCreateCreateInlineResponse2004 result = apiInstance.toutiaoVideoPartCompletePost(openId, accessToken, uploadId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToutiaoVideoPublishApi#toutiaoVideoPartCompletePost");
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

[**ToutiaoVideoCreateCreateInlineResponse2004**](ToutiaoVideoCreateCreateInlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="toutiaoVideoPartInitPost"></a>
# **toutiaoVideoPartInitPost**
> ToutiaoVideoCreateCreateInlineResponse2002 toutiaoVideoPartInitPost(openId, accessToken)

初始化上传

* Scope: &#x60;toutiao.video.create&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.ToutiaoVideoPublishApi;


ToutiaoVideoPublishApi apiInstance = new ToutiaoVideoPublishApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    ToutiaoVideoCreateCreateInlineResponse2002 result = apiInstance.toutiaoVideoPartInitPost(openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToutiaoVideoPublishApi#toutiaoVideoPartInitPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**ToutiaoVideoCreateCreateInlineResponse2002**](ToutiaoVideoCreateCreateInlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="toutiaoVideoPartUploadPost"></a>
# **toutiaoVideoPartUploadPost**
> ToutiaoVideoCreateCreateInlineResponse2003 toutiaoVideoPartUploadPost(video, openId, accessToken, uploadId, partNumber)

上传视频分片到文件服务器

* Scope: &#x60;toutiao.video.create&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.ToutiaoVideoPublishApi;


ToutiaoVideoPublishApi apiInstance = new ToutiaoVideoPublishApi();
File video = new File("video_example"); // File | 
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String uploadId = "uploadId_example"; // String | 分片上传的标记。有限时间为2小时。
Integer partNumber = 56; // Integer | 第几个分片，从1开始 
try {
    ToutiaoVideoCreateCreateInlineResponse2003 result = apiInstance.toutiaoVideoPartUploadPost(video, openId, accessToken, uploadId, partNumber);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToutiaoVideoPublishApi#toutiaoVideoPartUploadPost");
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

[**ToutiaoVideoCreateCreateInlineResponse2003**](ToutiaoVideoCreateCreateInlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="toutiaoVideoUploadPost"></a>
# **toutiaoVideoUploadPost**
> ToutiaoVideoCreateCreateInlineResponse200 toutiaoVideoUploadPost(video, openId, accessToken)

上传视频到文件服务器

* Scope: &#x60;toutiao.video.create&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.ToutiaoVideoPublishApi;


ToutiaoVideoPublishApi apiInstance = new ToutiaoVideoPublishApi();
File video = new File("video_example"); // File | 
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    ToutiaoVideoCreateCreateInlineResponse200 result = apiInstance.toutiaoVideoUploadPost(video, openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ToutiaoVideoPublishApi#toutiaoVideoUploadPost");
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

[**ToutiaoVideoCreateCreateInlineResponse200**](ToutiaoVideoCreateCreateInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

