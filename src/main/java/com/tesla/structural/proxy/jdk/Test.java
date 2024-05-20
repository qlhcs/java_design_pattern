package com.tesla.structural.proxy.jdk;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class Test {

    public static void testProxy() {
        UserServiceImpl userService = new UserServiceImpl();
        UserService service = (UserService) Proxy.newProxyInstance(UserServiceImpl.class.getClassLoader(),
                UserServiceImpl.class.getInterfaces(),
                new CustomInvocationHandler(userService));
        service.create();
    }

    public static void testClass() throws Exception {
        // ========== 添加了这行代码之后，可以将在项目目录下保存动态创建的class文件 ==========
        System.getProperties().put("jdk.proxy.ProxyGenerator.saveGeneratedFiles", "true");

        // ========== 代理类class相关信息 ==========
        Class<?> proxyClass = Proxy.getProxyClass(UserServiceImpl.class.getClassLoader(),
                UserServiceImpl.class.getInterfaces());
        System.out.println(proxyClass.getName());
        // 代理类所有方法
        for (Method method : proxyClass.getDeclaredMethods()) {
            System.out.println(method.getDeclaringClass() + "." + method.getName() + "()");
        }
        // 代理类所有构造函数
        System.out.println(Arrays.toString(proxyClass.getConstructors()));

        // ========== 通过反射创建代理类对象 ==========
        // 获取$Proxy0(InvocationHandler handler)构造方法
        Constructor<?> constructor = proxyClass.getConstructor(InvocationHandler.class);
        UserService userService = (UserService) constructor.newInstance(new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) {
                System.out.println("===== enter enhanced class invoke method =====");
                System.out.println(proxy.getClass());
                System.out.println(method.getDeclaringClass() + "." + method.getName() + "()");
                return null;
            }
        });
        userService.create();
    }

    public static void main(String[] args) throws Exception {

        testClass();


    }

}
