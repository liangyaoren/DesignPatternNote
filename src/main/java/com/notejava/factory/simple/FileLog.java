package com.notejava.factory.simple;

/**
 * @author lyle 2018/6/19 10:22.
 */
public class FileLog implements Log {
    public void write() {
        System.out.println("write to file");
    }
}
