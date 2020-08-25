# PoiSupplierSupplierBody1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**matchType** | [**MatchTypeEnum**](#MatchTypeEnum) | 匹配类型，0-离线匹配 1-实时匹配。离线匹配，不会实时返回结果，最大上传1w个数据，通过/poi/supplier/match/query/接口查询匹配结果； 在线匹配，实时返回结果，最大上传100个数据，需要申请授权。 | 
**matchDataList** | [**List&lt;PoiSupplierSupplierMatchOriginData&gt;**](PoiSupplierSupplierMatchOriginData.md) | 第三方上传的有效匹配数据 | 

<a name="MatchTypeEnum"></a>
## Enum: MatchTypeEnum
Name | Value
---- | -----
NUMBER_0 | 0
NUMBER_1 | 1
