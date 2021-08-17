package com.company.Decorator;

public class Tall extends SizeDecorator{
    Beverage beverage;

    public Tall(Beverage beverage) { this.beverage = beverage;}

    public String getDescription() {
        return beverage.getDescription() + ", Tall";
    }

    public double cost(){
        return 10 + beverage.cost();
    }
}
