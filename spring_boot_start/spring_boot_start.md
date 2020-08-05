一、Spring_boot_start

## 	1）操作流程

​			1.idea ->file->new project

​			2.Spring initilaizr

​				artifact 为项目的名称  group为src.main.java下的项目名称（一般使用com.xxx.xxx）

​			![image-20200803163303260](/Users/lixiaokang/Library/Application Support/typora-user-images/image-20200803163303260.png)

​			3. next -> 

​			    packet name为project 下的名字

           ![WeChat1f1cba117ef79c6f2af835627ce0f25b](/Users/lixiaokang/Desktop/WeChat1f1cba117ef79c6f2af835627ce0f25b.png)		4. next->

​		   ![image-20200803163628195](/Users/lixiaokang/Library/Application Support/typora-user-images/image-20200803163628195.png)

 	## 2) 项目的构建

​	1.自动引入依赖

```xml
      <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
            <exclusions>
                <exclusion>
                    <groupId>org.junit.vintage</groupId>
                    <artifactId>junit-vintage-engine</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
```

​	2.主程序类,主入口类

```java
@SpringBootApplication
public class ArtufacApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArtufacApplication.class, args);
    }

}
```

​	@**SpringBootApplication**: Spring Boot 应用标注在某个类上说明这个类是Spring boot的主配置类，Springboot就应该运行这个类的main方法来作为启动应用程序。

```java
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(excludeFilters = { @Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
		@Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })
public @interface SpringBootApplication {
```



​	@**SpringBootConfiguration**:Spring Boot 的配置类；

​		标注在某个类上，表示这是一个Spring Boot的配置类；

​	@**Configuration**:配置类上来标注这个注解；

​			配置类——— 配置文件：配置类也是容器中的一个组建 ：@Component



​	@**EnableAutoConfiguration**:开启自动配置功能：

​		以前我们需要配置的东西，Spring Boot帮我们自动配置：@**EnableAutoConfiguration**告诉SpringBoot 开启自动配置功能

```java
@AutoConfigurationPackage
@Import(AutoConfigurationImportSelector.class)
public @interface EnableAutoConfiguration {	
```

​	@**AutoConfigurationPackage**:自动配置包

​	@**Import**(AutoConfigurationImportSelector.class)

​		Spring的底层注解@Import,给容器中导入一个组建；导入的组建由AutoConfigurationPackages.Registrar.class==将主配置类(@SpringBootApplocation标注的类)的所以包及下面所有的组建扫描到Spring容器；==

@**Import**(EnableAutoConfigurationImportSelector.class)

​	给容器中导入组建?**EnableAutoConfigurationImportSelector**：导入哪些组建的选择器；

​	将所有的需要导入的组建以全类名的方式返回;这些组建就会被添加到容器中；

​	会给容器中导入非常多的自动配置类(xxxAutoConfiguration)；就是给容器中导入这个场景需要的组建；并配置好这些组建；

有了自动配置类，免去了我们手动编写配置注入功能组件等得工作；

​	SpringFactoriesLoader.loadFactoryNames(EnableAutoConfiguration.clss,classLoader);



==Spring  boot在启动的时候从类路径新的META-INF/spring.factories中获取EnableAutoConfiguration指定的值，将这些值作为自动配置类导入到容器中，自动配置类就生效，帮我们进行自动配置工作；

j2EE的整体整合方案和皮带配置都在spring_boot_autoconfigure:2.3.2.RELEASE下

## 3）经验

​	1.在请求时 RequestMapping 中method不写的话 get post都支持

​	2.@RestController =@Controller + @ResponseBody

​	3.如果需使用使用mybatis访问数据库	

​		a）引入驱动

```xml
<!--引入mybatis-start-->
        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
            <version>1.3.2</version>
        </dependency>

<!--引入数据库驱动-->
        <dependency>
            <groupId>org.mybatis.spring.boot</groupId>
            <artifactId>mybatis-spring-boot-starter</artifactId>
            <version>1.3.0</version>
        </dependency>
```

​		b) 引入dao层接口

​		在主程序上加入@**MapperScan**标签 或者 在每一个dao层中的接口上加上@Mapper标签

```java
@MapperScan("com.xxx.xxx.xxx.dao")
```

​		c)  连接数据库

​			在application.properties中加上数据库连接:

```properties
spring.datasource.url=jdbc:mysql://127.0.0.1:3306/test
spring.datasource.username=root
spring.datasource.password=123456789
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver 
```

​			否则爆出

*<u>Description:</u>*

*<u>Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.</u>*

*<u>Reason: Failed to determine a suitable driver class</u>* 

​			在application.properties中加上需要实现的mapper的位置

```properties
mybatis.mapper-locations=classpath*:/mapper/**Mapper.xml
```

​			否则在调用数据库时 报错

*<u>Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed; nested exception is org.apache.ibatis.binding.BindingException: Invalid bound statement (not found): com.personal.springboot.start.dao.UserMapper.findById] with root cause</u>*



​	