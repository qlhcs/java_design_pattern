package com.tesla.structural.decorator.p12_4;

public class ComplexPhone extends AbstractEnhancePhone {

    @Override
    public void callIn() {
        System.out.println("发声");
        System.out.println("振动");
        System.out.println("闪烁");
    }

}
