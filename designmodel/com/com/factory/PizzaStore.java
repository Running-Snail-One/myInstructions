package com.com.factory;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/17 21:24
 * @modified By：
 */
public abstract class PizzaStore {

    public abstract Pizza createPizza(String type);

    public final Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
//        pizza.bake();
//        pizza.cut();
//        pizza.box();
        return pizza;
    }

}
