package com.com.ordermodel;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/23 10:39
 * @modified By：
 */
public class MacroCommandMain {
    public static void main(String[] args) {
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light("living room");
        CeilingFan ceilingFan = new CeilingFan("kitchen room");

        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOff ceilingFanOff = new CeilingFanOff(ceilingFan);
        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOffCommand = new LightOffCommand(light);

        Command[] partyOn = {ceilingFanHighCommand, lightOnCommand};
        Command[] partOff = {ceilingFanOff, lightOffCommand};

        MacroCommand partOnMacro = new MacroCommand(partyOn);
        MacroCommand partOffMacro = new MacroCommand(partOff);

        simpleRemoteControl.setCommand(0, partOnMacro, partOffMacro);
        simpleRemoteControl.onButtonWasPressed(0);
        simpleRemoteControl.offButtonWasPressed(0);
    }
}
