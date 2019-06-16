package com.com.decorator;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/16 14:00
 * 饮料基类
 * @modified By：
 */
public abstract class Beverage {
    String description = "Unknown Beverage";
    static final  int TALL = 1;
    static final int GRANDE = 2;
    static final int VENTI = 3;
//    private int size;
    int size = 3;//默认大杯
    public String getDescription() {
        return description;
    }
    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size = size;
    }
    public abstract double cost();

}
