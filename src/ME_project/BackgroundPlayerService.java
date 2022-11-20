package ME_project;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.Buffer;

import javax.imageio.ImageIO;

public class BackgroundPlayerService implements Runnable {

	BufferedImage image;
	Player player;

	public BackgroundPlayerService(Player player) {
		this.player = player;
		try {
			image = ImageIO.read(new File("./image/asdf.png"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void run() {
		while (true) {
			// ���� Ȯ��
			Color leftColor = new Color(image.getRGB(player.getX() - 10, player.getY() + 25));
			Color rightColor = new Color(image.getRGB(player.getX() + 40, player.getY() + 25));
			Color upColor = new Color(image.getRGB(player.getX() + 25, player.getY() + 20));
			Color downColor = new Color(image.getRGB(player.getX() + 25, player.getY() + 80));
			
			if (leftColor.getRed() == 0 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
				System.out.println("���� ���� �浹");
			} else if (rightColor.getRed() == 0 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
				System.out.println("������ ���� �浹");
			} else if (upColor.getRed() == 0 && upColor.getGreen() == 0 && upColor.getBlue() == 0) {
				System.out.println("���� ���� �浹");
			} else if (downColor.getRed() == 0 && downColor.getGreen() == 0 && downColor.getBlue() == 0) {
				System.out.println("�Ʒ��� ���� �浹");
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
