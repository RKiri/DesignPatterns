package com.weiyuze.dp.visitor;

public class Computer {
    ComputerPart cpu = new CPU();
    ComputerPart memory = new Memory();
    ComputerPart board = new Board();

    void accept(Visitor visitor) {
        cpu.accept(visitor);
        memory.accept(visitor);
        board.accept(visitor);
    }

    public static void main(String[] args) {
        //PersonalVisitor p = new PersonalVisitor();
        CorpVisitor p = new CorpVisitor();
        Computer c = new Computer();
        c.accept(p);
        System.out.println(p.totalPrice);
    }
}

abstract class ComputerPart {
    abstract void accept(Visitor v);

    abstract double getPrice();
}

interface Visitor {
    void visitCPU(CPU cpu);

    void visitBoard(Board board);

    void visitMemory(Memory memory);
}

class CPU extends ComputerPart {

    @Override
    void accept(Visitor v) {
        v.visitCPU(this);
    }

    @Override
    double getPrice() {
        return 500;
    }
}

class Memory extends ComputerPart {

    @Override
    void accept(Visitor v) {
        v.visitMemory(this);
    }

    @Override
    double getPrice() {
        return 300;
    }
}

class Board extends ComputerPart {

    @Override
    void accept(Visitor v) {
        v.visitBoard(this);
    }

    @Override
    double getPrice() {
        return 200;
    }
}

class PersonalVisitor implements Visitor {

    double totalPrice = 0.0;

    @Override
    public void visitCPU(CPU cpu) {
        totalPrice += cpu.getPrice() * 0.9;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice += board.getPrice() * 0.9;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPrice() * 0.9;
    }
}

class CorpVisitor implements Visitor {

    double totalPrice = 0.0;

    @Override
    public void visitCPU(CPU cpu) {
        totalPrice += cpu.getPrice() * 0.8;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice += board.getPrice() * 0.8;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPrice() * 0.8;
    }
}

