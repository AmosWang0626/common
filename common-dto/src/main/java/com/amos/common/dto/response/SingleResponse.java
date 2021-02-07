package com.amos.common.dto.response;

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
        SingleResponse<R> response = new SingleResponse<R>();
        response.setSuccess(true);
        response.setData(data);

        return response;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
