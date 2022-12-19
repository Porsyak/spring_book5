package com.example.ch3.annotated;

import org.springframework.stereotype.Component;

@Component("injectSimpleConfig")
public class InjectSimpleConfig {

    private String name = "Ivan";
    private int age = 41;
    private float height = 1.92f;
    private boolean programming = true;
    private Long ageInSeconds = 1_222_444_123L;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public boolean isProgramming() {
        return programming;
    }

    public Long getAgeInSeconds() {
        return ageInSeconds;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setProgramming(boolean programming) {
        this.programming = programming;
    }

    public void setAgeInSeconds(Long ageInSeconds) {
        this.ageInSeconds = ageInSeconds;
    }
}
