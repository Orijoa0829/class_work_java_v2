package src.test.game;
//배경,플레이어1,플레이어2
//플레이어2 자동이동
//플레이어1 직접조종

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class GameFrame extends JFrame implements KeyListener {

    //속성
    //플레이어1,플레이어2,배경맵
    private BufferedImage backGroundMap;
    private BufferedImage player1;
    private BufferedImage player2;
    private ImagePanel imagePanel;
    private int player1X = 200;
    private int player1Y = 200;
    private int player2X = 500;
    private int player2Y = 200;




    //

    //생성자
    public GameFrame() {
        initData();
        setInitData();
        addEventListener();
        Thread thread1 = new Thread(imagePanel);
        thread1.start();
    }

    //메서드
    private void initData() {
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            backGroundMap = ImageIO.read(new File("images/backGroundMap.png"));
            player1 = ImageIO.read(new File("images/player1.png"));
            player2 = ImageIO.read(new File("images/player2.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        imagePanel = new ImagePanel();
    }

    private void setInitData() {
        add(imagePanel);
        setVisible(true);
    }

    private void addEventListener() {
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        //플레이어 좌표값을 이동할껀데..플레이어1 좌표변수는 draw 에서 하드코딩했네
        //멤버변수로 좌표 선언하고 draw 에서 치환해주자
        //switch - case 문은 비교연산자를 사용할수없고 무조건 리터럴만 넣을수있다.

        System.out.println("키 코드 " + e.getKeyCode());
        switch (e.getKeyCode()) {
            case 37:
                player1X -= 5;
                break;
            case 38:
                player1Y -= 5;
                break;
            case 39:
                player1X += 5;
                break;
            case 40:
                player1Y += 5;
                break;
        }//end of switch - case

        if (Math.abs(player2X - player1X) <= 150 && Math.abs(player2Y - player1Y) <= 150) {
            System.out.println("접촉");
            player1 = null;
        }
        repaint();
        //플레이어 1 이동 능력 구현 완료 . 플레이어 2 이동 구현해보자
        //플레이어2 하드코딩된 draw의 좌표 지역변수로 수정하자

        //쓰레드 구현은 ? 상속과 인터페이스
        //상속은 JFrame 을 쓰고있으니 인터페이스를 활용하자
    }

    @Override
    public void keyReleased(KeyEvent e) {


    }

    //내부클래스
    private class ImagePanel extends JPanel implements Runnable {
        @Override
        protected void paintComponent(Graphics g) {
            g.drawImage(backGroundMap, 0, 0, 1000, 600, null);
            g.drawImage(player1, player1X, player1Y, 100, 100, null);
            g.drawImage(player2, player2X, player2Y, 100, 100, null);
            //맵이랑 플레이어들은 구현했고.. 플레이어 1을 움직이게 하고싶어.
            //keyListener 로 가자
        }

        @Override
        public void run() {
            //추상 인터페이스 러너블을 구현하여 메서드 오버라이드로 재정의 해주어야한다.
            //플레이어2가 x좌표 100,900에 도달할때마다 방향을 바꾸고싶어->분기점flag
            //방향 변수필요
            boolean flag = true; // 분기 나누기
            boolean direction = true; //트루 우측 , 펄스 좌측으로 가정
            while (flag) {
                if (direction) {
                    player2X += 5;
                } else {
                    player2X -= 5;
                }

                if (player2X >= 900) {
                    direction = false;
                }
                if (player2X <= 100) {
                    direction = true;
                }
                try {
                    Thread.sleep(50);
                    // 그림을 다시 그려라
                    repaint();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }//end of while


        }
    }//end of inner class

    //테스트
    public static void main(String[] args) {
        new GameFrame();

    }
}
