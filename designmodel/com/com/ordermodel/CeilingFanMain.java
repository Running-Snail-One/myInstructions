package com.com.ordermodel;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/23 0:27
 * @modified By：
 */
public class CeilingFanMain {

    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();

        CeilingFan ceilingFan = new CeilingFan("起居室");
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingMediumCommand ceilingMediumCommand = new CeilingMediumCommand(ceilingFan);
        CeilingFanOff ceilingFanOff = new CeilingFanOff(ceilingFan);

        simpleRemoteControl.setCommand(0, ceilingFanHighCommand, ceilingFanOff);
        simpleRemoteControl.setCommand(1, ceilingMediumCommand, ceilingFanOff);

        simpleRemoteControl.onButtonWasPressed(0);//高速开启吊扇
//        simpleRemoteControl.offButtonWasPressed(0);//关闭
//        System.out.println(simpleRemoteControl);
//
//        simpleRemoteControl.undoButtonWasPressed();//撤销

        simpleRemoteControl.onButtonWasPressed(1);//中速
//        simpleRemoteControl.offButtonWasPressed(1);//关闭
        simpleRemoteControl.undoButtonWasPressed();

    }


}
