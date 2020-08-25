package com.xq.account.vo;

import java.io.Serializable;

/**
 * @author: zou_xq
 * @description:
 * @date: 2020/8/25 14:43
 */
public class BaseVo implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 扩展字段
     */
    private String extFields;


    public String getExtFields() {
        return extFields;
    }

    public void setExtFields(String extFields) {
        this.extFields = extFields;
    }
}
