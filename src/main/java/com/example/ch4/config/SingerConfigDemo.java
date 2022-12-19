package com.example.ch4.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.support.GenericApplicationContext;

public class SingerConfigDemo {

    public static void getBeans(String beansName, ApplicationContext ctx){
        try {
            Singer bean = (Singer) ctx.getBean(beansName);
            System.out.println(bean);
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }

    @Configuration
    static class SingerConfig {

        @Lazy
        @Bean(initMethod = "init")
        Singer singerOne() {
            Singer singer = new Singer();
            singer.setName("Ivan");
            singer.setAge(41);
            return singer;
        }

        @Lazy
        @Bean(initMethod = "init")
        Singer singerTwo() {
            Singer singer = new Singer();
            singer.setName("Mishail");
            singer.setAge(40);
            return singer;
        }

        @Lazy
        @Bean(initMethod = "init")
        Singer singerThree() {
            Singer singer = new Singer();
            singer.setName("Yula");
            return singer;
        }
    }

    public static void main(String[] args) {
        GenericApplicationContext context = new AnnotationConfigApplicationContext(SingerConfig.class);
        getBeans("singerOne", context);
        getBeans("singerTwo", context);
//        getBeans("singerTree", context);

    }
}
