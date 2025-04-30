package com._abstract;

public class Person extends Human {
    // 상속 오류 -> 부모 클래스의
    @Override
    public void hunt() {
        System.out.println("총으로 동물들을 사냥합니다.");
    }
}
