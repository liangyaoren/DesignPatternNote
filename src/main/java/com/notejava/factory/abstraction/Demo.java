package com.notejava.factory.abstraction;

/**
 * @author lyle 2018/6/19 15:45.
 */
public class Demo {
    public static void main(String[] args) {
        HairFactory hairFactory = new HairFactory();
        hairFactory.createAirConditioner().makeAir();
        hairFactory.createWashingMachine().wash();
        MideaFactory mideaFactory = new MideaFactory();
        mideaFactory.createAirConditioner().makeAir();
        mideaFactory.createWashingMachine().wash();
    }
}
