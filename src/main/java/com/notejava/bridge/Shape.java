package com.notejava.bridge;

/**
 * @author lyle 2018/6/22 14:30.
 */
public abstract class Shape {
    protected DrawApi drawApi;

    public Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
