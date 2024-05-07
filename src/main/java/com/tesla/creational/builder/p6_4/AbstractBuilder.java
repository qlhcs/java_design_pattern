package com.tesla.creational.builder.p6_4;

/**
 * 抽象建造者类：定义建造方法
 */
public abstract class AbstractBuilder {

    private Computer computer = new Computer();

    public Computer build(){
        return computer;
    }

    // 提供建造方法
    public abstract void setComputer();

}
