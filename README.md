# microservicecloud
本项目是基于一个员工表进行的微服务架构改造。
  所在的环境是Eureka,restTemplate+Ribbon,Feign,hystrix,zuul,config,lombok,内置容器jetty,修改重启插件,github,Maven多模块,Linux环境下的Mysql
lombok是一个插件，使用注解简化实体类中的代码，具体，请见百度
sql语句在服务提供者的resources中
项目的结构如下：
microservicecloud(父工程)
  microservicecloud-api(本项目公用配置，比如实体，工具类，服务提供者接口)
  microservicecloud-config(连接github的项目，是本项目的配置中心，子模块的配置文件都放在github中)
  microservicecloud-config-client(模拟子模块，连接配置中心测试)
  microservicecloud-consumer-dept(restTemplate+Ribbon远程调用服务)
  microservicecloud-consumer-dept-feign(feign调用远程服务)
  microservicecloud-eureka(注册中心)
  microservicecloud-hystrix-dashboard(断路器监控中心，有图形化界面)
  microservicecloud-provider-dept(服务的提供者)
  microservicecloud-provider-dept8002(服务提供者的集群)
  microservicecloud-provider-dept-hystrix(在服务的提供方的服务的熔断)
  microservicecloud-zuul-gateway(网关，路由的分发)
  pom.xml(父级的依赖)
