package com.example.ch3.annotated;

import com.example.ch2.decompiled.MassageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("provider")
public class ConfigurableMassageProvider implements MassageProvider {

    private final String massage;

    @Autowired
    public ConfigurableMassageProvider(@Value("Configurable massage") String massage) {
        this.massage = massage;
    }

    @Override
    public String getMassage() {
        return massage;
    }
}
