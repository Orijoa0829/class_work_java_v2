package wrapper;

public class wrapperTest4 {

    public static void main(String[] args) {

        //기본 데이터 타입 -> 문자열 변환
        // 1. 가장 쉬운 방법

        System.out.println(10 + "a");

        String str1 = 15.5 + "";

        // 2. string 클래스의 valueOf() 메서드 활용하는 방법
        int value = 5000;
        String strValue = String.valueOf(value);
        System.out.println(strValue);

        Float value2 = 500.123F;
        Long value3 = 1000L;
        //실수값 기본 연산 ->double
        //정수값 기본 연산 ->int

        String strvalue2 = String.valueOf(value2);
        System.out.println(value2);

    }// end of main
}
