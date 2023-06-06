import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class MyFrame extends JFrame{

	JButton button1;
	JButton button2;
    MyFrame() {
        this.setTitle("FeedForward");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        pack();
        setSize(screenSize.width, screenSize.height);
        this.setVisible(true);

        ImageIcon backgroundImage = null;
        ImageIcon logo = null;
        
        button1 = new JButton();
        button2 = new JButton();

        try {
            backgroundImage = new ImageIcon(ImageIO.read(new File("src/Wallpaper_Frame1.jpg")));
            logo = new ImageIcon("src/FeedForward-1 (1).png");
        } catch (IOException e) {
            e.printStackTrace();
        }

        JLabel backgroundLabel = new JLabel(backgroundImage);
        JLabel logoLabel = new JLabel(logo);
        ImageIcon icon = new ImageIcon("src/hand.png");
        ImageIcon iconFood = new ImageIcon("src/Food-icon.png");
        
        JPanel panel = new JPanel();
        panel.setBackground( new Color(105,105,105));
        panel.setPreferredSize(new Dimension(199,100));

        JLayeredPane layeredPane = new JLayeredPane(); //chatgpt
        layeredPane.setLayout(null); //chatgpt
        layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER); //chatgpt
        layeredPane.add(logoLabel, JLayeredPane.PALETTE_LAYER); //chatgpt
        layeredPane.add(button1, JLayeredPane.POPUP_LAYER);
        layeredPane.add(button2, JLayeredPane.POPUP_LAYER);
        layeredPane.add(panel, JLayeredPane.POPUP_LAYER);
 
        backgroundLabel.setBounds(0, 0, screenSize.width, screenSize.height); //chatgpt
        logoLabel.setBounds(0, 0, logo.getIconWidth(), logo.getIconHeight()); //chatgpt
        
        button1.setBounds(700,500,500,100);
        button1.addActionListener(e -> System.out.println("hello"));
        button1.setText("Feed-A-Friend");
        button1.setFocusable(false);
        button1.setIcon(icon);
        button1.setFont(new Font("SF Pro",Font.PLAIN,29));
        button1.setForeground(Color.white);
        button1.setBackground(Color.lightGray);
        
        button2.setBounds(700,350,500,100);
        button2.addActionListener(e -> System.out.println("hello"));
        button2.setText("Need-A-Meal");
        button2.setFocusable(false);
        button2.setIcon(iconFood);
        button2.setFont(new Font("SF Pro",Font.PLAIN,29));
        button2.setForeground(Color.white);
        button2.setBackground(Color.lightGray);
        
        JLabel label = new JLabel("Established 2023");
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setForeground(new Color(75, 141, 151));
        label.setBounds(screenSize.width - 200, screenSize.height - 50, 200, 50);
        
        
        
        this.add(panel);
        this.setContentPane(layeredPane); //chatgpt
        this.getContentPane().add(label); //chatgpt
        this.setIconImage(logo.getImage()); //chatgpt
        
        
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> { //chatgpt
            new MyFrame(); //chatgpt
        });
    }
}
