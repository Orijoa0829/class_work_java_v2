package com.polymorphism;

import com.Inheritance.A;

/**
 * 하나의 데이터 타입을 다양한 형태로 바라보는 것. (다형성)
 * 한 요소 , 메서드, 클래스가 여러 형태를 가질 수 있는 능력을 의미한다.
 * 상속관계에서 다형성을 살펴 보고 있다.
 */
public class AnimalTest {

    public static void main(String[] args) {

        Animal animal1  = new Animal();
        animal1.move();
        animal1.eating();
        System.out.println("-----------------------------------");

        // 다형성의 장점
        // 부모 타입으로 자식 클래스를 인스턴스화 할 수 있다.

        Animal animal2 = new Tiger();
        animal2.move();
        animal2.eating();

        // 코드를 작성하는 시점은 --> 컴파일 시점 --> animal의 move와 eating 을 읽는데
        // 프로그램을 실행시키는 시점은 --> 런타임 시점 --> 결과는 ?Tiger의 move와 eating
        System.out.println("------------------------");
        Animal animal3 = new Human();
        animal3.move();
        animal3.eating();

    }//end of main
}//end of class
