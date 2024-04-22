package com.tesla.creational.simpleFactory;

public class UnsupportedShapeException extends RuntimeException {

    public UnsupportedShapeException(){};

    public UnsupportedShapeException(String msg){
        super(msg);
    }


}
