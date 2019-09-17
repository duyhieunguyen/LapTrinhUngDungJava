package baitap1;

import javax.swing.JFrame;

public class MyWindow extends JFrame {
	public MyWindow() {
		super("Demo Windows");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		MyWindow ui = new MyWindow();
		ui.setSize(400,300);
		ui.setLocationRelativeTo(null);
		ui.setVisible(true);
	}
}
