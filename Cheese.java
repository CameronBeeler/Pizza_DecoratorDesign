package com.company;

class Cheese extends PizzaIngredients {
    Pizza pizza;

    Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    @Override
    double cost() {
        return pizza.cost() + .50;
    }

}
