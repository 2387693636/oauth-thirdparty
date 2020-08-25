# PoiOrderOrderBody1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | 抖音订单号 | 
**spuExtId** | **String** | 接入方房型ID | 
**status** | **Integer** | 订单支付状态。0 - 未支付, 1 - 已支付 | 
**reserveAmount** | **Integer** | 预定数量 | 
**customerName** | **String** | 预订人姓名 | 
**customerPhone** | **String** | 预订人电话 | 
**customerList** | [**List&lt;PoiOrderOrderPoiexthotelordercommitCustomerList&gt;**](PoiOrderOrderPoiexthotelordercommitCustomerList.md) | 入住人列表 |  [optional]
**checkIn** | **String** | 入住时间 yyyyMMdd | 
**checkOut** | **String** | 离店时间 yyyyMMdd | 
**totalPrice** | **Integer** | 总价, 单位人民币分 | 
**remark** | **String** | 备注 |  [optional]
**datePrice** | [**List&lt;PoiOrderOrderPoiexthotelordercommitDatePrice&gt;**](PoiOrderOrderPoiexthotelordercommitDatePrice.md) |  |  [optional]
