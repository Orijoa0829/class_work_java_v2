package src.bubble.test02;

import javax.swing.*;

public class Player extends JLabel implements Moveable {

    private int x;
    private int y;

    private ImageIcon playerR;
    private ImageIcon playerL;

    //플레이어 속도 상태
    private final int SPEED = 4;
    private final int JUMP_SPEED = 2;
    //플레이어의 움직인 상태
    private boolean left;
    private boolean right;
    private boolean up;
    private boolean down;

    // setter 만들기
    public void setLeft(boolean left) {
        this.left = left;
    }

    public void setRight(boolean right) {
        this.right = right;
    }


    public Player() {
        initData();
        setInitLayout();

    }

    private void initData() {
        playerR = new ImageIcon("img/playerR.png");
        playerL = new ImageIcon("img/playerL.png");
        //플레이어 초기 상태
        x = 55;
        y = 535;
        left = false;
        right = false;
        up = false;
        down = false;
    }

    private void setInitLayout() {
        setSize(50, 50);
        setIcon(playerR);
        setLocation(x, y);
    }

    @Override
    public void left() {
        left = true; //움직임 상태값 변경
        setIcon(playerL);
        //익명 클래스 =thread.start() --->run() 메서드 안의 구문이 동작된다
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (left) {
                    x -= SPEED;
                    setLocation(x, y);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }).start();
    }

    @Override
    public void right() {
        right = true; //움직임 상태값 변경
        setIcon(playerR);
        //익명 클래스 =thread.start() --->run() 메서드 안의 구문이 동작된다
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (right) {
                    x += SPEED;
                    setLocation(x, y);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }).start();
    }

    @Override
    public void up() {
        up = true; //움직임 상태값 변경
        //익명 클래스 =thread.start() --->run() 메서드 안의 구문이 동작된다
        new Thread(new Runnable() {
            @Override
            public void run() {
                //점프구현 캐릭터 현재좌표에서 y값이 +50만큼 1씩 50번 증가, 만약 50번 증가했다면, 다시 50번 감소
                //
                for (int i = 0; i<130/JUMP_SPEED; i++) {
                    y = y - JUMP_SPEED;
                    setLocation(x, y);
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }//end of
                down();
            }
        }).start();

    }

    @Override
    public void down() {
        down = true;
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i<130/JUMP_SPEED; i++) {
                    y = y + JUMP_SPEED;
                    setLocation(x, y);
                    try {
                        Thread.sleep(3);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }//end of for
                down=false;

            }
        }).start();

    }
}
