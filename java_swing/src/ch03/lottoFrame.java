package src.ch03;

import src.ch01.LottoRandomNumber;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lottoFrame extends JFrame implements ActionListener {

    private static final String INITIAL_MESSAGE = "로또 번호를 클릭하세요";
    private static final String FONT_NAME = "고딕";
    private static final int FONT_SIZE = 30;

    private JButton button;
    private LottoRandomNumber lottoRandomNumber;
    private boolean isStarted = true; //초기상태 플래그
    private int[] currentNumbers;

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
        currentNumbers = new int[src.ch03.LottoRandomNumber.LOTTO_NUMBER_COUNT];
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
        isStarted = false;// 상태값 변경
        currentNumbers = lottoRandomNumber.createNumber();
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setFont(new Font("FONT_NAME", Font.BOLD, FONT_SIZE));

        if (isStarted) {
            g.drawString(INITIAL_MESSAGE, 230, 200);
        } else {
            for (int i = 0; i < currentNumbers.length; i++) {
                g.drawString(currentNumbers[i] + "", 100 + (100 * i), 300);
            }

        }


        //로또 랜덤 넘버의 result[i] 값에 접근 하는 방법 ?


    }

    //메인함수 테스트코드 작성
    public static void main(String[] args) {
        new lottoFrame();
    }
}
