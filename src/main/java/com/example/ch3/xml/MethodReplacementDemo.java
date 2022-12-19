package com.example.ch3.xml;

import com.example.ch3.ReplacementTarget;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.util.StopWatch;

public class MethodReplacementDemo {
    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("app-context-xml.xml");
        ctx.refresh();

        ReplacementTarget replacementTarget = (ReplacementTarget) ctx.getBean("replacementTarget");
        ReplacementTarget standardTarget = (ReplacementTarget) ctx.getBean("standardTarget");

        displayInfo(replacementTarget);
        displayInfo(standardTarget);
    }

    public static void displayInfo(ReplacementTarget target){
        System.out.println(target.formatMassage("Thanks for playing, try again"));
        StopWatch stopWatch = new StopWatch();
        stopWatch.start("perfTest");
        for (int i = 0; i < 1_000_000; i++) {
            String out = target.formatMassage("No filter in my head");
            System.out.println(out);
            stopWatch.stop();
            stopWatch.getTotalTimeSeconds();
        }
    }



}
