package com.com.ordermodel;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/22 22:19
 * @modified By：
 */
public class SimpleRemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public SimpleRemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPressed(int slot) {
        onCommands[slot].excute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPressed(int slot) {
        offCommands[slot].excute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPressed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n------------Remote Control--------------\n");
        for (int i = 0; i < 7; i++) {
            sb.append("[slot" + i + "]" + onCommands[i].getClass().getName() + "  " + offCommands[i].getClass().getName() + "\n");

        }
        return sb.toString();
    }
}
