package com.weiyuze.dp.state_teach.thread;

public class Thread_ {
    ThreadState_ state = new NewState(this);

    void move(Action input) {
        state.move(input);
    }

    void run() {
        state.run();
    }

    public static void main(String[] args) {
        Thread_ t = new Thread_();
        Action a = new Action();
        t.move(a);

        t.move(a);

        t.move(a);

    }

}
