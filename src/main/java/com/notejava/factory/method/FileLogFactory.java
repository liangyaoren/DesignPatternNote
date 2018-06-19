package com.notejava.factory.method;

/**
 * @author lyle 2018/6/19 10:21.
 */
public class FileLogFactory implements LogFactory {
    public Log createLog() {
        return new FileLog();
    }
}
