package com.Inheritance;

/**
 * 상속 기법을 배운 개발자라면
 * A 클래스의 속성과 상태를 물려받을 수 있다.
 */

/**
 * 자바에서는 단일 상속만을 지원한다.
 * A 클래스는 부모 클래스 , C 클래스가 자식 클래스가 된다
 */
public class C extends A {

    //코드에는 보이지 않지만 자동으로 A에 선언된 필드들을 물려 받는다.
    int level;
    String nickName;
}
