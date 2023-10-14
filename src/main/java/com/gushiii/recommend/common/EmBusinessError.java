package com.gushiii.recommend.common;

/**
 * @author : GUSHIII
 * @version : 1.0
 * @projectName : recommend-sys
 * @package : com.gushiii.recommend.common
 * @className : EmBusinessError
 * @description : 通用错误枚举
 * @date : 2023/10/13 17:17
 */
public enum EmBusinessError {

    NO_OBJECT_FOUND(10001, "请求对象不存在"),
    UNKNOWN_ERROR(10002, "未知错误"),
    NO_HANDLER_FOUND(10003, "找不到操作路径"),
    BIND_EXCEPTION_ERROR(10004, "请求参数错误"),
    PARAMETER_VALIDATION_ERROR(10005, "请求参数校验失败"),

    /////////////////////////////////
    REGISTER_DUP_FAIL(20001,"用户已存在"),
    LOGIN_FAIL(20002, "手机号或密码错误"),

    /////////////////////////////////
    ADMIN_SHOULD_LOGIN(30001, "需要先登录"),
    ;


    private Integer errCode;
    private String errMsg;

    EmBusinessError(Integer errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
