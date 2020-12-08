package GUI.AWT.EventAndListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventAndListenerDemo extends Frame implements ActionListener {
    TextField tf ;
    public EventAndListenerDemo() {
        Button btn = new Button("Click ME");
        btn.setBounds(100,60,80,40);
        tf = new TextField();
        tf.setBounds(100,150,100,30);
        add(btn);
        add(tf);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
        btn.addActionListener(this);
    }

    public static void main(String[] args) {
        new EventAndListenerDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText("this is a text field");
    }
}
