package com.fen.dou;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestAutoConfig {

    @Bean
    public SayHello sayHello(){
        return new SayHello();
    }
}
