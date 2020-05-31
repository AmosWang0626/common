package com.amos.api.response;

import com.amos.api.pojo.BaseForm;

/**
 * DESCRIPTION: TestForm
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/5/31
 */
public class TestForm extends BaseForm {

    private String id;

    public String getId() {
        return id;
    }

    public TestForm setId(String id) {
        this.id = id;
        return this;
    }

}
