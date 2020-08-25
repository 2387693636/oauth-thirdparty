# EnterpriseImFancyCardCardDetailFancyCard

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cardId** | **String** | 模版名称 |  [optional]
**templates** | [**List&lt;EnterpriseImFancyCardCardDetailCardTemplate&gt;**](EnterpriseImFancyCardCardDetailCardTemplate.md) |  | 
**status** | [**StatusEnum**](#StatusEnum) | 审核状态（avaliable可使用,review审核中,reject审核不通过) |  [optional]
**rejectReason** | **String** | 审核不通过原因 |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
AVAILABLE | &quot;available&quot;
REVIEW | &quot;review&quot;
REJECT | &quot;reject&quot;
