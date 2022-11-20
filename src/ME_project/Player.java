package ME_project;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Player extends JLabel implements Moveable {

	int x, y; // 위치 상태

	boolean left;// 움직임 상태
	boolean right;
	boolean up;
	boolean down;
	
	public boolean isLeft() {
		return left;
	}
	
	public boolean isRight() {
		return right;
	}
	
	public boolean isUp() {
		return up;
	}
	
	public boolean isDown() {
		return down;
	}
	
	public boolean setLeft(boolean left) {
		 this.left =left;
		return this.left;
	}
	
	public boolean setRight(boolean right) {
		this.right = right;
		return this.right;
	}
	
	public boolean setUp(boolean up) {
		 this.up =up;
		return this.up;
	}
	
	public boolean setDown(boolean down) {
		this.down = down;
		return this.down;
	}

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
		// setSize(390, 419);
		setSize(50, 50);
		setLocation(x, y);
	}

	public void initBackgroundPlayerService() {
		new Thread(new BackgroundPlayerService(this)).start();
	}

	@Override
	public void left() {
		left = true;
		new Thread(() -> {
			while (left) {
				setIcon(player);
				x -= 5;
				setLocation(x, y);
				try {
					Thread.sleep(10); //0.01초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();

	}

	@Override
	public void right() {
		right = true;
		new Thread(() -> {
			while(right) {
				setIcon(player);
				x += 5;
				setLocation(x, y);
				try {
					Thread.sleep(10); //0.01초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}).start();

	}

	@Override
	public void up() {
		up = true;
		new Thread(() -> {
			while(up) {
				setIcon(player);
				y -= 5;
				setLocation(x, y);
				try {
					Thread.sleep(10); //0.01초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}).start();
	}

	@Override
	public void down() {
		down = true;
		new Thread(() -> {
			while(down) {
				setIcon(player);
				y += 5;
				setLocation(x, y);
				try {
					Thread.sleep(10); //0.01초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}).start();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
