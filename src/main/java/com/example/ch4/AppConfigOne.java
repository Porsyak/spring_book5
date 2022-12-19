package com.example.ch4;

import com.example.ch2.decompiled.MassageProvider;
import com.example.ch2.decompiled.MassageRenderer;
import com.example.ch2.decompiled.StandardOutMassageRenderer;
import com.example.ch3.xml.ConfigurableMassageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "classpath:message.properties")
public class AppConfigOne {

    private final Environment environment;

    @Autowired
    public AppConfigOne(Environment environment) {
        this.environment = environment;
    }

    @Bean
    @Lazy
    public MassageProvider massageProvider(){
        return new ConfigurableMassageProvider(environment.getProperty("message"));
    }

    @Bean(name = "messageProvider")
    @Scope(value = "prototype")
    @DependsOn(value = "messageProvider")
    public MassageRenderer massageRenderer(){
        MassageRenderer massageRenderer = new StandardOutMassageRenderer();
        massageRenderer.setMassageProvider(massageProvider());
        return massageRenderer;
    }

}

