# PoiSupplierSupplierBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**supplierExtId** | **String** | 接入方店铺id | 
**type** | [**PoiSupplierSupplierSupplierType**](PoiSupplierSupplierSupplierType.md) |  | 
**poiId** | **String** | 抖音poi id, 三方如果使用高德poi id可以通过/poi/query/接口转换，其它三方poi id走poi匹配功能进行抖音poi id获取 | 
**status** | [**PoiSupplierSupplierOnlineStatus**](PoiSupplierSupplierOnlineStatus.md) |  | 
**name** | **String** | 店铺名称 | 
**images** | **List&lt;String&gt;** | 店铺图片 |  [optional]
**contactPhone** | **String** | 联系手机号 |  [optional]
**contactTel** | **String** | 联系座机号 |  [optional]
**address** | **String** | 店铺地址 |  [optional]
**description** | **String** | 店铺介绍(&lt;&#x3D;500字) |  [optional]
**services** | [**List&lt;PoiSupplierSupplierPoisuppliersyncServices&gt;**](PoiSupplierSupplierPoisuppliersyncServices.md) | 店铺提供的服务列表 |  [optional]
**attributes** | [**PoiSupplierSupplierSupplierAttributes**](PoiSupplierSupplierSupplierAttributes.md) |  | 
