package com.com.ordermodel;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/22 22:23
 * @modified By：
 */
public class RemoteController {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light livingRoomLight = new Light("起居室");
        Light kitchenLight = new Light("厨房");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        simpleRemoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        simpleRemoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);


        simpleRemoteControl.onButtonWasPressed(0);//开灯
        simpleRemoteControl.offButtonWasPressed(0);//关灯


        simpleRemoteControl.undoButtonWasPressed();//撤销关灯按钮

        simpleRemoteControl.offButtonWasPressed(0);
        simpleRemoteControl.undoButtonWasPressed();

        System.out.println(simpleRemoteControl);
        simpleRemoteControl.undoButtonWasPressed();
//        simpleRemoteControl.onButtonWasPressed(1);
//        simpleRemoteControl.offButtonWasPressed(1);

    }
}
