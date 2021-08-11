package com.weiyuze.dp.state.v2;

public class MM {

    MMState state = new MMSadState();

    void smile() {
        state.smile();
    }

    void cry() {
        state.cry();
    }

    void say() {
        state.say();
    }

    public static void main(String[] args) {
        MM mm = new MM();
        mm.smile();

    }
}
