package com.example.ch4;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Jsr330Demo {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("app-context-annotation.xml");
        ctx.refresh();
        MassageRenderer renderer = ctx.getBean("massageRenderer", MassageRenderer.class);
        renderer.renderer();
        ctx.close();
    }
}
