package com.amos.common.dto.response;

import com.amos.common.dto.base.IErrorCode;
import com.amos.common.dto.base.SystemCodeEnum;

/**
 * Single Response
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/2/7
 */
public class SingleResponse<T> extends Response {

    private static final long serialVersionUID = 1L;

    private T data;

    public static <R> SingleResponse<R> ofSuccess() {
        return ofSuccess(null);
    }

    public static <R> SingleResponse<R> ofSuccess(R data) {
        SingleResponse<R> response = new SingleResponse<>();
        response.setSuccess(true);
        response.setCode(SystemCodeEnum.SUCCESS.getCode());
        response.setMessage(SystemCodeEnum.SUCCESS.getMessage());
        response.setData(data);

        return response;
    }

    public static <R> SingleResponse<R> ofFail() {
        return ofFail(SystemCodeEnum.FAIL);
    }

    public static <R> SingleResponse<R> ofFail(IErrorCode iErrorCode) {
        return ofFail(iErrorCode.getCode(), iErrorCode.getMessage());
    }

    public static <R> SingleResponse<R> ofFail(String code, String message) {
        SingleResponse<R> response = new SingleResponse<>();
        response.setSuccess(false);
        response.setCode(code);
        response.setMessage(message);

        return response;
    }

    public static <R> SingleResponse<R> ofErrorParam(String message) {
        return ofFail(SystemCodeEnum.ERROR_PARAM.getCode(), message);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
