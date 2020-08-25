# EnterpriseImCardCardListInlineResponse200DataCards

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cardId** | **String** | 卡片id | 
**cardType** | **String** | 卡片类型 | 
**content** | **String** | 卡片内容 | 
**status** | [**StatusEnum**](#StatusEnum) | 审核状态（avaliable可使用,review审核中,reject审核不通过) | 
**rejectReason** | **String** | 审核不通过理由 |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
AVALIABLE | &quot;avaliable&quot;
REVIEW | &quot;review&quot;
REJECT | &quot;reject&quot;
