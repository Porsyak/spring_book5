package com.example.ch3;

import org.springframework.stereotype.Component;

@Component
public class Singer {
    private String lyric = "qwerty";
    public void sing(){
        System.out.println(lyric);
    }
}
