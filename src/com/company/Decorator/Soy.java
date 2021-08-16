package com.company.Decorator;

public class Soy extends Beverage {
    Beverage beverage;

    public Soy(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }

    public double cost(){
        return 0.15 + beverage.cost();
    }
}
