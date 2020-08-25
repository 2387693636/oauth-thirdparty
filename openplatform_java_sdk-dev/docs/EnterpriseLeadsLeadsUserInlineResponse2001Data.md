# EnterpriseLeadsLeadsUserInlineResponse2001Data

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errorCode** | **Integer** |  | 
**description** | **String** |  | 
**openId** | **String** | 用户在当前应用的唯一标识 |  [optional]
**nickname** | **String** |  |  [optional]
**avatar** | **String** |  |  [optional]
**telephone** | **String** |  |  [optional]
**wechat** | **String** |  |  [optional]
**city** | **String** |  |  [optional]
**gender** | [**GenderEnum**](#GenderEnum) | 性别 * &#x60;0&#x60; - 未知 * &#x60;1&#x60; - 男 * &#x60;2&#x60; - 女  |  [optional]
**age** | **Integer** |  |  [optional]
**leadsLevel** | [**LeadsLevelEnum**](#LeadsLevelEnum) | 用户状态 * &#x60;-1&#x60; - 没兴趣 * &#x60;0&#x60; - 了解 * &#x60;1&#x60; - 有兴趣 * &#x60;2&#x60; - 有意愿 * &#x60;10&#x60; - 已转化  |  [optional]
**tagList** | [**List&lt;EnterpriseLeadsLeadsUserInlineResponse200DataTagList&gt;**](EnterpriseLeadsLeadsUserInlineResponse200DataTagList.md) | 绑定的标签列表 |  [optional]
**isFollow** | **Boolean** | 当前指定用户是否已关注本企业号 |  [optional]

<a name="GenderEnum"></a>
## Enum: GenderEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2

<a name="LeadsLevelEnum"></a>
## Enum: LeadsLevelEnum
Name | Value
---- | -----
NUMBER_MINUS_1 | -1
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_10 | 10
