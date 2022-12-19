package com.example.ch2.hello_world;

import com.example.ch2.decompiled.MassageProvider;
import com.example.ch2.decompiled.MassageRenderer;
import com.example.ch2.decompiled.MassageSupportFactory;

public class HelloWorld {
    public static void main(String[] args) {
        MassageRenderer mr = MassageSupportFactory.getInstance().getMassageRenderer();
        MassageProvider mp = MassageSupportFactory.getInstance().getMassageProvider();
        mr.setMassageProvider(mp);
        mr.render();
    }

}
