# 目的
通过Jib做成docker镜像，并推送至ECR

# 事前准备
## 1. 安装 `docker-credential-helper-ecr`
安装命令
``` shell
$ brew install docker-credential-helper-ecr
```

## 2. 配置 AWS
1. 创建 ECR 仓库
2. 分配用户权限
3. 修改 `.aws/credentials`
    ``` 
    aws_access_key_id = <aws_access_key_id>
    aws_secret_access_key = <aws_secret_access_key>
    ```

## 3. 配置 Gradle
1. 修改 IDEA 的 Gradle User Home
    * path : `Preferences | Build, Execution, Deployment | Build Tools | Gradle`
    * `Gradle User Home` : `/User/<user name>/.gradle`


2. 将下记信息添加至 `gradle.propteries`
    * `aws.accountid=<个人的AWS账户ID>`
    * `aws.region=<该账户的Region>`

## 4. 执行打包
iTerm 进入到工程目录下 执行
```shell
$ gradle jib
```