package SWING.jpasswordField;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JPasswordFieldDemo {
    public static void main(String[] args) {
        Font font = new Font("TimesRoman",Font.ITALIC,19);
        JFrame jFrame = new JFrame("Password");

        JTextField tf = new JTextField();
        tf.setBounds(30,40,180,30);
        tf.setFont(font);

        JPasswordField jp = new JPasswordField();
        jp.setBounds(30,100,180,30);
        jp.setFont(font);

        JButton jb = new JButton("Show");
        jb.setBounds(40,150,80,30);

        JTextField tf1 = new JTextField();
        tf1.setBounds(30,210,380,30);
        tf1.setEditable(false);
        tf1.setFont(font);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = "User Name : " +tf.getText();
//                data = data + ",Password : " +String.valueOf(jp.getPassword());
//                data = data + ",Password : " + String.copyValueOf(jp.getPassword());
                data = data + ",Password : " + new String(jp.getPassword());
                tf1.setText(data);
            }
        });
        jFrame.add(tf);jFrame.add(tf1);jFrame.add(jb);jFrame.add(jp);
        jFrame.setSize(500,400);
        jFrame.setLayout(null);
        jFrame.setVisible(true);

    }
}
