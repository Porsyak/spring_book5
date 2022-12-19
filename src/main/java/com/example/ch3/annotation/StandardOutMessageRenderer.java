package com.example.ch3.annotation;

import com.example.ch2.decompiled.MassageProvider;
import com.example.ch2.decompiled.MassageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("renderer")
public class StandardOutMessageRenderer implements MassageRenderer {

    private final MassageProvider massageProvider;


    public StandardOutMessageRenderer(MassageProvider provider) {
        massageProvider = provider;
    }

    @Override
    public void render() {
        if (massageProvider == null){
            throw new RuntimeException("You must set the property massageProvider" +
                    " of class: " + StandardOutMessageRenderer.class.getName());
        }
        System.out.println(massageProvider.getMassage());

    }

    @Override
    @Autowired
    public void setMassageProvider(MassageProvider provider) {

    }

    @Override
    public MassageProvider getMassageProvider() {
        return massageProvider;
    }
}
