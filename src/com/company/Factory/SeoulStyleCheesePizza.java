package com.company.Factory;

public class SeoulStyleCheesePizza extends Pizza{
    public SeoulStyleCheesePizza() {
        name = "Seoul Style Sauce and Cheese Pizza";
        dough = "Thin Dough";
        sauce = "Kimchi Sauce";

        toppings.add("spicy Cheese");
    }

    void cut(){
        System.out.println("Cutting the pizza into squate slice");
    }
}