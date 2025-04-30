package com.Inheritance;

public class Hero {

    String name;
    int hp;

    //생성자
    Hero(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    //메서드
    void attack() {
        System.out.println("기본 공격을 합니다");
    }
}
