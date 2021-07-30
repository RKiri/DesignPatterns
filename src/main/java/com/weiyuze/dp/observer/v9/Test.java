package com.weiyuze.dp.observer.v9;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Button b = new Button();
        b.addActionListener(new MyActionListener());
        b.addActionListener(new MyActionListener2());
        b.buttonPressed();
    }
}

class Button {
    List<ActionListener> actionListeners = new ArrayList<>();

    void buttonPressed() {
        ActionEvent ae = new ActionEvent(System.currentTimeMillis(), this);
        for (int i = 0; i < actionListeners.size(); i++) {
            actionListeners.get(i).actionPerformed(ae);
        }
    }

    void addActionListener(ActionListener al) {
        actionListeners.add(al);
    }
}

interface ActionListener {
    void actionPerformed(ActionEvent event);
}

class MyActionListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("button pressed...");
    }
}

class MyActionListener2 implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("button pressed2...");
    }
}

class ActionEvent {
    public long getWhen() {
        return when;
    }

    public Object getSource() {
        return source;
    }

    long when;
    Object source;

    public ActionEvent(long when, Object source) {
        this.when = when;
        this.source = source;
    }
}
