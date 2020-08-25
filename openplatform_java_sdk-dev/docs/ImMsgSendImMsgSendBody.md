# ImMsgSendImMsgSendBody

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**toUserId** | **String** | 发送消息的接收方openid | 
**messageType** | [**MessageTypeEnum**](#MessageTypeEnum) | 消息内容格式:   * &#x60;text&#x60; - 文本消息   * &#x60;image&#x60; - 图片消息  | 
**content** | **String** | 文本内容 | 
**mediaId** | **String** | 素材id | 

<a name="MessageTypeEnum"></a>
## Enum: MessageTypeEnum
Name | Value
---- | -----
TEXT | &quot;text&quot;
IMAGE | &quot;image&quot;
