package com.naya.demosimplestarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Evgeny Borisov
 */
@Configuration
@EnableScheduling
@EnableAspectJAutoProxy
@EnableConfigurationProperties(UserDetails.class)
public class Conf {

    @Bean
    public DeprecationHandlerAspect aspect(){
        return new DeprecationHandlerAspect();
    }

    @Bean
    @ConditionalOnProperty("userdetails.name")
    public HelloService helloService(){
        return new HelloService();
    }
}




