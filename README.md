## spring-cloud-tutorial

> 声明:该项目仅作本人练习使用,相关教程由[千峰教育](https://www.funtl.com)提供. 

### 1. Eureka

当 Client 向 Server 注册时，它会提供一些元数据，例如主机和端口，URL，主页等。Eureka Server 从每个 Client 实例接收心跳消息。 如果心跳超时，则通常将该实例从注册 Server 中删除

### 2. Ribbon Feign Hystrix

- Ribbon: 提供客户端的负载均衡算法
- Feign: 声明式web service客户端
- Hystrix(Dashboard): 熔断器,通过熔断机制控制服务,对故障有强大的容错能力
1. 在Ribbon中使用: `引入相关pom文件`, `为方法添加HystrixCommand注解`, `指定fallbackMethod,fallbackMethod方法参数统一`
2. 在Feign中使用, 因为Feign本身就有Hystrix相关包, 所以: `在yml中开启Hystrix`,  `创建Hystrix类实现服务层接口`

### 3. Zuul

Zuul可以实现网关的功能,它既可以路由,也可以过滤
- 路由功能: 在yml中配置相关路由规则
- 过滤功能: 创建filter类,继承ZuulFilter

### 4. 配置中心

- 配置服务器的默认端口为 `8888`，如果修改了默认端口，则客户端项目就不能在 `application.yml` 或 `application.properties` 中配置 `spring.cloud.config.uri`，必须在 `bootstrap.yml` 或是 `bootstrap.properties` 中配置，原因是 `bootstrap` 开头的配置文件会被优先加载和配置，切记。
- 操作起来很简单，只需要为不同的环境编写专门的配置文件，如：`application-dev.yml`、`application-prod.yml`， 启动项目时只需要增加一个命令参数 `--spring.profiles.active=`环境配置 即可，启动命令如下：

```java -jar hello-spring-cloud-web-admin-feign-1.0.0-SNAPSHOT.jar --spring.profiles.active=prod```

### 5. Zipkin

分布式跟踪系统[twitter].收集服务的定时数据, 解决微服务架构中的延迟问题, 包括数据的收集, 存储, 查找和展现

**Zipkin服务端已经不能自己创建了,可以直接使用docker部署服务端镜像,zipkin默认端口为9411**

### 6. Springboot Admin

监控管理系统.系统健康状态,会话数量,服务资源,延迟度.

### 7. Spring Cloud itoken

itoken是一个springcloud项目, springcloud-itoken相关文档请移步: [springcloud-itoken文档](./springcloud-itoken/README.md)
