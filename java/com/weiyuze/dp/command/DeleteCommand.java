package com.weiyuze.dp.command;

public class DeleteCommand extends Command {
    Content content;
    String delete;

    public DeleteCommand(Content content) {
        this.content = content;
    }

    @Override
    void doit() {
        delete = content.msg.substring(5,content.msg.length());
        content.msg = content.msg.substring(0,5);
    }

    @Override
    void undo() {
        content.msg = content.msg+delete;
    }
}
