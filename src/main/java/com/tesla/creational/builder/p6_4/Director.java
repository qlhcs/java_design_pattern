package com.tesla.creational.builder.p6_4;

/**
 * 指挥者类：定义组装过程
 */
public class Director {

    private AbstractBuilder abstractBuilder;

    public void setAbstractBuilder(AbstractBuilder builder) {
        this.abstractBuilder = builder;
    }

    public Computer construct() {
        abstractBuilder.setComputer();
        return abstractBuilder.build();
    }


}
