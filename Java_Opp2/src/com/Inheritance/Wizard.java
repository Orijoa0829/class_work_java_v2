package com.Inheritance;

public class Wizard extends Hero {

    public Wizard(String name, int hp){
        super(name,hp);
    }

    //메서드
    //어노테이션 주석 + 힌트
    @Override
    public void attack() {
        super.attack();
        System.out.println("위자드가 공격을 합니다.");
    }
}
