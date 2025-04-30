package com.starcraft_v02;

import java.util.Scanner;

public class GameTest1 {
    public static void main(String[] args) {

        Marine marine1 = new Marine("marine1");
        Zealot zealot1 = new Zealot("Zealot1");
        Zergling zergling1 = new Zergling("Zergling1");

       while(zealot1.getHp()>0){
           marine1.attack(zealot1);
       }
        zealot1.showInfo();
    }
}
