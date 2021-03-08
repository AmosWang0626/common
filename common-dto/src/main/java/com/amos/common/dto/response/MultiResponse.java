package com.amos.common.dto.response;

import com.amos.common.dto.base.IErrorCode;
import com.amos.common.dto.base.SystemCodeEnum;

import java.util.Collection;

/**
 * Multiple Response
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/2/7
 */
public class MultiResponse<T> extends Response {

    private static final long serialVersionUID = 1L;

    private Collection<T> data;

    public static <R> MultiResponse<R> ofSuccess() {
        return ofSuccess(null);
    }

    public static <R> MultiResponse<R> ofSuccess(Collection<R> data) {
        MultiResponse<R> response = new MultiResponse<>();
        response.setSuccess(true);
        response.setCode(SystemCodeEnum.SUCCESS.getCode());
        response.setMessage(SystemCodeEnum.SUCCESS.getMessage());
        response.setData(data);

        return response;
    }

    public static <R> MultiResponse<R> ofFail() {
        return ofFail(SystemCodeEnum.FAIL);
    }

    public static <R> MultiResponse<R> ofFail(IErrorCode iErrorCode) {
        return ofFail(iErrorCode.getCode(), iErrorCode.getMessage());
    }

    public static <R> MultiResponse<R> ofFail(String code, String message) {
        MultiResponse<R> response = new MultiResponse<>();
        response.setSuccess(false);
        response.setCode(code);
        response.setMessage(message);

        return response;
    }

    public static <R> MultiResponse<R> ofErrorParam(String message) {
        return ofFail(SystemCodeEnum.ERROR_PARAM.getCode(), message);
    }

    public Collection<T> getData() {
        return data;
    }

    public void setData(Collection<T> data) {
        this.data = data;
    }
}
