package _swing;

import javax.swing.*;
import java.awt.*;

public class MyPanelEx1 extends JFrame {

    private  JButton button1;
    private  JButton button2;
    private  JButton button3;
    private  JButton button4;
    //컴포넌트들을 그룹화 시킬 수 있다. 즉, 각각의 배치관리자를 추가로 설정해서 관리할 수도 있다.
    private  JPanel panel1;
    private  JPanel panel2;





    public MyPanelEx1() {
        initData();
        setInitLayout();
    }

    private void initData() {
        setTitle("패널 연습해보기");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        //그리드레이아웃 : 다단 (1단..2단..3단..)으로 배치하는 레이아웃
        setLayout(new GridLayout(2,1));
        panel1 = new JPanel();
        panel2 = new JPanel();

        button1 = new JButton("button1");
        button2 = new JButton("button2");
        button3 = new JButton("button3");
        button4 = new JButton("button4");




    }

    private void setInitLayout() {
        setLayout(new GridLayout(2,1));


        //R G B
        //0 0 0 --> 흰색
        //255 255 255 --> 검은색

        panel1.setBackground(Color.WHITE);
        add(panel1);

        panel2.setBackground(Color.MAGENTA);
        add(panel2);

        //패널1에 버튼1을 붙여보자.
        //패널1에 아직 배치 관리자를 설정안했음...(기본 배치관리자가 세팅됨)
        panel1.setLayout(new FlowLayout(FlowLayout.LEFT, 700, 30));
        panel1.add(button1);
        panel1.add(button2);

        panel2.setLayout(new FlowLayout(FlowLayout.RIGHT, 700, 30));
        panel2.add(button3);
        panel2.add(button4);

    }


    //테스트 코드 작성
    public static void main(String[] args) {

        new MyPanelEx1();

    }
}
