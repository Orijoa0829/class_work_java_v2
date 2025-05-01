package src._my_bubble;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 현재 메인쓰레드는 너무 바쁨
 * 백그라운드에서 계속 플레이어의 움직임을 관찰할 예정
 */
//서브쓰레드 사용하기 위해 러너블 인터페이스 구현
public class BackgroundPlayerService implements Runnable {
    //-------------멤버변수-------------
    private BufferedImage image;
    private Player player;

    //-------------생성자-------------
    public BackgroundPlayerService(Player player) {
        this.player = player;
        try {
            ImageIO.read(new File("img/backgroundMapService.png"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //-------------메서드-------------
    @Override
    public void run() {
        //생성자를 통해 플레이어를 주입받아 객체생성,백그라운드서비스맵 생성됨
        //하고싶은거 : 벽 인식 로직을 통해 캐릭터 이동 제한
        // 백그라운드 맵의 RBG 값을 이용해서 현재 캐릭터 좌표와 비교해
        // 특정 색상이 감지되면 이동 멈춤.
        //왼쪽 벽 색에 의한 왼쪽 이동 제어

        Color leftColor = new Color(image.getRGB(player.getX(), player.getY() + 25));
        //현재 캐릭터의 근처의 좌표값을 인수로, 주변 색을 추출함 . +는 캐릭터의 픽셀 그리는 시작점 보정
        Color rightColor = new Color(image.getRGB(player.getX() + 60, player.getY() + 25));
        //System.out.println("왼쪽 확인 : " + leftColor );
        //System.out.println("오른쪽 확인 : " + RightColor );


        while (true) {
            //만약 leftColor 의 값이 RGB(255,0,0) 이라면
            if (leftColor.getRed() == 255 && leftColor.getBlue() == 0 && leftColor.getGreen() == 0) {
                //왼쪽벽에 충돌한것으로 판별한다
                player.setLeftWallCrash(true);
                player.setLeft(false); //
            } else if (rightColor.getRed() == 255 && rightColor.getBlue() == 0 && rightColor.getGreen() == 0){
                player.setRightWallCrash(true);
                player.setLeft(false);
            }

        }

    }
}