package com.com.factory;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/17 22:01
 * @modified By：
 */
public class NYStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredienFactory();

        if (type.equals("clam")) {
            pizza = new NYClamPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
//        }else if(type.equals("clam")){
//            return new NYClamPizza();
//        }else if(type.equals("veggie")){
//            return new NYVeggiePizza();
//        }else{
//            return null;
//        }
        }
        return pizza;
    }
}
