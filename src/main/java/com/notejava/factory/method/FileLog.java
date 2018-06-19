package com.notejava.factory.method;

/**
 * @author lyle 2018/6/19 10:22.
 */
public class FileLog implements Log {
    public void write() {
        System.out.println("write to file");
    }
}
