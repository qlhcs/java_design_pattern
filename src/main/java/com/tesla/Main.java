package com.tesla;

import com.tesla.creational.prototype.p7_4.DataChart;
import com.tesla.creational.prototype.p7_4.DataSet;
import com.tesla.structural.flyweight.p14_4.FlyweightFactory;
import com.tesla.structural.flyweight.p14_4.NetworkDevice;

import java.util.Objects;

public class Main {
    public static void main(String[] args) throws Exception {
        FlyweightFactory factory = FlyweightFactory.getInstance();
        NetworkDevice switcher1 = factory.getFlyWeight("switcher");
        NetworkDevice switcher2 = factory.getFlyWeight("switcher");

        System.out.println(switcher1 == switcher2);

        switcher1.use("8080");

        NetworkDevice collector = factory.getFlyWeight("collector");
        collector.use("8888");

    }

}