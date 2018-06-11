package com.notejava.singleton.hungry;

/**
 * 饿汉式
 * instance 在类加载时就完成了初始化，所以类加载慢，对象获取速度快。
 *
 * @author lyle 2018/6/11 9:37.
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}
