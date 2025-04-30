package com._abstract;

public class MainTest1 {

    public static void main(String[] args) {

        //객체 지향 개념으로 Animal 이라는 클래스를 인스턴스화 시키면 뭔가 좀 이상해..
        Animal animal; // 타입으로 선언은 가능
        //  animal =new Animal() <<--- 오류 발생
        //Animal class 는 강제적으로 abstract 키워드를 사용해 추상 클래스로 설계했다.
        //그렇다면 추상 클래스는 new라는 키워드와 생성자를 활용해서
        //독립적으로 메모리에 올릴 수 없다.

//        Human human = new Human();
        // 개발자가 개체를 상속 시킬 때 다른 사용자가  마음대로 객체를 생성시키지 못하게 하는
        // 강제성을 지닐 수 있다.


    }//end of main
}//end of class
