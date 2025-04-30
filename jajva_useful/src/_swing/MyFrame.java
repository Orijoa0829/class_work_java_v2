package _swing;

import javax.swing.*;

/**
 * Jlabel 이용해서 이미지를 다룰 수 있다.
 * Jlabel.add()라는 메소드를 이용해서 이미지를 겹칠 수 있다.
 * 좌표 기준으로 배치 관리자를 세팅하려면 null값을 세팅해야한다.
 *
 */

public class MyFrame extends JFrame {

    private JLabel backgroundMap;
    private JLabel player;



    public MyFrame (){
        initData();
        setInitLayout();
    }
    private void initData(){
        setTitle("Jlabel 이용한 이미지 사용 연습");
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon backgroundIcon = new ImageIcon("images/background.png");
        ImageIcon playIcon = new ImageIcon("images/player.png  ");

        //Jlabel
        backgroundMap = new JLabel(backgroundIcon);
        player = new JLabel(playIcon);

        backgroundMap.setSize(500, 500);
        backgroundMap.setLocation(0,0);

        player.setSize(100,100);
        player.setLocation(200,350);

    }
    private void setInitLayout(){
        //좌표기반으로 셋팅이 됨(주의점 - 컴폰턴트에 크기 지정, 컴포넌트에 x,y 지정)
        setLayout(null);


        //루트 패널에 붙이기
        add(player);
        add(backgroundMap);

        setVisible(true);
    }

    //테스트 코드 작성
    public static void main(String[] args) {

        new MyFrame();
    }

}
