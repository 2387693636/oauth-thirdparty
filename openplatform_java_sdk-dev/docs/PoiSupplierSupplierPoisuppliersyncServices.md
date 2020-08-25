# PoiSupplierSupplierPoisuppliersyncServices

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**serviceType** | [**ServiceTypeEnum**](#ServiceTypeEnum) | 服务类型(201-预约点餐服务, 202-预约订位服务, 203-排队取号服务, 9001-门票预订服务, 9101-团购套餐服务, 9102-领优惠劵服务, 9201-在线预约服务, 9301-外卖服务) |  [optional]
**enable** | [**EnableEnum**](#EnableEnum) | 上线状态(1:上线，2:下线) |  [optional]
**entry** | [**PoiSupplierSupplierPoisuppliersyncEntry**](PoiSupplierSupplierPoisuppliersyncEntry.md) |  |  [optional]

<a name="ServiceTypeEnum"></a>
## Enum: ServiceTypeEnum
Name | Value
---- | -----
NUMBER_201 | 201
NUMBER_202 | 202
NUMBER_203 | 203
NUMBER_9001 | 9001
NUMBER_9101 | 9101
NUMBER_9102 | 9102
NUMBER_9201 | 9201
NUMBER_9301 | 9301

<a name="EnableEnum"></a>
## Enum: EnableEnum
Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2
