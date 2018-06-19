package com.notejava.factory.abstraction;

/**
 * @author lyle 2018/6/19 15:45.
 */
public interface AbstractFactory {
    WashingMachine createWashingMachine();
    AirConditioner createAirConditioner();
}
