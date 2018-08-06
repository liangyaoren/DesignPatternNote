package com.notejava.proxy;

/**
 * @author lyle 2018/6/25 9:58.
 */
public class Proxy implements Subject {
    private RealSubject realSubject;

    public Proxy() {
        realSubject = new RealSubject();
    }

    @Override
    public void request() {
        System.out.println("Proxy request");
        //before request;
        realSubject.request();
        //after request;
    }
}
