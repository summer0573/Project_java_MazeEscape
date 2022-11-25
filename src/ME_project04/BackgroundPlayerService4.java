package ME_project04;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.Buffer;

import javax.imageio.ImageIO;

import ME_project03.clearFrame3;

public class BackgroundPlayerService4 implements Runnable {

	BufferedImage image;
	Player4 player;
	clearFrame4 CF4;
	
	int stage4Time = 1;

	Color leftColor;
	Color rightColor;
	Color upColor;
	Color downColor;

	public BackgroundPlayerService4(Player4 player) {
		this.player = player;
		try {
			image = ImageIO.read(new File("./image/asdf1.png"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	@Override
	public void run() {

		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					// ���� Ȯ��
					leftColor = new Color(image.getRGB(player.getX() - 10, player.getY() + 25));
					rightColor = new Color(image.getRGB(player.getX() + 50, player.getY() + 25));
					upColor = new Color(image.getRGB(player.getX() + 25, player.getY() + 20));
					downColor = new Color(image.getRGB(player.getX() + 25, player.getY() + 80));

					// ���� ������ ������ ����
					if (leftColor.getRed() == 0 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
						System.out.println("���� ���� �浹");
						player.setLeftWallCrash(true);
						player.setLeft(false);
					} else if (rightColor.getRed() == 0 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
						System.out.println("������ ���� �浹");
						player.setRightWallCrash(true);
						player.setRight(false);
					} else if (upColor.getRed() == 0 && upColor.getGreen() == 0 && upColor.getBlue() == 0) {
						System.out.println("���� ���� �浹");
						player.setUpWallCrash(true);
						player.setUp(false);
					} else if (downColor.getRed() == 0 && downColor.getGreen() == 0 && downColor.getBlue() == 0) {
						System.out.println("�Ʒ��� ���� �浹");
						player.setDownWallCrash(true);
						player.setDown(false);
					} else { // ���� ���� ������ ��� �̵�
						player.setLeftWallCrash(false);
						player.setRightWallCrash(false);
						player.setUpWallCrash(false);
						player.setDownWallCrash(false);
					}

					if (leftColor.getRed() == 100 && leftColor.getGreen() == 100 && leftColor.getBlue() == 100) {
						System.out.println("L����");
						CF4 = new clearFrame4();
						break;
					}
					if (rightColor.getRed() == 100 && rightColor.getGreen() == 100 && rightColor.getBlue() == 100) {
						System.out.println("R����");
						CF4 = new clearFrame4();
						break;
					}
					if (upColor.getRed() == 100 && upColor.getGreen() == 100 && upColor.getBlue() == 100) {
						System.out.println("U����");
						CF4 = new clearFrame4();
						break;
					}
					if (downColor.getRed() == 100 && downColor.getGreen() == 100 && downColor.getBlue() == 100) {
						System.out.println("D����");
						CF4 = new clearFrame4();
						break;
					}
				}
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {

					try {
						Thread.sleep(1000);
						System.out.println(stage4Time++);

					} catch (Exception e) {
						e.printStackTrace();
					}
					if (leftColor.getRed() == 100 && leftColor.getGreen() == 100 && leftColor.getBlue() == 100) {
						break;
					}
					if (rightColor.getRed() == 100 && rightColor.getGreen() == 100 && rightColor.getBlue() == 100) {
						break;
					}
					if (upColor.getRed() == 100 && upColor.getGreen() == 100 && upColor.getBlue() == 100) {
						break;
					}
					if (downColor.getRed() == 100 && downColor.getGreen() == 100 && downColor.getBlue() == 100) {
						break;
					}
				}
			}
		}).start();

	}

}
