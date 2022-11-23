package ME_project04;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.Buffer;

import javax.imageio.ImageIO;

public class BackgroundPlayerService implements Runnable {

	BufferedImage image;
	Player player;
	clearFrame4 CF4;

	public BackgroundPlayerService(Player player) {
		this.player = player;
		try {
			image = ImageIO.read(new File("./image/asdf1.png"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void run() {
		while (true) {
			// 색상 확인
			Color leftColor = new Color(image.getRGB(player.getX() - 10, player.getY() + 25));
			Color rightColor = new Color(image.getRGB(player.getX() + 40, player.getY() + 25));
			Color upColor = new Color(image.getRGB(player.getX() + 25, player.getY() + 20));
			Color downColor = new Color(image.getRGB(player.getX() + 25, player.getY() + 80));
			
			if (leftColor.getRed() == 0 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
				System.out.println("왼쪽 벽에 충돌");
				player.setLeftWallCrash(true);
				player.setLeft(false);
			} else if (rightColor.getRed() == 0 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
				System.out.println("오른쪽 벽에 충돌");
				player.setRightWallCrash(true);
				player.setRight(false);
			} else if (upColor.getRed() == 0 && upColor.getGreen() == 0 && upColor.getBlue() == 0) {
				System.out.println("위쪽 벽에 충돌");
				player.setUpWallCrash(true);
				player.setUp(false);
			} else if (downColor.getRed() == 0 && downColor.getGreen() == 0 && downColor.getBlue() == 0) {
				System.out.println("아래쪽 벽에 충돌");
				player.setDownWallCrash(true);
				player.setDown(false);
			}else {
				player.setLeftWallCrash(false);
				player.setRightWallCrash(false);
				player.setUpWallCrash(false);
				player.setDownWallCrash(false);
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if (leftColor.getRed() == 100 && leftColor.getGreen() == 100 && leftColor.getBlue() == 100) {
				System.out.println("L도착");
				CF4 = new clearFrame4();
				break;
			} else if (rightColor.getRed() == 100 && rightColor.getGreen() == 100 && rightColor.getBlue() == 100) {
				System.out.println("R도착");
				CF4 = new clearFrame4();
				break;
			} else if (upColor.getRed() == 100 && upColor.getGreen() == 100 && upColor.getBlue() == 100) {
				System.out.println("U도착");
				CF4 = new clearFrame4();
				break;
			} else if (downColor.getRed() == 100 && downColor.getGreen() == 100 && downColor.getBlue() == 100) {
				System.out.println("D도착");
				CF4 = new clearFrame4();
				break;
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
