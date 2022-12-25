package com.example.ch4.config;

import com.example.ch4.Food;
import com.example.ch4.FoodProviderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.List;

public class ProfileJavaConfigExample {
    public static void main(String[] args) {
        GenericApplicationContext ctx = new AnnotationConfigApplicationContext(
                KindergartenConfig.class, HighschoolConfig.class);
        FoodProviderService foodProviderService =
                ctx.getBean("foodProviderService", FoodProviderService.class);
        List<Food> list = foodProviderService.provideLunchSet();
        list.forEach(food -> System.out.println(food.getName()));
        ctx.close();
    }
}
