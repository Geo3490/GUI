package com.learn.java;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JLabel label = new JLabel();
        JButton button = new JButton();

        frame.setSize(350, 200);
        frame.add(panel);

        panel.setBounds(40, 100, 50, 100);



        frame.setVisible(true);
    }
}
