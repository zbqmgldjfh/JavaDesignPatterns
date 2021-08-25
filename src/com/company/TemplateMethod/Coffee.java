package com.company.TemplateMethod;

public abstract class Coffee extends CaffeineBeverage {
    public void brewCoffeeGrinds() {
        System.out.println("필터를 통해 커피를 우려내는 중");
    }
    public void addSugarAndMilk() {
        System.out.println("설탕과 우유를 추가하는 중");
    }
}
