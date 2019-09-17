package baitap4;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BtBorderLayout extends JFrame{
	public BtBorderLayout() {
		super("BorderLayout");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel pnBorder = new JPanel();
		pnBorder.setLayout(new BorderLayout());
		
		JPanel pnNorth = new JPanel();
		pnNorth.setBackground(Color.red);
		pnBorder.add(pnNorth, BorderLayout.NORTH);
		
		JPanel pnSouth = new JPanel();
		pnSouth.setBackground(Color.red);
		pnBorder.add(pnSouth, BorderLayout.SOUTH);
		
		JPanel pnWest = new JPanel();
		pnWest.setBackground(Color.blue);
		pnBorder.add(pnWest, BorderLayout.WEST);
		
		JPanel pnEast = new JPanel();
		pnEast.setBackground(Color.blue);
		pnBorder.add(pnEast, BorderLayout.EAST);
		
		JPanel pnCenter = new JPanel();
		pnCenter.setBackground(Color.yellow);
		pnBorder.add(pnCenter, BorderLayout.CENTER);
		
		getContentPane().add(pnBorder);
		
	}
	public static void main(String[] args) {
		BtBorderLayout border = new BtBorderLayout();
		border.setSize(200,200);
		border.setVisible(true);
	}
}
