package com.example.ch5;

import lombok.extern.log4j.Log4j2;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.lang.reflect.Method;

@Log4j2
public class SimpleThrowsAdvice implements ThrowsAdvice {
    public static void main(String[] args) {
        ErrorBean errorBean = new ErrorBean();
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(errorBean);
        pf.addAdvice(new SimpleThrowsAdvice());

        ErrorBean proxy = (ErrorBean) pf.getProxy();
        try {
            proxy.errorProneMethod();
        } catch (Exception ignored) {
        }
        try {
            proxy.otherErrorProneMethod();
        } catch (Exception ignored) {
        }
    }

    public void afterThrowing(Exception ex) throws Throwable{
        log.info("***");
        log.info("Generic Exception Capture");
        log.info("Caught: " + ex.getClass().getName());
        log.info("\n");
    }

    public void afterThrowing(Method method,
                              Object[] args,
                              Object target,
                              IllegalArgumentException ex) throws Throwable{
        log.info("***");
        log.info("IllegalArgumentException Capture");
        log.info("Caught: " + ex.getClass().getName());
        log.info("Method: " + method.getName());
        log.info("***\n");
    }


}
