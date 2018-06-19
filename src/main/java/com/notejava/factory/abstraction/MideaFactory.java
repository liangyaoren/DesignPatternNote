package com.notejava.factory.abstraction;

/**
 * @author lyle 2018/6/19 15:48.
 */
public class MideaFactory implements AbstractFactory {
    public WashingMachine createWashingMachine() {
        return new MideaWashingMachine();
    }

    public AirConditioner createAirConditioner() {
        return new MideaAirConditioner();
    }
}
