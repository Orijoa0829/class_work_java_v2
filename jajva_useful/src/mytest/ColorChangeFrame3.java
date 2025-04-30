package mytest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.random.RandomGenerator;

public class ColorChangeFrame3 extends JFrame implements ActionListener {
    private final int FRAME_SIZE = 500;
    // 만들고 싶은것 : 패널1개,색 지정 버튼 6개 랜덤 지정 버튼 1개

    // 속성

    public JButton[] jButtons;

    private JPanel jPanel;


    //생성자
    public ColorChangeFrame3() {
        initData();
        setInitLayout();
        takeActionListener();
    }

    //메서드
    //객체 생성 관리
    public void initData() {
        jPanel = new JPanel();
        jButtons = new JButton[4];//인덱스0~6 : 색깔 지정 / 7 : 랜덤
        for (int i = 0; i < jButtons.length; i++) {
            jButtons[i] = new JButton("버튼" + i); //버튼 객체 생성 완료
        }
        setSize(FRAME_SIZE, FRAME_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    //배치 관리자
    public void setInitLayout() {
        setLayout(new BorderLayout());
        jPanel.setBackground(Color.RED);
        add(jButtons[0], BorderLayout.SOUTH);
        add(jButtons[1], BorderLayout.NORTH);
        add(jButtons[2], BorderLayout.EAST);
        add(jButtons[3], BorderLayout.WEST);
        add(jPanel, BorderLayout.CENTER);
        setVisible(true);

    }

    public void takeActionListener() {
        for (int i = 0; i < jButtons.length; i++) {
            jButtons[i].addActionListener(this);
        }
    }


    //


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jButtons[0]) {
            jPanel.setBackground(Color.BLACK);
        } else if (e.getSource() == jButtons[1]) {
            jPanel.setBackground(Color.MAGENTA);
        } else if (e.getSource() == jButtons[2]) {
            jPanel.setBackground(Color.CYAN);
        } else if (e.getSource() == jButtons[3]) {
            int r,g,b;
            Random generator =new Random();
            r = generator.nextInt(256);
            g = generator.nextInt(256);
            b = generator.nextInt(256);
            jPanel.setBackground(new Color(r,g,b));
        }
    }

    public static void main(String[] args) {
        new ColorChangeFrame3();
    }
}
