package com.tesla.structural.decorator.p12_4;

/**
 * 被装饰类 - 普通手机
 */
public class SimplePhone extends Phone {

    @Override
    public void callIn() {
        System.out.println("发声");
    }

}
