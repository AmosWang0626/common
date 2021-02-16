# common

> 基本使命——通用工具包

## 崇尚简约、规范、极客

## 项目模块

- common-dto【通用DTO】
    - Command、Query（参考 COLA 架构设计）
    - 分页查询相关
        - PageQuery（不含筛选条件查询）
        - PageFilterQuery（含筛选条件查询，暂无排序规则）
        - PageResponse（分页查询结果）
    - 统一响应结果
        - MultiResponse（多结果）
        - SingleResponse（单结果）

- common-util【通用工具类】
    - CheckUtils（检验工具类【手机号、身份证号、银行卡号】）
    - DesSecretUtils（DES加密工具类）
    - DateUtils（日期工具类）
    - IdUtils（ID工具类【UUID】）
    - JSON（jackson实现，仿照 FastJson 接口设计）
    - RandomStringUtils（随机字符串）

## 快速开始

> 如果你也想用 github 作自己的 maven 仓库，请参考 [deploy package to github](a_doc/deploy_package_to_github.md)

### 1、添加依赖（按需依赖）

```xml
<!-- dto -->
<dependency>
    <groupId>com.amos</groupId>
    <artifactId>common-dto</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```

```xml
<!-- util -->
<dependency>
    <groupId>com.amos</groupId>
    <artifactId>common-util</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```

### 2、修改 maven setting.xml

2.1 配置仓库依赖

```xml
<!-- github repository -->
<repository>
    <id>github</id>
    <name>GitHub AmosWang0626 Apache Maven Packages</name>
    <url>https://maven.pkg.github.com/AmosWang0626/common</url>
</repository> 
```

2.2 访问仓库账号、TOKEN（只读权限,可放心使用）

```xml
<!-- github read permission -->
<server>
    <id>github</id>
    <username>AmosWang0626</username>
    <password>de8fd5ae29835464b24cbb1ebb51a86964749082</password>
</server>
```

2.3 下载对应jar

`mvn install`

- 如果下载不下来，请检查 setting.xml 配置，可参考 [settings.xml](a_doc/settings.xml)

- 如果提示 401 Unauthorized，可能是 2.2 中配置的密码错误，请提 issue，看到后会第一时间处理

---
备注：

- since 1.8+
- 这是第 n + 1 次造轮子，也是最后一次。