package _swing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeFrame2 extends JFrame implements ActionListener {

    private JButton button1;
    private JButton button2;
    private JPanel panel;

    public ColorChangeFrame2() {
        initData();
        setInitLayout();
        addEventListener();
    }

    //객체생성관리
    private void initData() {
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        button1 = new JButton("ㅇㅇ");
        button2 = new JButton("ㄴㄴ");
    }

    //배치관리
    private void setInitLayout() {
        setLayout(new BorderLayout());
        panel.setBackground(Color.YELLOW);
        add(panel, BorderLayout.CENTER);
        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);
        setVisible(true);
    }


    //이 메서드의 책임은 이벤트 리스너만을 등록 처리 한다.
    private void addEventListener() {
        button1.addActionListener(this);
        button2.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

        JButton selectedButton = (JButton) e.getSource();
        System.out.println(selectedButton.getText());
        if (selectedButton == button1) {
            panel.setBackground(Color.BLACK);
        } else if (selectedButton == button2){
            panel.setBackground(Color.RED);
        }


        //도전과제
        // 어떻게 버튼1과 버튼2를 구분할까 ?
    }

    public static void main(String[] args) {
        new ColorChangeFrame2();
    }


}
