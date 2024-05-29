package com.tesla.creational.builder.p6_4;

public class Test {

    public static void main(String[] args) {
        Director director = new Director();
        director.setAbstractBuilder(new ServerBuilder());
        director.construct();

    }

}
