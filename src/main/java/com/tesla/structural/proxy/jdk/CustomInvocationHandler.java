package com.tesla.structural.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 增强类接口
 */
public class CustomInvocationHandler implements InvocationHandler {

    /**
     * 目标对象
     */
    private Object target;

    public CustomInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * 增强方法
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("====== 方法开始 ======");
        Object result = method.invoke(target, args);
        System.out.println("====== 方法结束 ======");
        return result;
    }

}
