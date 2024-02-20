package com.test.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.cicdtest.model.Model;
import com.example.sub2.Modle2;

@Configuration
public class appConfig {

    @Bean
    public Model getPerson() {
        return new Model();
    }
    @Bean
    public Modle2 getCar() {
        return new Modle2();
    }
}
