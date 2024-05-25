package com.tesla.behavioral.strategy.p24_5;

public class Context {

    private AbstractEncryptStrategy abstractEncryptStrategy;

    public void setEncryptStrategy(AbstractEncryptStrategy abstractEncryptStrategy) {
        this.abstractEncryptStrategy = abstractEncryptStrategy;
    }

    public void encrypt() {
        System.out.println("before encrypt work ...");
        abstractEncryptStrategy.encrypt();
        System.out.println("after encrypt work ...");
    }

}
