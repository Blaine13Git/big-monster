package com.muyi.bigMonster.exceptions;


public class BusinessException extends RuntimeException {
    private int status = 500;

    private String msg;

    public BusinessException(ErrorCodeEnum error) {
        this.status = error.getStatus();
        this.msg = error.getMsg();
    }


    public BusinessException(String msg) {
        this.status = ErrorCodeEnum.SYSTEM_ERROR.getStatus();
        this.msg = msg;
    }

    @Override
    public String getMessage() {
        return "[" + status + "] " + msg;
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
