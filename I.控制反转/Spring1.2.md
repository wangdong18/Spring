1.2 控制层概论
   org.springframework.context.ApplicationContext接口代表了Spring控制反转控制层并且为实例的实例化、配置、组织的处理。控制器在对象实例化、配置、组织的时候获得指令。配置元数据组成为XML、java注解以及java代码。这让你表示对象通过完成配置应用，这些对象间紧密依赖。 
   
   一些继承ApplicationContext的接口作为Spring的附属。在独立的应用中，创建一个 ClassPathXmlApplicationContext或者FileSystemXmlApplicationContext的实例是常见的。XML已是传统的定义配置元数组，你可以令容器使用Java注解或者使用代码来作为元数组的转换并使用少量申明的XML配置文件作为额外的元数组。
   
   在大多数的应用场景中，显示的用户代码来实例一个或者多个实例Spring控制反转实例是不需要的。例如在Web应用的场景中，一个简单地大概8行左右的web.xml样板配置就足够了(详情请见https://docs.spring.io/spring/docs/5.2.0.BUILD-SNAPSHOT/spring-framework-reference/core.html#context-create)。如果你使用Spring Tool Suite(一个Eclipse提供的开发环境)，你能快速且轻松的创建样板配置。
   
   下面的图展示了高级的Spring如何工作的。在ApplicationContext创建并完成初始化之后，配置文件将合并你的应用类，这样你就有已经完成配置的可以执行系统或文件。
   ![Aaron Swartz](https://raw.githubusercontent.com/wangdong18/Spring/master/I.%E6%8E%A7%E5%88%B%E5%8F%8D%E8%BD%AC/Figure%201.%20The%20Spring%20IoC%20container.png)
			Figure 1. The Spring IoC container
			
1.2.1 控制器元数组	
   查看上一小节的图片，可以发现Spring控制反转是一种控制器元数组。这种控制器元数组，向开发者展示了Spring容器在你的应用中如何初始化、配置和组织。

   控制器元数组是传统的被提供在样例和直观的XML格式，这也是在这篇文章中传递的关键感念和Spring控制反转容器的特色。
XML组成的元数组不是控制器元数组唯一形式.Spring控制反转容器本身与实际写入配置的元数据毫不相关。现在，许多的开发者为Sping应用选择Java-based configuration。

   关于Spring容器选择其他形式的控制器元数据，请看：
      * Annotation-based configuration:Spring2.5引进的注解型控制器元数据
      * Java-base configuration:Spring3.0开始使用，许多由Spring JavaConfig工程提供的特性成为Spring框架核心的一部分。因此，你可以能够在你的应用类之外定义对象，而不是使用XML文件。
   想要使用这些新的特性，请参考@Configuration、@Bean、@Import和@DependOn注解

   Spring配置至少一个组成并且管理超过一个实例的定义。XML构成的控制器元数据使用<bean/>标签构造实例,标签内部包含的实例优先级更高。Java构造器通常在@Configuration类中使用@Bean注释方法。

   这些实例的定义对应实际中组成你应用的对象。通常，你定义服务层对象，数据应用层(DAOs)对象,表现层对象（例如Struts Action实例),基础对象(例如Hibernate SessionFactories,JMS Queues这些)。通常，不会在容器中配置细领域的对象，
因为经常使用DAOs和商业逻辑去创造和配置细领域对象。尽管如此，你也可以使用Spring的切面整合去配置被外部控制反转的控制层已经创建的对象。详情请看[Using AspectJ to Dependency Inject Domain Objects with Spring][https://docs.spring.io/spring/docs/5.2.0.BUILD-SNAPSHOT/spring-framework-reference/core.html#aop-atconfigurable]

   下面的例子展示了XML构成的控制器元数据的基础构成：
   
           <?xml version="1.0" encoding="UTF-8"?>
			<beans xmlns="http://www.springframework.org/schema/beans"
		    	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		    	xsi:schemaLocation="http://www.springframework.org/schema/beans
		        	https://www.springframework.org/schema/beans/spring-beans.xsd">

		    <bean id="..." class="..."> 
		        <!-- collaborators and configuration for this bean go here -->
		    </bean>
		    <bean id="..." class="...">
		        <!-- collaborators and configuration for this bean go here -->
		    </bean>
		    <!-- more bean definitions go here -->
		</beans>
		
		1.id属性是个人定义的对象
		2.class属性是定义使用类名全路径定义对象

   id的值是指属性对象。这个实例的XML文件中没有显示指向的协助对象。更多信息请看[Dependencies][https://docs.spring.io/spring/docs/5.2.0.BUILD-SNAPSHOT/spring-framework-reference/core.html#beans-dependencies]



