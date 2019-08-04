package com.com.ordermodel;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/23 0:10
 * @modified By：
 */
public class CeilingFanHighCommand implements Command {
    CeilingFan ceilingFan;
    int preSpeed;

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void excute() {
        preSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    @Override
    public void undo() {
        if (preSpeed == CeilingFan.getHIGH()) {
            ceilingFan.high();
        } else if (preSpeed == CeilingFan.getMEDIUM()) {
            ceilingFan.medium();
        } else if (preSpeed == CeilingFan.getLOW()) {
            ceilingFan.low();
        } else if (preSpeed == CeilingFan.getOFF()) {
            ceilingFan.off();
        }
    }
}
