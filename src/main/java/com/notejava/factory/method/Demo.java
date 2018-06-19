package com.notejava.factory.method;

/**
 * @author lyle 2018/6/19 10:18.
 */
public class Demo {
    public static void main(String[] args) {
        FileLogFactory fileLogFactory = new FileLogFactory();
        Log fileLog = fileLogFactory.createLog();
        fileLog.write();

        DatabaseLogFactory databaseLogFactory = new DatabaseLogFactory();
        Log databaseLog = databaseLogFactory.createLog();
        databaseLog.write();
    }
}
