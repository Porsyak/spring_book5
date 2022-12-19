package com.example.ch4;

import com.example.ch2.decompiled.MassageProvider;
import com.example.ch2.decompiled.MassageRenderer;
import com.example.ch2.decompiled.StandardOutMassageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example.ch4.annotated"})
public class AppConfigTwo {

    MassageProvider provider;

    public AppConfigTwo(MassageProvider provider) {
        this.provider = provider;
    }

    @Bean(name = "messageRenderer")
    public MassageRenderer massageRenderer(){
        MassageRenderer renderer = new StandardOutMassageRenderer();
        renderer.setMassageProvider(provider);
        return renderer;
    }

}
