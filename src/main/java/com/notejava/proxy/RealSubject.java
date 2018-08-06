package com.notejava.proxy;

/**
 * @author lyle 2018/6/25 9:58.
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("Real request");
    }
}
