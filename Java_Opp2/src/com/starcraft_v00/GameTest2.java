package com.starcraft_v00;

import java.util.Scanner;

public class GameTest2 {
    public static void main(String[] args) {

        Marine marine1 = new Marine("marine1");
        Zealot zealot1 = new Zealot("Zealot1");
        Zergling zergling1 = new Zergling("Zergling1");

        //마린1로 질럿1을 때려보자
        marine1.attackZealot(zealot1);

        //공격을 당할때마다 남은 HP를 표시하게 하고싶군.
        //클래스로 이동하여 메서드에 System.out.println(name + "의 남은 Hp: " + hp) 추가;

        marine1.attackZealot(zealot1);

        //공격할때마다 실행을 반복해야하니 귀찮다.. 반복문을 써보자
        //스캐너를 통해 입력받기
        Scanner sc = new Scanner(System.in);


        while (true) {//실행식
            // 1. 메뉴들 중 사용자 입력값을 받아 선택
            System.out.println("유닛을 선택하세요 1.마린 2.질럿 3.저글링 0.종료");
            int choice = sc.nextInt();
            // 사용자의 입력값에 따라 처리
            if (choice == 1) { // 사용자가 1번을 입력 했을 시 들어옴
                System.out.println("타겟으로 지정할 유닛 설정 : 1.질럿 2.저글링");
                // 사용자의 입력값을 받아 무슨 타켓을 정할 지 확인
                int selNum = sc.nextInt();
                // 입력값에 따라 처리
                if (selNum == 1) { // 질럿 공격
                    marine1.attackZealot(zealot1);
                } else if (selNum == 2) { // 저글링 공격
                    marine1.attackZergling(zergling1);
                }
                // 2. 명령문이 끝났을 시 다시 1번으로 이동
            } else if (choice == 2) {
                System.out.println("타겟으로 지정할 유닛 설정 : 1.마린 2.저글링");
                int selNum = sc.nextInt();
                if (selNum == 1) {
                    zealot1.attack(marine1);
                } else if (selNum == 2) {
                    zealot1.attack(zergling1);
                }
            } else if (choice == 3) { // 저글링 공격 명령어 작성
                System.out.println("타겟으로 지정할 유닛 설정 : 1.마린 2.질럿");
                int selNum = sc.nextInt();
                if (selNum == 1) {
                    zergling1.attackMarine(marine1);
                } else if (selNum == 2) {
                    zergling1.attackZealot(zealot1);
                }

            } else if (choice == 0) { // 프로그램 종료
                System.out.println("프로그램 종료");
                break;
            }
        }
    }
}
