# PoiProductProductBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**supplierExtId** | **String** | 接入方店铺ID | 
**spuExtId** | **String** | 接入方SPU ID | 
**spuType** | [**SpuTypeEnum**](#SpuTypeEnum) | spu类型号，1-酒店民宿房型，90-景区门票，91-团购券 20 电商实体商品 21 电商虚拟商品 |  [optional]
**status** | [**PoiProductProductOnlineStatus**](PoiProductProductOnlineStatus.md) |  | 
**name** | **String** | SPU名称 | 
**order** | **Integer** | SPU展示顺序,降序 |  [optional]
**description** | **String** | SPU描述 |  [optional]
**attributes** | [**PoiProductProductSpuAttributes**](PoiProductProductSpuAttributes.md) |  | 

<a name="SpuTypeEnum"></a>
## Enum: SpuTypeEnum
Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_20 | 20
NUMBER_21 | 21
NUMBER_90 | 90
NUMBER_91 | 91
