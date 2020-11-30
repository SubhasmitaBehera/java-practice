package SWING.textarea;

import javax.swing.*;
import java.awt.*;

public class TextAreaDemo {
    public static void main(String[] args) {
        JFrame jf = new JFrame("Text Area");
        JTextField jTextField = new JTextField();
        jTextField.setBounds(30,50,80,30);
        jTextField.setColumns(4);
        jf.add(jTextField);
        jf.setSize(400,400);
        jf.setLayout(null);
        jf.setVisible(true);

    }
}
