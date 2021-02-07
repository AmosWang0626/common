package com.amos.common.dto.page;

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

    public static <R> PageResponse<R> ofSuccess(Collection<R> data) {
        PageResponse<R> response = new PageResponse<R>();
        response.setSuccess(true);
        response.setData(data);

        return response;
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