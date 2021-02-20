package com.tlm.security.rbac.util;

import lombok.Data;

@Data
public class Result {
    private static final int SUCCESS_CODE = 1;
    private static final int ERROR_CODE = 0;
    private static final String SUCCESS_MSG = "操作成功";
    private int code;
    private Object data;
    private String msg;

    private Result(int code, Object data, String msg) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }


    public static Result success(Object data) {
        return new Result(SUCCESS_CODE, data, SUCCESS_MSG);
    }
    public static Result success() {
        return new Result(SUCCESS_CODE, null, SUCCESS_MSG);
    }

    public static Result fail(String msg) {
        return new Result(ERROR_CODE, null, msg);
    }

}
