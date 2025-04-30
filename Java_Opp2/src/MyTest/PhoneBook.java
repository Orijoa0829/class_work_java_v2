package MyTest;
//- **저장**: 사용자가 이름과 전화번호를 입력하여 전화번호부에 저장할 수 있어야 합니다. //객체 생성시 저 두개가 필요
//- **조회**: 전체 연락처 목록을 조회하거나,//TODO  특정 이름으로 연락처를 검색하여 조회할 수 있어야 합니다.
//- **수정**: 기존 연락처의 전화번호를 변경할 수 있어야 합니다.
//- **삭제**: 전화번호부에서 연락처를 삭제할 수 있어야 합니다.
//- **선택 조회** : 이름을 입력하면 해당 전화번호가 출력 되어야 합니다.
//- **프로그램 종료 - 사용자가 프로그램 종료할 때 까지 계속 실행되어야 합니다.**
//- **Scanner 활용, 입력 받는 데이터 타입은 전부 String 으로 처리**
//- **전화번호 저장은 100까지 한정.** // -> 배열
public class PhoneBook {
    //필요한 속성 설계 .private 쓴다-> 사용자가 나중에 이 값을 읽으려면 getter를 생성해놔야함을 미리 생각
    private String phoneNumber;
    private String name;

    //생성자 설정

    public PhoneBook (String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public PhoneBook(String phoneNumber, String name){
        this(phoneNumber);
        this.name=name;
    }

    //getter
    public String getName(){
        return name;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    //setter
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

}//end of class
