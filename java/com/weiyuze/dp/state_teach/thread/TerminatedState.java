package com.weiyuze.dp.state_teach.thread;

public class TerminatedState extends ThreadState_ {
    private Thread_ t;

    public TerminatedState(Thread_ t) {
        this.t = t;
    }

    @Override
    void move(Action input) {
        if (input.msg == "TerminatedState") {
            System.out.println("...");
        }

    }

    @Override
    void run() {

    }
}
