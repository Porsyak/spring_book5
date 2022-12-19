package com.example.ch2.annotated;

import com.example.ch2.decompiled.MassageProvider;
import com.example.ch2.decompiled.MassageRenderer;
import com.example.ch2.decompiled.StandardOutMassageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.ch2.decompiled.HelloWorldMassageProvider;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public MassageProvider provider(){
        return new HelloWorldMassageProvider();
    }

    @Bean
    public MassageRenderer renderer(){
        MassageRenderer massageRenderer = new StandardOutMassageRenderer();
        massageRenderer.setMassageProvider(provider());
        return massageRenderer;
    }
}
