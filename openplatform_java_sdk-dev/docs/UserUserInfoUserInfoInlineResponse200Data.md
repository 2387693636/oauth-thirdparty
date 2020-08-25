# UserUserInfoUserInfoInlineResponse200Data

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errorCode** | **Integer** |  |  [optional]
**description** | **String** |  |  [optional]
**openId** | **String** | 用户在当前应用的唯一标识 |  [optional]
**unionId** | **String** | 用户在当前开发者账号下的唯一标识（未绑定开发者账号没有该字段） |  [optional]
**nickname** | **String** |  |  [optional]
**avatar** | **String** |  |  [optional]
**city** | **String** |  |  [optional]
**province** | **String** |  |  [optional]
**country** | **String** |  |  [optional]
**gender** | [**GenderEnum**](#GenderEnum) | 性别:   * &#x60;0&#x60; - 未知   * &#x60;1&#x60; - 男性   * &#x60;2&#x60; - 女性  |  [optional]
**eAccountRole** | [**EAccountRoleEnum**](#EAccountRoleEnum) | 类型:   * &#x60;EAccountM&#x60; - 普通企业号   * &#x60;EAccountS&#x60; - 认证企业号   * &#x60;EAccountK&#x60; - 品牌企业号  |  [optional]

<a name="GenderEnum"></a>
## Enum: GenderEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2

<a name="EAccountRoleEnum"></a>
## Enum: EAccountRoleEnum
Name | Value
---- | -----
EACCOUNTM | &quot;EAccountM&quot;
EACCOUNTS | &quot;EAccountS&quot;
EACCOUNTK | &quot;EAccountK&quot;
