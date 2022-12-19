package com.example.ch2.hello_world;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.ch2.decompiled.MassageRenderer;

public class HelloWorldSpringDI {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("*/app-context.xml");
        MassageRenderer mr = ctx.getBean("renderer", MassageRenderer.class);
        mr.render();
    }
}
