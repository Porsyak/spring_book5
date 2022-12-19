package com.example.ch3.annotation;

import com.example.ch2.decompiled.MassageProvider;

public class HelloWorldMassageProvider implements MassageProvider {

    @Override
    public String getMassage() {
        return "Hello World from package ch3";
    }
}
