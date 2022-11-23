package ME_project04;

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

import ME_project05.Frame5;

public class clearFrame4 extends JFrame {
	ImageIcon continueBtn = new ImageIcon("./Image/next.png");
	Image clearImg = new ImageIcon("./Image/clear.png").getImage();
	Frame5 F5;

	public clearFrame4() {
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
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				
				F5 = new Frame5();
				setVisible(false); // â �Ⱥ��̰� �ϱ�

			}

		});
	}

	public void paint(Graphics g) {
		g.drawImage(clearImg, 430, 50, null);// background�� �׷���
	}

	public static void main(String[] args) {
		new clearFrame4();
	}
}