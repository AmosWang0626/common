package com.amos.common.util.json;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * DESCRIPTION: 用户地址
 *
 * @author <a href="mailto:daoyuan0626@gmail.com">amos.wang</a>
 * @date 2020/6/17
 */
public class Address {

    private String id;
    private String name;
    private Long phone;
    private String address;
    private Date createTime;
    private LocalDateTime updateTime;

    public Address() {
    }

    public Address(String id, String name, Long phone, String address, Date createTime, LocalDateTime updateTime) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.createTime = createTime;
        this.updateTime = updateTime;
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

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }
}
