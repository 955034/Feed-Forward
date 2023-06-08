import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;

public class NewWindow extends JFrame {

    JLabel label = new JLabel("hello");

    NewWindow() {

        // Set up the main frame
        this.setTitle("Restaurant Page");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        getContentPane().setBackground(Color.WHITE); // Set the background color


        // Create the restaurant box
        JPanel restaurantPanel = new JPanel();
        restaurantPanel.setBorder(BorderFactory.createTitledBorder("Restaurant"));
        restaurantPanel.setBackground(Color.LIGHT_GRAY); // Set the box background color
        JLabel restaurantLabel = new JLabel("Welcome to our restaurant!");
        restaurantPanel.add(restaurantLabel);
        add(restaurantPanel, BorderLayout.NORTH);

        // Create the "About" box
        JPanel aboutPanel = new JPanel();
        aboutPanel.setBorder(BorderFactory.createTitledBorder("About"));
        JLabel aboutLabel = new JLabel("We serve delicious food.");
        aboutPanel.add(aboutLabel);
        add(aboutPanel, BorderLayout.WEST);

        // Create the "Cuisine Type" box
        JPanel cuisinePanel = new JPanel();
        cuisinePanel.setBorder(BorderFactory.createTitledBorder("Cuisine Type"));
        JLabel cuisineLabel = new JLabel("We specialize in Italian cuisine.");
        cuisinePanel.add(cuisineLabel);
        add(cuisinePanel, BorderLayout.CENTER);

        // Create the "Location" box
        JPanel locationPanel = new JPanel();
        locationPanel.setBorder(BorderFactory.createTitledBorder("Location"));
        JLabel locationLabel = new JLabel("123 Main Street, City, Country");
        locationPanel.add(locationLabel);
        add(locationPanel, BorderLayout.EAST);

        // Create the "Meal Packages" boxes
        JPanel mealPanel1 = new JPanel();
        mealPanel1.setBorder(BorderFactory.createTitledBorder("Meal Package 1 - $10"));
        JLabel mealLabel1 = new JLabel("Includes appetizer, main course, and dessert.");
        mealPanel1.add(mealLabel1);
        add(mealPanel1, BorderLayout.SOUTH);

        JPanel mealPanel2 = new JPanel();
        mealPanel2.setBorder(BorderFactory.createTitledBorder("Meal Package 2 - $7"));
        JLabel mealLabel2 = new JLabel("Includes main course and a drink.");
        mealPanel2.add(mealLabel2);
        add(mealPanel2, BorderLayout.SOUTH);

        // Display the frame
        pack();
        setVisible(true);
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new NewWindow();
        });
    }
}
