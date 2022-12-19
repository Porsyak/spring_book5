package com.example.ch4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;


public class DestructiveBeanConfigDemo {

    @Configuration
    static class DestructiveBeanConfig{

        @Lazy
        @Bean(initMethod = "afterPropertiesSet", destroyMethod = "destroy")
        DestructiveBean destructiveBean(){
            DestructiveBean destructiveBean = new DestructiveBean();
            destructiveBean.setFilePath("text.txt");
            return  destructiveBean;
        }
    }


}
