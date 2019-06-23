package com.com.factory;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/20 20:18
 * @modified By：
 */
public class NYPizzaIngredienFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new Dough();
    }

    @Override
    public Sauce createSauce() {
        return new Sauce();
    }

    @Override
    public Cheese createCheese() {
        return new Cheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Veggies()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni();
    }

    @Override
    public Clams createClam() {
        return new Clams();
    }
}
