package GUI.AWT.eventANDListener.type2;

import java.awt.*;

public class EventAndListenerDemo1 extends Frame {
    TextField tf;
    public EventAndListenerDemo1() {
        tf = new TextField();
        tf.setBounds(100,50,100,20);
        Button btn = new Button("Click me");
        btn.setBounds(100,150,80,30);
        OuterClassDemo ocd = new OuterClassDemo(this);
        btn.addActionListener(ocd);
        add(btn);
        add(tf);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new EventAndListenerDemo1();
    }
}
