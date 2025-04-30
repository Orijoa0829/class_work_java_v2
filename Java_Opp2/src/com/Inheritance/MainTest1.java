package com.Inheritance;

public class MainTest1 {

    public static void main(String[] args) {

        //Cal 클래스와 childCal 관계는 부모 자식 관계에 놓여 있다.
        //Cal 의 기존기능을 childCal 에서 호출
        ChildCal childCal1 = new ChildCal();
        int sum1 = childCal1.sum(20, 10);
        System.out.println("sum1:" + sum1);
        //추가된 기능
        int minus1 = childCal1.minus(100,10);
        System.out.println("minus1 : " + minus1);

        // 부모 클래스의 메서드를 자식 클래스에서 재정의를 한다면,
        // 메서드 오버라이드라고 한다.
        int multi = childCal1.multiply(10,0);
        System.out.println("multi : " + multi);



        // 상속 관계에 있어서 부모 클래스가 먼저 존재해야,
        // 자식 클래스가 존재할 수 있다.




    } //end of main

} // end of class
