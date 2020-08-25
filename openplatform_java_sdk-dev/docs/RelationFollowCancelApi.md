# RelationFollowCancelApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**relationFollowingCancelPost**](RelationFollowCancelApi.md#relationFollowingCancelPost) | **POST** /relation/following/cancel/ | 取消关注指定抖音号

<a name="relationFollowingCancelPost"></a>
# **relationFollowingCancelPost**
> RelationRelationFollowCommonResponse relationFollowingCancelPost(openId, accessToken)

取消关注指定抖音号

* Scope: &#x60;relation.follow&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.RelationFollowCancelApi;


RelationFollowCancelApi apiInstance = new RelationFollowCancelApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    RelationRelationFollowCommonResponse result = apiInstance.relationFollowingCancelPost(openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationFollowCancelApi#relationFollowingCancelPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**RelationRelationFollowCommonResponse**](RelationRelationFollowCommonResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

