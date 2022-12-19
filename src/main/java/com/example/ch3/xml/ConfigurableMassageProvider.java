package com.example.ch3.xml;

import com.example.ch2.decompiled.MassageProvider;

public class ConfigurableMassageProvider implements MassageProvider {

    private String massage = "Hello Spring";

    public ConfigurableMassageProvider(String massage) {
        this.massage = massage;
    }

    public ConfigurableMassageProvider() {
    }

    @Override
    public String getMassage() {
        return massage;
    }
}
