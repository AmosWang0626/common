package com.amos.common.dto.base;

/**
 * 模块名称: common
 * 模块描述: System Response
 *
 * @author amos.wang
 * @date 2021/2/8 16:45
 */
public enum SystemCodeEnum implements IErrorCode {

    /***/
    SUCCESS("200", "success"),
    FAIL("500", "fail"),
    FORBIDDEN("403", "fail");

    private final String code;

    private final String message;

    SystemCodeEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
