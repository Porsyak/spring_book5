package com.example.ch4;

import com.example.ch2.decompiled.MassageRenderer;
import com.example.ch4.multiple.AppConfigThree;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigExampleTwo {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigThree.class);
        MassageRenderer renderer = ctx.getBean("messageRenderer", MassageRenderer.class);
        renderer.render();
    }
}
