package com.amos.common.dto.response;

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
        MultiResponse<R> response = new MultiResponse<R>();
        response.setSuccess(true);
        response.setData(data);

        return response;
    }

    public Collection<T> getData() {
        return data;
    }

    public void setData(Collection<T> data) {
        this.data = data;
    }
}
