package com.weiyuze.dp.state.thread;

public class Thread_ {
    ThreadState_ state = new NewState(this);
    void move(Action action){
        state.move(action);
    }
    void run(){}

    public static void main(String[] args) {
        Thread_ t = new Thread_();
        Action action =  new Action();
        t.move(action);
        t.move(action);
        t.move(action);
    }
}
