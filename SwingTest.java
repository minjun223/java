package chap11;

import javax.swing.JFrame;

class Swing extends JFrame{
	Swing(){
		setTitle("�ڹ� ������ǥ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(500,500);
		setVisible(true);
	}
}
public class SwingTest {

	public static void main(String[] args) {
		new Swing();
	}

}
