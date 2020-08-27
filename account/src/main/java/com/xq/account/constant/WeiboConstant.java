package com.xq.account.constant;

/**
 * @author: zou_xq
 * @description:
 * @date: 2020/8/27 9:47
 */
public class WeiboConstant {
    public static final String CLIENT_ID="2355065950";
    public static final String CLIENT_SECRET = "72037e76bee00315691d9c30dd8a386a"; // 应用的密钥
    public static final String REDIRECT_URL = "https://api.weibo.com/oauth2/default.html";// 应用的回调页
    // 应用申请的高级权限
    public static final String SCOPE = "email,direct_messages_read,direct_messages_write,"
            + "friendships_groups_read,friendships_groups_write,statuses_to_me_read,"
            + "follow_app_official_microblog," + "invitation_write";
    public static final String ACCESS_TOKEN="2.00wBA4CI56aVcE5ac9fef730mMwW3E";
    public static final String RESPONSE_TYPE = "code";
}
