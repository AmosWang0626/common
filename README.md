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
    <password>ff15825cfd4dbb0643240cc4fbf2e8f66c58ac20</password>
</server>
```

---
备注：

- since 1.8+
- 这是第 n + 1 次造轮子，也是最后一次。