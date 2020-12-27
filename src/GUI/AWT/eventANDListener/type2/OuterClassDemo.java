package GUI.AWT.eventANDListener.type2;

import GUI.AWT.eventANDListener.type2.EventAndListenerDemo1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OuterClassDemo implements ActionListener {
    EventAndListenerDemo1 var;
    public OuterClassDemo(EventAndListenerDemo1 obj) {
        var = obj;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        var.tf.setText("This is a text field");
    }
}
