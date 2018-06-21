package com.notejava.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lyle 2018/6/21 10:13.
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        return items.stream().map(item -> item.price()).reduce(Float::sum).get();
    }
}
