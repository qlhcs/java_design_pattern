package com.tesla.structural.flyweight.p14_4;

public class Switcher extends NetworkDevice {

    private String type;

    public Switcher() {
        this.type = "switcher";
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
