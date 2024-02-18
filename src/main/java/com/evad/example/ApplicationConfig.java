package com.evad.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ApplicationConfig {

    @Bean
    @Qualifier("firstBean")
    public MyFirstClass myFirstBean(){
        return new MyFirstClass("First bean");
    }
    @Bean
    @Qualifier("secondBean")
    public MyFirstClass mySecondBean(){
        return new MyFirstClass("Second bean");
    }

    @Bean
    @Primary
    public MyFirstClass myThirdBean(){
        return new MyFirstClass("Third bean");
    }

}
