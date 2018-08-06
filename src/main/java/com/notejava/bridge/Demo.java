package com.notejava.bridge;

/**
 * @author lyle 2018/6/22 14:20.
 */
public class Demo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }
}
