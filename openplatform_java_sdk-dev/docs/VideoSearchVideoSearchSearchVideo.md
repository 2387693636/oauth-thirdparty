# VideoSearchVideoSearchSearchVideo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**secItemId** | **String** | 特殊加密的视频id通过用户视频搜索的评论接口获取到 | 
**itemId** | **String** | 视频id | 
**title** | **String** | 视频标题 | 
**cover** | **String** | 视频封面 | 
**isTop** | **Boolean** | 是否置顶 | 
**createTime** | **Long** | 视频创建时间戳 | 
**isReviewed** | **Boolean** | 表示是否审核结束。审核通过或者失败都会返回true，审核中返回false。 | 
**shareUrl** | **String** | 视频播放页面。视频播放页可能会失效，请在观看视频前调用/video/data/获取最新的播放页。 | 
**openId** | **String** | 作者openID | 
**avatar** | **String** | 头像 | 
**nickname** | **String** | 昵称 | 
**statistics** | [**VideoSearchVideoSearchSearchVideoStatistics**](VideoSearchVideoSearchSearchVideoStatistics.md) |  | 