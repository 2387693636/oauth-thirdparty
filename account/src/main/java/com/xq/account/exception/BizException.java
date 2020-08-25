package com.xq.account.exception;

import org.apache.commons.lang3.StringUtils;

/**
 * @author: zou_xq
 * @description:
 * @date: 2020/8/25 14:22
 */
public class BizException extends RuntimeException {
    private static final long serialVersionUID = 1687478562586239073L;
    public static final int DEFAULT_CODE = 10010001;
    public static final String DEFAULT_MSG = "系统错误！";
    public static final int PARAMS_CHECK_ERROR = 10011001;

    /**
     * 异常信息
     */
    protected String msg;

    /**
     * 具体异常码
     */
    protected Integer code;

    public BizException(String message, Throwable cause) {
        super(message, cause);
    }

    public BizException(Throwable cause) {
        super(cause);
    }

    public BizException(String message) {
        super(message);
    }

    public BizException(int code, String msgFormat, Object... args) {
        super(format(msgFormat, args));
        if(args!=null && args.length>0 && args[args.length-1] instanceof Throwable) {
            super.initCause((Throwable) args[args.length-1]);
        }
        this.code = code;
        this.msg = format(msgFormat, args);
    }

    /**fix 异常信息包含错误的格式化信息,如%、%i等**/
    private static String format(String msgFormat, Object... args) {
        if (args == null || args.length == 0) {
            return msgFormat;
        }
        try {
            return String.format(msgFormat, args);
        } catch (Exception e) {
            return msgFormat + StringUtils.join(args);
        }
    }

    public BizException() {
        super();
    }

    public String getMsg() {
        return msg;
    }

    public Integer getCode() {
        return code;
    }

    /**
     * 实例化异常
     *
     * @param msgFormat
     * @param args
     * @return
     */
    public BizException newInstance(String msgFormat, Object... args) {
        return new BizException(this.code, msgFormat, args);
    }

}
