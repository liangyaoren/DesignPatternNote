package com.notejava.builder;

/**
 * @author lyle 2018/6/21 10:03.
 */
public abstract class ColdDrink implements Item {
    public Packing packing() {
        return new Bottle();
    }
}
