package com.example.ch3;

import com.example.ch2.decompiled.MassageRenderer;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DeclareSpringComponents {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("app-context.xml");
        ctx.refresh();
        MassageRenderer massageRenderer = ctx.getBean("renderer", MassageRenderer.class);
        massageRenderer.render();
        ctx.close();
    }
}
