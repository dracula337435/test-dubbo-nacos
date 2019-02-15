# 试验dubbo

主要目的和nacos一起试验  

## 注册中心  
consumer用了一个controller来调用  
[测试链接/sayHello?name=world](http://localhost:8080/sayHello?name=gxk)

## 配置中心  
[测试链接/testNacosConfig](http://localhost:8080/testNacosConfig)  
测试配置生效、动态更新，需要向nacos增加配置信息项dataId为example，内容为useLocalCache=true  
curl命令
```
curl -X POST "http://127.0.0.1:8848/nacos/v1/cs/configs?dataId=example&group=DEFAULT_GROUP&content=useLocalCache=true"
```
关键代码，在spring-boot主类上  
```
@NacosPropertySource(dataId = "example", autoRefreshed = true)
```
使用配置项
```
@NacosValue("${useLocalCache:false}", autoRefreshed = true)
private boolean useLocalCache;
```

nacos可以使用@Value拿到配置，通过actuator/env可以看到影响env，拉和推配置。
但是@Value不会自动刷新

Main上@NacosPropertySource(autoRefreshed = ...)，可被属性上的@NacosValue(autoRefreshed = true)覆盖。  

属性上的@NacosValue可取到本地properties的值  

由于原理是影响了env，xml方式也可以拿到nacos中的配置项，但是推配置不生效，同@Value，见```another.xml```和```AnotherController```