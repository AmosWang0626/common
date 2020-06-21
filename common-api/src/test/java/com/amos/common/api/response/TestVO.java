package com.amos.common.api.response;

import com.amos.common.api.pojo.BaseVO;

/**
 * DESCRIPTION: TestVO
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/5/31
 */
public class TestVO extends BaseVO {

    private String name;

    private String address;

    public String getName() {
        return name;
    }

    public TestVO setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public TestVO setAddress(String address) {
        this.address = address;
        return this;
    }

}
