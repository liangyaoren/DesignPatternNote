package com.notejava.decorator;

/**
 * @author lyle 2018/6/22 15:42.
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        //doSomething
        component.operation();
        ////doSomething
    }
}
