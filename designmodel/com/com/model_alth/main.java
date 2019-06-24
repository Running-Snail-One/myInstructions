package com.com.model_alth;

import javax.swing.*;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/24 20:58
 * @modified By：
 */
public class main {
    public static void main(String[] args) {
        System.out.println("我想喝手磨咖啡！！！！！");
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println("我想喝绿茶！！！");
        Tea tea = new Tea();
        tea.prepareRecipe();
        new JFrame();
    }
}
