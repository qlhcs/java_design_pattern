package com.tesla.creational.builder.p6_4;

public class DesktopComputerBuilder extends AbstractBuilder {

    @Override
    public void buildCPU() {
        System.out.println("build desktopComputer cpu successful");
    }

    @Override
    public void buildMemory() {
        System.out.println("build desktopComputer memory successful");
    }

    @Override
    public void buildHardDisk() {
        System.out.println("build desktopComputer hardDisk successful");
    }

    @Override
    public void buildMainBoard() {
        System.out.println("build desktopComputer mainBoard successful");
    }

    @Override
    public void buildDisplayer() {
        System.out.println("build desktopComputer displayer successful");
    }
    
}
