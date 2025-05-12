package wrapper;

public class wrapperTest1 {


    public static void main(String[] args) {


        //Boxing
        // 기본 데이터를 래퍼 클래스 객체로 변환하는 과정을 말한다
        int num = 10;

        Integer wrappedNum = Integer.valueOf(num); //Boxing

        System.out.println(wrappedNum);

        //UnBoxing
        // 래퍼 클래스 객체를 기본 타입 데이터로 변환하는 과정.
        Integer wrappedNum2 = Integer.valueOf(30);

        int num2 = wrappedNum2.intValue();

        System.out.println("num2 : "  + num2);


        // Auto-boxing / Auto-unboxing

        Integer autoBoxed = 20; // 자동 박싱 (int(값) --> Integer(...))

        int autoUnboxed = autoBoxed; // 자동 언박싱(Integer(값) --> int)






    }
}
