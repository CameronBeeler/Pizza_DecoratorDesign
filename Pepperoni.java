package com.company;

class Pepperoni extends PizzaIngredients {
    Pizza pizza;

    Pepperoni(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    String getDescription() {
        return pizza.getDescription() + ", Pepperoni";
    }

    @Override
    double cost() {
        return pizza.cost() + 1.00;
    }

}
