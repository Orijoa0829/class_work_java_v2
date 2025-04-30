package com.Inheritance;

public class Warrior extends Hero {

    public Warrior(String name, int hp){
        //부모 사용자 정의 생성자가 있다면 super 키워드를 활용해서
        //가장 먼저 부모 생성자를 호출 해야 한다.
        super(name,hp);
    }
    //메서드


    @Override
    void attack() {
        super.attack();
        System.out.println("전사의 기본 공격");
    }

    void comboAttack(){
        System.out.println("전사의 콤보 어택");
    }


    public static void main(String[] args) {
        Archer archer1=new Archer("archer1",10);
        Warrior warrior1=new Warrior("warrior1",40);
        Wizard wizard1= new Wizard("wizard1",5);
    }
}
