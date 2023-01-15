package com.example.ch4;

public interface MassageRenderer {
    void renderer();
    default void setMassageProvider(MassageProvider provider){
        MassageProvider getMassageProvider;
    }
}
