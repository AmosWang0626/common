package com.amos.common.dto.response;

import com.amos.common.dto.base.IResponse;
import com.amos.common.dto.base.SystemResponseEnum;

/**
 * DESCRIPTION: Single Response
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/2/7
 */
public class SingleResponse<T> extends Response {

    private static final long serialVersionUID = 1L;

    private T data;

    public static <R> SingleResponse<R> ofSuccess(R data) {
        SingleResponse<R> response = new SingleResponse<>();
        response.setSuccess(true);
        response.setCode(SystemResponseEnum.SUCCESS.getCode());
        response.setMessage(SystemResponseEnum.SUCCESS.getMessage());
        response.setData(data);

        return response;
    }

    public static <R> SingleResponse<R> ofFail() {
        return ofFail(SystemResponseEnum.FAIL);
    }

    public static <R> SingleResponse<R> ofFail(IResponse iResponse) {
        return ofFail(iResponse.getCode(), iResponse.getMessage());
    }

    public static <R> SingleResponse<R> ofFail(String code, String message) {
        SingleResponse<R> response = new SingleResponse<>();
        response.setSuccess(false);
        response.setCode(code);
        response.setMessage(message);

        return response;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
