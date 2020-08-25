# PoiOrderSyncOrderSyncBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**miniApp** | [**PoiOrderSyncOrderSyncPoiordersyncMiniApp**](PoiOrderSyncOrderSyncPoiordersyncMiniApp.md) |  |  [optional]
**orderType** | [**OrderTypeEnum**](#OrderTypeEnum) | 订单类型- 201 预约点餐订单, 202 餐厅预定订单, 203 餐厅排队订单, 9001 景区门票订单, 9101 团购券订单, 9201 在线预约订单, 9301 外卖订单 | 
**dateTime** | **Integer** | 发送请求的时间，精确到毫秒 | 
**orderDetail** | **String** | 订单的细节，不同的订单业务有不同的结构体，请具体询问业务方字段结构 | 
**extShopInfo** | [**PoiOrderSyncOrderSyncExtShopInfo**](PoiOrderSyncOrderSyncExtShopInfo.md) |  | 

<a name="OrderTypeEnum"></a>
## Enum: OrderTypeEnum
Name | Value
---- | -----
NUMBER_201 | 201
NUMBER_202 | 202
NUMBER_203 | 203
NUMBER_9001 | 9001
NUMBER_9101 | 9101
NUMBER_9201 | 9201
NUMBER_9301 | 9301
