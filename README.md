## spring-cloud-tutorial

### 1.Eureka

当 Client 向 Server 注册时，它会提供一些元数据，例如主机和端口，URL，主页等。Eureka Server 从每个 Client 实例接收心跳消息。 如果心跳超时，则通常将该实例从注册 Server 中删除

### 2.Zuul
Zuul可以实现路由转发和过滤功能