package com.tesla.structural.adapter.p9_6;

public class Cat implements CatInterface {

    @Override
    public void miao() {
        System.out.println("喵～");
    }

    @Override
    public void catchMouse() {
        System.out.println("抓老鼠");
    }

}
