# EnterpriseGrouponGrouponGrouponListGrouponItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grouponId** | **String** | 团购活动Id，审核失败修改用 |  [optional]
**useType** | [**UseTypeEnum**](#UseTypeEnum) | * 团购使用方式   * 1: 到店核销  | 
**codeType** | [**CodeTypeEnum**](#CodeTypeEnum) | * 券码生成的方式   * 1: 系统生成   * 2: 自定义上传  | 
**merchantName** | **String** | 商户名称 | 
**serviceNumber** | **String** | 联系电话 | 
**title** | **String** | 卡券标题 | 
**coverImages** | **List&lt;String&gt;** | 封面图 | 
**originalAmount** | **Integer** | 原价(单位分) | 
**actualAmount** | **Integer** | 实际金额(单位分) | 
**notification** | **String** | 团购须知 | 
**orderLimit** | **Integer** | 单用户购买数量上限 | 
**stock** | **Integer** | 团购活动库存总数 | 
**poiIds** | **List&lt;String&gt;** | * 绑定的POI 列表 默认展示全部门店  |  [optional]
**grouponGoods** | [**List&lt;EnterpriseGrouponGrouponGrouponListGrouponItemGrouponGoods&gt;**](EnterpriseGrouponGrouponGrouponListGrouponItemGrouponGoods.md) | 团购商品 | 
**startTime** | **Long** | * 活动开始时间 unix time  | 
**endTime** | **Long** | * 活动截止时间 unix time  | 
**h5Url** | **String** | 团购活动详情页链接 | 
**status** | [**StatusEnum**](#StatusEnum) | * 活动状态 创建时可以忽略  * 1：有效  * 2：审核中  * 3：审核失败  * 4：中止  |  [optional]
**soldCount** | **Integer** | 已售出数量 |  [optional]
**auditMsg** | **String** | 审核失败原因 |  [optional]

<a name="UseTypeEnum"></a>
## Enum: UseTypeEnum
Name | Value
---- | -----
NUMBER_1 | 1

<a name="CodeTypeEnum"></a>
## Enum: CodeTypeEnum
Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2

<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
NUMBER_1 | 1
NUMBER_2 | 2
NUMBER_3 | 3
NUMBER_4 | 4
