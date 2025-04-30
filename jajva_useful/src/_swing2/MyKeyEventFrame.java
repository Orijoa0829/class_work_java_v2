package _swing2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyEventFrame extends JFrame implements KeyListener {
    private final int FRAME_SIZE = 500;

    private JTextArea textArea;

    public MyKeyEventFrame(){
        initData();
        setInitLayout();
        addEventListener();
    }
    private void initData(){
        setSize(FRAME_SIZE,FRAME_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false); //프레임 사이즈 조절 불가

        textArea = new JTextArea();

    }
    private void setInitLayout(){
        setLayout(new BorderLayout());
        add(textArea);
        setVisible(true);

    }
    private void addEventListener(){
        textArea.addKeyListener(this);
    }



    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("KeyCode: " + e.getKeyCode());
        if(e.getKeyCode() == KeyEvent.VK_UP){
            System.out.println("위 화살표 이벤트");
        }else if(e.getKeyCode() == KeyEvent.VK_DOWN){
            System.out.println("아래 화살표 이벤트");
        }else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            System.out.println("왼쪽 화살표 이벤트");
        }else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            System.out.println("오른쪽 화살표 이벤트");
        }

    }
    public static void main(String[] args) {
        //메인함수 - 테스트 코드
        new MyKeyEventFrame();
    }
}
