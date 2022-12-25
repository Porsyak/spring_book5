package com.example.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;

import java.util.HashMap;
import java.util.Map;

public class EnvironmentSampleLast {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.refresh();
        ConfigurableEnvironment env = ctx.getEnvironment();
        MutablePropertySources propertySources = env.getPropertySources();
        Map<String, Object> appMap = new HashMap<>();
        appMap.put("user.home", "application_home");
        propertySources.addLast(new MapPropertySource("prospring5_MAP", appMap));
        System.out.println("user.home " + System.getProperty("user.home"));
        System.out.println(System.getenv("JAVA_HOME"));
        ctx.close();
        System.out.println(env.getProperty("application.home"));


    }
}
