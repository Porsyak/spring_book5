package com.example.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class LookupDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("app-context-xml.xml");
        ctx.refresh();
        DemoBean abstractBean = ctx.getBean("abstractLookupBean", DemoBean.class);
        DemoBean standardBean = ctx.getBean("standardLookupBean", DemoBean.class);
        ctx.close();
        displayInfo("abstractLookupBean", abstractBean);
    }

    public static void displayInfo(String beanName, DemoBean bean){
        Singer singer1 = bean.getMySinger();
        Singer singer2 = bean.getMySinger();
    }


}
