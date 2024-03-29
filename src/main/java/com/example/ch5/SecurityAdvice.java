package com.example.ch5;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class SecurityAdvice implements MethodBeforeAdvice {

    private SecurityManager securityManager;

    public SecurityAdvice() {
    }

    public SecurityAdvice(SecurityManager securityManager) {
        this.securityManager = securityManager;
    }

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        UserInfo user = securityManager.getLoggedOnUser();
        if (user == null){
            System.out.println("No user authenticated ");
            throw new SecurityException("You must login ");
        }else if ("Ivan".equals(user.getUserName())){
            System.out.println("Logged in user is Ivan - OKAY!");
        }else {
            System.out.println("Logged in user is " + user.getUserName() + " NOT GOOD");
        }
    }
}
