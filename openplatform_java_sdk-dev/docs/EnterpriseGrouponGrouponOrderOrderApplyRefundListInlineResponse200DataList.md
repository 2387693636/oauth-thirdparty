# EnterpriseGrouponGrouponOrderOrderApplyRefundListInlineResponse200DataList

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** | 团购券码 | 
**orderId** | **String** | 订单id | 
**status** | [**StatusEnum**](#StatusEnum) | * 退款申请单状态   * 1: 待确认   * 2: 已确认  | 
**title** | **String** | 订单名称 | 
**createTime** | **Integer** | 退款申请发起时间，unix时间戳 | 

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2
