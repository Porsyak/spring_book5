package com.example.ch3.config;

import com.example.ch3.annotated.Singer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Arrays;
import java.util.Map;

public class AliasBeanDemo {

    @Configuration
    public static class AliasBeanConfig{

        @Bean(name = {"123", "456", "789"})
        public Singer singer(){
            return new Singer();
        }
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(AliasBeanConfig.class);

        Map<String, Singer> beans = ctx.getBeansOfType(Singer.class);
        beans.entrySet().stream().forEach(b -> System.out.println(b.getKey() +
                Arrays.toString(ctx.getAliases(b.getKey()))));
        ctx.close();
    }

}
