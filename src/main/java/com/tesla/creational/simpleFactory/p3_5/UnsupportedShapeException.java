package com.tesla.creational.simpleFactory.p3_5;

public class UnsupportedShapeException extends RuntimeException {

    public UnsupportedShapeException(){};

    public UnsupportedShapeException(String msg){
        super(msg);
    }


}
