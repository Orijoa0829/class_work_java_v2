package com.books;

import com.starcraft_v00.Zealot;
//import 수입하다 가져오다

public class ZealotTest {
    public static void main(String[] args) {

        Zealot[] zealots = new Zealot[5]; //질럿 클래스의 배열,변수명은 zealots

        //반복문 사용하지 말고 질럿3 마리 0, 1, 3 인덱스에 넣어 주세요
        zealots[0] = new Zealot("질럿0");
        zealots[1] = new Zealot("질럿1");
        zealots[3] = new Zealot("질럿3");

        //[질럿0] [질럿1] [null] [질럿3] [null]

        //0번째 인덱스에 넣어둔 질럿의 기능을 showInfo()를 호출 하시오.

        zealots[0].showInfo();

        //반복문을 활용해서 배열안에 있는 질럿들의 showInfo()를 호출 하시오.

        for(int i = 0; i< zealots.length; i++){
            if(zealots[i] == null){
                continue;
            }
            zealots[i].showInfo();
        }





    }
}
