package com.company;

public class ChicagoPie extends Pizza{
    public ChicagoPie() {
        this.description = "Chicago Pizza";
    }

    @Override
    String getDescription() {
        return description;
    }

    @Override
    double cost() {
        return 7.95;
    }
}
