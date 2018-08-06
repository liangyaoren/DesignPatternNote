package com.notejava.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author lyle 2018/6/25 11:16.
 */
public class ObserverB implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("ObserverB do update");
    }
}
