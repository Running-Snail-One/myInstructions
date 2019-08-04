package com.com.ordermodel;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/23 0:35
 * @modified By：
 */
public class CeilingFanOff implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOff(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void excute() {
        ceilingFan.speed = CeilingFan.getOFF();
        System.out.println("风扇已经关闭.....");
    }

    @Override
    public void undo() {

    }
}
