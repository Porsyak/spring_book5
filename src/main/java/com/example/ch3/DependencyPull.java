package com.example.ch3;

import com.example.ch2.decompiled.MassageRenderer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyPull {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml");
        MassageRenderer mr = ctx.getBean("renderer", MassageRenderer.class);
        mr.render();

        BeanFactory beanFactory = new DefaultListableBeanFactory();
    }
}
