package com.example.ch3.xml;

import org.springframework.context.support.GenericXmlApplicationContext;

public class ConstructorConfusion {

    private final String someValue;

    public ConstructorConfusion(String someValue) {
        System.out.println("ConstructorConfusion(String) called");
        this.someValue = someValue;
    }

    public ConstructorConfusion(int someValue){
        System.out.println("ConstructorConfusion(int) called");
        this.someValue = Integer.toString(someValue);
    }

    @Override
    public String toString() {
        return  someValue;
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("app-context-xml.xml");
        ctx.refresh();
        ConstructorConfusion constructorConfusion = (ConstructorConfusion) ctx.getBean("constructorConfusion");
        System.out.println(constructorConfusion);
        ctx.close();

    }
}
