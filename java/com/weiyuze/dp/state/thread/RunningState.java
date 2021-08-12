package com.weiyuze.dp.state.thread;

public class RunningState extends ThreadState_ {
    Thread_ t;

    public RunningState(Thread_ t) {
        this.t = t;
    }

    @Override
    void move(Action action) {
        if (action.msg=="zhixing"){
            System.out.println("RunningState");
            t.state = new TerminatedState(t);
            action.msg = "jieshu";
        }
    }

    @Override
    void run() {

    }
}
