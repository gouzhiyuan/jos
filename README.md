## 京东JOS平台接口转发工具

###简介




`打包`: mvn clean package

`运行`: sudo -u tomcat nohup java -jar -Djava.io.tmpdir=/opt/ucenter/temp/ yl-tiger-ucenter.jar --spring.config.location=/opt/ucenter/config/application.yml &

 **说明**: -Djava.io.tmpdir 指定临时文件存放目录 --spring.config.location 指定外部配置文件路径
