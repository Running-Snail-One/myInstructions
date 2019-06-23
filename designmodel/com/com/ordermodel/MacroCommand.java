package com.com.ordermodel;

/**
 * @author ：fanshuaibing
 * @date ：Created in 2019/6/23 10:37
 * @modified By：
 */
public class MacroCommand implements Command {
    Command command[];

    public MacroCommand(Command command[]) {
        this.command = command;
    }

    @Override
    public void excute() {
        for (int i = 0; i < command.length; i++) {
            command[i].excute();
        }
    }

    @Override
    public void undo() {
        for (int i = 0; i < command.length; i++) {
            command[i].undo();
        }
    }
}
