package SWING.jbutton;

import javax.swing.*;

public class JButtonDemo {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("J FRAME");

        JButton jButton = new JButton("Click");
        jButton.setBounds(20,50,80,30);
        jFrame.add(jButton);
        jFrame.setSize(400,400);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

    }
}
