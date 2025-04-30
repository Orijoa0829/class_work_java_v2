package _object;

public class EBook {
    private int bookTypeId;
    private String title;
    private String author;

    //생성자 자동 생성 alt + insert -> construct


    public EBook(int bookTypeId, String title, String author) {
        this.bookTypeId = bookTypeId;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "title :" + title + "," + "author: " + author;
    }
//이퀄스는 두 객체를 비교, 문자열 값이 같다면, true를 반환한다.
// 하지만 나는 이 Ebook 클래스의 객체들 중, 책의 이름과 저자가 같다면 true를 반환하도록 하고싶다
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

//

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
//toString() , equals(), hashCode() 메서드 재 정의하시오

