# RelationFollowCreateApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**relationFollowingCreatePost**](RelationFollowCreateApi.md#relationFollowingCreatePost) | **POST** /relation/following/create/ | 关注指定抖音号

<a name="relationFollowingCreatePost"></a>
# **relationFollowingCreatePost**
> RelationRelationFollowCommonResponse relationFollowingCreatePost(openId, accessToken)

关注指定抖音号

* Scope: &#x60;relation.follow&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.RelationFollowCreateApi;


RelationFollowCreateApi apiInstance = new RelationFollowCreateApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    RelationRelationFollowCommonResponse result = apiInstance.relationFollowingCreatePost(openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RelationFollowCreateApi#relationFollowingCreatePost");
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

