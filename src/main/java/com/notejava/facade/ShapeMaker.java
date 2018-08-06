package com.notejava.facade;

/**
 * @author lyle 2018/6/22 16:34.
 */
public class ShapeMaker {
    protected Shape circle;
    protected Shape rectangle;
    protected Shape square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle() {

    }

    public void drawRectangle() {

    }

    public void drawSquare() {

    }
}
