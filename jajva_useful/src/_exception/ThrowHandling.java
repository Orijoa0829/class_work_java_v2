package _exception;

public class ThrowHandling {

    public static void main(String[] args) {

        boolean flag = true;
        if (flag) {
            //필요에 의해 직접 미리 만들어 둔 예외 클래스를 생성할 수 있다.
            throw new ArithmeticException();
        }


    }//end of main
}//end of class
