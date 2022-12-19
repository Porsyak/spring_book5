package com.example.ch3;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class FormatMassageReplacer implements MethodReplacer {

    @Override
    public Object reimplement(Object argO, Method method, Object[] objects) throws Throwable {
        if (isFormatMethod(method)) {
            String msg = (String) argO;
            return "<h2>" + msg + "</h2>";
        } else {
            throw new IllegalArgumentException();
        }
    }

    public boolean isFormatMethod(Method method) {
        if (method.getParameterTypes().length != 1) {
            return false;
        }

        if (!("formatMassage".equals(method.getName()))) {
            return false;
        }

        if (method.getReturnType() != String.class) {
            return false;
        }

        return method.getParameterTypes()[0] == String.class;
    }
}
