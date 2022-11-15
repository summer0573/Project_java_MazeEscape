package ME_project;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel implements Moveable {

	int x, y; // 위치 상태

	boolean left;// 움직임 상태
	boolean right;
	boolean up;
	boolean down;

	ImageIcon player;

	public Player() {
		initObject();
		initSetting();
	}

	public void initObject() {
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
		setSize(50, 50);
		setLocation(x, y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void left() {
		x -= 10;
		setLocation(x, y);
	}

	@Override
	public void right() {
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

}
