package com._static;

public class Company {

    //static 변수는 class 변수 라고도 한다.
    //메서드 에어리어


    static int empSerialNumber = 1;

    // main 함수
    public static void main(String[] args) {

        Employee e1 = new Employee("야스오");
        Employee e2 = new Employee("티모");
        Employee e3 = new Employee("샤코");
        Employee e4 = new Employee("홍길동");

        System.out.println(e1.getName() + " : " + e1.getEmployeeId());
        System.out.println(e2.getName() + " : " + e2.getEmployeeId());
        System.out.println(e3.getName() + " : " + e3.getEmployeeId());
        System.out.println(e4.getName() + " : " + e4.getEmployeeId());

        Math.random();
    }//end of main
}//end of class
