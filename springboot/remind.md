1.@MapperScan("springboot.simple.dao") 导入所有的mapper 否则在每一个mapper上加上@Mapper标签
2.resources中的 application.propreties在初始化前就会加载配置
3.在application.propreties中加入mybatis.mapper-locations=classpath:/mapper/*.xml
    导入所有的mapper.xml文件,注意叫dao时名称的修改 
4.mapper.xml中指定namespace表示对应的dao接口的位置
5.额外引入mysql-connector-java mybatis-spring-boot-starter包
    