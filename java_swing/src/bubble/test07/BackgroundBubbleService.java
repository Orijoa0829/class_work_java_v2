package src.bubble.test07;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 백그라운드플레이어 서비스는 스레드가 계속 작동하는 상태이다
 * 백그라운드 버블 서비스는 스레드가 너무 많이 발생 될 것 같아서,
 * 게임에 렉 발생 가능성이 너무 높다
 */
public class BackgroundBubbleService {
    private Bubble bubble;

    private BufferedImage image;

    //생성자
    public BackgroundBubbleService(Bubble bubble) {
        try {
            this.bubble = bubble;
            image = ImageIO.read(new File("img/backgroundMapService.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // 왼쪽 벽 확인
    public boolean leftWall() {
        Color leftColor = new Color(image.getRGB(bubble.getX() + 10, bubble.getY() + 25));
        //빨간색 : R G B (255,0,0) ->왼쪽벽 판단 가능
        if (leftColor.getRed() == 255 && leftColor.getBlue() == 0 && leftColor.getGreen() == 0){
            return true;
        }
            return false;
    }
    //오른쪽 벽
    public boolean rightWall() {
        Color rightColor = new Color(image.getRGB(bubble.getX() + 60, bubble.getY() + 25));
        //빨간색 : R G B (255,0,0) ->오른쪽벽 판단 가능
        if (rightColor.getRed() == 255 && rightColor.getBlue() == 0 && rightColor.getGreen() == 0){
            return true;
        }
        return false;
    }
    public boolean upWall(){
        Color upColor = new Color(image.getRGB(bubble.getX()+30 , bubble.getY() ));
        //빨간색 : R G B (255,0,0) ->오른쪽벽 판단 가능
        if (upColor.getRed() == 255 && upColor.getBlue() == 0 && upColor.getGreen() == 0){
            return true;
        }
        return false;
    }

}
