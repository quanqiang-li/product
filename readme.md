[toc]
# 简介
eureka 客户端,产品服务
集群部署
# 打包 pom中配置了profiles 需要指定-P
## peer1 节点 略过测试编译和执行
mvn clean package -P peer1 -Dmaven.test.skip=true
## peer2 节点
mvn clean package -P peer2 -Dmaven.test.skip=true
# 部署
nohup java -jar product-peer1.jar>product1.out 2>&1 &
nohup java -jar product-peer2.jar>product2.out 2>&1 &

# 访问
http://ip:8761/
http://ip:8762/  
http://ip:8763/  
![注册中心](https://note.youdao.com/yws/public/resource/030c5ed1a14c969b99e35b06051c9f7a/xmlnote/B4B2B8356AA742D6BD770D19B22BDB48/65689)
