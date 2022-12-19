package com.example.ch3;

public class ReplacementTarget {

    public String formatMassage(String mgs){
        return "<h1>" + mgs + "<h1>";
    }

    public String formatMassage(Object mgs){
        return "<h1>" + mgs + "<h1>";
    }
}
