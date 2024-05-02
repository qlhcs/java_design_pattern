package com.tesla.creational.singleton;

public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    private LazySingleton(){}

    synchronized public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }


}
