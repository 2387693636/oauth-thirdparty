# PoiSupplierSupplierMatchResultData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**supplierExtId** | **String** | 第三方商户ID | 
**poiId** | **String** | 抖音POI ID | 
**poiName** | **String** | POI名称 | 
**province** | **String** | POI所在省份 | 
**city** | **String** | POI所在城市 | 
**address** | **String** | POI地址 | 
**matchStatus** | [**MatchStatusEnum**](#MatchStatusEnum) | 匹配状态，0-等待匹配，1-正在匹配，2-匹配成功，3-匹配失败 | 
**matchStatusDesc** | **String** | 匹配状态描述 | 

<a name="MatchStatusEnum"></a>
## Enum: MatchStatusEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3
