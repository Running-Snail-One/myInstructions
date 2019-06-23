package com.com.factory;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/20 20:13
 * @modified By：
 */
public interface PizzaIngredientFactory {
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClam();

}