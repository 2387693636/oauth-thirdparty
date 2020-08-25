# EnterpriseLeadsApi

All URIs are relative to *https://open.douyin.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**enterpriseLeadsTagCreatePost**](EnterpriseLeadsApi.md#enterpriseLeadsTagCreatePost) | **POST** /enterprise/leads/tag/create/ | 创建标签
[**enterpriseLeadsTagDeletePost**](EnterpriseLeadsApi.md#enterpriseLeadsTagDeletePost) | **POST** /enterprise/leads/tag/delete/ | 删除标签
[**enterpriseLeadsTagListGet**](EnterpriseLeadsApi.md#enterpriseLeadsTagListGet) | **GET** /enterprise/leads/tag/list/ | 获取标签列表
[**enterpriseLeadsTagUpdatePost**](EnterpriseLeadsApi.md#enterpriseLeadsTagUpdatePost) | **POST** /enterprise/leads/tag/update/ | 编辑标签
[**enterpriseLeadsTagUserListGet**](EnterpriseLeadsApi.md#enterpriseLeadsTagUserListGet) | **GET** /enterprise/leads/tag/user/list/ | 获取打标签的用户列表
[**enterpriseLeadsTagUserUpdatePost**](EnterpriseLeadsApi.md#enterpriseLeadsTagUserUpdatePost) | **POST** /enterprise/leads/tag/user/update/ | 给用户设置标签
[**enterpriseLeadsUserActionListGet**](EnterpriseLeadsApi.md#enterpriseLeadsUserActionListGet) | **GET** /enterprise/leads/user/action/list/ | 获取意向用户互动记录
[**enterpriseLeadsUserDetailGet**](EnterpriseLeadsApi.md#enterpriseLeadsUserDetailGet) | **GET** /enterprise/leads/user/detail/ | 获取意向用户详情
[**enterpriseLeadsUserListGet**](EnterpriseLeadsApi.md#enterpriseLeadsUserListGet) | **GET** /enterprise/leads/user/list/ | 获取意向用户列表

<a name="enterpriseLeadsTagCreatePost"></a>
# **enterpriseLeadsTagCreatePost**
> EnterpriseLeadsLeadsUserInlineResponse2005 enterpriseLeadsTagCreatePost(openId, accessToken, body)

创建标签

* Scope: &#x60;enterprise.data&#x60; * 一个企业号最多创建100个标签 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseLeadsApi;


EnterpriseLeadsApi apiInstance = new EnterpriseLeadsApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
EnterpriseLeadsLeadsUserBody body = new EnterpriseLeadsLeadsUserBody(); // EnterpriseLeadsLeadsUserBody | 
try {
    EnterpriseLeadsLeadsUserInlineResponse2005 result = apiInstance.enterpriseLeadsTagCreatePost(openId, accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseLeadsApi#enterpriseLeadsTagCreatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **body** | [**EnterpriseLeadsLeadsUserBody**](EnterpriseLeadsLeadsUserBody.md)|  | [optional]

### Return type

[**EnterpriseLeadsLeadsUserInlineResponse2005**](EnterpriseLeadsLeadsUserInlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="enterpriseLeadsTagDeletePost"></a>
# **enterpriseLeadsTagDeletePost**
> EnterpriseLeadsLeadsUserInlineResponse2006 enterpriseLeadsTagDeletePost(openId, accessToken, body)

删除标签

* Scope: &#x60;enterprise.data&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseLeadsApi;


EnterpriseLeadsApi apiInstance = new EnterpriseLeadsApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
EnterpriseLeadsLeadsUserBody2 body = new EnterpriseLeadsLeadsUserBody2(); // EnterpriseLeadsLeadsUserBody2 | 
try {
    EnterpriseLeadsLeadsUserInlineResponse2006 result = apiInstance.enterpriseLeadsTagDeletePost(openId, accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseLeadsApi#enterpriseLeadsTagDeletePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **body** | [**EnterpriseLeadsLeadsUserBody2**](EnterpriseLeadsLeadsUserBody2.md)|  | [optional]

### Return type

[**EnterpriseLeadsLeadsUserInlineResponse2006**](EnterpriseLeadsLeadsUserInlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="enterpriseLeadsTagListGet"></a>
# **enterpriseLeadsTagListGet**
> EnterpriseLeadsLeadsUserInlineResponse2003 enterpriseLeadsTagListGet(openId, accessToken, count, cursor)

获取标签列表

* Scope: &#x60;enterprise.data&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseLeadsApi;


EnterpriseLeadsApi apiInstance = new EnterpriseLeadsApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer count = 56; // Integer | 每页数量
Integer cursor = 1; // Integer | 分页游标
try {
    EnterpriseLeadsLeadsUserInlineResponse2003 result = apiInstance.enterpriseLeadsTagListGet(openId, accessToken, count, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseLeadsApi#enterpriseLeadsTagListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **count** | **Integer**| 每页数量 | [enum: ]
 **cursor** | **Integer**| 分页游标 | [optional] [default to 1] [enum: ]

### Return type

[**EnterpriseLeadsLeadsUserInlineResponse2003**](EnterpriseLeadsLeadsUserInlineResponse2003.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="enterpriseLeadsTagUpdatePost"></a>
# **enterpriseLeadsTagUpdatePost**
> EnterpriseLeadsLeadsUserInlineResponse2005 enterpriseLeadsTagUpdatePost(openId, accessToken, body)

编辑标签

* Scope: &#x60;enterprise.data&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseLeadsApi;


EnterpriseLeadsApi apiInstance = new EnterpriseLeadsApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
EnterpriseLeadsLeadsUserBody1 body = new EnterpriseLeadsLeadsUserBody1(); // EnterpriseLeadsLeadsUserBody1 | 
try {
    EnterpriseLeadsLeadsUserInlineResponse2005 result = apiInstance.enterpriseLeadsTagUpdatePost(openId, accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseLeadsApi#enterpriseLeadsTagUpdatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **body** | [**EnterpriseLeadsLeadsUserBody1**](EnterpriseLeadsLeadsUserBody1.md)|  | [optional]

### Return type

[**EnterpriseLeadsLeadsUserInlineResponse2005**](EnterpriseLeadsLeadsUserInlineResponse2005.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="enterpriseLeadsTagUserListGet"></a>
# **enterpriseLeadsTagUserListGet**
> EnterpriseLeadsLeadsUserInlineResponse2004 enterpriseLeadsTagUserListGet(openId, accessToken, count, tagId, cursor)

获取打标签的用户列表

* Scope: &#x60;enterprise.data&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseLeadsApi;


EnterpriseLeadsApi apiInstance = new EnterpriseLeadsApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer count = 56; // Integer | 每页数量
Integer tagId = 56; // Integer | 
Integer cursor = 1; // Integer | 分页游标
try {
    EnterpriseLeadsLeadsUserInlineResponse2004 result = apiInstance.enterpriseLeadsTagUserListGet(openId, accessToken, count, tagId, cursor);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseLeadsApi#enterpriseLeadsTagUserListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **count** | **Integer**| 每页数量 | [enum: ]
 **tagId** | **Integer**|  |
 **cursor** | **Integer**| 分页游标 | [optional] [default to 1] [enum: ]

### Return type

[**EnterpriseLeadsLeadsUserInlineResponse2004**](EnterpriseLeadsLeadsUserInlineResponse2004.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="enterpriseLeadsTagUserUpdatePost"></a>
# **enterpriseLeadsTagUserUpdatePost**
> EnterpriseLeadsLeadsUserInlineResponse2006 enterpriseLeadsTagUserUpdatePost(openId, accessToken, body)

给用户设置标签

* Scope: &#x60;enterprise.data&#x60; * 一个用户最多设置5个标签 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseLeadsApi;


EnterpriseLeadsApi apiInstance = new EnterpriseLeadsApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
EnterpriseLeadsLeadsUserBody3 body = new EnterpriseLeadsLeadsUserBody3(); // EnterpriseLeadsLeadsUserBody3 | 
try {
    EnterpriseLeadsLeadsUserInlineResponse2006 result = apiInstance.enterpriseLeadsTagUserUpdatePost(openId, accessToken, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseLeadsApi#enterpriseLeadsTagUserUpdatePost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **body** | [**EnterpriseLeadsLeadsUserBody3**](EnterpriseLeadsLeadsUserBody3.md)|  | [optional]

### Return type

[**EnterpriseLeadsLeadsUserInlineResponse2006**](EnterpriseLeadsLeadsUserInlineResponse2006.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="enterpriseLeadsUserActionListGet"></a>
# **enterpriseLeadsUserActionListGet**
> EnterpriseLeadsLeadsUserInlineResponse2002 enterpriseLeadsUserActionListGet(openId, accessToken, count, userId, cursor, actionType)

获取意向用户互动记录

* Scope: &#x60;enterprise.data&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseLeadsApi;


EnterpriseLeadsApi apiInstance = new EnterpriseLeadsApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer count = 56; // Integer | 每页数量
String userId = "userId_example"; // String | 
String cursor = "cursor_example"; // String | 
Integer actionType = 56; // Integer | 
try {
    EnterpriseLeadsLeadsUserInlineResponse2002 result = apiInstance.enterpriseLeadsUserActionListGet(openId, accessToken, count, userId, cursor, actionType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseLeadsApi#enterpriseLeadsUserActionListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **count** | **Integer**| 每页数量 | [enum: ]
 **userId** | **String**|  |
 **cursor** | **String**|  | [optional]
 **actionType** | **Integer**|  | [optional] [enum: 0, 1, 2, 3]

### Return type

[**EnterpriseLeadsLeadsUserInlineResponse2002**](EnterpriseLeadsLeadsUserInlineResponse2002.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="enterpriseLeadsUserDetailGet"></a>
# **enterpriseLeadsUserDetailGet**
> EnterpriseLeadsLeadsUserInlineResponse2001 enterpriseLeadsUserDetailGet(openId, accessToken, userId)

获取意向用户详情

* Scope: &#x60;enterprise.data&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseLeadsApi;


EnterpriseLeadsApi apiInstance = new EnterpriseLeadsApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
String userId = "userId_example"; // String | 
try {
    EnterpriseLeadsLeadsUserInlineResponse2001 result = apiInstance.enterpriseLeadsUserDetailGet(openId, accessToken, userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseLeadsApi#enterpriseLeadsUserDetailGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **userId** | **String**|  |

### Return type

[**EnterpriseLeadsLeadsUserInlineResponse2001**](EnterpriseLeadsLeadsUserInlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="enterpriseLeadsUserListGet"></a>
# **enterpriseLeadsUserListGet**
> EnterpriseLeadsLeadsUserInlineResponse200 enterpriseLeadsUserListGet(openId, accessToken, count, startTime, endTime, actionType, cursor, leadsLevel)

获取意向用户列表

* Scope: &#x60;enterprise.data&#x60; 

### Example
```java
// Import classes:
//import com.douyin.open.ApiException;
//import com.douyin.open.api.EnterpriseLeadsApi;


EnterpriseLeadsApi apiInstance = new EnterpriseLeadsApi();
String openId = "openId_example"; // String | 通过/oauth/access_token/获取，用户唯一标志
String accessToken = "accessToken_example"; // String | 调用/oauth/access_token/生成的token，此token需要用户授权。
Integer count = 56; // Integer | 每页数量
Integer startTime = 56; // Integer | 
Integer endTime = 56; // Integer | 
Integer actionType = 56; // Integer | 分类:   * `0` - 全部   * `1` - 私信互动   * `2` - 组件互动   * `3` - 主页互动 
Integer cursor = 1; // Integer | 分页游标
Integer leadsLevel = 56; // Integer | 用户状态:   * `-1` - 没兴趣   * `0` - 了解   * `1` - 有兴趣   * `2` - 有意愿   * `10` - 已转化 
try {
    EnterpriseLeadsLeadsUserInlineResponse200 result = apiInstance.enterpriseLeadsUserListGet(openId, accessToken, count, startTime, endTime, actionType, cursor, leadsLevel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EnterpriseLeadsApi#enterpriseLeadsUserListGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **openId** | **String**| 通过/oauth/access_token/获取，用户唯一标志 |
 **accessToken** | **String**| 调用/oauth/access_token/生成的token，此token需要用户授权。 |
 **count** | **Integer**| 每页数量 | [enum: ]
 **startTime** | **Integer**|  |
 **endTime** | **Integer**|  |
 **actionType** | **Integer**| 分类:   * &#x60;0&#x60; - 全部   * &#x60;1&#x60; - 私信互动   * &#x60;2&#x60; - 组件互动   * &#x60;3&#x60; - 主页互动  | [enum: 0, 1, 2, 3]
 **cursor** | **Integer**| 分页游标 | [optional] [default to 1] [enum: ]
 **leadsLevel** | **Integer**| 用户状态:   * &#x60;-1&#x60; - 没兴趣   * &#x60;0&#x60; - 了解   * &#x60;1&#x60; - 有兴趣   * &#x60;2&#x60; - 有意愿   * &#x60;10&#x60; - 已转化  | [optional] [enum: -1, 0, 1, 2, 10]

### Return type

[**EnterpriseLeadsLeadsUserInlineResponse200**](EnterpriseLeadsLeadsUserInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

