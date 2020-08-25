# PoiProductProductSpuAttributes4101DetailEntry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schemaType** | [**SchemaTypeEnum**](#SchemaTypeEnum) | 链接类型 (1:H5，2:抖音小程序，3:原生小程序) |  [optional]
**url** | **String** | 详情页链接 |  [optional]
**platformSource** | [**PlatformSourceEnum**](#PlatformSourceEnum) | 平台来源枚举（16电商小店） |  [optional]
**platformName** | **String** | 平台名称 |  [optional]
**isTest** | **Integer** | 主要用于联调，1-使用测试版的小程序，0或者不填-使用正式版小程序 |  [optional]

<a name="SchemaTypeEnum"></a>
## Enum: SchemaTypeEnum
Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3

<a name="PlatformSourceEnum"></a>
## Enum: PlatformSourceEnum
Name | Value
---- | -----
NUMBER_16 | 16
