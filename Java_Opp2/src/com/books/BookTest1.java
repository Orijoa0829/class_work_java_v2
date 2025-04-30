package com.books;

/**
 * 배열 테스트 코드 작성
 */
public class BookTest1 {
    public static void main(String[] args) {
        //배열안의 요소는 - 기본 데이터 타입
        //                - 참조 자료형 타입
        Book[] books = new Book[10]; //배열길이 10 / 인덱스 길이 9
        books[0] = new Book("플러터UI실전", "김근호");
        books[1] = new Book("무궁화 꽃이 피었습니다", "김진명");
        books[2] = new Book("흐르는 강물 처럼", "파울로코엘료");
        books[3] = new Book("리딩으로 리드하라", "이지성");
        books[4] = new Book("사피엔스", "유발하라리");
        books[9] = new Book("홍길동전", "허균");
        //--> [플] [무] [흐] [리] [사] [null] [null] [null] [홍]
        //      0    1   2     3    4   5       6       7     8
        //배열의 길이와 안에 요소(eliments)는 꼭 가득 차 있는 것은 아니다
        //heap 메모리에 6개 들어감..

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {            ///만약 배열안의 요소가 null이 아니라면 출력 해- 방어적 코드
                System.out.println(books[i].getTitle());
            }
        }
        //조회
        System.out.println("----------------------------------------");
        String title9 = books[9].getTitle();
        String author9 = books[9].getAuthor();
        System.out.println(title9);
        System.out.println(author9);


        //end of main
    }
}//end of class
