package com.example;

import com.example.ch5.Agent;
import com.example.ch5.AgentDecorator;
import org.springframework.aop.framework.ProxyFactory;

public class AgentAOPDemo {
    public static void main(String[] args) {
        Agent agent = new Agent();
        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new AgentDecorator());
        pf.setTarget(agent);
        Agent proxy = (Agent) pf.getProxy();
        agent.speak();
        System.out.println("");
        proxy.speak();

    }
}
