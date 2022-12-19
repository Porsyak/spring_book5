package com.example.ch4.multiple;

import com.example.ch2.decompiled.MassageProvider;
import com.example.ch2.decompiled.MassageRenderer;
import com.example.ch2.decompiled.StandardOutMassageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(AppConfigFour.class)
public class AppConfigThree {

    @Autowired
    MassageProvider provider;

    @Bean(name = "messageRenderer")
    public MassageRenderer massageRenderer(){
        MassageRenderer renderer = new StandardOutMassageRenderer();
        renderer.setMassageProvider(provider);
        return renderer;
    }

}
