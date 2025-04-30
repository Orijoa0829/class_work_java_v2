package com.polymorphism;

public class Banana extends Fruit {

    String origin; //원산지 담을 변수 선언

    //생성자(기본)
    public Banana(){
        name = "델몬트 바나나";
        price = 3000;
        origin = "필리핀";
    }

    public void saleBanana(){
        System.out.println("지금은 할인 행사 기간 입니다");
        System.out.println("이 방송이 나간 이후(메서드 호출) 바나나 가격을 천원 할인합니다.");
        price -= 1000;
    }


}
