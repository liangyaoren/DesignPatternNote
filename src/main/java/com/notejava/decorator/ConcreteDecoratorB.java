package com.notejava.decorator;

/**
 * @author lyle 2018/6/22 15:43.
 */
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        //doSomething
        component.operation();
        //doSomething
    }
}
