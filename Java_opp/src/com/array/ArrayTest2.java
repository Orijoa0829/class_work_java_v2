package com.array;

public class ArrayTest2 {
    public static void main(String[] args) {

        char[] alphabets = new char[26];


        // char 타입은 원래 정수값이다.
        // 컴퓨터는 0,1 이진수로 데이터를 표현한다.
        // 문자, 문자열을 아주 많이 다루고 있다.
        // 컴퓨터에서 문자를 표현하기 위해서 문자표라는 것을 사용한다.
        // 아스키 코드, EUC-KR,   전세계 공통으로 사용하기 위해 유니코드를 만들었음.
        // 아스키코드 1바이트 안에 하나의 문자를 다 표현할 수 있다.
        // [][][][][][][][] <--- 정수 0 ~ 127


        alphabets[0] = 'A';
        System.out.println((int)alphabets[0]);

        alphabets[1] = 'B';
        System.out.println((int)alphabets[1]);

        //인코딩
        //문자를 컴퓨터가 이해할 수 있는 숫자(코드값)로 바꾸는 과정
        int code1 = (int)'A';
        //디코딩
        //숫자(코드값)를 사람이 읽을 수 있는 문자로 바꾸는 과정
        char code = (char)66;

        int a = 65;
        System.out.println((char)a);

        // 반복문을 통해서 알파벳 A~Z 출력
        while(a<91){
            System.out.println((char)a);
            a++;
        }


        for(int i = 0; i< alphabets.length; i++){
            alphabets[i] = (char)('A' + i);
        }

        for(int i = 0; i< alphabets.length; i++){
            System.out.println(alphabets[i]);
        }
















































    }
}
