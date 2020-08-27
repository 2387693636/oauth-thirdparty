package com.xq.account.service;

import com.xq.account.vo.BaseResult;
import com.xq.account.vo.DyOauthVo;
import com.xq.account.vo.DyPublishImageVo;

/**
 * @author: zou_xq
 * @description:
 * @date: 2020/8/25 14:54
 */
public interface DyOauthService {
    BaseResult<String> toDouyinAuthUrl(DyOauthVo vo);

    BaseResult<Void> publishDouyinImage(DyOauthVo vo , DyPublishImageVo imageVo);
}
