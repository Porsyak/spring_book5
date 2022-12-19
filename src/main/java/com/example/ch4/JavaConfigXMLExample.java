package com.example.ch4;

import com.example.ch2.decompiled.MassageRenderer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigXMLExample {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context-xml.xml");
        MassageRenderer renderer = ctx.getBean("messageRenderer", MassageRenderer.class);
        renderer.render();
    }
}
