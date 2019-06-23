package com.com.factory;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/17 21:20
 * @modified By：
 */
public class NYClamPizza extends Pizza {

    PizzaIngredientFactory pizzaIngredientFactory;

    public NYClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Prepare " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
