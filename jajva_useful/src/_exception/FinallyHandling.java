package _exception;

import java.util.Scanner;

public class FinallyHandling {

    public static void main(String[] args) {

        //try-catch-finally 구문
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("숫자를 입력해주세요");
            int result = scanner.nextInt();
            System.out.println("입력한 숫자 :" + result);
            //return;
        } catch (Exception e) {
            System.out.println("입력 오류");

        } finally {
            //반드시 수행 되어야 하는 코드를 입력하는 영역
            //심지어 return 키워드를 만나더라도 여기는 수행이 됩니다.
             //스트링을, 자원을 해제 합니다
            scanner.close();
            System.out.println("자원을 해제 했습니다");
        }

        System.out.println("프로그램이 비정상 종료안됨!");


    }
}
