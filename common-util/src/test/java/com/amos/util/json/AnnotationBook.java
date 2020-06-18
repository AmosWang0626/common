package com.amos.util.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

/**
 * 模块名称: common
 * 模块描述: AnnotationBook
 *
 * @author amos.wang
 * @date 2020/6/18 11:21
 */
public class AnnotationBook {

    private String id;
    @JsonProperty("ISBN")
    private String isbn;
    private String name;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("publish_info")
    private String publish;
    @JsonProperty("author_info")
    private String author;
    @JsonProperty("version_info")
    private String version;
    @JsonProperty("package")
    private String packages;
    @JsonProperty("create_time")
    private LocalDateTime createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPackages() {
        return packages;
    }

    public void setPackages(String packages) {
        this.packages = packages;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}
