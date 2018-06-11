package com.notejava.singleton.dcl;

/**
 * 双重检测懒汉式（DCL）
 * DCL 模式虽然在一定程度解决了线程安全和资源的消耗问题，但某些情况下也会有DCL失效问题。
 * @author lyle 2018/6/11 9:58.
 */
public class Singleton {
    private volatile static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
