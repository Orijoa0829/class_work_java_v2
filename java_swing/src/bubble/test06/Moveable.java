package src.bubble.test06;

public interface Moveable {
    void left();

    void right();

    void up();

    default void down(){}
    //인터페이스의 모든 메서드는 추상 메서드여야 한다.
    // ** 단, default 메서드는 제외 **


    //default void a(){}
}
