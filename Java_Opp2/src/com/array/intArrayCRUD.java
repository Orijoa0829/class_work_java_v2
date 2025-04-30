package com.array;

/*
 * 배열이란 연관된 데이터 타입의 요소들을 통으로 관리하기 위해 사용한다.
 *
 */
public class intArrayCRUD {
    public static void main(String[] args) {


        //1.생성 (Create) - C
        //배열은 반드시 크기(길이)를 지정해주어야 한다
        // [] [] [] [] [] << 인덱스 번호를 통해서 각 요소를 찾아갈 수 있다.
        // 모든 인덱스의 번호는 0부터 시작 된다.
        int[] intArray = new int[5];// 정수값을 담는 배열이다 배열 길이는 5
        // int[] intArray = new int[5];// 정수값을 담는 배열이다 배열 길이는 5
        // 배열은 보통 반복문과 함께 많이 사용이 된다.

        for (int i = 0; i < intArray.length; i++) {
        intArray[i] = (i+1) * 10;
        }

        //2.조회 (Read) - R
        System.out.println("-----------------------------------------------");
        System.out.println(intArray[0]);
        for(int i = 0; i<intArray.length; i++){
            System.out.println(intArray[i]);
        }
        System.out.println(intArray[1]);
        System.out.println(intArray[2]);
        System.out.println(intArray[3]);
        System.out.println(intArray[4]);
        //System.out.println(intArray[5]);

        System.out.println("프로그램 종료"); // index out of bounds로 인해 출력되지 않음 인덱스는 0부터 시작 !


        //3. 수정 (Update) - U

        System.out.println("---------------------------------------------");

        intArray[2] = 3;
        System.out.println("intArray[2] 수정후 : " + intArray[2] );

        //4. 삭제 (Delete) - D

        //배열은 고정 길이이므로 특정 인덱스를 (int 이기 때문에) 0으로 초기화하여
        //논리적으로 삭제했다 말할 수 있다.
        intArray[2]=0;
        System.out.println("intArray[2] 삭제 후 : " + intArray[2] );



        


    }
}
