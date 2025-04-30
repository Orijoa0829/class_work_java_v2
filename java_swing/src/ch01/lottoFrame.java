package src.ch01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lottoFrame extends JFrame implements ActionListener {

    private JButton button;

    public lottoFrame() {
        initData();
        setInitData();
        addEventListener();
    }

    private void initData(){
        setTitle("로또게임");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new JButton("게임 스타트");
    }

    private void setInitData(){
        add(button, BorderLayout.NORTH);

        setVisible(true);
    }

    private void addEventListener(){
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0; i<=6; i++ ){

        }
        System.out.println("그림을 그려라");
    }

    //메인함수 테스트코드 작성
    public static void main(String[] args) {
        new lottoFrame();
    }
}
