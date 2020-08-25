# PoiProductProductSpuAttributes90201

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**timeType** | [**TimeTypeEnum**](#TimeTypeEnum) | 时间格式 1-最早可订今日，2-最早可订明日, 3-最早可订MM月dd日, 4-HH:mm前可订当日, 5-需提前x天预订 | 
**time** | **String** | time_type为3时该字段必选(yyyyMMdd格式)，time_type为4时该字段必选(HH:mm格式), time_type为5时该字段必选(x格式) |  [optional]

<a name="TimeTypeEnum"></a>
## Enum: TimeTypeEnum
Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3
NUMBER_4 | 4
NUMBER_5 | 5
