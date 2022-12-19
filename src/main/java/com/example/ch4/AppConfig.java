package com.example.ch4;

import com.example.ch2.decompiled.MassageProvider;
import com.example.ch2.decompiled.MassageRenderer;
import com.example.ch2.decompiled.StandardOutMassageRenderer;
import com.example.ch3.xml.ConfigurableMassageProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MassageProvider massageProvider(){
        return new ConfigurableMassageProvider();
    }

    @Bean
    public MassageRenderer massageRenderer(){
        MassageRenderer massageRenderer = new StandardOutMassageRenderer();
        massageRenderer.setMassageProvider(massageProvider());
        return massageRenderer;
    }

}
