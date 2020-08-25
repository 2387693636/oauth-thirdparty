# UserInfoApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**oauthUserinfoGet**](UserInfoApi.md#oauthUserinfoGet) | **GET** /oauth/userinfo/ | 获取用户信息

<a name="oauthUserinfoGet"></a>
# **oauthUserinfoGet**
> UserUserInfoUserInfoInlineResponse200 oauthUserinfoGet(openId, accessToken)

获取用户信息

* Scope: &#x60;user_info&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.UserInfoApi;


UserInfoApi apiInstance = new UserInfoApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
try {
    UserUserInfoUserInfoInlineResponse200 result = apiInstance.oauthUserinfoGet(openId, accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserInfoApi#oauthUserinfoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |

### Return type

[**UserUserInfoUserInfoInlineResponse200**](UserUserInfoUserInfoInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

