package com.muyi.bigMonster.exceptions;

/**
 * @Des:
 * @Auther: 飞狐
 * @Date: 2019-05-01
 */
public enum ErrorCodeEnum {
    /** AppInfo相关*/
    APPID_NOT_EXIST(0001,"App不存在"),
    DELETE_PASSWORD_INVALID(0002,"删除密码无效"),
    APP_TYPE_NOT_EXIST(0003,"app配置信息中无此app类型"),


    /** 通用*/
    INVALID_PARAMETER(9000, "非法参数"),
    SYSTEM_ERROR(9999, "系统异常");
    private int status;

    private String msg;

    ErrorCodeEnum(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
