package SWING.textarea;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaMain {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("CALCULATOR");

        JTextField jTextField = new JTextField();
        jTextField.setBounds(10, 50, 80, 30);

        JTextField jTextField1 = new JTextField();
        jTextField1.setBounds(190, 50, 80, 30);

        JTextField jTextField2 = new JTextField();
        jTextField2.setBounds(30,180,225,40);
//        jTextField2.setBackground(Color.darkGray);
        
        jTextField2.setEditable(false);

        JButton jButton1 = new JButton("+");
        jButton1.setBounds(10, 110, 50, 40);
        JButton jButton2 = new JButton("-");
        jButton2.setBounds(80, 110, 50, 40);
        JButton jButton3 = new JButton("*");
        jButton3.setBounds(150, 110, 50, 40);
        JButton jButton4 = new JButton("/");
        jButton4.setBounds(220, 110, 50, 40);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String val1 = jTextField.getText();
                int a = Integer.parseInt(val1);
                String val2 = jTextField1.getText();
                int b = Integer.parseInt(val2);
                int result = a + b;
                jTextField2.setText("Result of Addition = " +result);
            }
        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String val1 = jTextField.getText();
                int a = Integer.parseInt(val1);
                String val2 = jTextField1.getText();
                int b = Integer.parseInt(val2);
                int result = a -b;
                jTextField2.setText("Result of Substraction = " + result);
            }
        });
        jButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String val1 = jTextField.getText();
                int a = Integer.parseInt(val1);
                String val2 = jTextField1.getText();
                int b = Integer.parseInt(val2);
                int result = a * b;
                jTextField2.setText("Result of Multiplication = " + result);
            }
        });
        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String val1 = jTextField.getText();
                int a = Integer.parseInt(val1);
                String val2 = jTextField1.getText();
                int b = Integer.parseInt(val2);
                int result = a / b;
                jTextField2.setText("Result of Division = " + result);
            }
        });
        jFrame.add(jButton1);
        jFrame.add(jButton2);
        jFrame.add(jButton3);
        jFrame.add(jButton4);
        jFrame.add(jTextField);
        jFrame.add(jTextField1);
        jFrame.add(jTextField2);
        jFrame.setSize(295, 300);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}
