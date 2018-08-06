package com.notejava.facade;

/**
 * @author lyle 2018/6/22 16:38.
 */
public class Demo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
