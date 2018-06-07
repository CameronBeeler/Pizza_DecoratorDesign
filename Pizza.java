package com.company;

abstract class Pizza {

    public static void main(String[] args) {
        Pizza pizza = new NewYorkDeepDish();
        PizzaIngredients is     = new Sausage(pizza);
        PizzaIngredients pp     = new Pepperoni(is);
        PizzaIngredients cheese = new Cheese(pp);

        System.out.println( cheese.getDescription() + " at cost " + cheese.cost());
    }
    String description = "unknown pizza type";

    abstract String getDescription();
    abstract double cost();
}
