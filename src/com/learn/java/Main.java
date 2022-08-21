package com.learn.java;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
            JFrame frame = new JFrame();
            JPanel panel = new JPanel();
            JLabel userLabel = new JLabel("User");
            JLabel passwordLabel = new JLabel("Password");
            JTextField userText = new JTextField();
            JTextField passwordText = new JTextField();

            frame.setSize(350,200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(panel);


            panel.setLayout(null);
            panel.add(userLabel);


            userLabel.setBounds(10,25,80,20);



            frame.setVisible(true);


    }
}
