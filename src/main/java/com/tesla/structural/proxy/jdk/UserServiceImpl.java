package com.tesla.structural.proxy.jdk;

/**
 * 目标类
 */
public class UserServiceImpl implements UserService {

    @Override
    public void create() {
        System.out.println("create...");
    }

    @Override
    public void update() {
        System.out.println("update...");
    }

    @Override
    public void read() {
        System.out.println("read...");
    }

    @Override
    public void delete() {
        System.out.println("delete...");
    }

}
