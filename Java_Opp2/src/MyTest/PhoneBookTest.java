package MyTest;

import java.util.Scanner;

//- **저장**: 사용자가 이름과 전화번호를 입력하여 전화번호부에 저장할 수 있어야 합니다. //객체 생성시 저 두개가 필요
//- **조회**: 전체 연락처 목록을 조회하거나, 특정 이름으로 연락처를 검색하여 조회할 수 있어야 합니다.
//- **수정**: 기존 연락처의 전화번호를 변경할 수 있어야 합니다.
//- **삭제**: 전화번호부에서 연락처를 삭제할 수 있어야 합니다.
//- **선택 조회** : 이름을 입력하면 해당 전화번호가 출력 되어야 합니다.
//- **프로그램 종료 - 사용자가 프로그램 종료할 때 까지 계속 실행되어야 합니다.**
//- **Scanner 활용, 입력 받는 데이터 타입은 전부 String 으로 처리**
//- **전화번호 저장은 100까지 한정.** // -> 배열
public class PhoneBookTest {
    static int indexCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PhoneBook[] books = new PhoneBook[100];
//        books[0] = new PhoneBook("01011111111", "홍길동");
//        books[1] = new PhoneBook("01012345678", "김둘리");
        //...books[99] = ...
        //일단 큰 틀 만들기
        final String SAVE = "1";
        final String READ = "2";
        final String UPDATE = "3";
        final String DELETE = "4";
        final String SEARCH_BY = "5";
        final String END = "6";
        boolean flag = true;
        while (flag) {
            System.out.println("메뉴를 선택 1.저장 2.조회 3.수정 4.삭제 5.선택 조회 6.프로그램 종료");
            String selectedNumber = scanner.nextLine();
            if (selectedNumber.equals(SAVE)) {
                //저장 함수
                save(scanner, books);
            } else if (selectedNumber.equals(READ)) {   //선택조회 하고, 안뜨면 전체조회하는식으로
                //READ함수
                read(books);
            } else if (selectedNumber.equals(UPDATE)) {
                //기존 연락처의 전화번호 수정
                update(scanner, books);
            } else if (selectedNumber.equals(DELETE)) {
                //전화번호 삭제
                delete(scanner, books);
            } else if (selectedNumber.equals(SEARCH_BY)) {
                //선택조회
                search_by(scanner, books);
            } else if (selectedNumber.equals(END)) {
                flag = false;
                System.out.println("프로그램을 종료");
            }

        }


    }//end of main


    // 함수 설정하기
    //**저장** - 사용자가 이름과 전화번호를 입력하여 저장
    public static void save(Scanner scanner, PhoneBook[] books) {
        System.out.println("이름을 입력");
        String name = scanner.nextLine();
        System.out.println("전화번호를 입력");
        String phoneNumber = scanner.nextLine();
        //입력받고 저장해야 한다 저장=객체를 생성
        //  PhoneBook a = new PhoneBook(phoneNumber, name);
        //배열의 인덱스값을 생각하면..
        // 인덱스0까지 있으면 1에 저장
        // 인덱스 1까지 있으면 2에 저장
        //...
        // 1.1~100까지 증가하는데 그 중 값이 null이라면 거기에 저장?
        // 2. 아니면 books의 인덱스값을 저장하는 static 변수 사용
        // 1로 해보자
        //                 100         100  ++
        // i를 이용하여 book.length의 길이만큼 ++을 해줘야함.
        // 첫번 째 i = 0 -> books[0]
        // ++ 두번 째 i = 1 -> books[1]
        //     초기값      조건식        증감식
        for (int i = 0; i < books.length; i++) {
            // i 값은 = 0; 첫 번째
            // i 값은 = 1; 두 번째
            if (books[i] == null) { // books[i] == null --> books[0] = null --> 현재 값이 없기 떄문에 조건문에 들어옴
                books[indexCount] = new PhoneBook(phoneNumber, name);
                indexCount++; // 다음 전화번호 정보 생성을 위해 인덱스카운트 변수값 ++(증가)
                break; // for문 강제 종료
            }
        }
    }

    //**조회** (전체조회)
    //TODO 전체조회 전에 선택조회 추가해보기
    public static void read(PhoneBook[] books) {
        //books의 메모리 공간1~100을 다 뒤지고,
        // null이 아니라면 모두 출력
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].getName());
                System.out.println(books[i].getPhoneNumber());
            }
        }
    }

    //**수정** 기존 연락처의 전화번호를 변경
    // 1.사용자 값을 받아 전화번호를 검색
    // 2.메모리를 다 뒤져 일치하는값 찾고,
    // 3.일치할 경우 사용자가 입력하는대로 수정
    public static void update(Scanner scanner, PhoneBook[] books) {
        System.out.println(" 번호를 입력하세요");
        String usallyPhoneNumber = scanner.nextLine();
        for (int i = 0; i < books.length; i++) {
            if (books[i].getPhoneNumber() != null) {
                if (usallyPhoneNumber.equals(books[i].getPhoneNumber())) {
                    System.out.println("어떻게 수정할지 입력하시오");
                    String updatePhoneNumber = scanner.nextLine();
                    books[i].setPhoneNumber(updatePhoneNumber);
                    System.out.println("수정된 번호: " + updatePhoneNumber);
                    break;
                }
            }
        }
    }

//  **삭제**
    //전화번호(기존의 객체들중 하나) 삭제 /삭제는 null
    //모든값에 null 을 때리면 안된다 다시 선언해야함.
    //books[?] 의 특정 객체에 null 부여하기
    //1. Phonebook 클래스에 전화번호 삭제 메소드 추가 하기 ?
    //2. 제어하는 메인함수에 함수 추가하기
    //2 번으로 해보자
    //1-1 모든 배열을 화면에 출력하고 그 배열의 인덱스값을 선택하면,null
    //1-2 또는 사용자에게 받은 값으로
    // 이름 검색하여 객체를 출력하고 객체에 null

    //1-2 로 해보자
    public static void delete(Scanner scanner, PhoneBook[] books) {
        System.out.println("삭제할 번호의 사람 이름");
        String wantToDelete = scanner.nextLine();
        for (int i = 0; i < books.length; i++) {
            if (wantToDelete.equals(books[i].getName())) {
                books[i] = null;
            } else if (!(wantToDelete.equals(books[i].getName()))) {
                break;
            }
        }
    }

    public static void search_by(Scanner scanner, PhoneBook[] books) {
        System.out.println("조회할 이름을 입력하세요");
        String name = scanner.nextLine();
        for (int i = 0; i < books.length; i++) {
            if (name.equals(books[i].getName())) {
                System.out.println(books[i].getPhoneNumber());
                break;
            }
        }
    }

}//end of class
