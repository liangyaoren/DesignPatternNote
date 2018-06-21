package com.notejava.builder;

/**
 * @author lyle 2018/6/21 9:09.
 */
public class Demo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println(nonVegMeal.getCost());
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println(vegMeal.getCost());
    }
}
