package com.weiyuze.dp.command;

public class CopyCommand extends Command {
    Content content;

    public CopyCommand(Content content) {
        this.content = content;
    }

    @Override
    void doit() {
        content.msg = content.msg+content.msg;
    }

    @Override
    void undo() {
        content.msg = content.msg.substring(0,content.msg.length()/2);
    }
}
