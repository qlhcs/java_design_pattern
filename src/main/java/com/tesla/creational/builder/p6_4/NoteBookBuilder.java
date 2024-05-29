package com.tesla.creational.builder.p6_4;

public class NoteBookBuilder extends AbstractBuilder {

    @Override
    public void buildCPU() {
        System.out.println("build notebook cpu successful");
    }

    @Override
    public void buildMemory() {
        System.out.println("build notebook memory successful");
    }

    @Override
    public void buildHardDisk() {
        System.out.println("build notebook hardDisk successful");
    }

    @Override
    public void buildMainBoard() {
        System.out.println("build notebook mainBoard successful");
    }

    @Override
    public void buildDisplayer() {
        System.out.println("build notebook displayer successful");
    }

}
