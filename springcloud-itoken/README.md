# Spring Cloud iToken

## 1. 服务规划

- cloud 

|服务名称|服务端口|服务说明|
|-|-|-|
|itoken-eureka|9001|服务注册与发现|
|itoken-config|9002|分布式配置中心|
|itoken-zuul|9003|分布式路由网关|
|itoken-admin|9004|分布式系统监控|
|openzipkin/zipkin|9411|分布式链路追踪|

- service

|服务名称|服务端口|服务说明|
|-|-|-|
|itoken-service-admin|9101|管理员服务提供者|
|itoken-service-redis|9102|数据缓存服务提供者|
|itoken-service-sso|9103|单点登录服务提供者|
|itoken-service-posts|9104|文章服务提供者|
|itoken-service-upload|9105|文件上传服务提供者|
|itoken-service-digiccy|9106|数字货币服务提供者|
|itoken-service-collection|9107|数据采集服务提供者|

- web

|服务名称|服务端口|服务说明|
|-|-|-|
|itoken-web-admin|9201|管理员服务消费者|
|itoken-web-post|9202|文章服务消费者|
|itoken-web-backend|9203|后台服务聚合|
|itoken-web-digiccy|9204|数字货币服务消费者|


## 2. 敏捷开发

- 敏捷开发(Agile)是一种以人为核心,迭代,循序渐进的开发方法,敏捷开发不追求前期完美设计,完美编码,而是力求在很短的周期内开发出产品的核心功能,尽早发布可用版本.在后续生产周期内,不断迭代,完善
- 敏捷开发实现主要包括SSCRUM、XP(极限编程)、Crystal Methods、FDD(特性驱动开发)等。SCRUM和XP最为流行。

