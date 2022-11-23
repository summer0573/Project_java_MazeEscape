package ME_project06_final;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class mazeEndFrame extends JFrame {
	
	JLabel background;
	
	public mazeEndFrame() {
		initSetting();
		setVisible(true);
	}

	// db 출력하기
	public void initSetting() {
		setTitle("Maze Escape"); // 타이틀
		setSize(1500, 800);
		setLayout(null);
		setBackground(Color.WHITE);
		setLocationRelativeTo(null); // 가운데 위치
		setResizable(false);// 창 크기 고정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		background = new JLabel(new ImageIcon("./image/end.png"));
		setContentPane(background);
		
	}

}
