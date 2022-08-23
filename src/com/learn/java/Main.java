package com.learn.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
            private static JFrame frame = new JFrame();
            private static JPanel panel = new JPanel();
            private static JLabel userLabel = new JLabel("User");
            private static JLabel passwordLabel = new JLabel("Password");
            private static JLabel buttonLabel = new JLabel("Log In");
            private static JLabel success = new JLabel("");
            private static JTextField userText = new JTextField(20);
            private static JTextField passwordText = new JTextField();
            private static JButton button = new JButton();


    public static void main(String[] args) {

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
            button.addActionListener(new Main());
            buttonLabel.setBounds(105,100, 40,20);
            button.setBounds(100,100,45,20);

            success.setBounds(10,110,300,25);
            panel.add(success);

            frame.setVisible(true);
    }
        @Override
        public void actionPerformed(ActionEvent e) {
               String user = userText.getText();
               String password = passwordText.getText();

               if(user =="George" && password == "ruby123"){

        }else {

                   System.out.println("Wrong");
               }
    }

}
