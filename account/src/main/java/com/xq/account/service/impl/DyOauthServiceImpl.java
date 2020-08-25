package com.xq.account.service.impl;

import com.xq.account.service.DyOauthService;
import com.xq.account.vo.BaseResult;
import com.xq.account.vo.DyOauthVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author: zou_xq
 * @description:
 * @date: 2020/8/25 14:55
 */
@Service
public class DyOauthServiceImpl implements DyOauthService {
    private static final Logger logger = LoggerFactory.getLogger(DyOauthServiceImpl.class);

    @Override
    public BaseResult<String> qrcodeAuth(DyOauthVo codes) {
        BaseResult<String> result = new BaseResult<>();
        String code = "https://open.douyin.com/platform/oauth/connect/?client_key=" + codes.getClientKey()
                + "&response_type=" + codes.getResponseType() + "&scope=" + codes.getScope() + "&redirect_uri=" + codes.getRedirectUri() + "&state=" + codes.getState();
        logger.info("qrConnect requestUrl=" + code);
        result.setCode(0);
        result.setData(code);
        return result;
    }
}
