package mytest;

import javax.swing.*;
import java.awt.*;

public class MyPaintFrame extends JFrame {

    private MyPanel mypanel;


    public MyPaintFrame() {
        initData();
        setInitLayout();
    }

    private void initData() {
        setTitle("집만들기");
        setSize(1000, 1000);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mypanel = new MyPanel();

    }

    private void setInitLayout() {
        super.add(mypanel);

    }

    //내부 클래스
    static class MyPanel extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawRect(700, 350, 600, 520);
            g.drawLine(700, 350, 1000, 50);
            g.drawLine(1300, 350, 1000, 50);
            g.drawLine(700, 870, 400, 1000);
            g.drawLine(1300, 870, 1600, 1000);
            g.drawLine(700, 350, 300, 100);
            g.drawLine(1300, 350, 1600, 100);
            g.drawLine(700, 610, 200, 610);
            g.drawLine(1300, 610, 1800, 610);
            g.drawLine(1000, 350, 1000, 870);
            g.drawOval(875, 200, 40, 40);
            g.drawOval(1075, 200, 40, 40);
            g.drawLine(875, 200, 850, 150);
            g.drawLine(1115, 200, 1140, 150);
            g.drawLine(700, 400, 600, 380);
            g.drawLine(700, 550, 600, 550);
            g.drawLine(700, 700, 600, 720);
            g.drawLine(1300, 400, 1400, 380);
            g.drawLine(1300, 550, 1400, 550);
            g.drawLine(1300, 700, 1400, 720);
            g.drawArc(925, 260, 150, 50, 0, -180);
            g.drawLine(700, 400, 700, 500);
            g.drawLine(700, 500, 800, 600);
            g.drawLine(1300, 400, 1300, 500);
            g.drawLine(1300, 500, 1200, 600);
            g.drawLine(800, 600, 700, 700);
            g.drawLine(1200, 600, 1300, 700);





        }
    }//end of inner class

    public static void main(String[] args) {
        new MyPaintFrame();
    }
}
