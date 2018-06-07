package com.company;

public class HawaiiPie extends Pizza{
    public HawaiiPie() {
        this.description = "Ham and Pineapple, yum!";
    }

    @Override
    String getDescription() {
        return description;
    }

    @Override
    double cost() {
        return 8.75;
    }
}
