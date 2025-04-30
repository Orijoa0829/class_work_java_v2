package com.array;

public class ArrayTest1 {
    public static void main(String[] args) {

        //배열이란.. 연관된 데이터 타입을 한번에 모아서 통으로 관리하기 위해 사용할 수 있다.

        //배열을 선언하는 문법
        //규칙 1
        //배열은 반드시 먼저 몇 개의 데이터가 들어갈지 크기를 지정해야 사용할 수 있다.

        //int[] numbers; //배열의 선언
        //numbers = new int[3]; //4바이트 네모칸 3개 초기화

        int[] numbers = new int[3]; //데이터 타입의 대괄호 문법 허용

        //int intbox[] = new int[5]; //변수 뒤에 대괄호 문법 허용

        //[][][] <<값이 아직 안들어간 상태이다.
        //배열 선언과 동시에 값을 초기화 해보자
        int[] grades = new int[]{1, 2, 3};

        int[] grades2 = {1, 2, 3, 4, 5, 6};

        //문제1

        double[] doubles = new double[5]; //크기 = 길이 를 정해야 한다
        doubles[0] = 1.0;
        doubles[1] = 1.1;
        doubles[2] = 1.2;
        doubles[3] = 1.3;
        doubles[4] = 1.4;
        // 중요! - 모든 프로그래밍 언어에 인덱스 번호는 0 부터 시작한다.

        //doubles 배열의 길이는 얼마일까 ? 5개
        //doubles 인덱스의 길이는 얼마일까 ? 4
        //**모든 인덱스의 길이는 n - 1 이다**
        //doubles[5] = 1.4;

        int[] array1 = new int[57];
        //배열의 길이 - 57
        //인덱스의 길이 - 56


        //String 배열 선언 방법
        String[] StringBox = new String[3];
        StringBox[0] = "가";
        StringBox[1] = "나";
        StringBox[2] = "다";
        System.out.println("-------------------------------------");
        System.out.println(StringBox.length);
        System.out.println(StringBox[0]);
        System.out.println(StringBox[1]);
        System.out.println(StringBox[2]);
        System.out.println(StringBox[3]);


        for(int i = 0; i< StringBox.length; i++){
            System.out.println(StringBox[i]);
        }

    }//end of main
}//end of class
