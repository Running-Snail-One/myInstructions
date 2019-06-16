package com.com.decorator;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/16 14:12
 * @modified By：
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public int getSize() {
        return 0;
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }

}
