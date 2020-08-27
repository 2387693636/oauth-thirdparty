package com.xq.account.service;

import com.xq.account.vo.BaseResult;
import com.xq.account.vo.DyOauthVo;
import com.xq.account.vo.WeiboOauthVo;

/**
 * @author: zou_xq
 * @description:
 * @date: 2020/8/26 14:42
 */
public interface WeiboService {
    BaseResult<String> toWeiboAuthUrl(WeiboOauthVo vo);
}
