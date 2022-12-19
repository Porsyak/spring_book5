package com.example.ch3.xml;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("injectSimpleSpel")
public class InjectSimpleSpel {
    @Value("")
    private String name;
    private int age;
    private float height;
    private boolean programmer;
    private Long adeInSeconds;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public boolean isProgrammer() {
        return programmer;
    }

    public void setProgrammer(boolean programmer) {
        this.programmer = programmer;
    }

    public Long getAdeInSeconds() {
        return adeInSeconds;
    }

    public void setAdeInSeconds(Long adeInSeconds) {
        this.adeInSeconds = adeInSeconds;
    }

    @Override
    public String toString() {
        return "InjectSimpleSpel{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", programmer=" + programmer +
                ", adeInSeconds=" + adeInSeconds +
                '}';
    }

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("app-context.xml");
        ctx.refresh();
        InjectSimpleSpel spel = (InjectSimpleSpel) ctx.getBean("injectSimpleSpel");
        System.out.println(spel);
        ctx.close();
    }
}
