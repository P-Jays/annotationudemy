package com.spring.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.spring.anno")
@PropertySource("classpath:sport.properties")
public class AppConfig {
  
    @Bean
    public FotuneService sadFotuneService(){
        return new SadFortuneService();
    }

    @Bean
    public Coach swimCoach(){
        return new SwimCoach(sadFotuneService());
    }
}
