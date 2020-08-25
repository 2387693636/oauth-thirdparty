# PoiProductProductSyncStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastSyncStatus** | [**LastSyncStatusEnum**](#LastSyncStatusEnum) | 最近一次酒店同步状态, 0 - 未处理; 1 - 通过; 2 - 未通过 |  [optional]
**failReason** | **String** | 同步失败原因，抖音风控政策问题，该字段无法提供太多信息，目前审核不通过联系抖音运营做进一步处理 |  [optional]

<a name="LastSyncStatusEnum"></a>
## Enum: LastSyncStatusEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2
