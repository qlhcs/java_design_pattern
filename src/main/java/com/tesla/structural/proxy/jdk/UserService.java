package com.tesla.structural.proxy.jdk;

/**
 * 目标类和代理类的共同接口
 */
public interface UserService {

    void create();

    void update();

    void read();

    void delete();

}
