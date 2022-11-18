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

public class Intro extends JFrame {
	ImageIcon btnImg = new ImageIcon("./Image/start.png");
	Image logo = new ImageIcon("./Image/logo.png").getImage();

	public Intro() {
		super("Maze Escape"); // Ÿ��Ʋ
		JPanel Jpanel = new JPanel();
		JButton IntBtn = new JButton(btnImg);
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

			@Override
			public void actionPerformed(ActionEvent e) {
				new Frame();
				setVisible(false); // â �Ⱥ��̰� �ϱ�
			}
		});
	}

	public void paint(Graphics g) {
		g.drawImage(logo, 430, 50, null);// background�� �׷���
	}

	public static void main(String[] args) {
		new Intro();
	}
}
