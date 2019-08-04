package com.com.factory;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/17 22:25
 * @modified By：
 */
public class main {
    public static void main(String[] args) {

        NYStylePizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredienFactory();
        Pizza pizza = nyStylePizzaStore.orderPizza("clam");
        pizza.prepare();
        System.out.println("Ethan ordered a " + pizza.getName());
    }
}
