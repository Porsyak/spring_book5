package com.example.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

public class ProfileXmlConfigExample {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:/*-config.xml");
        ctx.refresh();
        FoodProviderService foodProviderService =
                ctx.getBean("foodProviderService", FoodProviderService.class);
        List<Food> list = foodProviderService.provideLunchSet();
        list.forEach(System.out::println);
        ctx.close();
    }

}
