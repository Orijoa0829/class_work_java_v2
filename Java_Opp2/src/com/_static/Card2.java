package com._static;

public class Card2 {

    //static 변수 : 모든 card 객체가 공유하며, 고유 번호를 생성하기 위해 사용할 수 있다.
    private static int cardCounter = 0;
    // 카드발하면 ---> 총 몇개 카드 개수를 알수 있도록 설계

    //인스턴스 변수
    private final String cardId;
    private final String cardName;

    public Card2 (String cardName){
        this.cardName = cardName;
        this.cardId = cardCounter++ + "-11 " + cardCounter + "11-123" ;
    }

    public static int getTotalCards(){
        //static 메서드 안에서 인스턴스 변수를 사용할 수 없다.
        //왜? 인스턴스 변수는 객체가 생성된 이후에 사용될 수 있기 때문이다.
        // System.out.println("cardName: " + cardName);
        return cardCounter;
    }

    //인스턴스 메서드 만들어보자.
    public void showInfo(){
        System.out.println(cardCounter);
        System.out.println(cardName + "의 고유 번호는 " + cardId + "입니다.");

    }












    public static void main(String[] args) {
        //변수 static 은 객체 생성 전에 사용 가능
        // static 메서드는 객체 생성 전에 사용 가능
        // 사용하는 방법 (클래스 이름으로 접근 가능하다)
        System.out.println(Card2.cardCounter);

        //static 메서드 이므로 객체 생성전에 호출해 볼 수 있다.
        System.out.println(Card2.getTotalCards() );



        Card2 c1 = new Card2("우리카드1");
        System.out.println(c1.cardId);




    }
}
