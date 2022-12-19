package com.example.ch4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.lang.NonNull;

import java.io.File;
import java.io.IOException;

public class ResourceDemo {
    public static void main(String[] args) throws IOException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext();
        File file = new File("test", "txt");
        file.deleteOnExit();
        Resource res1 = ctx.getResource("file://" + file.getPath());
        displayInfo(res1);
        Resource res2 = ctx.getResource("classpath:test.txt");
        displayInfo(res2);
        Resource res3 = ctx.getResource("http://www.google.com");
        displayInfo(res3);

    }

    private static void displayInfo(Resource resource) throws IOException {
        System.out.println(resource.getClass());
        System.out.println(resource.getURL().getContent());
        System.out.println("");
    }
}
