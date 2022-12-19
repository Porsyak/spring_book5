package com.example.ch4;

import com.example.ch2.decompiled.MassageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigExampleOne {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        MassageRenderer renderer = ctx.getBean("massageRenderer", MassageRenderer.class);
        renderer.render();
    }

}
