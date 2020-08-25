# EnterpriseImFancyCardCardSaveCardModule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**moduleType** | [**ModuleTypeEnum**](#ModuleTypeEnum) |  | 
**text** | **String** | 文本 |  [optional]
**image** | [**EnterpriseImFancyCardCardSaveCardModuleImage**](EnterpriseImFancyCardCardSaveCardModuleImage.md) |  |  [optional]
**action** | [**EnterpriseImFancyCardCardSaveModuleAction**](EnterpriseImFancyCardCardSaveModuleAction.md) |  |  [optional]
**modules** | [**List&lt;EnterpriseImFancyCardCardSaveCardSubModule&gt;**](EnterpriseImFancyCardCardSaveCardSubModule.md) | 子模块 |  [optional]
**props** | **String** | 卡片属性 json string |  [optional]

<a name="ModuleTypeEnum"></a>
## Enum: ModuleTypeEnum
Name | Value
---- | -----
TEXT | &quot;text&quot;
IMAGE | &quot;image&quot;
IMAGE_TEXT | &quot;image_text&quot;
BUTTONS | &quot;buttons&quot;
PHONE_LEADS | &quot;phone_leads&quot;
BUTTON | &quot;button&quot;
DIV_LINE | &quot;div_line&quot;
