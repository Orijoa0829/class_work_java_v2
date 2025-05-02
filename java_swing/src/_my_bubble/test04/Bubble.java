package src._my_bubble.test04;

import javax.swing.*;

public class Bubble extends JLabel {

    private int x;
    private int y;
    private Player player;
    private ImageIcon bubble;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setBubble(ImageIcon bubble) {
        this.bubble = bubble;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public Player getPlayer() {
        return player;
    }

    public ImageIcon getBubble() {
        return bubble;
    }

    public Bubble (Player player){
        this.player = player;
        initData();
        setInitLayout();

    }

    private void initData() {
        bubble = new ImageIcon("img/bubble.png");

    }

    private void setInitLayout() {
        setIcon(bubble);
        setSize(50,50);
        setLocation(player.getX(), player.getY());

    }

}
