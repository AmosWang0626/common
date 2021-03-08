package com.amos.common.dto.page;

import com.amos.common.dto.base.Query;

/**
 * Page Query
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2021/2/7
 */
public class PageQuery extends Query {

    private static final long serialVersionUID = 1L;

    private static final int DEFAULT_PAGE_SIZE = 10;

    private int page = 1;

    private int size = DEFAULT_PAGE_SIZE;

    public int getOffset() {
        return (getPage() - 1) * getSize();
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        if (page < 1) {
            page = 1;
        }
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size < 1) {
            size = DEFAULT_PAGE_SIZE;
        }
        this.size = size;
    }
}
