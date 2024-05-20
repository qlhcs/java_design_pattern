package com.tesla.structural.flyweight.p14_4;

public class Collector extends NetworkDevice {

    private String type;

    public Collector() {
        type = "collector";
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void use(String port) {
        System.out.println("device: " + getType() + "  " + "use port: " + port);
    }

}
