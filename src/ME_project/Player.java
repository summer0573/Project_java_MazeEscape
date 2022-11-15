package ME_project;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player extends JLabel {
	int x, y;

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
		setIcon(player);
		setSize(50, 50);
		setLocation(x, y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
