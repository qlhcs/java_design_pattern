package com.tesla.structural.bridge.p10_6;

public class MysqlUtil implements DataBaseInterface{

    @Override
    public void getData() {
        System.out.println("Mysql return data");
    }

}
