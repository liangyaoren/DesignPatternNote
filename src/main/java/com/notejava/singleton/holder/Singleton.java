package com.notejava.singleton.holder;

/**
 * 静态内部类单例模式
 * 类加载的时候不会初始化 instance，只有第一次调用 getInstance()，才加载内部类 SingletonHolder，并初始化 instance，既线程安全又保证唯一。
 * @author lyle 2018/6/11 10:07.
 */
public class Singleton {
    private Singleton() {}

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }
}
