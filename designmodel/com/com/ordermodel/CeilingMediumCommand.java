package com.com.ordermodel;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/23 0:23
 * @modified By：
 */
public class CeilingMediumCommand implements Command {
    CeilingFan ceilingFan;
    int preSpeed;

    public CeilingMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void excute() {
        preSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    @Override
    public void undo() {
        if (preSpeed == CeilingFan.getHIGH()) {
            ceilingFan.high();
        } else if (preSpeed == CeilingFan.getMEDIUM()) {
            ceilingFan.medium();
        } else if (preSpeed == CeilingFan.getLOW()) {
            ceilingFan.low();
        }
    }
}
