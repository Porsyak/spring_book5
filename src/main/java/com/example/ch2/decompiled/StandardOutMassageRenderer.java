package com.example.ch2.decompiled;

public class StandardOutMassageRenderer implements MassageRenderer {

    private MassageProvider massageProvider;

    @Override
    public void render() {
        if (massageProvider == null){
            throw new RuntimeException();
        }
        System.out.println(massageProvider.getMassage());
    }

    @Override
    public void setMassageProvider(MassageProvider provider) {
        this.massageProvider = provider;

    }

    @Override
    public MassageProvider getMassageProvider() {
        return this.massageProvider;
    }
}
