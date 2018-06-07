package com.company;

public class Mushrooms extends PizzaIngredients {
    Pizza pizza;

    public Mushrooms(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Mushrooms";
    }

    @Override
    double cost() {
        return pizza.cost() + 0.75;
    }
}
