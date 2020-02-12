## spring-cloud-tutorial

### 1.Eureka

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

