package com.tesla.creational.singleton;

/**
 * 单例模式 - 懒汉式 - 采用DCL（Double Check Lock）
 */
public class LazySingleton {

    /**
     * volatile：防止指令重排序
     * new对象不是原子性操作，创建对象的步骤：
     * 1.分配内存空间；
     * 2.执行构造方法，初始化对象；
     * 3.把对象指向这个内存空间。
     *
     *  涉及指令重排：
     *  我们期望顺序是 123 ，但底层可能执行的是 132 ；
     *  单线程是可以的。
     *  多线程的话，A线程执行完13，此时B线程进来，会认为对象已存在，直接return（因为对象已经指向内存空间了）。
     *  但是此时对象还没有完成构造，B线程拿到没有构造好的对象，往下执行就可能出异常了
     **/
    private static volatile LazySingleton lazySingleton = null;

    private LazySingleton(){}

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }


}
