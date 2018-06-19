package com.notejava.factory.abstraction;

/**
 * @author lyle 2018/6/19 15:45.
 */
public class HairFactory implements AbstractFactory {
    public WashingMachine createWashingMachine() {
        return new HairWashingMachine();
    }

    public AirConditioner createAirConditioner() {
        return new HairAirConditioner();
    }
}
