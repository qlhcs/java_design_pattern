package com.tesla.structural.decorator.p12_4;

/**
 * 抽象装饰类
 */
public abstract class AbstractEnhancePhone extends Phone {

    private Phone phone;

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

}
