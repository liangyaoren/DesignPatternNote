package com.notejava.factory.method;

/**
 * @author lyle 2018/6/19 10:23.
 */
public class DatabaseLog implements Log {
    public void write() {
        System.out.println("write to database");
    }
}
