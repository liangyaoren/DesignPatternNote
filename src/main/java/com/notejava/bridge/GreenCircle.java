package com.notejava.bridge;

/**
 * @author lyle 2018/6/22 14:38.
 */
public class GreenCircle implements DrawApi {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", "+ y + "]");
    }
}
