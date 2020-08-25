# EnterpriseImCardCardSaveBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cardId** | **String** | 卡片id，创建时不传；更新时必传。同一个用户的卡片id不可重复 |  [optional]
**cardType** | [**CardTypeEnum**](#CardTypeEnum) | 卡片类型:   * &#x60;question_list&#x60; - 问题列表   * &#x60;h5&#x60; - H5卡片类型（对应E平台图片链接)  | 
**content** | **String** | &#x60;&#x60;&#x60; 卡片内容字段 json序列化成string， 具体schema如文档下方 &#x60;&#x60;&#x60;  | 

<a name="CardTypeEnum"></a>
## Enum: CardTypeEnum
Name | Value
---- | -----
QUESTION_LIST | &quot;question_list&quot;
H5 | &quot;h5&quot;
