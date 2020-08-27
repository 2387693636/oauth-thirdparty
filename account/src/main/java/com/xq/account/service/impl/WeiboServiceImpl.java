package com.xq.account.service.impl;

import com.xq.account.service.WeiboService;
import com.xq.account.vo.BaseResult;
import com.xq.account.vo.WeiboOauthVo;
import org.springframework.stereotype.Service;

/**
 * @author: zou_xq
 * @description:
 * @date: 2020/8/27 9:31
 */
@Service
public class WeiboServiceImpl implements WeiboService {
    @Override
    public BaseResult<String> toWeiboAuthUrl(WeiboOauthVo vo) {
        if (null != vo.getAccess_token()) {
            return BaseResult.success();
        }
        return BaseResult.fail("登陆access_token输入为空！");
    }
}
