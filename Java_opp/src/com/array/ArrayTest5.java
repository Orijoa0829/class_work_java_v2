package com.array;

import java.util.Random;

public class ArrayTest5 {
    public static void main(String[] args) {

        //1.문자열 배열 선언 및 초기화(값을 넣을 예정)
        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};//4개선언-배열길이4
        System.out.println(fruits.length);

        //랜덤한 숫자를 하나 뽑아서 해당하는 번호에 과일을 출력
        // 배열 생성식
        // int[] intbox = new int[4]
        // new int[3] <-- 배열의 길이
        // intbox[2] <-- 배열의 특정 주소값 호출
//        fruits[0] = "Apple";
//        fruits[1] = "Banana"; [] [] [] [] []
//        fruits[2] = "Orange";
//        fruits[3] = "Mango";

        Random random = new Random();
        int choice = random.nextInt(4); // 0 ~ 3 까지 랜덤 숫자 출력
        System.out.println("오늘의 과일은: " + fruits[choice]);








    } //end of main
} // end of class
