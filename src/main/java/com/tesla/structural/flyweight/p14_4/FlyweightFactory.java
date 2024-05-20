package com.tesla.structural.flyweight.p14_4;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private static final FlyweightFactory factory = new FlyweightFactory();

    private static final Map<String, NetworkDevice> cacheMap = new HashMap<>();

    private FlyweightFactory(){}

    public static FlyweightFactory getInstance() {
        return factory;
    }

    public NetworkDevice getFlyWeight(String key) {
        NetworkDevice networkDevice = cacheMap.get(key);
        if (networkDevice == null) {
            if ("switcher".equals(key)) {
                networkDevice = new Switcher();
                cacheMap.put(key, networkDevice);
            } else if ("collector".equals(key)) {
                networkDevice = new Collector();
                cacheMap.put(key, networkDevice);
            }
        }
        return networkDevice;
    }

}
