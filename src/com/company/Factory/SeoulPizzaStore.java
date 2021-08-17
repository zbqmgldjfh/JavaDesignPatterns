package com.company.Factory;

public class SeoulPizzaStore extends PizzaStore {
    Pizza createPizza(String item){
        if(item.equals("cheese")){
            return new SeoulStyleCheesePizza();
        }else if(item.equals("pepperoni")){
            return new SeoulStylePepperoniPizza();
        }
    }
}