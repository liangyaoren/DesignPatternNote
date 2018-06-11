package com.notejava.singleton.lazy;

/**
 * 懒汉式
 * instance 在第一次被用户使用的时候才初始化，实现了懒加载，但线程不安全。
 * @author lyle 2018/6/11 9:45.
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
