package com.example.ch2.annotated;

import com.example.ch2.decompiled.MassageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorldSpringAnnotated {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        MassageRenderer mr = ctx.getBean("renderer", MassageRenderer.class);
        mr.render();
    }
}
