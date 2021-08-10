package com.weiyuze.dp.command;

public class Main {
    public static void main(String[] args) {
        Content content = new Content();
        Command insertCommand = new InsertCommand(content);
        insertCommand.doit();
        insertCommand.undo();

        Command copyCommand = new CopyCommand(content);
        copyCommand.doit();
        copyCommand.undo();

        Command deleteCommand = new DeleteCommand(content);
        deleteCommand.doit();
        deleteCommand.undo();

        System.out.println(content.msg);
    }
}
