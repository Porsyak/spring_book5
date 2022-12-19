package com.example.ch2.decompiled;

import java.util.Properties;

public class MassageSupportFactory {
    private static final MassageSupportFactory instance;

    private MassageRenderer renderer;
    private MassageProvider provider;

    private MassageSupportFactory() {
        Properties properties = new Properties();
        try {
            properties.load(this.getClass().getResourceAsStream("/msf.properties"));
            String rendererClass = properties.getProperty("renderer.class");
            String providerClass = properties.getProperty("provider.class");
            renderer = (MassageRenderer) Class.forName(rendererClass).getDeclaredConstructor().newInstance();
            provider = (MassageProvider) Class.forName(providerClass).getDeclaredConstructor().newInstance();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    static {
        instance = new MassageSupportFactory();
    }

    public static MassageSupportFactory getInstance(){
        return instance;
    }

    public MassageRenderer getMassageRenderer(){
        return renderer;
    }

    public MassageProvider getMassageProvider(){
        return provider;
    }



}
