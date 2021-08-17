package com.company.Factory;

public class PizzaTestDrive {
    public static void main(String[] args){
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore seStore = new SeoulPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = seStore.orderPizza("cheese");
        System.out.println("JiWoo ordered a " + pizza.getName() + "\n");
    }
}