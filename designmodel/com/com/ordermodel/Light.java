package com.com.ordermodel;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/22 22:17
 * @modified By：
 */
public class Light {
    String des;

    public Light(String str) {
        this.des = str;
    }

    public void on() {
        System.out.println(des + "灯,已经打开了....");
    }

    public void off() {
        System.out.println(des + "灯,熄灭了...");
    }
}
