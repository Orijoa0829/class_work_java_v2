package src.ch02;

import src.ch01.LottoRandomNumber;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lottoFrame extends JFrame implements ActionListener {

    private int testNumber = 45;
    private JButton button;
    private LottoRandomNumber lottoRandomNumber;
    private int[] result;

    public lottoFrame() {
        initData();
        setInitData();
        addEventListener();
    }

    private void initData() {
        setTitle("로또게임");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new JButton("게임 스타트");
        lottoRandomNumber = new LottoRandomNumber();
    }

    private void setInitData() {
        add(button, BorderLayout.NORTH);

        setVisible(true);
    }

    private void addEventListener() {
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        System.out.println("그림을 그려라");
        int[] result = lottoRandomNumber.createNumber();

        // 그림을 다시 그려라


        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        Font f = new Font("궁서체", Font.BOLD, 60);
        g.setFont(f);


        for (int i =0; i< 5; i++){
            g.drawString(result[i]+"",(100+i*100),300);
        }

        //로또 랜덤 넘버의 result[i] 값에 접근 하는 방법 ?



    }

    //메인함수 테스트코드 작성
    public static void main(String[] args) {
        new lottoFrame();
    }
}
