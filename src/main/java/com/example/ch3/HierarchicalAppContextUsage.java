package com.example.ch3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HierarchicalAppContextUsage {
    public static void main(String[] args) {
        GenericXmlApplicationContext parent = new GenericXmlApplicationContext();
        parent.load("parent-context.xml");
        parent.refresh();

        GenericXmlApplicationContext child = new GenericXmlApplicationContext();
        child.load("child-context.xml");
        child.setParent(parent);
        child.refresh();

        Sound sound1 = (Sound) child.getBean("sound1");
        Sound sound2 = (Sound) child.getBean("sound2");
        Sound sound3 = (Sound) child.getBean("sound3");

        System.out.println(sound1.getTitle());
        System.out.println(sound2.getTitle());
        System.out.println(sound3.getTitle());
        child.close();
        parent.close();
    }
}
