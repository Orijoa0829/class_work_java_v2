package com.Inheritance;


public class Main1 {

}

class Animal{
    //protected 를 쓰면 나를 물려받은 자식 클래스에서 접근 가능하다.
   protected String name;
    void eat(){
        System.out.println(name+ "이 (가) 밥을 먹습니다.");
    }
    void bark(){
        System.out.println(name + "이 (가) 짖습니다");
    }
}

//자식 클래스
class Dog extends Animal{
    @Override
    void eat() {
        super.eat();

    }
    //@Override << 주석 + 힌트

}

class Cat extends Animal {

    @Override
    void eat() {
        //고양이의 먹는 모습 구현..
        super.eat();
        System.out.println("야옹");
    }
}


