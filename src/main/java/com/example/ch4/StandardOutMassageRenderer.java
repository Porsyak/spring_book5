package com.example.ch4;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Named("massageRenderer")
@Singleton
public class StandardOutMassageRenderer implements MassageRenderer{

    @Inject
    private MassageProvider massageProvider = null;

    @Override
    public void renderer() {
        if (massageProvider == null){
            throw new RuntimeException();
        }
        System.out.println(massageProvider.getMassage());

    }

    public void setMassageProvider(MassageProvider provider){
        this.massageProvider = provider;
    }
}
