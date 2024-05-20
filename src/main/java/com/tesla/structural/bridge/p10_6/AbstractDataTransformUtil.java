package com.tesla.structural.bridge.p10_6;

public abstract class AbstractDataTransformUtil {

    private DataBaseInterface dataBase;

    public abstract void transform();

    public void setDataBase(DataBaseInterface dataBase) {
        this.dataBase = dataBase;
    }

    public DataBaseInterface getDataBase() {
        return this.dataBase;
    }

}
