package _string;

public class StringBufferTest1 {

    // StringBuffer <<-- 클래스를 이해하기 위해 String 의 특징을 알아보았ㄷ

    public static void main(String[] args) {

        String str1 = new String ("Hello");
        String str2 = new String ("World");

        //새로 배우는
        StringBuffer buffer1 = new StringBuffer(str1);

        System.out.println("수정 전 :" + System.identityHashCode(buffer1));
        // buffer1 의 값을 수정해 보자. 문자열 변경
        buffer1.append(str2);

        System.out.println("수정 후 :" + System.identityHashCode(buffer1));


        //API 8버전에서는 buffer1.toString() 해야 값을 확인할 수 있다.
                                      // 이전버전 : 해시코드
        System.out.println(buffer1);  // 출력값 : HelloWorld

        //StringBuffer 데이터 타입을 String 으로 형 변환 하려면 .toString() 호출하면 됨.
        String result1 = buffer1.toString();



    } // end of main
} // end of class
