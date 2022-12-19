package com.example.ch4.annotated;

import com.example.ch2.decompiled.MassageProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("provider")
public class ConfigurableMessageProvider implements MassageProvider {

    private final String message;

    public ConfigurableMessageProvider(@Value("Love on the weekend") String message) {
        this.message = message;
    }

    @Override
    public String getMassage() {
        return this.message;
    }

}
