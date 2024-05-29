package com.tesla.creational.builder.p6_4;

/**
 * 抽象建造者类：定义建造方法
 */
public abstract class AbstractBuilder {

    private Computer computer = new Computer();

    public Computer buildComputer(){
        return this.computer;
    }

    // 提供建造方法
    public abstract void buildCPU();
    public abstract void buildMemory();
    public abstract void buildHardDisk();
    public abstract void buildMainBoard();
    // 有的电脑比如服务器，不需要显示器
    public void buildDisplayer() {};

}
