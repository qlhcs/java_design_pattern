package com.tesla.behavioral.strategy.p24_5;

public class Client {

    public static void main(String[] args) {
        Context context = new Context();
        context.setEncryptStrategy(new KeshaEncryptStrategy());
        context.encrypt();

    }


}
