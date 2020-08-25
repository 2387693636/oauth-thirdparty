# EnterpriseGrouponGrouponCommonGrouponEventCodeInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grouponId** | **String** | 团购活动的ID |  [optional]
**code** | **String** | 劵码值 |  [optional]
**startTime** | **Long** | 劵码有效的起始时间 |  [optional]
**endTime** | **Long** | 劵码有效的终止时间 |  [optional]
**confirmTime** | **Integer** | 核销时间 |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | * 劵码的状态   * -1: 不存在   * 1: 未核销   * 2: 已核销  |  [optional]

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NUMBER_MINUS_1 | -1
NUMBER_1 | 1
NUMBER_2 | 2
