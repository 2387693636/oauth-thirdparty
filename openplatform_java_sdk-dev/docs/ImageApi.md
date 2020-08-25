# ImageApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**imageCreatePost**](ImageApi.md#imageCreatePost) | **POST** /image/create/ | 发布图片
[**imageUploadPost**](ImageApi.md#imageUploadPost) | **POST** /image/upload/ | 上传图片到文件服务器

<a name="imageCreatePost"></a>
# **imageCreatePost**
> ImageCreateImageCreateInlineResponse2001 imageCreatePost(openId, accessToken, body)

发布图片

* Scope: &#x60;video.create&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.ImageApi;


ImageApi apiInstance = new ImageApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
ImageCreateImageCreateBody1 body = new ImageCreateImageCreateBody1(); // ImageCreateImageCreateBody1 | 
try {
    ImageCreateImageCreateInlineResponse2001 result = apiInstance.imageCreatePost(openId, accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImageApi#imageCreatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **body** | [**ImageCreateImageCreateBody1**](ImageCreateImageCreateBody1.md)|  | [optional]

### Return type

[**ImageCreateImageCreateInlineResponse2001**](ImageCreateImageCreateInlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="imageUploadPost"></a>
# **imageUploadPost**
> ImageCreateImageCreateInlineResponse200 imageUploadPost(image, openId, accessToken)

上传图片到文件服务器

* Scope: &#x60;video.create&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.ImageApi;


ImageApi apiInstance = new ImageApi();
File image = new File("image_example"); // File | 
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    ImageCreateImageCreateInlineResponse200 result = apiInstance.imageUploadPost(image, openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ImageApi#imageUploadPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **image** | **File**|  |
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**ImageCreateImageCreateInlineResponse200**](ImageCreateImageCreateInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

