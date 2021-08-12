package com.weiyuze.dp.state.thread;

public class TerminatedState extends ThreadState_ {
    Thread_ t;

    public TerminatedState(Thread_ t) {
        this.t = t;
    }

    @Override
    void move(Action action) {
        if (action.msg=="jieshu"){
            System.out.println("TerminatedState");
            action.msg = "...";
        }
    }

    @Override
    void run() {

    }
}
