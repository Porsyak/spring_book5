package com.example.ch4.custom;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.support.GenericXmlApplicationContext;

@Getter
@Setter
public class CustomerEditorExample {

    private FullName name;

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("app-context-02.xml");
        ctx.refresh();
        CustomerEditorExample bean = (CustomerEditorExample) ctx.getBean("exampleBean");
        System.out.println(bean.getName());
        ctx.close();
    }

}
