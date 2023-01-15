package com.example.ch5;

import org.springframework.aop.framework.ProxyFactory;

public class SecurityDemo {
    public static void main(String[] args) {
        SecurityManager mgr = new SecurityManager();
        SecureBean bean = getSecurirtyBean();
        mgr.login("Ivan", "pwd");
        bean.writeSecureMessage();
        mgr.logout();
    }

    private static SecureBean getSecurirtyBean() {
        SecureBean target = new SecureBean();
        SecurityAdvice advice = new SecurityAdvice();
        ProxyFactory proxy = new ProxyFactory();
        proxy.setTarget(target);
        proxy.addAdvice(advice);
        return (SecureBean) proxy.getProxy();
    }
}
