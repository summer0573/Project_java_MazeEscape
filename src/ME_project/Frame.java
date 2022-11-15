package ME_project;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame{
	
	JLabel backgroundMap;
	Player player;
	
	public Frame() {
		screen();
		backGroundMap();
		setVisible(true);
	}
	
	
		public void backGroundMap() {
		backgroundMap = new JLabel(new ImageIcon("./image/asdf.png"));
		setContentPane(backgroundMap);
		
		player = new Player();
		add(player);
	}
		
		
	public void screen() { //������ ����
		setSize(1500, 800);
		setLayout(null);	
		setLocationRelativeTo(null); //��� ��ġ
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		new Frame();
	}
}

