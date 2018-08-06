package com.notejava.observer;

import java.util.Observable;

/**
 * @author lyle 2018/6/25 11:28.
 */
public class ObserverManager extends Observable {
    public ObserverManager() {
        init();
    }

    public void init() {
        this.deleteObservers();
        this.addObserver(new ObserverA());
        this.addObserver(new ObserverB());
    }

    public void update() {
        this.setChanged();
        this.notifyObservers();
    }
}
