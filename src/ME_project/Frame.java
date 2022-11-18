package ME_project;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame extends JFrame {

	JLabel backgroundMap;
	Player player;

	public Frame() {
		initObject();
		initSetting();
		initListner();

		setVisible(true);
	}

	public void initObject() {
		backgroundMap = new JLabel(new ImageIcon("./image/asdf2.png"));
		setContentPane(backgroundMap);

		player = new Player();
		add(player);
	}

	public void initSetting() { // 프레임 실행
		setSize(1500, 800);
		setLayout(null);
		setBackground(Color.WHITE);
		setLocationRelativeTo(null); // 가운데 위치
		setResizable(false);//창 크기 고정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void initListner() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					player.left();
					break;
				case KeyEvent.VK_RIGHT:
					player.right();
					break;
				case KeyEvent.VK_UP:
					player.up();
					break;
				case KeyEvent.VK_DOWN:
					player.down();
					break;
				}
			}
		});
	}

	public static void main(String[] args) {
		new Frame();
	}
}
