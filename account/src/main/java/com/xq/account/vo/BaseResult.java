package com.xq.account.vo;

import com.xq.account.exception.BizException;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author: zou_xq
 * @description:
 * @date: 2020/8/25 14:21
 */
public class BaseResult<T> implements Serializable {
    public static final int CODE_SUCCESS = 0;
    public static final int CODE_FAIL = -1;
    public static final int CODE_TIMEOUT = -2;
    public static final int CODE_EXCEPTION = 1;

    private static final long serialVersionUID = 1L;

    private int code;

    private String msg;

    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BaseResult(int code, String msg) {
        super();
        this.code = code;
        this.msg = msg;
    }

    public BaseResult(T data) {
        super();
        this.code = CODE_SUCCESS;
        this.data = data;
    }

    public T checkAndGetData() {
        if(CODE_SUCCESS == code) {
            return data;
        }
        throw new BizException(code, msg);
    }

    public BaseResult() {
    }

    public static <D> BaseResult<D> success(D data){
        return new BaseResult<>(data);
    }

    public static <D> BaseResult<D> success(){
        return new BaseResult<>(null);
    }

    public static <D>  BaseResult<D> fail(String msg){
        return new BaseResult<>(CODE_FAIL,msg);
    }

    public static <D>  BaseResult<D> fail(int code,String msg){
        return new BaseResult<>(code,msg);
    }

    public boolean isSucc() {
        return Objects.equals(code, CODE_SUCCESS);
    }
}
