package com.weiyuze.dp.command;

public abstract class Command {
    public abstract void doit(); //exec run
    public abstract void undo();
}
