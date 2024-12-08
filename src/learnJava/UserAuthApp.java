package learnJava;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class UserAuthApp {
    public static void main(String[] args) {
//         Sample user credentials (username: password)
        HashMap<String, String> users = new HashMap<>();
        users.put("admin", "password123");
        users.put("user", "welcome123");

        // Create JFrame
        JFrame frame = new JFrame("User Authentication");
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(4, 1, 10, 10));

        // Add components
        JLabel usernameLabel = new JLabel("Username:");
        JTextField usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JLabel statusLabel = new JLabel("", SwingConstants.CENTER);

        // Add components to the frame
        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(statusLabel);

        // Action listener for login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (users.containsKey(username) && users.get(username).equals(password)) {
                    statusLabel.setText("Login Successful!");
                    statusLabel.setForeground(Color.GREEN);
                } else {
                    statusLabel.setText("Invalid credentials, try again.");
                    statusLabel.setForeground(Color.RED);
                }
            }
        });
        

        // Center the frame and make it visible
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
