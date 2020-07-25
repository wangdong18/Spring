package springboot.simple;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("springboot.simple.dao")
public class SimpleApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleApplication.class, args);
    }

}
