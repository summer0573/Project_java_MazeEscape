package ME_project;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Moveable {

	int x, y; // 위치 상태

	boolean left;// 움직임 상태
	boolean right;
	boolean up;
	boolean down;

	ImageIcon playerR, playerL, player;

	public Player() {
		initObject();
		initSetting();
		initBackgroundPlayerService();
	}

	public void initObject() {
//		playerR = new ImageIcon("./image/playerTest2R.png");
//		playerL = new ImageIcon("./image/playerTest2L.png");
		player = new ImageIcon("./image/playerTest.png");
	}

	public void initSetting() {
		x = 100;
		y = 640;

		left = false;
		right = false;
		up = false;
		down = false;

		setIcon(player);
		//setSize(390, 419);
		setSize(50, 50);
		setLocation(x, y);
	}

	public void initBackgroundPlayerService() {
		new Thread(new BackgroundPlayerService(this)).start();
	}

	@Override
	public void left() {
		setIcon(player);
		x -= 10;
		setLocation(x, y);
	}

	@Override
	public void right() {
		setIcon(player);
		x += 10;
		setLocation(x, y);
	}

	@Override
	public void up() {
		y -= 10;
		setLocation(x, y);
	}

	@Override
	public void down() {
		y += 10;
		setLocation(x, y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
