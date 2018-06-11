package com.notejava.singleton.secure;

/**
 * 线程安全的懒汉式
 * 这种写法虽然线程安全，但每次调用都进行同步，效率低。
 * @author lyle 2018/6/11 9:50.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
