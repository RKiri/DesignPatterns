package com.weiyuze.dp.state_teach.thread;

public class Thread_ {
    ThreadState_ state;

    void move(Action input) {
        state.move(input);
    }

    void run() {
        state.run();
    }


}
