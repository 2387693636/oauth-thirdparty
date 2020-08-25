# EnterpriseGrouponGrouponOrderOrderDetailOrderInfo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**orderId** | **String** | 团购活动订单Id | 
**channel** | **String** | 订单来源 | 
**buyerOpenId** | **String** | 买家的open_id | 
**originalAmount** | **Integer** | 原价，单位分 | 
**amount** | **Integer** | 订单金额，单位分 | 
**refundAmount** | **Integer** | 退款金额，单位分 | 
**settleAmount** | **Integer** | 结算金额，单位分 | 
**itemCount** | **Integer** | 团购券个数 | 
**status** | [**StatusEnum**](#StatusEnum) | * 订单状态   * 1: 订单完成   * 101: 支付完成   * 200: 发起核销   * 201: 核销完成   * 202: 核销失败   * 299: 用户申请退款   * 300: 商户发起退款   * 301: 退款成功   * 302: 退款失败  | 
**createTime** | **Long** | 订单创建时间 unix time | 
**payTime** | **Long** | 订单支付时间 unix time | 
**refundTime** | **Long** | 退款完成时间 unix time |  [optional]
**codes** | [**List&lt;EnterpriseGrouponGrouponOrderOrderDetailCodeInfo&gt;**](EnterpriseGrouponGrouponOrderOrderDetailCodeInfo.md) | 团购券码列表 | 

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_101 | 101
NUMBER_200 | 200
NUMBER_201 | 201
NUMBER_202 | 202
NUMBER_299 | 299
NUMBER_300 | 300
NUMBER_301 | 301
NUMBER_302 | 302
