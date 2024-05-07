package com.tesla.creational.prototype.p7_4;

import java.io.*;

public class DataChart implements Serializable {

    /**
     * 编号
     */
    private String number;

    /**
     * 颜色
     */
    private String color;

    /**
     * 数据集
     */
    private DataSet dataSet;

    public DataChart deepClone() throws Exception {
        // 说明：对象流采用了装饰器设计模式，此处用 字节数组流 做序列化
        // 对象输出流 序列化
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);
        // 对象输入流 反序列化（初始化时将输出流作为数据来源）
        ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
        return (DataChart) objectInputStream.readObject();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public DataSet getDataSet() {
        return dataSet;
    }

    public void setDataSet(DataSet dataSet) {
        this.dataSet = dataSet;
    }
}
