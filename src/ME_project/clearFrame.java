package ME_project;

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

import ME_project02.Frame2;

public class clearFrame extends JFrame {
	ImageIcon continueBtn = new ImageIcon("./Image/start.png");
	Image clearImg = new ImageIcon("./Image/logo.png").getImage();
	Frame2 F;

	public clearFrame() {
		initSetting();
	}
	
	
	public void initSetting() {
		setTitle("Maze Escape"); // Ÿ��Ʋ
		JPanel Jpanel = new JPanel();
		JButton IntBtn = new JButton(continueBtn);
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
			public void actionPerformed2(ActionEvent arg0) {
				dispose();
			}

			public void actionPerformed(ActionEvent e) {
				F = new Frame2();
				setVisible(false); // â �Ⱥ��̰� �ϱ�
			}

		});
	}

	public void paint(Graphics g) {
		g.drawImage(clearImg, 430, 50, null);// background�� �׷���
	}

	public static void main(String[] args) {
		new clearFrame();
	}
}
