package com.amos.common.dto.response;

import com.amos.common.dto.base.IResponse;
import com.amos.common.dto.base.SystemResponseEnum;

import java.util.Collection;

/**
 * DESCRIPTION: Multiple Response
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/2/7
 */
public class MultiResponse<T> extends Response {

    private static final long serialVersionUID = 1L;

    private Collection<T> data;

    public static <R> MultiResponse<R> ofSuccess(Collection<R> data) {
        MultiResponse<R> response = new MultiResponse<>();
        response.setSuccess(true);
        response.setCode(SystemResponseEnum.SUCCESS.getCode());
        response.setMessage(SystemResponseEnum.SUCCESS.getMessage());
        response.setData(data);

        return response;
    }

    public static <R> MultiResponse<R> ofFail() {
        return ofFail(SystemResponseEnum.FAIL);
    }

    public static <R> MultiResponse<R> ofFail(IResponse iResponse) {
        return ofFail(iResponse.getCode(), iResponse.getMessage());
    }

    public static <R> MultiResponse<R> ofFail(String code, String message) {
        MultiResponse<R> response = new MultiResponse<>();
        response.setSuccess(true);
        response.setCode(code);
        response.setMessage(message);

        return response;
    }

    public Collection<T> getData() {
        return data;
    }

    public void setData(Collection<T> data) {
        this.data = data;
    }
}
