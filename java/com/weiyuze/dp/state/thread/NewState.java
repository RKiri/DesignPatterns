package com.weiyuze.dp.state.thread;

public class NewState extends ThreadState_ {
    Thread_ t;

    public NewState(Thread_ t) {
        this.t = t;
    }

    @Override
    void move(Action action) {
        if(action.msg=="start"){
            System.out.println("NewState");
            t.state = new RunningState(t);
            action.msg = "zhixing";
        }
    }

    @Override
    void run() {

    }
}
