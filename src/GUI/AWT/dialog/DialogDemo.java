package GUI.AWT.dialog;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogDemo {
    static Dialog d;
    public static void main(String[] args) {
        Frame f = new Frame("Dialog Demo");
        d = new Dialog(f,"Dialog", true);
//        d.setBounds(200,200,500,500);
        d.setLayout(new FlowLayout());


        Button b = new Button("OK");
        b.setBounds(100,100,80,40);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                DialogDemo.d.setVisible(false);
            }
        });
        d.add(b);
//        f.setSize(800,800);
//        d.setLayout(null);
        d.setVisible(true);
    }
}
