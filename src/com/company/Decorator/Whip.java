package com.company.Decorator;

public class Whip extends Beverage{
    Beverage beverage;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", 휘핑크림";
    }

    public double cost(){
        return 0.10 + beverage.cost();
    }
}
