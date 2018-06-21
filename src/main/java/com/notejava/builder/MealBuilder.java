package com.notejava.builder;

/**
 * @author lyle 2018/6/21 10:24.
 */
public class MealBuilder {
    public Meal prepareVegMeal() {
        Burger burger = new VegBurger();
        ColdDrink coldDrink = new Pepsi();
        Meal meal = new Meal();
        meal.addItem(burger);
        meal.addItem(coldDrink);
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Burger burger = new ChickenBurger();
        ColdDrink coldDrink = new Coke();
        Meal meal = new Meal();
        meal.addItem(burger);
        meal.addItem(coldDrink);
        return meal;
    }
}
