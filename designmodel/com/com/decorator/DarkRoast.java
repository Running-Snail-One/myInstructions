package com.com.decorator;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/16 14:22
 * @modified By：
 */
public class DarkRoast extends Beverage {
    public DarkRoast(){
        description = "DarkRoast";
    }
    @Override
    public double cost() {
        return 2;
    }

}
