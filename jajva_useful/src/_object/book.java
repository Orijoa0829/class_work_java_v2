package _object;

//import java.lang.Object;
//import java.lang.*;

// java.lang.* 패키지도 자동으로 넣어준다.


/**
 * Object 최상위 클래스에 대한 이해
 * 클래스를 만들면 기본적으로 Object 클래스 상속을 받는다.
 * 자바는 Object 클래스( 모든 클래스의 최상위 )를 제외하고
 * 단일 상속만을 제공한다.
 */
public class book extends Object {
    //public class book
    private int bookTypeId;
    private String title;
    private String author;

    //생성자
    public book(int bookTypeId, String title, String author) {
        this.bookTypeId = bookTypeId;
        this.title = title;
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        //재정의 해 보자.

        if (obj instanceof book) {
            //this 는 book A, obj -->book = true
            //재정의
            if (this.title.equals(((book) obj).title) && this.author.equals(((book) obj).author)) {
                //book 타입이 맞다면 추가적으로, 제목이 같다면 같은 책으로 판단하겠다
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


    //equals() 메서드를 재정의 할 때는 hashCode()메서드도 재정의 해주어야
    //의도하지 않은 동작을 막을 수 있다.

    @Override
    public int hashCode() {
        //hashCode - > 이 객체의 고유한 정수값을 만들어서 독립적인 녀석을 보장하는 정수 값
        return bookTypeId;
    }


//    @Override
//    public String toString() {
//       return "title : " + title + ", " + "author : " + author;
//    }

    //테스트코드
    public static void main(String[] args) {

        // 물리적 객체 주소값은 다르지만 (equals() 메서드를 재정의해서
        // 논리적으로 책 이름과 저자 이름이 같다면 같은 녀석으로 바라 보게
        // 프로그램을 만들어 주세요
        book A = new book(1, "데미안", "헤르만헤세");
        book B = new book(1, "데미안", "헤르만헤세");
        book C = new book(2, "자바", "홍길동");
        book D = new book(1, "흐르는 강물처럼", "파울로코엘료");

        String str1 = new String("데미안");
        System.out.println(A.toString());
        System.out.println(B.toString());

        boolean result1 = A.equals(B);
        boolean result2 = A.equals(str1);
        boolean result3 = A.equals(C);
        boolean result4 = A.equals(D);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

    }

}
