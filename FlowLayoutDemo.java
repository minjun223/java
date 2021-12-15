package chap11;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutDemo extends JFrame{
	FlowLayoutDemo(){
		setTitle("ÇÃ·Î¿ì ·¹ÀÌ¾Æ¿ô");
		
		JPanel p = new JPanel(new FlowLayout());
		
		JButton b1 = new JButton("µ¶");
		JButton b2 = new JButton("¹ÎÁØ");
		JButton b3 = new JButton("¼ºÈÆ");
		JButton b4 = new JButton("Áö¿¹");
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		add(p);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,110);
		setVisible(true);
	}

	public static void main(String[] args) {
		new FlowLayoutDemo();

	}

}
