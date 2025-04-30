package com.Inheritance;

public class Archer extends Hero{
    public Archer(String name, int hp) {
        super(name, hp);
    }


    void fireArrow() {
        System.out.println("궁수의 파이어 애로우!");
    }
}
