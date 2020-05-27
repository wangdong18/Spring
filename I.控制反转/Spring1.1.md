这篇参考文档包含所有的Spring框架的所必需的全部技术。

Spring框架中最重要的是控制反转(Ioc)。关于Spring框架Ioc的深入讨论围绕着Spring切面技术(Aop)。Spring框架有自己的Aop框架，它易于理解且能满足Java企业开发中80%的需求。

1.控制反转
	这一章介绍控制反转(Ioc)
	1.1介绍控制反转以及实例化
	这一节说明Spring框架控制反转(Ioc)的实施。Ioc也被叫做依赖注入(DI)。这是一个凭借的对象定义依赖仅通过构造函数参数、工厂方法参数或者通过工厂构造或返回之后对象实例化的属性的过程。接着注入在创建实例时注入这些依赖。从根本上说这是反转(或者说控制反转)对象实例化或者像服务器定位(Service Licator)模式一样的通过直接构造类的定位依赖的过程。

		 org.springframework.beans和org.springframework.context包是Spring框架控制反转的基础。
		 工厂模式接口提供了提前配置机智能够管理任何对象。ApplicationContext是BeanFactory的替换接口，它增加了
		 ·更容易整和Sping的控制反转
		 ·管理资源处理（通过使用国际化）
		 ·事件发布
		 ·应用层规范环境比如web应用使用WebApplicationContext
		 
   简而言之，BeanFactory提供了构造框架和基础设计，ApplicationContext增加了更多的企业环境规范。ApplicationContext整和了BeanFactory集合并且在使用控制反转时排他性。想了解更多的使用BeanFactory替代ApplicationContext请看The BeanFactory.
   在Spring中，对象来自于你配置的基础，也管理通过控制反转的对象。一个实例就是一个对象的示例，聚集和被控制反转管理。换句话说，一个实例不过是你应用中许多对象中的一个。配置中的许多对象是通过控制器直接映射在构造的元数据。
