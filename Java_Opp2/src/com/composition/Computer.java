package com.composition;

public class Computer {
    private String userName;
    CPU cpu;


    //생성자
    public Computer(String username){
        this.userName = userName;
        CPU cpu = new CPU();
    }

    //메서드
    public void startComputer () {
        cpu.startCpu();
        System.out.println("컴퓨터를 켭니다");
    }
    public void stopComputer(){
        System.out.println("컴퓨터를 끕니다");
    }

    public static void main(String[] args) {
        Computer computer = new Computer("moon");
        computer.startComputer();


    }

}
