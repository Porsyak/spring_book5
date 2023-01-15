package com.example.ch4;

import javax.inject.Inject;
import javax.inject.Named;

@Named("messageProvider")
public class ConfigurableMessageProvider implements MassageProvider {

    private String massage = "Default message";

    public ConfigurableMessageProvider() {
    }

    @Inject
    @Named("massege")
    public ConfigurableMessageProvider(String massage) {
        this.massage = massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    @Override
    public String getMassage() {
        return massage;
    }
}
