package src.game;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.security.Key;
import java.util.EventListener;

public class GameFrame extends JFrame implements KeyListener {

    private BufferedImage backgroundImage;
    private BufferedImage player1;
    private BufferedImage player2;

    private ImagePanel imagePanel;

    private int playerX = 200;
    private int playerY = 300;

    private int player2X = 200;
    private int player2Y = 300;

    private boolean flag = true;

    public GameFrame() {
        initData();
        setInitLayout();
        addEventListener();
        // 메인 작업자가 서브 작업자를 생성한다.
        Thread thread1 = new Thread(imagePanel);
        thread1.start();
        // imagePanel 안에 구현한 run() {} 메서드가 시작 된다.
    }

    private void initData() {
        setSize(1000, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        try {
            backgroundImage = ImageIO.read(new File("images/backgroundMap.png"));
            player1 = ImageIO.read(new File("images/player1.png"));
            player2 = ImageIO.read(new File("images/player2.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        imagePanel = new ImagePanel();
    }

    private void setInitLayout() {
        add(imagePanel);
        setVisible(true);

    }
    private void addEventListener() {
        // JFrame 자체에 키 이벤트 리스너를 등록한다.
        addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyPressed(KeyEvent e) {
        //System.out.println("keyCode : " + e.getKeyCode());
        // TODO 화살표만 추출해 낼 예정..
        int code = e.getKeyCode();
        if(code == KeyEvent.VK_UP) {
            playerY -= 10;
        } else if(code == KeyEvent.VK_DOWN) {
            playerY += 10;
        } else if(code == KeyEvent.VK_LEFT) {
            playerX -= 10;
        } else if(code == KeyEvent.VK_RIGHT) {
            playerX += 10;
        }
        if(Math.abs(player2X-playerX) <= 150 && Math.abs(player2Y-playerY) <=150 ){
            System.out.println("접촉했다 !");
            player1 = null;

        }

        // 그림을 다시 그려라
        repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }


    // 내부 클래스 생성
    private class ImagePanel extends JPanel implements Runnable {

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(backgroundImage, 0, 0, 1000, 600, null);
            g.drawImage(player1, playerX, playerY, 100, 100, null);
            g.drawImage(player2, player2X, player2Y, 500, 500, null);
        }

        @Override
        public void run() {
            // direction -> true 라면 오른쪽 가고 있는 상태
            // direction -> false 라면 왼쪽으로 가고 있는 상태
            boolean direction = true;

            // 서브 작업자가 해야하는 일을 명시하도록 약속 되어 있다.
            while (flag) {
                if(direction == true) {
                    player2X += 5;
                } else {
                    player2X -= 5;
                }

                if(player2X >= 800) {
                    direction = false;
                }

                if(player2X <= 100) {
                    direction = true;
                }

                try {
                    Thread.sleep(5000);
                    // 그림을 다시 그려라
                    repaint();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                //플레이어2의 좌표 150,150이라 가정
                //플레이어1의 좌표가 0~300,0~300이면 null

                System.out.println("player1X : " + playerX);
                System.out.println("player1Y : " + playerY);
                System.out.println("-----------------------");
                System.out.println("player2X : " + player2X);
                System.out.println("player2Y : " + player2Y);



            }
        }
    } // end of inner class
}
