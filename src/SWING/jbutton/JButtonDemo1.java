package SWING.jbutton;

import javax.swing.*;

public class JButtonDemo1 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("J FRAME");
        JButton jButton = new JButton();
        jButton.setBounds(170,90,80,22);
        jButton.setIcon(new ImageIcon("C:\\Users\\user\\Desktop\\ALL PROGRAMM\\HTML\\project-2\\button.jpg"));
        jFrame.add(jButton);
        jFrame.setSize(400,400);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }
}
