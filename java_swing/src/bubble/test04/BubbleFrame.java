package src.bubble.test04;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BubbleFrame extends JFrame {
    //-------------------------------------------속성---------------------------------------------
    private JLabel backgroundMap; //배경 맵
    private Player player;


    //-------------------------------------------생성자-------------------------------------------
    public BubbleFrame() {
        initData();
        setInitLayout();
        addEventListener();


        new Thread(new BackgroundPlayerService(player)).start();
    }

    //----------------------------------------------메서드-----------------------------------------
    private void initData() {
        setTitle("버블버블");
        setSize(1000, 640);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        backgroundMap = new JLabel(new ImageIcon("img/backgroundMap.png"));
        // 루트 패널에 JLabel 을 넣어보기
        setContentPane(backgroundMap);
        player = new Player();
    }

    private void setInitLayout() {
        setLayout(null);//좌표기준 (absolute) 절대 레이아웃
        setResizable(false);// 화면크기 조절 막기
        setLocationRelativeTo(null);// JFrame 화면 가운데 배치해준다
        add(player);
        //플레이어 add 처리 하기 - add는 컴포넌트만 가능하므로 플레이어에 extends JLable

        setVisible(true);
    }

    private void addEventListener() {
        //프레임에 키보드 이벤트 리스너 등록 처리
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("code : " + e.getKeyCode());
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        if (!player.isLeft() && !player.isLeftWallCrash()) {
                            System.out.println("왼쪽 누르고잇음");
                            player.left();
                        }
                        break;
                    case KeyEvent.VK_RIGHT:
                        //만약 플레이어가 오른쪽으로 가고 있는 상태가 아니라면, 메서드를 수행해
                        //만약 플레이어가 오른쪽으로 가고 있는 상태라면, right 메서드를 수행하지마
                        if (player.isRight() == false && player.isRightWallCrash() == false) {
                            System.out.println("오른쪽 누르고잇음");
                            player.right();
                        }
                        break;
                    case KeyEvent.VK_UP:
                        player.up();
                        break;
                    case KeyEvent.VK_SPACE:
                        add(new Bubble(player));
                        break;
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("code : " + e.getKeyCode());
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        //왼쪽으로 가고있다면 멈춰(while 문 종료 - thread 종료됨)
                        player.setLeft(false);
                        break;
                    case KeyEvent.VK_RIGHT:
                        player.setRight(false);
                        break;
                    case KeyEvent.VK_UP:
                        player.up();
                        break;
                }


            }
        });
    }

    //테스트 코드 ---------------------------------메인함수------------------------------
    public static void main(String[] args) {
        new BubbleFrame();
    }


}
