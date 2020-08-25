# VideoCreateAwemeCreateBody1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**videoId** | **String** | video_id, 通过/video/upload/接口得到。注意每次调用/video/create/都要调用/video/upload/生成新的video_id。 | 
**text** | **String** | 视频标题， 可以带话题,@用户。 如title1#话题1 #话题2 @openid1  注意：   1. 话题审核依旧遵循抖音的审核逻辑，强烈建议第三方谨慎拟定话题名称，避免强导流行为。  |  [optional]
**poiId** | **String** | 地理位置id |  [optional]
**poiName** | **String** | 地理位置名称 |  [optional]
**microAppId** | **String** | 小程序id |  [optional]
**microAppTitle** | **String** | 小程序标题 |  [optional]
**microAppUrl** | **String** | 吊起小程序时的参数 |  [optional]
**articleId** | **String** | 文章ID，暂不开放 |  [optional]
**articleTitle** | **String** | 文章自定义标题，暂不开放 |  [optional]
**timelinessLabel** | **Integer** | 时效新闻标签，1表示使用。暂不开放 |  [optional]
**timelinessKeyword** | **String** | 最多可添加3个，用&#x60;\\|&#x60;隔开。暂不开放 |  [optional]
**gameId** | **String** | 游戏id。暂不开放 |  [optional]
**gameContent** | **String** | 游戏个性化参数 |  [optional]
**coverTsp** | **Double** | 将传入的指定时间点对应帧设置为视频封面（单位：秒） |  [optional]
**atUsers** | **List&lt;String&gt;** | 如果需要at其他用户。将text中@nickname对应的open_id放到这里。 |  [optional]
