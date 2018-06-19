package com.notejava.factory.simple;

/**
 * @author lyle 2018/6/19 11:05.
 */
public class LogFactory {
    public Log createLog(String logType) {
        if ("fileLog".equals(logType)) {
            return new FileLog();
        }
        if ("databaseLog".equals(logType)) {
            return new DatabaseLog();
        }
        return null;
    }
}
