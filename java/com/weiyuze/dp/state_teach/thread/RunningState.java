package com.weiyuze.dp.state_teach.thread;

public class RunningState extends ThreadState_ {
    private Thread_ t;

    public RunningState(Thread_ t) {
        this.t = t;
    }

    @Override
    void move(Action input) {
        if (input.msg == "Running") {
            t.state = new TerminatedState(t);
            System.out.println("TerminatedState...");
            input.msg = "TerminatedState";
        }

    }

    @Override
    void run() {

    }
}
