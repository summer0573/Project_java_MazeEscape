package ME_project05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Frame5 extends JFrame {

	JLabel backgroundMap;
	Player5 player;


	public Frame5() {
		initObject();
		initSetting();
		initListner();

		setVisible(true);
	}

	public void initObject() {
		backgroundMap = new JLabel(new ImageIcon("./image/asdf6.png"));
		setContentPane(backgroundMap);

		player = new Player5();
		add(player);
	}
	

	public void initSetting() { // 프레임 실행
		setTitle("Maze Escape"); // 타이틀
		setSize(1500, 800);
		setLayout(null);
		setBackground(Color.WHITE);
		setLocationRelativeTo(null); // 가운데 위치
		setResizable(false);//창 크기 고정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void initListner() {
		addKeyListener(new KeyAdapter() {
			
			//키보드를 눌렀을 시 발생 이벤트
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					if(!player.isLeft() && !player.isLeftWallCrash()) {
						player.left();
					}
					break;
				case KeyEvent.VK_RIGHT:
					if(!player.isRight() && !player.isRightWallCrash()) {
						player.right();
					}
					break;
				case KeyEvent.VK_UP:
					if(!player.isUp() && !player.isUpWallCrash()) {
						player.up();
					}
					break;
				case KeyEvent.VK_DOWN:
					if(!player.isDown() && !player.isDownWallCrash()) {
						player.down();
					}
					break;
				}
			}
			//키보드 해제 이벤트
			@Override
			public void keyReleased(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_LEFT:
					player.setLeft(false);
					break;
				case KeyEvent.VK_RIGHT:
					player.setRight(false);
					break;
				case KeyEvent.VK_UP:
					player.setUp(false);
					break;
				case KeyEvent.VK_DOWN:
					player.setDown(false);
					break;
				}
			}
		});
	}

	public static void main(String[] args) {
		new Frame5();
	}
}
