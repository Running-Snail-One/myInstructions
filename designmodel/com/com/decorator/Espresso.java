package com.com.decorator;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/16 14:04
 * 浓缩咖啡
 * @modified By：
 */
public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }
    @Override
    public double cost() {
        return 1.99;
    }


}
