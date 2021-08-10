package com.weiyuze.dp.command;

public class InsertCommand extends Command {
    Content c;
    String strToInsert = "http://www.weiyuze.com";

    public InsertCommand(Content c) {
        this.c = c;
    }

    @Override
    void doit() {
        c.msg = c.msg + strToInsert;
    }

    @Override
    void undo() {
        c.msg = c.msg.substring(0, c.msg.length() - strToInsert.length());
    }
}
