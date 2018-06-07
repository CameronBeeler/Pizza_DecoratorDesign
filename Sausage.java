package com.company;

class Sausage extends PizzaIngredients {
    Pizza pizza;

    Sausage(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Italian Sausage";
    }

    @Override
    double cost() {
        return pizza.cost() + 1.25;
    }

}
