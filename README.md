# common
> 基本使命——通用工具包

## 崇尚简约、规范、极客

## 项目模块
- common-api【通用API】
    - GeneralResponse（code, message, body）
    - IResponseCode（通用响应接口）
    - GeneralResponseCode（全局响应码）
    - BaseForm（抽象请求表单）
    - BaseVO 抽象响应对象（已重写toString方法）

- common-util【通用工具类】
    - DateUtils（日期工具类）
    - IdUtils（ID工具类）
    - JSON（jackson实现，仿照 FastJson 接口设计）
    - RandomStringUtils（随机字符串）

## 快速开始

### 1、添加依赖（按需依赖）

```xml
<dependency>
  <groupId>com.amos</groupId>
  <artifactId>common-api</artifactId>
  <version>1.0.0-SNAPSHOT</version>
</dependency>
```

```xml
<dependency>
  <groupId>com.amos</groupId>
  <artifactId>common-util</artifactId>
  <version>1.0.0-SNAPSHOT</version>
</dependency>
```

### 2、修改 maven setting.xml

2.1 配置仓库依赖

```xml
<repository>
    <id>github</id>
    <name>GitHub AmosWang0626 Apache Maven Packages</name>
    <url>https://maven.pkg.github.com/AmosWang0626/common</url>
</repository> 
```

2.2 访问仓库账号、TOKEN（只读权限,可放心使用）

```xml
<server>
    <id>github</id>
    <username>AmosWang0626</username>
    <password>2648477045d0a528ff2ad7a6fef61416b08a824b</password>
</server>
```


---
备注：
- since 1.8+
- 这是第 n + 1 次造轮子，也是最后一次。