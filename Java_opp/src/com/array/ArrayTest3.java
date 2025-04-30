package com.array;

import java.util.Random;

public class ArrayTest3 {
    public static void main(String[] args) {

        //난수 발생 가능 - 랜덤한 숫자를 하나 만들어 주는 도구
        //표준 라이브러리
        //자바 개발자들이 미리 만들어 준 기능
        Random random = new Random();
        // 문서 <-- 구글링 <--AI

        //int temp = random.nextInt(45); //0부터 44까지 랜덤한 숫자를 하나 발생해 준다.
        //0부터 45까지 랜덤한 숫자를 하나 발생해 준다.
        int ranInt1 = random.nextInt(45) + 1;
        int ranInt2 = random.nextInt(45) + 1;
        int ranInt3 = random.nextInt(45) + 1;
        int ranInt4 = random.nextInt(45) + 1;
        int ranInt5 = random.nextInt(45) + 1;
        int ranInt6 = random.nextInt(45) + 1;

        //[][][][][][]
        // 인덱스의 길이는 배열의 길이 - 1이다.
        // 배열의 길이는? : 8
        // 인덱스의 길이는? : 7

        // 배열을 왜 쓰는가?
        // int num = 1; // 값 하나.
        // int num[] = new int[6]

        int[] intBoxes = new int[6];

        // [1][2][3][4][5][6]
        // 배열 번호
        // 1 2 3 4 5 6
        // 인덱스 번호
        // 0 1 2 3 4 5
        // intbox[2] = 3이 나옴;
        //배열과 for문을 사용해서 코드를 간결하게 수정
        //int intbox[0] = new int[5]; []
        //int intbox[1] = random.nextInt(45) + 1;
        //int intbox[2] = random.nextInt(45) + 1;
        //int intbox[3] = random.nextInt(45) + 1;
        //int intbox[4] = random.nextInt(45) + 1;
        //int intbox[5] = random.nextInt(45) + 1;
        // out of bounds 에러 발생
        // 배열의 길이 5
        // 인덱스의 길이 4


        // 1. 배열 설정
        // new int[6]
        // [][][][][][]

        int intbox[] = new int[6];
        //
        // 2. for문 작성
       for(int i = 0; i<intbox.length; i ++){
           intbox[i] = random.nextInt(45) + 1;
       }

    }
}
