package com.notejava.decorator;

/**
 * @author lyle 2018/6/22 15:36.
 */
public abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public abstract void operation();
}
