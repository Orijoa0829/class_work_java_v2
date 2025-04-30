package com.Inheritance;

public class Cal {

    //메서드를 만들어보자
    public int sum (int n1,int n2){
        return n1+n2;
    }

    public int multiply(int n1, int n2){
        return n1*n2;
    }

}//end of class

// xxx.java 하나의 자바 파일에 여러개의 클래스를 선언할 수 있다.
// 단 스코프는 분명히 구분이 되어야 한다.
// 중요. 단 하나의 자바 파일에 public 클래스는 오직 하나만 존재할 수 있다
// 이해하는것이 아닌 약속(문법)

//부모, 자식 클래스 관계가 된다.
class ChildCal extends Cal{

    //마이너스 기능을 추가
    public int minus(int n1, int n2){
        return n1-n2;
    }
    //곱하기 기능에서, n1 과 n2에 0이 들어온다면 0을 입력하지 마시오 .
    //라는 문구를 나오도록 요청 받음.


    // !!. 상속을 사용했을 때 메서드 오버라이드 개념이 있다. !!
    // 부모 클래스의 메서드를 재정의 할 수 있다. 이것을 메서드 오버라이드라 한다.
    // 문법 - 부모 클래스의 메서드 이름과, 매개변수 갯수 및, 타입 즉 모양이 동일해야 한다.

    public int multiply(int n1, int n2) {
        if(n1==0 || n2 ==0){
            System.out.println("0을 입력하지 마시오");
        }
        return n1 * n2;
    }


}//end of ChildCal class
