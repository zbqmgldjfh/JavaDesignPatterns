package com.company.Factory;

public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String item){
        if(item.equals("cheese")){
            return new NYStyleCheesePizza();
        }else if(item.equals("pepperoni")){
            return new NYStylePepperoniPizza();
        }
    }
}