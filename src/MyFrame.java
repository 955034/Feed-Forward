import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;
import java.awt.image.*;

public class MyFrame extends JFrame {

	MyFrame(){
		this.setTitle("FeedForward");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		//this.setSize(2000,2000);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		pack();
		setSize(screenSize.width,screenSize.height);
		this.setVisible(true);
		
		this.getContentPane().setBackground(new Color(212,220,222));
		JLabel label = new JLabel();
		label.setText("Established 2023");
		label.setAlignmentX(RIGHT_ALIGNMENT);
		this.add(label);
		ImageIcon logo = new ImageIcon("src/FeedForward-1.png");
		label.setIcon(logo);
		//label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		label.setForeground(new Color(75,141,151));
		this.setIconImage(logo.getImage());

	}
}
