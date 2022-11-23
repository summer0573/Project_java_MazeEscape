package ME_project05;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import ME_project06_final.mazeEndFrame;

public class clearFrame5 extends JFrame {
	ImageIcon scoreBtn = new ImageIcon("./Image/score.png");
	Image lastclearImg = new ImageIcon("./Image/lastclear.png").getImage();
	mazeEndFrame EF;


	public clearFrame5() {
		initSetting();
	}
	
	
	public void initSetting() {
		setTitle("Maze Escape"); // Ÿ��Ʋ
		JPanel Jpanel = new JPanel();
		JButton IntBtn = new JButton(scoreBtn);
		setSize(1500, 850); // â ũ�� ����
		IntBtn.setBorderPainted(false); // ��ư �׵θ� ��������
		IntBtn.setPreferredSize(new Dimension(300, 50)); // ��ư ũ�� ����
		IntBtn.setBounds(500, 500, 400, 150);
		add(IntBtn);
		add(Jpanel);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);

		IntBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				EF = new mazeEndFrame();
				setVisible(false); // â �Ⱥ��̰� �ϱ�

			}

		});
	}

	public void paint(Graphics g) {
		g.drawImage(lastclearImg, 430, 50, null);// background�� �׷���
	}

	public static void main(String[] args) {
		new clearFrame5();
	}
}
