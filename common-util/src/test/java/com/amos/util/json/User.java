package com.amos.util.json;

import java.util.List;

/**
 * DESCRIPTION: 用户
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/6/17
 */
public class User {

    private String id;
    private String name;
    private Integer age;
    private List<Address> addressList;

    public User() {
    }

    public User(String id, String name, Integer age, List<Address> addressList) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.addressList = addressList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<Address> addressList) {
        this.addressList = addressList;
    }
}
