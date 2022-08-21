package com.learn.java;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
            JFrame frame = new JFrame();
            JPanel panel = new JPanel();
            JLabel userLabel = new JLabel("User");
            JLabel passwordLabel = new JLabel("Password");
            JLabel buttonLabel = new JLabel("Log In");
            JTextField userText = new JTextField();
            JTextField passwordText = new JTextField();
            JButton button = new JButton();

            frame.setSize(350,200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(panel);


            panel.setLayout(null);
            panel.add(userLabel);
            panel.add(passwordLabel);
            userLabel.setBounds(20,20,80,20);
            passwordLabel.setBounds(20,60,80,20);

            panel.add(userText);
            userText.setBounds(100,20,165,25);
            panel.add(passwordText);
            passwordText.setBounds(100,60, 165, 25);

            panel.add(buttonLabel);
            panel.add(button);
            buttonLabel.setBounds(105,100, 40,20);
            button.setBounds(100,100,45,20);


            frame.setVisible(true);


    }
}
