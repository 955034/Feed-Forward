import java.awt.Color;
import java.awt.Image;

import javax.swing.*;
import java.awt.image.*;

public class MyFrame extends JFrame {

	MyFrame(){
		this.setTitle("FeedForward");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(2000,2000);
		this.setVisible(true);
		
		this.getContentPane().setBackground(Color.white);
		JLabel label = new JLabel();
		label.setText("Introtext");
		this.add(label);
		ImageIcon logo = new ImageIcon("src/LogoForPage.png");
		label.setIcon(logo);
		//ImageIcon scaleImage = logo.getImage().getScaledInstance(208, 208, Image.SCALE_DEFAULT);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.CENTER);
		label.setForeground(Color.green);
	}
}
