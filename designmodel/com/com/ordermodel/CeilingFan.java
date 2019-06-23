package com.com.ordermodel;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/23 0:07
 * @modified By：
 */
public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    String location;
    int speed;

    public CeilingFan(String location) {
        this.location = location;
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println(speed + "级风速");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println(speed + "级风速");

    }

    public void low() {
        speed = LOW;
        System.out.println(speed + "级风速");
    }

    public void off() {
        speed = OFF;
    }

    public static int getHIGH() {
        return HIGH;
    }

    public static int getMEDIUM() {
        return MEDIUM;
    }

    public static int getLOW() {
        return LOW;
    }

    public static int getOFF() {
        return OFF;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
