package tcsss;

import java.awt.Color;

import java.awt.Font;

//import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JLabel label = new JLabel();
		label.setText("Welcome to Cat cafe! ");
		
		
		ImageIcon image = new ImageIcon("C:\\Users\\Marianne\\eclipse-workspace\\Tea and Coffee Shop Sales System\\src\\tcsss\\catlogo2.jpg");
		label.setIcon(image);
		
		// set the opening text to top and center
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		
		// setting foreground and background
		label.setForeground(new Color(0xf9df88));
		label.setFont(new Font("MV Boli",Font.ITALIC,20));
		label.setBackground(new Color(0x98694e));
		label.setOpaque(true);
		//label.setIconTextGap(50);
	
		 
		// setting  the icon and the txt in the center
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(100,100, 350, 350);
		
		
		
		
		
		
		
		
		
		
		
		JFrame frame = new JFrame();
		frame.add(label); 
		
		frame.setTitle("Tea and Cofee Shop Sales System");
		
		frame.setSize(800,600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setResizable(false);
		
		frame.setLayout(null);
		
		
		//frame.getContentPane().setBackground(new Color(0x606C38));
		
		
	}	

	}


