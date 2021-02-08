package com.amos.common.dto.page;

/**
 * DESCRIPTION: Page Query
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/2/7
 */
public class PageFilterQuery<T> extends PageQuery {

    private static final long serialVersionUID = 1L;

    private T search;

    public T getSearch() {
        return search;
    }

    public void setSearch(T search) {
        this.search = search;
    }
}
