package GUI.AWT.dialog;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogDemo1 {
    static Dialog d;
    public static void main(String[] args) {
        d = new Dialog(d, "dialog", true);
        d.setLayout(new FlowLayout());
//        d.setBounds(20, 30, 200, 200);
        Button b = new Button("OK");
        b.setBounds(100, 50, 80, 40);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
                DialogDemo1.d.setVisible(false);
            }
        });
        d.add(new Label("Click ok to close the window.."));
        d.add(b);
        d.setBounds(1210, 4,300,126);
        d.setVisible(true);
    }
}
