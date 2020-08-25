package com.xq.account.service;

import com.xq.account.vo.BaseResult;
import com.xq.account.vo.DyOauthVo;

/**
 * @author: zou_xq
 * @description:
 * @date: 2020/8/25 14:54
 */
public interface DyOauthService {
    public BaseResult<String> qrcodeAuth(DyOauthVo vo);
}
