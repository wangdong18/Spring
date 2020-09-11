package com.mortal.starter.configuration;

import com.mortal.starter.properties.DemoProperties;
import com.mortal.starter.service.DemoService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author mortal
 * @since 2020-09-11
 */
@Configuration
@EnableConfigurationProperties(DemoProperties.class)
public class DemoServiceAutoConfiguration {
    private final DemoProperties demoProperties;

    public DemoServiceAutoConfiguration(DemoProperties demoProperties) {
        this.demoProperties = demoProperties;
    }

    @Bean
    @ConditionalOnMissingBean
    public DemoService demoService() {
        return new DemoService(this.demoProperties.getName(), this.demoProperties.getAge());
    }
}
