package com.tesla.structural.bridge.p10_6;

public class TxtDataTransformUtil extends AbstractDataTransformUtil {

    @Override
    public void transform() {
        DataBaseInterface dataBase = getDataBase();
        dataBase.getData();
        System.out.println("txt transform over");
    }

}
