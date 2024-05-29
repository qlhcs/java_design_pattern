package com.tesla.creational.builder.p6_4;

public class ServerBuilder extends AbstractBuilder {

    @Override
    public void buildCPU() {
        System.out.println("build server cpu successful");
    }

    @Override
    public void buildMemory() {
        System.out.println("build server memory successful");
    }

    @Override
    public void buildHardDisk() {
        System.out.println("build server hardDisk successful");
    }

    @Override
    public void buildMainBoard() {
        System.out.println("build server mainBoard successful");
    }

}
