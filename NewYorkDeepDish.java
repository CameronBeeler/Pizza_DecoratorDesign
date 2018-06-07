package com.company;

public class NewYorkDeepDish extends Pizza {
    public NewYorkDeepDish() {
        this.description = "New York Deep Dish Pan Pizza";
    }

    @Override
    String getDescription() {
        return description;
    }

    @Override
    double cost() {
        return 9.75;
    }

    @Override
    public String toString() {
        return "NewYorkDeepDish{" +
                "Base Cost=$" + cost() +
                '}';
    }
}
