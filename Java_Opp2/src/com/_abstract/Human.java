package com._abstract;

public abstract class Human extends Animal {

    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다");
    }
    //추상 메서드를 구현 메서드로 재정의하거나 클래스를 abstract 로 만들면 된다
}
