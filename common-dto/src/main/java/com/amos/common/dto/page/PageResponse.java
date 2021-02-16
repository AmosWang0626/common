package com.amos.common.dto.page;

import com.amos.common.dto.base.IErrorCode;
import com.amos.common.dto.base.SystemCodeEnum;
import com.amos.common.dto.response.Response;

import java.util.Collection;

/**
 * DESCRIPTION: Page Response
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/2/7
 */
public class PageResponse<T> extends Response {

    private static final long serialVersionUID = 1L;

    private int total = 0;

    private Collection<T> data;

    public static <R> PageResponse<R> ofSuccess() {
        return ofSuccess(null);
    }

    public static <R> PageResponse<R> ofSuccess(Collection<R> data) {
        PageResponse<R> response = new PageResponse<>();
        response.setSuccess(true);
        response.setCode(SystemCodeEnum.SUCCESS.getCode());
        response.setMessage(SystemCodeEnum.SUCCESS.getMessage());
        response.setData(data);

        return response;
    }

    public static <R> PageResponse<R> ofFail() {
        return ofFail(SystemCodeEnum.FAIL);
    }

    public static <R> PageResponse<R> ofFail(IErrorCode iErrorCode) {
        return ofFail(iErrorCode.getCode(), iErrorCode.getMessage());
    }

    public static <R> PageResponse<R> ofFail(String code, String message) {
        PageResponse<R> response = new PageResponse<>();
        response.setSuccess(false);
        response.setCode(code);
        response.setMessage(message);

        return response;
    }

    public static <R> PageResponse<R> ofErrorParam(String message) {
        return ofFail(SystemCodeEnum.ERROR_PARAM.getCode(), message);
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Collection<T> getData() {
        return data;
    }

    public void setData(Collection<T> data) {
        this.data = data;
    }
}
