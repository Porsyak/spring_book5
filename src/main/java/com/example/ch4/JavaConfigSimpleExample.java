package com.example.ch4;

import com.example.ch2.decompiled.MassageProvider;
import com.example.ch2.decompiled.MassageRenderer;
import com.example.ch2.decompiled.StandardOutMassageRenderer;
import com.example.ch3.xml.ConfigurableMassageProvider;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class JavaConfigSimpleExample {

    @Configuration
    static class AppConfigOne{

        @Bean
        public MassageProvider massageProvider(){
            return new ConfigurableMassageProvider();
        }

        @Bean
        public MassageRenderer massageRenderer(){
            MassageRenderer renderer = new StandardOutMassageRenderer();
            renderer.setMassageProvider(massageProvider());
            return renderer;
        }
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigOne.class);
        MassageRenderer renderer = ctx.getBean("massageRenderer", MassageRenderer.class);
        renderer.render();
    }
}
