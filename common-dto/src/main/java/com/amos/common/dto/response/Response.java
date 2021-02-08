package com.amos.common.dto.response;

import com.amos.common.dto.base.DTO;

/**
 * DESCRIPTION: Response
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/2/7
 */
public abstract class Response extends DTO {

    private static final long serialVersionUID = 1L;

    private String code;

    private String message;

    private boolean success;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

}
