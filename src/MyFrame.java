import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {

    JButton button1;
    JButton button2;

    MyFrame() {
        this.setTitle("FeedForward");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
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
        panel.setOpaque(true); // Enable opacity
        panel.setBackground(new Color(0, 100, 100, 150));

        backgroundLabel.setBounds(0, 0, screenSize.width, screenSize.height);
        logoLabel.setBounds(0, 0, logo.getIconWidth(), logo.getIconHeight());

        button1.setBounds(300, 500, 500, 100);
        button1.setText("Feed-A-Friend");
        button1.setFocusable(false);
        button1.setIcon(icon);
        button1.setFont(new Font("SF Pro", Font.PLAIN, 29));
        button1.setForeground(new Color(0, 100, 100));
        button1.setBackground(Color.white);
        button1.addActionListener(this);

        button2.setBounds(300, 350, 500, 100);
        button2.addActionListener(e -> System.out.println("hello"));
        button2.setText("Need-A-Meal");
        button2.setFocusable(false);
        button2.setIcon(iconFood);
        button2.setFont(new Font("SF Pro", Font.PLAIN, 29));
        button2.setForeground(new Color(0, 100, 100));
        button2.setBackground(Color.white);

        JLabel label = new JLabel("Established 2023");
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setVerticalAlignment(JLabel.TOP);
        label.setForeground(new Color(75, 141, 151));
        label.setBounds(screenSize.width - 1350, screenSize.height - 580, 200, 50);
        
        JLabel label1 = new JLabel("Feed Forward");
        label1.setHorizontalAlignment(JLabel.RIGHT);
        label1.setVerticalAlignment(JLabel.TOP);
        label1.setForeground(new Color(75, 141, 151));
        label1.setFont(new Font("SF Pro", Font.PLAIN, 69));
        label1.setBounds(screenSize.width - 1550, screenSize.height - 680, 900, 100);
        
        JLabel label2 = new JLabel("Share a Meal, Make an Impact!");
        label2.setHorizontalAlignment(JLabel.RIGHT);
        label2.setVerticalAlignment(JLabel.TOP);
        label2.setForeground(Color.white);
        label2.setFont(new Font("SF Pro", Font.PLAIN, 25));
        label2.setBounds(screenSize.width - 650, screenSize.height - 425, 500, 100);


        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setLayout(null);
        layeredPane.add(backgroundLabel, JLayeredPane.DEFAULT_LAYER);
        layeredPane.add(label, JLayeredPane.DRAG_LAYER);
        layeredPane.add(label2, JLayeredPane.DRAG_LAYER);
        layeredPane.add(label1, JLayeredPane.DRAG_LAYER);
        layeredPane.add(logoLabel, JLayeredPane.PALETTE_LAYER);
        layeredPane.add(button1, JLayeredPane.POPUP_LAYER);
        layeredPane.add(button2, JLayeredPane.POPUP_LAYER);
        layeredPane.add(panel, JLayeredPane.PALETTE_LAYER);

        int panelWidth = 600;
        int panelHeight = 400;
        int panelX = screenSize.width - panelWidth-400;
        int panelY = screenSize.height - panelHeight -50;
        panel.setBounds(panelX, panelY, panelWidth, panelHeight);

        this.setContentPane(layeredPane);
        this.setIconImage(logo.getImage());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            this.dispose();
            NewWindow myWindow = new NewWindow();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MyFrame();
        });
    }
}
