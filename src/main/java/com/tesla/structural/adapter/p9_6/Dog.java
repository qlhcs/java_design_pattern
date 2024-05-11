package com.tesla.structural.adapter.p9_6;

public class Dog implements DogInterface{

    @Override
    public void wang() {
        System.out.println("汪～");
    }

    @Override
    public void action() {
        System.out.println("run");
    }

}
