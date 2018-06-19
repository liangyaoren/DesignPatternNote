package com.notejava.factory.simple;

/**
 * @author lyle 2018/6/19 11:07.
 */
public class Demo {
    public static void main(String[] args) {
        LogFactory logFactory = new LogFactory();
        Log fileLog = logFactory.createLog("fileLog");
        if (fileLog != null)
            fileLog.write();
        Log databaseLog = logFactory.createLog("databaseLog");
        if (databaseLog != null)
            databaseLog.write();
    }
}
