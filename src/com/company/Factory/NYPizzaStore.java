package com.company.Factory;

public class NYPizzaStore extends PizzaStore {
    Pizza createPizza(String item){
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(item.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }else if(item.equals("Veggie")){
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        }else if(item.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }else if(item.equals("pepperoni")){
            pizza = new PepproniPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }
    }
}