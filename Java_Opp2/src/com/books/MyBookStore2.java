package com.books;

import java.util.Scanner;

/**
 * 모든 프로그래밍의 기본은 CRUD 이다.
 * CRUD 기능을 구현해보자
 */
public class MyBookStore2 {

    static int currentnBookIndex = 6; //샘플데이터가 5까지라 6으로함 지우고나면 0부터 하면됨

    //메인함수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //배열 준비
        Book[] books = new Book[100];
        //books = null; 가리키는 공간이 없다;
        boolean flag = true;

        //TODO - 추후 삭제하기
        //샘플 데이터 미리 만들어 두기 **tip**
        books[0] = new Book("플러터UI실전", "김근호");
        books[1] = new Book("무궁화 꽃이 피었습니다", "김진명");
//        books[2] = new Book("흐르는 강물 처럼", "파울로코엘료");
//        books[3] = new Book("리딩으로 리드하라", "이지성");
//        books[4] = new Book("사피엔스", "유발하라리");
//        books[5] = new Book("홍길동전", "허균");


        final String SAVE = "1";
        final String SEARCH_ALL = "2";
        final String SEARCH_BY_TITLE = "3";
        final String DELETE_ALL = "4";
        final String END = "5";

        while (flag) {
            System.out.println("⭐메뉴선택⭐");
            // String n1 = sc.nextLine(); -> "가나다라" + 줄바꿈
            System.out.println("1.저장 2.전체조회 3.선택조회 4.전체삭제 5.종료");
            String selectedNumber = sc.nextLine();
            // 숫자 비교할때 == 사용한다.
            // 문자열 비교할때 "문자열".equals("문자열") --> true 다르다면 false 반환
            //문자열 비교할 때는 무조건 equals()메서드를 사용하자


            if (selectedNumber.equals(SAVE)) {
                System.out.println(">>저장하기<<");
                save(sc, books);
                //가게의 책 목록에 책을 추가한다
                //
            } else if (selectedNumber.equals(SEARCH_ALL)) {
                System.out.println(">> 전체조회 <<");
                readAll(books);
            } else if (selectedNumber.equals(SEARCH_BY_TITLE)) {
                System.out.println(">> 책 제목으로 조회하기 <<");
                readByTitle(sc, books);
            } else if (selectedNumber.equals(DELETE_ALL)) {
                System.out.println(">> 전체 삭제하기 <<");
                deleteAll(books);
            } else if (selectedNumber.equals(END)) {
                System.out.println(">> 프로그램을 종료합니다 <<");
                flag = false; //while문이 false가 되면서 종료됨
            } else {
                System.out.println(">> 잘못된 선택입니다 <<");
                end();
            }

        }

    }//end of main

    //저장하기
    public static void save(Scanner scanner, Book[] books) {
        System.out.println("-----save()-----");
        //가게 책 목록을 업데이트한다
        //북스 배열에 null값이 나오면,사용자가 입력한 책 제목과 저자를 저장한다?
//        !=null continue;
//        =null
        System.out.println("책 제목을 입력하세요");
        String title = scanner.nextLine();
        System.out.println("책 저자를 입력하세요");
        String author = scanner.nextLine();
        Book book = new Book(title, author);
        // books 라는 배열에 북 객체를 저장하는 코드
        //인덱스 번호 어디까지 사용했는지에 대한 정보도 필요하다(Static 변수로 관리)
        if (currentnBookIndex > books.length) {
            System.out.println("더 이상 저장할 공간이 없어요");
            return;
        }

        books[currentnBookIndex] = book;
        currentnBookIndex++;


    }


    // 전체 조회 하기 함수
    public static void readAll(Book[] books) {
        System.out.println("-----readAll()-----");
        for (int i = 0; i < books.length; i++) {
            //방어적 코드 작성
            if (books[i] != null) {
                System.out.println(books[i].getTitle() + "," + books[i].getAuthor());
            }
        }

    }

    // 책 제목으로 조회하기 (선택조회)
    public static void readByTitle(Scanner scanner, Book[] books) {
        System.out.println("-----readByTitle()-----");
        System.out.println("책 제목을 입력하세요");
        //문자열 기능중에는 공백 제거 기능이 있다.. trim();
        String sameTitle = scanner.nextLine();
        //사용자에게 입력받은 값이 배열안의 변수값과 일치하면 "책이 있습니다"
        //for문 / i , 배열렝스 , 1씩 증가 : 만약 books[i].getTilte과 title이 같다면 책이 있습니다.else  책이 없습니다
        //밑 코드 작성후 NullpointerException 에러-->
        for (int i = 0; i < books.length; i++) {
            // books 객채값을 담아주는 배열은 현재 0,1,2가 생성되어 있는 상태.
            // 즉 인덱스 3의 값을 불러올려 하면 객체를 생성해서 넣어준적이 없기 때문에
            // nullPointerException 에러 발생
            // 저 예외처리를 해주기 위해선?
            // books[?] 이 인덱스에 객체 주소값이 존재하는지 안하는지 먼저 확인 필요.
            if (books[i] != null) {
                if (sameTitle.equals(books[i].getTitle())) {
                    System.out.println("제목과 일치하는 책이 있어요");
                    break;
                }
            } else if (books[i] == null) {
                System.out.println("찾지 못했어요");
                break;
            }
        }

    }

    //전체 삭제하기
    public static void deleteAll(Book[] books) {
        System.out.println("-----deleteAll-----");
        //배열에 저장된 데이터를 초기화 한다 = null
        //for문으로 인덱스값이 증가할때마다 null이 아닌값을 null로
        //새로 선언 ?
//        books = null;
//        books = new Book[100];
        for (int i = 0; i < books.length; i++) {
            books[i] = null;
        }


    }

    //프로그램 종료
    public static void end() {
        //함수를 호출한 곳의 반복문에서 break를 선언하면 종료
        //
    }

}//end of class
