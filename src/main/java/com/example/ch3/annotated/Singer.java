package com.example.ch3.annotated;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Award(prize = {"grammy","platinum disk"})
public class Singer {

    private String lyric = "12345QWER";

    public void sing(){
        System.out.println(lyric);
    }
}
