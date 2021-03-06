# Deploy Package to GitHub

## 1、pom.xml 增加配置

```xml
<!-- pom.xml -->
<distributionManagement>
    <repository>
        <id>github</id>
        <name>GitHub AmosWang0626 Apache Maven Packages</name>
        <url>https://maven.pkg.github.com/AmosWang0626/common</url>
    </repository>
</distributionManagement>
```

## 2、setting.xml 增加配置

2.1 配置仓库依赖

```xml
<!-- setting.xml -->
<repository>
    <id>github</id>
    <name>GitHub AmosWang0626 Apache Maven Packages</name>
    <url>https://maven.pkg.github.com/AmosWang0626/common</url>
</repository> 
```

2.2 访问仓库账号、TOKEN

```xml
<!-- github write permission -->
<server>
    <id>github</id>
    <username>AmosWang0626</username>
    <password>xxx</password>
</server>
```

- [申请GithubToken](https://github.com/settings/tokens/new)
- 授权：write:packages、read:packages、delete:packages

## 3、建议配置

未稳定的版本，建议版本号上加上 `-SNAPSHOT`

1. 可以多次deploy，不然的话同一版本提交会提示重复 `422 Unprocessable Entity`
2. 使用者Reimport会自动拉取最新版本

---

# 完整的 setting.xml 示例，另见[settings.xml](settings.xml)

```xml
<?xml version="1.0" encoding="UTF-8"?>
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd">

    <localRepository>E:\app_res\mvnrepository</localRepository>

    <activeProfiles>
        <activeProfile>default</activeProfile>
    </activeProfiles>

    <!-- Maven 仓库镜像加速 -->
    <mirrors>
        <mirror>
            <id>central</id>
            <name>central</name>
            <mirrorOf>*,!github</mirrorOf>
            <url>http://maven.aliyun.com/nexus/content/groups/public</url>
        </mirror>
    </mirrors>

    <!-- Maven 仓库 -->
    <profiles>
        <profile>
            <id>default</id>
            <repositories>
                <repository>
                    <id>central</id>
                    <name>Central Repository</name>
                    <url>https://repo1.maven.org/maven2/</url>
                </repository>
                <repository>
                    <id>github</id>
                    <name>GitHub AmosWang0626 Apache Maven Packages</name>
                    <url>https://maven.pkg.github.com/AmosWang0626/common</url>
                </repository>
            </repositories>
        </profile>
    </profiles>

    <!-- Github仓库访问账号密码 -->
    <servers>
        <server>
            <id>github</id>
            <username>AmosWang0626</username>
            <password>xxx</password>
        </server>
    </servers>

</settings>
```
